package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedRecordsInfoProperties extends js.Object {
  /**
    * An array of [RelatedRecordsInfoFieldOrder](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html) objects indicating the field display order for the related records and whether they should be sorted in ascending `asc` or descending `desc` order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html#orderByFields)
    */
  var orderByFields: js.UndefOr[js.Array[RelatedRecordsInfoFieldOrderProperties]] = js.undefined
  /**
    * Indicates whether to display related records in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html#showRelatedRecords)
    */
  var showRelatedRecords: js.UndefOr[Boolean] = js.undefined
}

object RelatedRecordsInfoProperties {
  @scala.inline
  def apply(
    orderByFields: js.Array[RelatedRecordsInfoFieldOrderProperties] = null,
    showRelatedRecords: js.UndefOr[Boolean] = js.undefined
  ): RelatedRecordsInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (orderByFields != null) __obj.updateDynamic("orderByFields")(orderByFields.asInstanceOf[js.Any])
    if (!js.isUndefined(showRelatedRecords)) __obj.updateDynamic("showRelatedRecords")(showRelatedRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedRecordsInfoProperties]
  }
}

