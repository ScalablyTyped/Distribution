package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionsList extends js.Object {
  /**
    * A list of connections used by the job.
    */
  var Connections: js.UndefOr[StringList] = js.undefined
}

object ConnectionsList {
  @scala.inline
  def apply(Connections: StringList = null): ConnectionsList = {
    val __obj = js.Dynamic.literal()
    if (Connections != null) __obj.updateDynamic("Connections")(Connections)
    __obj.asInstanceOf[ConnectionsList]
  }
}

