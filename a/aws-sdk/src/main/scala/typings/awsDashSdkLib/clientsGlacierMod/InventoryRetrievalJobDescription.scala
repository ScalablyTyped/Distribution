package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryRetrievalJobDescription extends js.Object {
  /**
    * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
    */
  var EndDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The output format for the vault inventory list, which is set by the InitiateJob request when initiating a job to retrieve a vault inventory. Valid values are CSV and JSON.
    */
  var Format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of inventory items returned per vault inventory retrieval request. This limit is set when initiating the job with the a InitiateJob request. 
    */
  var Limit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new InitiateJob request to obtain additional inventory items. If there are no more inventory items, this value is null. For more information, see  Range Inventory Retrieval.
    */
  var Marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
    */
  var StartDate: js.UndefOr[DateTime] = js.undefined
}

object InventoryRetrievalJobDescription {
  @scala.inline
  def apply(
    EndDate: DateTime = null,
    Format: java.lang.String = null,
    Limit: java.lang.String = null,
    Marker: java.lang.String = null,
    StartDate: DateTime = null
  ): InventoryRetrievalJobDescription = {
    val __obj = js.Dynamic.literal()
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate)
    if (Format != null) __obj.updateDynamic("Format")(Format)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    __obj.asInstanceOf[InventoryRetrievalJobDescription]
  }
}

