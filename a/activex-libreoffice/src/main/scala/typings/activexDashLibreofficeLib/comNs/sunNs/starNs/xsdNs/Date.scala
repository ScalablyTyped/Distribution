package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an [XSD compliant date type]{@link url="http://www.w3.org/TR/xmlschema-2/#date"} */
trait Date extends XDataType {
  /**
    * specifies the exclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
    */
  var MaxExclusiveDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /**
    * specifies the inclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
    */
  var MaxInclusiveDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /**
    * specifies the exclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
    */
  var MinExclusiveDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
  /**
    * specifies the inclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
    */
  var MinInclusiveDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date
}

object Date {
  @scala.inline
  def apply(
    IsBasic: scala.Boolean,
    MaxExclusiveDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    MaxInclusiveDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    MinExclusiveDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    MinInclusiveDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    Name: java.lang.String,
    Pattern: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    TypeClass: scala.Double,
    WhiteSpaceTreatment: scala.Double,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    explainInvalid: js.Function1[java.lang.String, java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    validate: js.Function1[java.lang.String, scala.Boolean]
  ): Date = {
    val __obj = js.Dynamic.literal(IsBasic = IsBasic, MaxExclusiveDate = MaxExclusiveDate, MaxInclusiveDate = MaxInclusiveDate, MinExclusiveDate = MinExclusiveDate, MinInclusiveDate = MinInclusiveDate, Name = Name, Pattern = Pattern, PropertySetInfo = PropertySetInfo, TypeClass = TypeClass, WhiteSpaceTreatment = WhiteSpaceTreatment, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, explainInvalid = explainInvalid, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, validate = validate)
  
    __obj.asInstanceOf[Date]
  }
}

