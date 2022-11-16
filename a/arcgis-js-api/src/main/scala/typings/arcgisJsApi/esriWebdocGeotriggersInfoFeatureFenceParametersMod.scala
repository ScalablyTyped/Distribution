package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureFenceParameters
import typings.arcgisJsApi.esri.FeatureFenceParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWebdocGeotriggersInfoFeatureFenceParametersMod {
  
  @JSImport("esri/webdoc/geotriggersInfo/FeatureFenceParameters", JSImport.Namespace)
  @js.native
  /**
    * Fence parameters for a Geotrigger that uses feature data from an online feature service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html)
    */
  open class ^ ()
    extends StObject
       with FeatureFenceParameters {
    def this(properties: FeatureFenceParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/webdoc/geotriggersInfo/FeatureFenceParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FeatureFenceParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FeatureFenceParameters]
}
