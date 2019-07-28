package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedRecordsInfoFieldOrderProperties extends js.Object {
  /**
    * The attribute value of the field selected that will drive the sorting of related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * Set the ascending or descending sort order of the returned related records.  **Possible Values**: asc | desc
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html#order)
    */
  var order: js.UndefOr[String] = js.undefined
}

object RelatedRecordsInfoFieldOrderProperties {
  @scala.inline
  def apply(field: String = null, order: String = null): RelatedRecordsInfoFieldOrderProperties = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[RelatedRecordsInfoFieldOrderProperties]
  }
}

