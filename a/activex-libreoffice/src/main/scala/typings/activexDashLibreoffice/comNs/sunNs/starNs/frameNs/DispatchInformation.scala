package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides information about a supported command
  * @see XDispatchInformationProvider
  * @see Controller
  * @since OOo 2.0
  */
trait DispatchInformation extends js.Object {
  /** command URL of a supported command. */
  var Command: String
  /**
    * group identifier to which the supported command belong.
    * @see CommandGroup
    */
  var GroupId: Double
}

object DispatchInformation {
  @scala.inline
  def apply(Command: String, GroupId: Double): DispatchInformation = {
    val __obj = js.Dynamic.literal(Command = Command, GroupId = GroupId)
  
    __obj.asInstanceOf[DispatchInformation]
  }
}

