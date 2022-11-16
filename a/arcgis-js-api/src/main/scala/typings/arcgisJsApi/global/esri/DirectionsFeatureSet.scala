package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DirectionsFeatureSetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DirectionsFeatureSet")
@js.native
/**
  * DirectionsFeatureSet is a subclass of [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) that contains street directions for a [solved route](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-route.html#solve).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html)
  */
open class DirectionsFeatureSet ()
  extends StObject
     with typings.arcgisJsApi.esri.DirectionsFeatureSet {
  def this(properties: DirectionsFeatureSetProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object DirectionsFeatureSet {
  
  @JSGlobal("__esri.DirectionsFeatureSet")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.DirectionsFeatureSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DirectionsFeatureSet]
}
