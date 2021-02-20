package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureEffect
import typings.arcgisJsApi.esri.FeatureEffectConstructor
import typings.arcgisJsApi.esri.FeatureEffectProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureEffectMod extends Shortcut {
  
  @JSImport("esri/views/layers/support/FeatureEffect", JSImport.Namespace)
  @js.native
  val ^ : FeatureEffectConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/support/FeatureEffect", JSImport.Namespace)
  @js.native
  /**
    * FeatureEffect allows you to emphasize or deemphasize features that satisfy a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html)
    */
  class Class () extends FeatureEffect {
    def this(properties: FeatureEffectProperties) = this()
  }
  
  type _To = FeatureEffectConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureEffectMod.foo` */
  override def _to: FeatureEffectConstructor = ^
}
