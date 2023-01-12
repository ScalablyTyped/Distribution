package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpTimeout extends StObject {
  
  /**
    * An object that represents an idle timeout. An idle timeout bounds the amount of time that a connection may be idle. The default value is none.
    */
  var idle: js.UndefOr[Duration] = js.undefined
}
object TcpTimeout {
  
  inline def apply(): TcpTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TcpTimeout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TcpTimeout] (val x: Self) extends AnyVal {
    
    inline def setIdle(value: Duration): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setIdleUndefined: Self = StObject.set(x, "idle", js.undefined)
  }
}
