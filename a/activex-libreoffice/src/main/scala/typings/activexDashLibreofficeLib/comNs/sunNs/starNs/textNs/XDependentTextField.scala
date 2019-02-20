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

