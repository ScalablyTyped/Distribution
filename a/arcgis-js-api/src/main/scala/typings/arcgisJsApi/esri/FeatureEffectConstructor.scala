package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureEffectConstructor
  extends /**
  * FeatureEffect allows you to emphasize or deemphasize features that satisfy a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). The [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) and [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) properties allow you to apply [CSS filters](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) to features that are either included or excluded from the filter. Typically, you use `includedEffect` to emphasize features that are included in the filter and `excludedEffect` to deemphasize features excluded from the filter.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html)
  */
Instantiable0[FeatureEffect]
     with Instantiable1[/* properties */ FeatureEffectProperties, FeatureEffect] {
  def fromJSON(json: js.Any): FeatureEffect = js.native
}

