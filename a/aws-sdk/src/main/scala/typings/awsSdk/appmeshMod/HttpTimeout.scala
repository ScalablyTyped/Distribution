package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpTimeout extends StObject {
  
  /**
    * An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection may be idle. The default value is none.
    */
  var idle: js.UndefOr[Duration] = js.undefined
  
  /**
    * An object that represents a per request timeout. The default value is 15 seconds. If you set a higher timeout, then make sure that the higher value is set for each App Mesh resource in a conversation. For example, if a virtual node backend uses a virtual router provider to route to another virtual node, then the timeout should be greater than 15 seconds for the source and destination virtual node and the route.
    */
  var perRequest: js.UndefOr[Duration] = js.undefined
}
object HttpTimeout {
  
  @scala.inline
  def apply(): HttpTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpTimeout]
  }
  
  @scala.inline
  implicit class HttpTimeoutMutableBuilder[Self <: HttpTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: Duration): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
    
    @scala.inline
    def setPerRequest(value: Duration): Self = StObject.set(x, "perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerRequestUndefined: Self = StObject.set(x, "perRequest", js.undefined)
  }
}
