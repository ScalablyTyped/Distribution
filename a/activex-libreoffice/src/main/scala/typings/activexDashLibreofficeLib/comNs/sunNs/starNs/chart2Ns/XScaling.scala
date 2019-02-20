package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XScaling
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Get an interface object that conforms to a scaling rule that is the reverse of the original scaling rule.
    * @returns internface object that represents the reversed scaling rule.
    */
  val InverseScaling: XScaling
  /**
    * Given a numeric value, return the scaled value that conforms to a predefined scaling rule. For instance, for linear scaling, given a x value, the
    * method may return a y value as defined by y = Ax + B for predefined values of A and B.
    * @param value input value from which to calculate the scaled value.
    * @returns scaled value based on a predefined scaling rule.
    */
  def doScaling(value: scala.Double): scala.Double
  /**
    * Get an interface object that conforms to a scaling rule that is the reverse of the original scaling rule.
    * @returns internface object that represents the reversed scaling rule.
    */
  def getInverseScaling(): XScaling
}

