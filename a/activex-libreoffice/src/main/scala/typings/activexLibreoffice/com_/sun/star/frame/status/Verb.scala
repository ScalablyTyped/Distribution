package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a command that can be send to an OLE object
  *
  * For example, this can be used to select a font.
  * @since OOo 2.0
  */
@js.native
trait Verb extends js.Object {
  /** specifies the Id of the command. */
  var VerbId: Double = js.native
  /** specifies if the command is available for a constant object. */
  var VerbIsConst: Boolean = js.native
  /** specifies if the command should be visible in a menu. */
  var VerbIsOnMenu: Boolean = js.native
  /** specifies the name of the command. The name is localized. */
  var VerbName: String = js.native
}

object Verb {
  @scala.inline
  def apply(VerbId: Double, VerbIsConst: Boolean, VerbIsOnMenu: Boolean, VerbName: String): Verb = {
    val __obj = js.Dynamic.literal(VerbId = VerbId.asInstanceOf[js.Any], VerbIsConst = VerbIsConst.asInstanceOf[js.Any], VerbIsOnMenu = VerbIsOnMenu.asInstanceOf[js.Any], VerbName = VerbName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verb]
  }
  @scala.inline
  implicit class VerbOps[Self <: Verb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVerbId(value: Double): Self = this.set("VerbId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbIsConst(value: Boolean): Self = this.set("VerbIsConst", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbIsOnMenu(value: Boolean): Self = this.set("VerbIsOnMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbName(value: String): Self = this.set("VerbName", value.asInstanceOf[js.Any])
  }
  
}

