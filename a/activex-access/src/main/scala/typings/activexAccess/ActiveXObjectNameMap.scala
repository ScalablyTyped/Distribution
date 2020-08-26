package typings.activexAccess

import typings.activexAccess.AccWizObjects.FieldList
import typings.activexAccess.AccWizObjects.ImexGrid
import typings.activexAccess.AccWizObjects.WizShellLinkA
import typings.activexAccess.Access.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("ACCWIZ.FieldListCtrl")
  var ACCWIZDotFieldListCtrl: FieldList = js.native
  @JSName("ACCWIZ.ImexGridCtrl")
  var ACCWIZDotImexGridCtrl: ImexGrid = js.native
  @JSName("Access.Application")
  var AccessDotApplication: Application = js.native
  var lnkfile: WizShellLinkA = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    ACCWIZDotFieldListCtrl: FieldList,
    ACCWIZDotImexGridCtrl: ImexGrid,
    AccessDotApplication: Application,
    lnkfile: WizShellLinkA
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(lnkfile = lnkfile.asInstanceOf[js.Any])
    __obj.updateDynamic("ACCWIZ.FieldListCtrl")(ACCWIZDotFieldListCtrl.asInstanceOf[js.Any])
    __obj.updateDynamic("ACCWIZ.ImexGridCtrl")(ACCWIZDotImexGridCtrl.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Application")(AccessDotApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
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
    def setACCWIZDotFieldListCtrl(value: FieldList): Self = this.set("ACCWIZ.FieldListCtrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setACCWIZDotImexGridCtrl(value: ImexGrid): Self = this.set("ACCWIZ.ImexGridCtrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessDotApplication(value: Application): Self = this.set("Access.Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setLnkfile(value: WizShellLinkA): Self = this.set("lnkfile", value.asInstanceOf[js.Any])
  }
  
}

