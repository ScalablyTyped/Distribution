package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.StopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Stop")
@js.native
/**
  * A stop respresents the start, end, or midpoint of a route in [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops) or [RouteParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RouteParameters.html#stops).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html)
  */
open class StopCls ()
  extends StObject
     with typings.arcgisJsApi.esri.Stop {
  def this(properties: StopProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
