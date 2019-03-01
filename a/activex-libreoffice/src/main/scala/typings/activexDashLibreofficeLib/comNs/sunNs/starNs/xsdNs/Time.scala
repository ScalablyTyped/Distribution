package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an [XSD compliant time type]{@link url="http://www.w3.org/TR/xmlschema-2/#time"} */
trait Time extends XDataType {
  /**
    * specifies the exclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
    */
  var MaxExclusiveTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /**
    * specifies the inclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
    */
  var MaxInclusiveTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /**
    * specifies the exclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
    */
  var MinExclusiveTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  /**
    * specifies the inclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
    */
  var MinInclusiveTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
}

object Time {
  @scala.inline
  def apply(
    IsBasic: scala.Boolean,
    MaxExclusiveTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    MaxInclusiveTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    MinExclusiveTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    MinInclusiveTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
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
  ): Time = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsBasic")(IsBasic)
    __obj.updateDynamic("MaxExclusiveTime")(MaxExclusiveTime)
    __obj.updateDynamic("MaxInclusiveTime")(MaxInclusiveTime)
    __obj.updateDynamic("MinExclusiveTime")(MinExclusiveTime)
    __obj.updateDynamic("MinInclusiveTime")(MinInclusiveTime)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Pattern")(Pattern)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("WhiteSpaceTreatment")(WhiteSpaceTreatment)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("explainInvalid")(explainInvalid)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Time]
  }
}

