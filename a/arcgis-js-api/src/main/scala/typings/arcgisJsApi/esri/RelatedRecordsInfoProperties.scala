package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedRecordsInfoProperties extends js.Object {
  /**
    * An array of [RelatedRecordsInfoFieldOrder](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html) objects indicating the field display order for the related records and whether they should be sorted in ascending `asc` or descending `desc` order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html#orderByFields)
    */
  var orderByFields: js.UndefOr[js.Array[RelatedRecordsInfoFieldOrderProperties]] = js.native
  /**
    * Indicates whether to display related records in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-RelatedRecordsInfo.html#showRelatedRecords)
    */
  var showRelatedRecords: js.UndefOr[Boolean] = js.native
}

object RelatedRecordsInfoProperties {
  @scala.inline
  def apply(): RelatedRecordsInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedRecordsInfoProperties]
  }
  @scala.inline
  implicit class RelatedRecordsInfoPropertiesOps[Self <: RelatedRecordsInfoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrderByFieldsVarargs(value: RelatedRecordsInfoFieldOrderProperties*): Self = this.set("orderByFields", js.Array(value :_*))
    @scala.inline
    def setOrderByFields(value: js.Array[RelatedRecordsInfoFieldOrderProperties]): Self = this.set("orderByFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderByFields: Self = this.set("orderByFields", js.undefined)
    @scala.inline
    def setShowRelatedRecords(value: Boolean): Self = this.set("showRelatedRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRelatedRecords: Self = this.set("showRelatedRecords", js.undefined)
  }
  
}

