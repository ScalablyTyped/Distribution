package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.NetworkFeatureSetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.NetworkFeatureSet")
@js.native
/**
  * A subclass of FeaureSet that can be used as an input in the Route, Closest Facility, and Service Area solvers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkFeatureSet.html)
  */
open class NetworkFeatureSet ()
  extends StObject
     with typings.arcgisJsApi.esri.NetworkFeatureSet {
  def this(properties: NetworkFeatureSetProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object NetworkFeatureSet {
  
  @JSGlobal("__esri.NetworkFeatureSet")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.NetworkFeatureSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.NetworkFeatureSet]
}
