package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureViewModelLastEditInfo extends Object {
  /**
    * Date that the edit was performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var date: String
  /**
    * The type of edit that was performed on the feature.  **Possible values:** edit | create
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var `type`: String
  /**
    * User who performed the last edit on a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var user: String
}

object FeatureViewModelLastEditInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    date: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String,
    user: String
  ): FeatureViewModelLastEditInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, date = date, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FeatureViewModelLastEditInfo]
  }
}

