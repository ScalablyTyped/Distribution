package typings.activexShell.Shell32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Definition of interface FolderItemVerb */
@js.native
trait FolderItemVerb extends js.Object {
  /** Get display name for item */
  val Name: String = js.native
  @JSName("Shell32.FolderItemVerb_typekey")
  var Shell32DotFolderItemVerb_typekey: FolderItemVerb = js.native
  /** Execute the verb */
  def DoIt(): Unit = js.native
}

object FolderItemVerb {
  @scala.inline
  def apply(DoIt: () => Unit, Name: String, Shell32DotFolderItemVerb_typekey: FolderItemVerb): FolderItemVerb = {
    val __obj = js.Dynamic.literal(DoIt = js.Any.fromFunction0(DoIt), Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell32.FolderItemVerb_typekey")(Shell32DotFolderItemVerb_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderItemVerb]
  }
  @scala.inline
  implicit class FolderItemVerbOps[Self <: FolderItemVerb] (val x: Self) extends AnyVal {
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
    def setDoIt(value: () => Unit): Self = this.set("DoIt", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShell32DotFolderItemVerb_typekey(value: FolderItemVerb): Self = this.set("Shell32.FolderItemVerb_typekey", value.asInstanceOf[js.Any])
  }
  
}

