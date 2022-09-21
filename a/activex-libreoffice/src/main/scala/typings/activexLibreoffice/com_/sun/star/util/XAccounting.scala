package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows estimating the memory usage of a service.
  * @since LibreOffice 5.3
  */
trait XAccounting
  extends StObject
     with XInterface {
  
  /** @returns an estimate of the current memory usage, in octets. */
  def estimateUsage(): Double
}
object XAccounting {
  
  inline def apply(
    acquire: () => Unit,
    estimateUsage: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAccounting = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), estimateUsage = js.Any.fromFunction0(estimateUsage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccounting]
  }
  
  extension [Self <: XAccounting](x: Self) {
    
    inline def setEstimateUsage(value: () => Double): Self = StObject.set(x, "estimateUsage", js.Any.fromFunction0(value))
  }
}
