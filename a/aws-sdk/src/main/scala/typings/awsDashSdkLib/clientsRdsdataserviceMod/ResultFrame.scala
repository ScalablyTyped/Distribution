package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultFrame extends js.Object {
  /**
    * ResultSet Metadata.
    */
  var records: js.UndefOr[Records] = js.undefined
  /**
    * ResultSet Metadata.
    */
  var resultSetMetadata: js.UndefOr[ResultSetMetadata] = js.undefined
}

object ResultFrame {
  @scala.inline
  def apply(records: Records = null, resultSetMetadata: ResultSetMetadata = null): ResultFrame = {
    val __obj = js.Dynamic.literal()
    if (records != null) __obj.updateDynamic("records")(records)
    if (resultSetMetadata != null) __obj.updateDynamic("resultSetMetadata")(resultSetMetadata)
    __obj.asInstanceOf[ResultFrame]
  }
}

