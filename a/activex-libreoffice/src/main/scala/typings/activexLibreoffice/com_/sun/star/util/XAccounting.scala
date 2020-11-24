package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows estimating the memory usage of a service.
  * @since LibreOffice 5.3
  */
@js.native
trait XAccounting extends XInterface {
  
  /** @returns an estimate of the current memory usage, in octets. */
  def estimateUsage(): Double = js.native
}
object XAccounting {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    estimateUsage: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccounting = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), estimateUsage = js.Any.fromFunction0(estimateUsage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccounting]
  }
  
  @scala.inline
  implicit class XAccountingOps[Self <: XAccounting] (val x: Self) extends AnyVal {
    
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
    def setEstimateUsage(value: () => Double): Self = this.set("estimateUsage", js.Any.fromFunction0(value))
  }
}
