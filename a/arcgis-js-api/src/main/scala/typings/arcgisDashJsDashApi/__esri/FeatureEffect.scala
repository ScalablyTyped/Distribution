package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureEffect
  extends Accessor
     with JSONSupport {
  /**
    * The graphical [css filter](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) operation applied to the features that do not meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) requirements. Currently, [grayscale](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/grayscale), [sepia](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/sepia), [hue-rotate](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/hue-rotate), [invert](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/invert), [opacity](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/opacity), [brightness](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/brightness) and [contrast](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/contrast) css filter functions are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect)
    */
  var excludedEffect: String = js.native
  /**
    * Indicates if labels for features that are [excluded](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) from the effect are visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedLabelsVisible)
    *
    * @default false
    */
  var excludedLabelsVisible: Boolean = js.native
  /**
    * The filter that drives the effect. Features that meet the requirements specified in the filter will have the [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) applied while features that do not meet meet the filter requirements will have the [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter)
    */
  var filter: FeatureFilter = js.native
  /**
    * The graphical [css filter](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) operation applied to the features that meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) requirements. Currently, [grayscale](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/grayscale), [sepia](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/sepia), [hue-rotate](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/hue-rotate), [invert](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/invert), [opacity](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/opacity), [brightness](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/brightness) and [contrast](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/contrast) css filter functions are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect)
    */
  var includedEffect: String = js.native
}

@JSGlobal("__esri.FeatureEffect")
@js.native
object FeatureEffect extends TopLevel[FeatureEffectConstructor]

