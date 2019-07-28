package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait ControlFontDialog extends XExecutableDialog {
  def createWithGridModel(GridModel: XPropertySet): Unit
}

object ControlFontDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithGridModel: XPropertySet => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): ControlFontDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithGridModel = js.Any.fromFunction1(createWithGridModel), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[ControlFontDialog]
  }
}

