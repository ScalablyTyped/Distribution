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

