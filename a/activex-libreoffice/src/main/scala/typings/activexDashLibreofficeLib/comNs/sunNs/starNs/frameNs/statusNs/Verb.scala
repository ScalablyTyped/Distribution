package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.statusNs

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
  var VerbId: scala.Double
  /** specifies if the command is available for a constant object. */
  var VerbIsConst: scala.Boolean
  /** specifies if the command should be visible in a menu. */
  var VerbIsOnMenu: scala.Boolean
  /** specifies the name of the command. The name is localized. */
  var VerbName: java.lang.String
}

object Verb {
  @scala.inline
  def apply(
    VerbId: scala.Double,
    VerbIsConst: scala.Boolean,
    VerbIsOnMenu: scala.Boolean,
    VerbName: java.lang.String
  ): Verb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("VerbId")(VerbId)
    __obj.updateDynamic("VerbIsConst")(VerbIsConst)
    __obj.updateDynamic("VerbIsOnMenu")(VerbIsOnMenu)
    __obj.updateDynamic("VerbName")(VerbName)
    __obj.asInstanceOf[Verb]
  }
}

