package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectionResponse extends StObject {
  
  /**
    * The connection that is being deleted.
    */
  var Connection: js.UndefOr[typings.awsSdk.clientsDmsMod.Connection] = js.undefined
}
object DeleteConnectionResponse {
  
  inline def apply(): DeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
