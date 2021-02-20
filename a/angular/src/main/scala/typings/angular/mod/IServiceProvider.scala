package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// All service providers extend this interface
@js.native
trait IServiceProvider extends StObject {
  
  @JSName("$get")
  var $get: js.Any = js.native
}
object IServiceProvider {
  
  @scala.inline
  def apply($get: js.Any): IServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceProvider]
  }
  
  @scala.inline
  implicit class IServiceProviderMutableBuilder[Self <: IServiceProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$get(value: js.Any): Self = StObject.set(x, "$get", value.asInstanceOf[js.Any])
  }
}
