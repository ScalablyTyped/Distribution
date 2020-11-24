package typings.activexLibreoffice.com_.sun.star.xsd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an [XSD compliant decimal type]{@link url="http://www.w3.org/TR/xmlschema-2/#decimal"} */
@js.native
trait Decimal extends XDataType {
  
  /**
    * fractionDigits is the maximum number of digits in the fractional part of values of decimal data
    *
    * The value of fractionDigits must be a non negative integer.
    *
    * See [http://www.w3.org/TR/xmlschema-2/#rf-fractionDigits]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-fractionDigits"}
    */
  var FractionDigits: Double = js.native
  
  /**
    * specifies the exclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
    */
  var MaxExclusiveDouble: Double = js.native
  
  /**
    * specifies the inclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
    */
  var MaxInclusiveDouble: Double = js.native
  
  /**
    * specifies the exclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
    */
  var MinExclusiveDouble: Double = js.native
  
  /**
    * specifies the inclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
    */
  var MinInclusiveDouble: Double = js.native
  
  /**
    * totalDigits is the maximum number of digits in values of decimal data types.
    *
    * The value of totalDigits must be a positive integer.
    *
    * See [http://www.w3.org/TR/xmlschema-2/#rf-totalDigits]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-totalDigits"}
    */
  var TotalDigits: Double = js.native
}
object Decimal {
  
  @scala.inline
  def apply(
    FractionDigits: Double,
    IsBasic: scala.Boolean,
    MaxExclusiveDouble: Double,
    MaxInclusiveDouble: Double,
    MinExclusiveDouble: Double,
    MinInclusiveDouble: Double,
    Name: java.lang.String,
    Pattern: java.lang.String,
    PropertySetInfo: XPropertySetInfo,
    TotalDigits: Double,
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
  ): Decimal = {
    val __obj = js.Dynamic.literal(FractionDigits = FractionDigits.asInstanceOf[js.Any], IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveDouble = MaxExclusiveDouble.asInstanceOf[js.Any], MaxInclusiveDouble = MaxInclusiveDouble.asInstanceOf[js.Any], MinExclusiveDouble = MinExclusiveDouble.asInstanceOf[js.Any], MinInclusiveDouble = MinInclusiveDouble.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TotalDigits = TotalDigits.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Decimal]
  }
  
  @scala.inline
  implicit class DecimalOps[Self <: Decimal] (val x: Self) extends AnyVal {
    
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
    def setFractionDigits(value: Double): Self = this.set("FractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxExclusiveDouble(value: Double): Self = this.set("MaxExclusiveDouble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInclusiveDouble(value: Double): Self = this.set("MaxInclusiveDouble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinExclusiveDouble(value: Double): Self = this.set("MinExclusiveDouble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinInclusiveDouble(value: Double): Self = this.set("MinInclusiveDouble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDigits(value: Double): Self = this.set("TotalDigits", value.asInstanceOf[js.Any])
  }
}
