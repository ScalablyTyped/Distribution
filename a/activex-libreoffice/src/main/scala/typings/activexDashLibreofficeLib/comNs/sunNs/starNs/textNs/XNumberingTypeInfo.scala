package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the numbering types that are supported by a component.
  *
  * To be able to store unknown numbering types in a file format the numbering types correspond to an identifier.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.style.NumberingType
  * @version 1.0
  */
trait XNumberingTypeInfo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  val SupportedNumberingTypes: activexDashInteropLib.SafeArray[scala.Double]
  /** returns the corresponding identifier to a numbering type. */
  def getNumberingIdentifier(NumberingType: scala.Double): java.lang.String
  /** returns the corresponding numbering type to an identifier. */
  def getNumberingType(NumberingIdentifier: java.lang.String): scala.Double
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  def getSupportedNumberingTypes(): activexDashInteropLib.SafeArray[scala.Double]
  /** determines whether an identifier is supported. */
  def hasNumberingType(NumberingIdentifier: java.lang.String): scala.Boolean
}

