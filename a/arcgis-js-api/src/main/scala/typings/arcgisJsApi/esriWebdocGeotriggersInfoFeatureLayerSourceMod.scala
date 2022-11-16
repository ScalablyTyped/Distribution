package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureLayerSource
import typings.arcgisJsApi.esri.FeatureLayerSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWebdocGeotriggersInfoFeatureLayerSourceMod {
  
  @JSImport("esri/webdoc/geotriggersInfo/FeatureLayerSource", JSImport.Namespace)
  @js.native
  /**
    * The source for a feature layer to be used as fences for Geotriggers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureLayerSource.html)
    */
  open class ^ ()
    extends StObject
       with FeatureLayerSource {
    def this(properties: FeatureLayerSourceProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/webdoc/geotriggersInfo/FeatureLayerSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FeatureLayerSource = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FeatureLayerSource]
}
