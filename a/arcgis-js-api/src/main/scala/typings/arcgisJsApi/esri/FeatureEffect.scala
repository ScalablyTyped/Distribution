package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureEffect
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The [effect](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#Effect) applied to features that do not meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#filter) requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#excludedEffect)
    */
  var excludedEffect: Effect = js.native
  
  /**
    * Indicates if labels are visible for features that are [excluded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#excludedEffect) from the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#filter).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#excludedLabelsVisible)
    */
  var excludedLabelsVisible: Boolean = js.native
  
  /**
    * The [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html) that drives the effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#filter)
    */
  var filter: FeatureFilter = js.native
  
  /**
    * The [effect](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#Effect) applied to features that meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#filter) requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureEffect.html#includedEffect)
    */
  var includedEffect: Effect = js.native
}
