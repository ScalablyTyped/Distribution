package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoiseReducer extends js.Object {
  /**
    * Use Noise reducer filter (NoiseReducerFilter) to select one of the following spatial image filtering functions. To use this setting, you must also enable Noise reducer (NoiseReducer). * Bilateral is an edge preserving noise reduction filter. * Mean (softest), Gaussian, Lanczos, and Sharpen (sharpest) are convolution filters. * Conserve is a min/max noise reduction filter. * Spatial is a frequency-domain filter based on JND principles.
    */
  var Filter: js.UndefOr[NoiseReducerFilter] = js.undefined
  /**
    * Settings for a noise reducer filter
    */
  var FilterSettings: js.UndefOr[NoiseReducerFilterSettings] = js.undefined
  /**
    * Noise reducer filter settings for spatial filter.
    */
  var SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings] = js.undefined
}

object NoiseReducer {
  @scala.inline
  def apply(
    Filter: NoiseReducerFilter = null,
    FilterSettings: NoiseReducerFilterSettings = null,
    SpatialFilterSettings: NoiseReducerSpatialFilterSettings = null
  ): NoiseReducer = {
    val __obj = js.Dynamic.literal()
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (FilterSettings != null) __obj.updateDynamic("FilterSettings")(FilterSettings)
    if (SpatialFilterSettings != null) __obj.updateDynamic("SpatialFilterSettings")(SpatialFilterSettings)
    __obj.asInstanceOf[NoiseReducer]
  }
}

