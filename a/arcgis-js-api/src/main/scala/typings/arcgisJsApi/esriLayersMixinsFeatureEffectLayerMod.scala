package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureEffect
import typings.arcgisJsApi.esri.FeatureEffectLayer
import typings.arcgisJsApi.esri.FeatureEffectLayerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsFeatureEffectLayerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/FeatureEffectLayer", JSImport.Namespace)
  @js.native
  val ^ : FeatureEffectLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/FeatureEffectLayer", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with FeatureEffectLayer {
    
    /**
      * The featureEffect can be used to draw attention features of interest.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureEffectLayer.html#featureEffect)
      */
    /* CompleteClass */
    var featureEffect: FeatureEffect = js.native
  }
  
  type _To = FeatureEffectLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersMixinsFeatureEffectLayerMod.foo` */
  override def _to: FeatureEffectLayerConstructor = ^
}
