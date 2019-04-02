package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var excludedEffect: java.lang.String = js.native
  /**
    * Indicates if labels for features that are [excluded](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) from the effect are visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedLabelsVisible)
    *
    * @default false
    */
  var excludedLabelsVisible: scala.Boolean = js.native
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
  var includedEffect: java.lang.String = js.native
}

@JSGlobal("__esri.FeatureEffect")
@js.native
/**
  * FeatureEffect allows you to emphasize or deemphasize features that satisfy a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). The [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) and [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) properties allow you to apply [CSS filters](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) to features that are either included or excluded from the filter. Typically, you use `includedEffect` to emphasize features that are included in the filter and `excludedEffect` to deemphasize features excluded from the filter.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html)
  */
class FeatureEffectCls () extends FeatureEffect {
  def this(properties: FeatureEffectProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

