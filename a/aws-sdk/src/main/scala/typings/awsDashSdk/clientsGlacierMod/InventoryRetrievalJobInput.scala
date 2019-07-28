package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryRetrievalJobInput extends js.Object {
  /**
    * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
    */
  var EndDate: js.UndefOr[String] = js.undefined
  /**
    * Specifies the maximum number of inventory items returned per vault inventory retrieval request. Valid values are greater than or equal to 1.
    */
  var Limit: js.UndefOr[String] = js.undefined
  /**
    * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new InitiateJob request to obtain additional inventory items. If there are no more inventory items, this value is null.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The start of the date range in UTC for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
    */
  var StartDate: js.UndefOr[String] = js.undefined
}

object InventoryRetrievalJobInput {
  @scala.inline
  def apply(EndDate: String = null, Limit: String = null, Marker: String = null, StartDate: String = null): InventoryRetrievalJobInput = {
    val __obj = js.Dynamic.literal()
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    __obj.asInstanceOf[InventoryRetrievalJobInput]
  }
}

