package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row extends js.Object {
  /**
    * The data that populates a row in a query result table.
    */
  var Data: js.UndefOr[datumList] = js.native
}

object Row {
  @scala.inline
  def apply(Data: datumList = null): Row = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
}

