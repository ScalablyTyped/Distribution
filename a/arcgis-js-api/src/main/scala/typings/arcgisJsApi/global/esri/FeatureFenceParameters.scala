package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FeatureFenceParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FeatureFenceParameters")
@js.native
/**
  * Fence parameters for a Geotrigger that uses feature data from an online feature service.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html)
  */
open class FeatureFenceParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.FeatureFenceParameters {
  def this(properties: FeatureFenceParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object FeatureFenceParameters {
  
  @JSGlobal("__esri.FeatureFenceParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.FeatureFenceParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.FeatureFenceParameters]
}
