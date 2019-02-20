package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an [XSD compliant decimal type]{@link url="http://www.w3.org/TR/xmlschema-2/#decimal"} */
trait Decimal extends XDataType {
  /**
    * fractionDigits is the maximum number of digits in the fractional part of values of decimal data
    *
    * The value of fractionDigits must be a non negative integer.
    *
    * See [http://www.w3.org/TR/xmlschema-2/#rf-fractionDigits]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-fractionDigits"}
    */
  var FractionDigits: scala.Double
  /**
    * specifies the exclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
    */
  var MaxExclusiveDouble: scala.Double
  /**
    * specifies the inclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
    */
  var MaxInclusiveDouble: scala.Double
  /**
    * specifies the exclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
    */
  var MinExclusiveDouble: scala.Double
  /**
    * specifies the inclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
    */
  var MinInclusiveDouble: scala.Double
  /**
    * totalDigits is the maximum number of digits in values of decimal data types.
    *
    * The value of totalDigits must be a positive integer.
    *
    * See [http://www.w3.org/TR/xmlschema-2/#rf-totalDigits]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-totalDigits"}
    */
  var TotalDigits: scala.Double
}

