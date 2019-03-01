package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldOrderProperties extends js.Object {
  /**
    * The attribute value of the field selected that will drive the sorting of related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-RelatedRecordsInfo-FieldOrder.html#field)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the ascending or descending sort order of the returned related records.  **Possible Values**: asc | desc
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-RelatedRecordsInfo-FieldOrder.html#order)
    */
  var order: js.UndefOr[java.lang.String] = js.undefined
}

object FieldOrderProperties {
  @scala.inline
  def apply(field: java.lang.String = null, order: java.lang.String = null): FieldOrderProperties = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[FieldOrderProperties]
  }
}

