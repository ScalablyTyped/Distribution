package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Computer extends js.Object {
  /**
    * An array of Attribute objects containing the LDAP attributes that belong to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.undefined
  /**
    * The identifier of the computer.
    */
  var ComputerId: js.UndefOr[SID] = js.undefined
  /**
    * The computer name.
    */
  var ComputerName: js.UndefOr[ComputerName] = js.undefined
}

object Computer {
  @scala.inline
  def apply(ComputerAttributes: Attributes = null, ComputerId: SID = null, ComputerName: ComputerName = null): Computer = {
    val __obj = js.Dynamic.literal()
    if (ComputerAttributes != null) __obj.updateDynamic("ComputerAttributes")(ComputerAttributes)
    if (ComputerId != null) __obj.updateDynamic("ComputerId")(ComputerId)
    if (ComputerName != null) __obj.updateDynamic("ComputerName")(ComputerName)
    __obj.asInstanceOf[Computer]
  }
}

