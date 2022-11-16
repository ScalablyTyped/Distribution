package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DirectionsEventProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DirectionsEvent")
@js.native
/**
  * DirectionsEvent represent [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeature.html#events) for features in a [DirectionsFeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsEvent.html)
  */
open class DirectionsEvent ()
  extends StObject
     with typings.arcgisJsApi.esri.DirectionsEvent {
  def this(properties: DirectionsEventProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object DirectionsEvent {
  
  @JSGlobal("__esri.DirectionsEvent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.DirectionsEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DirectionsEvent]
}
