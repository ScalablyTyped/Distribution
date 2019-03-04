package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to attach this {@link TextField} to a {@link TextFieldMaster} . */
trait XDependentTextField extends XTextField {
  /** @returns the previously attached {@link TextFieldMaster} */
  val TextFieldMaster: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * method must be called to attach the {@link TextFieldMaster} to this {@link TextField} .
    *
    * A {@link TextFieldMaster} can only be assigned once.
    *
    * Example: Create and insert a user field (with a `UserField` ):
    *
    * {{program example here, see documentation}}
    */
  def attachTextFieldMaster(xFieldMaster: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): scala.Unit
  /** @returns the previously attached {@link TextFieldMaster} */
  def getTextFieldMaster(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XDependentTextField {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    TextFieldMaster: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    attachTextFieldMaster: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getPresentation: js.Function1[scala.Boolean, java.lang.String],
    getTextFieldMaster: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XDependentTextField = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, TextFieldMaster = TextFieldMaster, acquire = acquire, addEventListener = addEventListener, attach = attach, attachTextFieldMaster = attachTextFieldMaster, dispose = dispose, getAnchor = getAnchor, getPresentation = getPresentation, getTextFieldMaster = getTextFieldMaster, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XDependentTextField]
  }
}

