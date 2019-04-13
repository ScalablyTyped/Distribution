package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomainEntryResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the operation.
    */
  var operation: js.UndefOr[Operation] = js.undefined
}

object CreateDomainEntryResult {
  @scala.inline
  def apply(operation: Operation = null): CreateDomainEntryResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[CreateDomainEntryResult]
  }
}

