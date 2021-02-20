package typings.angularSpinner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpinnerService extends StObject {
  
  /**
    * Start selected spinner
    *
    * @param spinner key
    */
  def spin(key: String): Unit = js.native
  
  /**
    * Stop selected spinner
    *
    * @param spinner key
    */
  def stop(key: String): Unit = js.native
}
object ISpinnerService {
  
  @scala.inline
  def apply(spin: String => Unit, stop: String => Unit): ISpinnerService = {
    val __obj = js.Dynamic.literal(spin = js.Any.fromFunction1(spin), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[ISpinnerService]
  }
  
  @scala.inline
  implicit class ISpinnerServiceMutableBuilder[Self <: ISpinnerService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpin(value: String => Unit): Self = StObject.set(x, "spin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: String => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
