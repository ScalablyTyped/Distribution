package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Background")
@js.native
/**
  * The background of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) that lies behind the sky, atmosphere and stars.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-Background.html)
  */
class BackgroundCls ()
  extends StObject
     with typings.arcgisJsApi.esri.Background {
  def this(properties: BackgroundProperties) = this()
  
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
