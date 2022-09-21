package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ViewpointProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Viewpoint")
@js.native
/**
  * Describes a point of view for a 2D or 3D view.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html)
  */
open class ViewpointCls ()
  extends StObject
     with typings.arcgisJsApi.esri.Viewpoint {
  def this(properties: ViewpointProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
