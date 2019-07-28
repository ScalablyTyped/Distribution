package typings.activexDashLibreoffice.comNs.sunNs.starNs.reportNs.metaNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.FunctionArgument
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies a {@link XFunctionDescription} which allows to retrieve the meta data of all supported functions. */
trait XFunctionDescription extends XPropertySet {
  /** returns a sequence of localized descriptions of the function's arguments (in the order specified by the function). */
  var Arguments: SafeArray[FunctionArgument]
  /** specifies the category number. */
  var Category: XFunctionCategory
  /** returns a localized description of the function. */
  var Description: String
  /** returns the localized function's name. */
  var Name: String
  /** returns the signature of the function. */
  var Signature: String
  def createFormula(arguments: SeqEquiv[String]): String
}

object XFunctionDescription {
  @scala.inline
  def apply(
    Arguments: SafeArray[FunctionArgument],
    Category: XFunctionCategory,
    Description: String,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    Signature: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createFormula: SeqEquiv[String] => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XFunctionDescription = {
    val __obj = js.Dynamic.literal(Arguments = Arguments, Category = Category, Description = Description, Name = Name, PropertySetInfo = PropertySetInfo, Signature = Signature, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createFormula = js.Any.fromFunction1(createFormula), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XFunctionDescription]
  }
}

