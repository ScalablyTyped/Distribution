package typings.activexLibreoffice.com_.sun.star.xsd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an [XSD compliant simple data type]{@link url="http://www.w3.org/TR/xmlschema-2/#built-in-datatypes"} */
trait XDataType extends XPropertySet {
  /**
    * specifies whether the type is a basic type
    *
    * Basic types are built into the type system, and cannot be changed by the user.
    */
  var IsBasic: scala.Boolean
  /** provides access to the name of the type */
  var Name: java.lang.String
  /**
    * specifies the pattern which strings conforming to this type comply to
    *
    * See [http://www.w3.org/TR/xmlschema-2/#rf-pattern]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-pattern"}
    */
  var Pattern: java.lang.String
  /**
    * class of the type
    * @see DataTypeClass
    */
  var TypeClass: Double
  /**
    * specifies how strings of this data type are to be processed, with respect to white spaces
    *
    * See [http://www.w3.org/TR/xmlschema-2/#rf-whiteSpace]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-whiteSpace"}
    */
  var WhiteSpaceTreatment: Double
  def explainInvalid(value: java.lang.String): java.lang.String
  def validate(value: java.lang.String): scala.Boolean
}

object XDataType {
  @scala.inline
  def apply(
    IsBasic: scala.Boolean,
    Name: java.lang.String,
    Pattern: java.lang.String,
    PropertySetInfo: XPropertySetInfo,
    TypeClass: Double,
    WhiteSpaceTreatment: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Unit,
    explainInvalid: java.lang.String => java.lang.String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Unit,
    setPropertyValue: (java.lang.String, js.Any) => Unit,
    validate: java.lang.String => scala.Boolean
  ): XDataType = {
    val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[XDataType]
  }
}

