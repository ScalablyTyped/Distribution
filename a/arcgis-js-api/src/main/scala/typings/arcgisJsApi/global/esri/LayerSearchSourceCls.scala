package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LayerSearchSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.LayerSearchSource")
@js.native
/**
  * The following properties define a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)-based [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) whose features may be searched by a [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget instance.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LayerSearchSource.html)
  */
class LayerSearchSourceCls ()
  extends StObject
     with typings.arcgisJsApi.esri.LayerSearchSource {
  def this(properties: LayerSearchSourceProperties) = this()
  
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
