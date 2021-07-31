package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// SCEProvider
// see http://docs.angularjs.org/api/ng/provider/$sceProvider
///////////////////////////////////////////////////////////////////////////
trait ISCEProvider
  extends StObject
     with IServiceProvider {
  
  def enabled(value: Boolean): Unit
}
object ISCEProvider {
  
  @scala.inline
  def apply($get: js.Any, enabled: Boolean => Unit): ISCEProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], enabled = js.Any.fromFunction1(enabled))
    __obj.asInstanceOf[ISCEProvider]
  }
  
  @scala.inline
  implicit class ISCEProviderMutableBuilder[Self <: ISCEProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean => Unit): Self = StObject.set(x, "enabled", js.Any.fromFunction1(value))
  }
}
