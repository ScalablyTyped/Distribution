package typings
package activexDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `ACCWIZ.FieldListCtrl`: activexDashAccessLib.AccWizObjectsNs.FieldList
  var `ACCWIZ.ImexGridCtrl`: activexDashAccessLib.AccWizObjectsNs.ImexGrid
  var `Access.Application`: activexDashAccessLib.AccessNs.Application
  var lnkfile: activexDashAccessLib.AccWizObjectsNs.WizShellLinkA
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `ACCWIZ.FieldListCtrl`: activexDashAccessLib.AccWizObjectsNs.FieldList,
    `ACCWIZ.ImexGridCtrl`: activexDashAccessLib.AccWizObjectsNs.ImexGrid,
    `Access.Application`: activexDashAccessLib.AccessNs.Application,
    lnkfile: activexDashAccessLib.AccWizObjectsNs.WizShellLinkA
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(lnkfile = lnkfile)
    __obj.updateDynamic("ACCWIZ.FieldListCtrl")(`ACCWIZ.FieldListCtrl`)
    __obj.updateDynamic("ACCWIZ.ImexGridCtrl")(`ACCWIZ.ImexGridCtrl`)
    __obj.updateDynamic("Access.Application")(`Access.Application`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

