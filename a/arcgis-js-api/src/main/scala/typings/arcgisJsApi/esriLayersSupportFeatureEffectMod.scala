package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureEffect
import typings.arcgisJsApi.esri.FeatureEffectProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportFeatureEffectMod {
  
  @JSImport("esri/layers/support/FeatureEffect", JSImport.Namespace)
  @js.native
  /**
  		 * FeatureEffect allows you to emphasize or deemphasize features that satisfy a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#filter) in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html)
  		 */
  open class ^ ()
    extends StObject
       with FeatureEffect {
    def this(properties: FeatureEffectProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/FeatureEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FeatureEffect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FeatureEffect]
}
