package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows access to a one-dimensional sequence of double precision floating-point numbers. */
trait XNumericalDataSequence
  extends StObject
     with XInterface {
  
  /** retrieves data as `double` values. */
  val NumericalData: SafeArray[Double]
  
  /** retrieves data as `double` values. */
  def getNumericalData(): SafeArray[Double]
}
object XNumericalDataSequence {
  
  inline def apply(
    NumericalData: SafeArray[Double],
    acquire: () => Unit,
    getNumericalData: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumericalDataSequence = {
    val __obj = js.Dynamic.literal(NumericalData = NumericalData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getNumericalData = js.Any.fromFunction0(getNumericalData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumericalDataSequence]
  }
  
  extension [Self <: XNumericalDataSequence](x: Self) {
    
    inline def setGetNumericalData(value: () => SafeArray[Double]): Self = StObject.set(x, "getNumericalData", js.Any.fromFunction0(value))
    
    inline def setNumericalData(value: SafeArray[Double]): Self = StObject.set(x, "NumericalData", value.asInstanceOf[js.Any])
  }
}
