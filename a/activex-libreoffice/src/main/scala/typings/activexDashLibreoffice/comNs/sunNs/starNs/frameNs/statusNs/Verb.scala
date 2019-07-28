package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.statusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a command that can be send to an OLE object
  *
  * For example, this can be used to select a font.
  * @since OOo 2.0
  */
trait Verb extends js.Object {
  /** specifies the Id of the command. */
  var VerbId: Double
  /** specifies if the command is available for a constant object. */
  var VerbIsConst: Boolean
  /** specifies if the command should be visible in a menu. */
  var VerbIsOnMenu: Boolean
  /** specifies the name of the command. The name is localized. */
  var VerbName: String
}

object Verb {
  @scala.inline
  def apply(VerbId: Double, VerbIsConst: Boolean, VerbIsOnMenu: Boolean, VerbName: String): Verb = {
    val __obj = js.Dynamic.literal(VerbId = VerbId, VerbIsConst = VerbIsConst, VerbIsOnMenu = VerbIsOnMenu, VerbName = VerbName)
  
    __obj.asInstanceOf[Verb]
  }
}

