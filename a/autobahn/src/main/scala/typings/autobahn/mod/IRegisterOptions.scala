package typings.autobahn.mod

import typings.autobahn.autobahnStrings.first
import typings.autobahn.autobahnStrings.last
import typings.autobahn.autobahnStrings.random
import typings.autobahn.autobahnStrings.roundrobin
import typings.autobahn.autobahnStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRegisterOptions extends StObject {
  
  var disclose_caller: js.UndefOr[Boolean] = js.native
  
  var invoke: js.UndefOr[single | roundrobin | random | first | last] = js.native
}
object IRegisterOptions {
  
  @scala.inline
  def apply(): IRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRegisterOptions]
  }
  
  @scala.inline
  implicit class IRegisterOptionsMutableBuilder[Self <: IRegisterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisclose_caller(value: Boolean): Self = StObject.set(x, "disclose_caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisclose_callerUndefined: Self = StObject.set(x, "disclose_caller", js.undefined)
    
    @scala.inline
    def setInvoke(value: single | roundrobin | random | first | last): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokeUndefined: Self = StObject.set(x, "invoke", js.undefined)
  }
}
