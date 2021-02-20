package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubscribeOptions extends StObject {
  
  var get_retained: js.UndefOr[Boolean] = js.native
  
  var `match`: js.UndefOr[String] = js.native
}
object ISubscribeOptions {
  
  @scala.inline
  def apply(): ISubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscribeOptions]
  }
  
  @scala.inline
  implicit class ISubscribeOptionsMutableBuilder[Self <: ISubscribeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_retained(value: Boolean): Self = StObject.set(x, "get_retained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet_retainedUndefined: Self = StObject.set(x, "get_retained", js.undefined)
    
    @scala.inline
    def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
  }
}
