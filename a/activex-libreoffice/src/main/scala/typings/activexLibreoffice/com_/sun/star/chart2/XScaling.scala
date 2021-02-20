package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XScaling extends XInterface {
  
  /**
    * Get an interface object that conforms to a scaling rule that is the reverse of the original scaling rule.
    * @returns internface object that represents the reversed scaling rule.
    */
  val InverseScaling: XScaling = js.native
  
  /**
    * Given a numeric value, return the scaled value that conforms to a predefined scaling rule. For instance, for linear scaling, given a x value, the
    * method may return a y value as defined by y = Ax + B for predefined values of A and B.
    * @param value input value from which to calculate the scaled value.
    * @returns scaled value based on a predefined scaling rule.
    */
  def doScaling(value: Double): Double = js.native
  
  /**
    * Get an interface object that conforms to a scaling rule that is the reverse of the original scaling rule.
    * @returns internface object that represents the reversed scaling rule.
    */
  def getInverseScaling(): XScaling = js.native
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
    val __obj = js.Dynamic.literal(InverseScaling = InverseScaling.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), doScaling = js.Any.fromFunction1(doScaling), getInverseScaling = js.Any.fromFunction0(getInverseScaling), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScaling]
  }
  
  @scala.inline
  implicit class XScalingMutableBuilder[Self <: XScaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoScaling(value: Double => Double): Self = StObject.set(x, "doScaling", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInverseScaling(value: () => XScaling): Self = StObject.set(x, "getInverseScaling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInverseScaling(value: XScaling): Self = StObject.set(x, "InverseScaling", value.asInstanceOf[js.Any])
  }
}
