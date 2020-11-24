package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows access to a one-dimensional sequence of double precision floating-point numbers. */
@js.native
trait XNumericalDataSequence extends XInterface {
  
  /** retrieves data as `double` values. */
  val NumericalData: SafeArray[Double] = js.native
  
  /** retrieves data as `double` values. */
  def getNumericalData(): SafeArray[Double] = js.native
}
object XNumericalDataSequence {
  
  @scala.inline
  def apply(
    NumericalData: SafeArray[Double],
    acquire: () => Unit,
    getNumericalData: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumericalDataSequence = {
    val __obj = js.Dynamic.literal(NumericalData = NumericalData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getNumericalData = js.Any.fromFunction0(getNumericalData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumericalDataSequence]
  }
  
  @scala.inline
  implicit class XNumericalDataSequenceOps[Self <: XNumericalDataSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNumericalData(value: SafeArray[Double]): Self = this.set("NumericalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNumericalData(value: () => SafeArray[Double]): Self = this.set("getNumericalData", js.Any.fromFunction0(value))
  }
}
