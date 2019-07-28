package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateComputerResult extends js.Object {
  /**
    * A Computer object that represents the computer account.
    */
  var Computer: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Computer] = js.undefined
}

object CreateComputerResult {
  @scala.inline
  def apply(Computer: Computer = null): CreateComputerResult = {
    val __obj = js.Dynamic.literal()
    if (Computer != null) __obj.updateDynamic("Computer")(Computer)
    __obj.asInstanceOf[CreateComputerResult]
  }
}

