package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Caller extends StObject {
  
  var caller: js.UndefOr[String] = js.native
  
  var channelId: String = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object Caller {
  
  @scala.inline
  def apply(channelId: String): Caller = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caller]
  }
  
  @scala.inline
  implicit class CallerMutableBuilder[Self <: Caller] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaller(value: String): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
