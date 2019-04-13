package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomainResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the domain resource you created.
    */
  var operation: js.UndefOr[Operation] = js.undefined
}

object CreateDomainResult {
  @scala.inline
  def apply(operation: Operation = null): CreateDomainResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[CreateDomainResult]
  }
}

