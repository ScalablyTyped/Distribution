package typings.activexDashLibreoffice.comNs.sunNs.starNs.xsdNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an [XSD compliant time type]{@link url="http://www.w3.org/TR/xmlschema-2/#time"} */
trait Time extends XDataType {
  /**
    * specifies the exclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
    */
  var MaxExclusiveTime: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
  /**
    * specifies the inclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
    */
  var MaxInclusiveTime: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
  /**
    * specifies the exclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
    */
  var MinExclusiveTime: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
  /**
    * specifies the inclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
    */
  var MinInclusiveTime: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
}

object Time {
  @scala.inline
  def apply(
    IsBasic: scala.Boolean,
    MaxExclusiveTime: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time,
    MaxInclusiveTime: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time,
    MinExclusiveTime: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time,
    MinInclusiveTime: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time,
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
  ): Time = {
    val __obj = js.Dynamic.literal(IsBasic = IsBasic, MaxExclusiveTime = MaxExclusiveTime, MaxInclusiveTime = MaxInclusiveTime, MinExclusiveTime = MinExclusiveTime, MinInclusiveTime = MinInclusiveTime, Name = Name, Pattern = Pattern, PropertySetInfo = PropertySetInfo, TypeClass = TypeClass, WhiteSpaceTreatment = WhiteSpaceTreatment, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
  
    __obj.asInstanceOf[Time]
  }
}

