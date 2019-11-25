package typings.activexDashAccess

import typings.activexDashAccess.AccWizObjects.FieldList
import typings.activexDashAccess.AccWizObjects.ImexGrid
import typings.activexDashAccess.AccWizObjects.WizShellLinkA
import typings.activexDashAccess.Access.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `ACCWIZ.FieldListCtrl`: FieldList
  var `ACCWIZ.ImexGridCtrl`: ImexGrid
  var `Access.Application`: Application
  var lnkfile: WizShellLinkA
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `ACCWIZ.FieldListCtrl`: FieldList,
    `ACCWIZ.ImexGridCtrl`: ImexGrid,
    `Access.Application`: Application,
    lnkfile: WizShellLinkA
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(lnkfile = lnkfile.asInstanceOf[js.Any])
    __obj.updateDynamic("ACCWIZ.FieldListCtrl")(`ACCWIZ.FieldListCtrl`.asInstanceOf[js.Any])
    __obj.updateDynamic("ACCWIZ.ImexGridCtrl")(`ACCWIZ.ImexGridCtrl`.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Application")(`Access.Application`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

