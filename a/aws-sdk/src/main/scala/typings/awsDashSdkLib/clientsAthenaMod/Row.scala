package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row extends js.Object {
  /**
    * The data that populates a row in a query result table.
    */
  var Data: js.UndefOr[datumList] = js.undefined
}

object Row {
  @scala.inline
  def apply(Data: datumList = null): Row = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data)
    __obj.asInstanceOf[Row]
  }
}

