package typings.activexDashAccess

import typings.activexDashAccess.AccWizObjectsNs.FieldList
import typings.activexDashAccess.AccWizObjectsNs.ImexGrid
import typings.activexDashAccess.AccWizObjectsNs.WizShellLinkA
import typings.activexDashAccess.AccessNs.Application
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
    val __obj = js.Dynamic.literal(lnkfile = lnkfile)
    __obj.updateDynamic("ACCWIZ.FieldListCtrl")(`ACCWIZ.FieldListCtrl`)
    __obj.updateDynamic("ACCWIZ.ImexGridCtrl")(`ACCWIZ.ImexGridCtrl`)
    __obj.updateDynamic("Access.Application")(`Access.Application`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

