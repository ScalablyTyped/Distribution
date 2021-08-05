package typings.angularSpinner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpinnerService extends StObject {
  
  /**
    * Start selected spinner
    *
    * @param spinner key
    */
  def spin(key: String): Unit
  
  /**
    * Stop selected spinner
    *
    * @param spinner key
    */
  def stop(key: String): Unit
}
object ISpinnerService {
  
  inline def apply(spin: String => Unit, stop: String => Unit): ISpinnerService = {
    val __obj = js.Dynamic.literal(spin = js.Any.fromFunction1(spin), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[ISpinnerService]
  }
  
  extension [Self <: ISpinnerService](x: Self) {
    
    inline def setSpin(value: String => Unit): Self = StObject.set(x, "spin", js.Any.fromFunction1(value))
    
    inline def setStop(value: String => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
