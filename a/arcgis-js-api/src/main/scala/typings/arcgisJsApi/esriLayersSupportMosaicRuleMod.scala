package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MosaicRule
import typings.arcgisJsApi.esri.MosaicRuleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportMosaicRuleMod {
  
  @JSImport("esri/layers/support/MosaicRule", JSImport.Namespace)
  @js.native
  /**
  		 * Specifies the mosaic rule when defining how individual images should be mosaicked.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html)
  		 */
  open class ^ ()
    extends StObject
       with MosaicRule {
    def this(properties: MosaicRuleProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/MosaicRule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): MosaicRule = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[MosaicRule]
}
