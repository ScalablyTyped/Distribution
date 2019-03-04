package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an [XSD compliant simple data type]{@link url="http://www.w3.org/TR/xmlschema-2/#built-in-datatypes"} */
trait XDataType
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
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
  var TypeClass: scala.Double
  /**
    * specifies how strings of this data type are to be processed, with respect to white spaces
    *
    * See [http://www.w3.org/TR/xmlschema-2/#rf-whiteSpace]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-whiteSpace"}
    */
  var WhiteSpaceTreatment: scala.Double
  def explainInvalid(value: java.lang.String): java.lang.String
  def validate(value: java.lang.String): scala.Boolean
}

object XDataType {
  @scala.inline
  def apply(
    IsBasic: scala.Boolean,
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
  ): XDataType = {
    val __obj = js.Dynamic.literal(IsBasic = IsBasic, Name = Name, Pattern = Pattern, PropertySetInfo = PropertySetInfo, TypeClass = TypeClass, WhiteSpaceTreatment = WhiteSpaceTreatment, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, explainInvalid = explainInvalid, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, validate = validate)
  
    __obj.asInstanceOf[XDataType]
  }
}

