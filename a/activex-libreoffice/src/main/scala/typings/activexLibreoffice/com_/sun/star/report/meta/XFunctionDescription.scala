package typings.activexLibreoffice.com_.sun.star.report.meta

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.sheet.FunctionArgument
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies a {@link XFunctionDescription} which allows to retrieve the meta data of all supported functions. */
@js.native
trait XFunctionDescription extends XPropertySet {
  /** returns a sequence of localized descriptions of the function's arguments (in the order specified by the function). */
  var Arguments: SafeArray[FunctionArgument] = js.native
  /** specifies the category number. */
  var Category: XFunctionCategory = js.native
  /** returns a localized description of the function. */
  var Description: String = js.native
  /** returns the localized function's name. */
  var Name: String = js.native
  /** returns the signature of the function. */
  var Signature: String = js.native
  def createFormula(arguments: SeqEquiv[String]): String = js.native
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
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createFormula = js.Any.fromFunction1(createFormula), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XFunctionDescription]
  }
  @scala.inline
  implicit class XFunctionDescriptionOps[Self <: XFunctionDescription] (val x: Self) extends AnyVal {
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
    def setArguments(value: SafeArray[FunctionArgument]): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: XFunctionCategory): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: String): Self = this.set("Signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateFormula(value: SeqEquiv[String] => String): Self = this.set("createFormula", js.Any.fromFunction1(value))
  }
  
}

