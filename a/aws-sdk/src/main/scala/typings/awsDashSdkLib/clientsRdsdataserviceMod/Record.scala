package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  /**
    * Record
    */
  var values: js.UndefOr[Row] = js.undefined
}

object Record {
  @scala.inline
  def apply(values: Row = null): Record = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Record]
  }
}

