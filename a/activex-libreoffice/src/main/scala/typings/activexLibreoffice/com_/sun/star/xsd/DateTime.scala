package typings.activexLibreoffice.com_.sun.star.xsd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an [XSD compliant dateTime type]{@link url="http://www.w3.org/TR/xmlschema-2/#dateTime"} */
@js.native
trait DateTime extends XDataType {
  
  /**
    * specifies the exclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
    */
  var MaxExclusiveDateTime: typings.activexLibreoffice.com_.sun.star.util.DateTime = js.native
  
  /**
    * specifies the inclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
    */
  var MaxInclusiveDateTime: typings.activexLibreoffice.com_.sun.star.util.DateTime = js.native
  
  /**
    * specifies the exclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
    */
  var MinExclusiveDateTime: typings.activexLibreoffice.com_.sun.star.util.DateTime = js.native
  
  /**
    * specifies the inclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
    */
  var MinInclusiveDateTime: typings.activexLibreoffice.com_.sun.star.util.DateTime = js.native
}
object DateTime {
  
  @scala.inline
  def apply(
    IsBasic: scala.Boolean,
    MaxExclusiveDateTime: typings.activexLibreoffice.com_.sun.star.util.DateTime,
    MaxInclusiveDateTime: typings.activexLibreoffice.com_.sun.star.util.DateTime,
    MinExclusiveDateTime: typings.activexLibreoffice.com_.sun.star.util.DateTime,
    MinInclusiveDateTime: typings.activexLibreoffice.com_.sun.star.util.DateTime,
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
  ): DateTime = {
    val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveDateTime = MaxExclusiveDateTime.asInstanceOf[js.Any], MaxInclusiveDateTime = MaxInclusiveDateTime.asInstanceOf[js.Any], MinExclusiveDateTime = MinExclusiveDateTime.asInstanceOf[js.Any], MinInclusiveDateTime = MinInclusiveDateTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[DateTime]
  }
  
  @scala.inline
  implicit class DateTimeOps[Self <: DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxExclusiveDateTime(value: typings.activexLibreoffice.com_.sun.star.util.DateTime): Self = this.set("MaxExclusiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInclusiveDateTime(value: typings.activexLibreoffice.com_.sun.star.util.DateTime): Self = this.set("MaxInclusiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinExclusiveDateTime(value: typings.activexLibreoffice.com_.sun.star.util.DateTime): Self = this.set("MinExclusiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinInclusiveDateTime(value: typings.activexLibreoffice.com_.sun.star.util.DateTime): Self = this.set("MinInclusiveDateTime", value.asInstanceOf[js.Any])
  }
}
