package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XScaling extends XInterface {
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
  def doScaling(value: Double): Double
  /**
    * Get an interface object that conforms to a scaling rule that is the reverse of the original scaling rule.
    * @returns internface object that represents the reversed scaling rule.
    */
  def getInverseScaling(): XScaling
}

object XScaling {
  @scala.inline
  def apply(
    InverseScaling: XScaling,
    acquire: () => Unit,
    doScaling: Double => Double,
    getInverseScaling: () => XScaling,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScaling = {
    val __obj = js.Dynamic.literal(InverseScaling = InverseScaling, acquire = js.Any.fromFunction0(acquire), doScaling = js.Any.fromFunction1(doScaling), getInverseScaling = js.Any.fromFunction0(getInverseScaling), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XScaling]
  }
}

