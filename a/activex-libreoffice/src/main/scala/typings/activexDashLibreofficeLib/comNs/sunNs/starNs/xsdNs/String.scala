package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an [XSD compliant string type]{@link url="http://www.w3.org/TR/xmlschema-2/#string"} */
trait String extends XDataType {
  /**
    * specifies the length of the string
    *
    * Note that you cannot specify {@link Length} together with {@link MinLength} or {@link MaxLength} .
    */
  var Length: scala.Double
  /**
    * specifies the maximum length of the string
    *
    * Note that you cannot specify {@link MaxLength} together with {@link Length} .
    */
  var MaxLength: scala.Double
  /**
    * specifies the minimum length of the string
    *
    * Note that you cannot specify {@link MinLength} together with {@link Length} .
    */
  var MinLength: scala.Double
}

object String {
  @scala.inline
  def apply(
    IsBasic: scala.Boolean,
    Length: scala.Double,
    MaxLength: scala.Double,
    MinLength: scala.Double,
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
  ): String = {
    val __obj = js.Dynamic.literal(IsBasic = IsBasic, Length = Length, MaxLength = MaxLength, MinLength = MinLength, Name = Name, Pattern = Pattern, PropertySetInfo = PropertySetInfo, TypeClass = TypeClass, WhiteSpaceTreatment = WhiteSpaceTreatment, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, explainInvalid = explainInvalid, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, validate = validate)
  
    __obj.asInstanceOf[String]
  }
}

