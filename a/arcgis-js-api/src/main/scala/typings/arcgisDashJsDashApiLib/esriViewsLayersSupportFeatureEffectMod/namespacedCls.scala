package typings
package arcgisDashJsDashApiLib.esriViewsLayersSupportFeatureEffectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/views/layers/support/FeatureEffect", JSImport.Namespace)
@js.native
/**
  * FeatureEffect allows you to emphasize or deemphasize features that satisfy a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). The [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) and [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) properties allow you to apply [CSS filters](https://developer.mozilla.org/en-US/docs/Web/CSS/filter) to features that are either included or excluded from the filter. Typically, you use `includedEffect` to emphasize features that are included in the filter and `excludedEffect` to deemphasize features excluded from the filter.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html)
  */
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.FeatureEffect {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.FeatureEffectProperties) = this()
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

