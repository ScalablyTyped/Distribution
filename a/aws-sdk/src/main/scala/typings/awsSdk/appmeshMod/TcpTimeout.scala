package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TcpTimeout extends StObject {
  
  /**
    * An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection may be idle. The default value is none.
    */
  var idle: js.UndefOr[Duration] = js.native
}
object TcpTimeout {
  
  @scala.inline
  def apply(): TcpTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TcpTimeout]
  }
  
  @scala.inline
  implicit class TcpTimeoutMutableBuilder[Self <: TcpTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdle(value: Duration): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
  }
}
