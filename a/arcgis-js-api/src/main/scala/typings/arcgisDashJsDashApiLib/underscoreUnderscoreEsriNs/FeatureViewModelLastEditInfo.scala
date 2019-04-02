package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureViewModelLastEditInfo
  extends stdLib.Object {
  /**
    * Date that the edit was performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var date: java.lang.String
  /**
    * The type of edit that was performed on the feature.  **Possible values:** edit | create
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var `type`: java.lang.String
  /**
    * User who performed the last edit on a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var user: java.lang.String
}

object FeatureViewModelLastEditInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    date: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: java.lang.String,
    user: java.lang.String
  ): FeatureViewModelLastEditInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, date = date, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FeatureViewModelLastEditInfo]
  }
}

