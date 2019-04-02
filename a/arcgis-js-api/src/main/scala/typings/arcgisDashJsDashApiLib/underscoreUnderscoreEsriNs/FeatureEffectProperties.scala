package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureEffectProperties extends js.Object {
  /**
    * The graphical [css filter](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) operation applied to the features that do not meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) requirements. Currently, [grayscale](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/grayscale), [sepia](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/sepia), [hue-rotate](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/hue-rotate), [invert](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/invert), [opacity](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/opacity), [brightness](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/brightness) and [contrast](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/contrast) css filter functions are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect)
    */
  var excludedEffect: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates if labels for features that are [excluded](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) from the effect are visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedLabelsVisible)
    *
    * @default false
    */
  var excludedLabelsVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The filter that drives the effect. Features that meet the requirements specified in the filter will have the [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) applied while features that do not meet meet the filter requirements will have the [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.undefined
  /**
    * The graphical [css filter](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) operation applied to the features that meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) requirements. Currently, [grayscale](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/grayscale), [sepia](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/sepia), [hue-rotate](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/hue-rotate), [invert](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/invert), [opacity](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/opacity), [brightness](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/brightness) and [contrast](https://developer.mozilla.org/en-US/docs/Web/CSS/filter-function/contrast) css filter functions are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect)
    */
  var includedEffect: js.UndefOr[java.lang.String] = js.undefined
}

object FeatureEffectProperties {
  @scala.inline
  def apply(
    excludedEffect: java.lang.String = null,
    excludedLabelsVisible: js.UndefOr[scala.Boolean] = js.undefined,
    filter: FeatureFilterProperties = null,
    includedEffect: java.lang.String = null
  ): FeatureEffectProperties = {
    val __obj = js.Dynamic.literal()
    if (excludedEffect != null) __obj.updateDynamic("excludedEffect")(excludedEffect)
    if (!js.isUndefined(excludedLabelsVisible)) __obj.updateDynamic("excludedLabelsVisible")(excludedLabelsVisible)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (includedEffect != null) __obj.updateDynamic("includedEffect")(includedEffect)
    __obj.asInstanceOf[FeatureEffectProperties]
  }
}

