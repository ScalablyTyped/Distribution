package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistingSansProvider
  extends StObject
     with InjectableProvider {
  
  /**
    * Existing `token` to return. (Equivalent to `injector.get(useExisting)`)
    */
  var useExisting: js.Any
}
object ExistingSansProvider {
  
  @scala.inline
  def apply(useExisting: js.Any): ExistingSansProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingSansProvider]
  }
  
  @scala.inline
  implicit class ExistingSansProviderMutableBuilder[Self <: ExistingSansProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseExisting(value: js.Any): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
  }
}
