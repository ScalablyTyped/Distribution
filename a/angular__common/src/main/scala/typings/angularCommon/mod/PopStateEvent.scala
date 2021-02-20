package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopStateEvent extends StObject {
  
  var pop: js.UndefOr[Boolean] = js.native
  
  var state: js.UndefOr[js.Any] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object PopStateEvent {
  
  @scala.inline
  def apply(): PopStateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopStateEvent]
  }
  
  @scala.inline
  implicit class PopStateEventMutableBuilder[Self <: PopStateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPop(value: Boolean): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
