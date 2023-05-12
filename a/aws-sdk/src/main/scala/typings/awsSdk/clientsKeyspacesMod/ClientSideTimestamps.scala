package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSideTimestamps extends StObject {
  
  /**
    * Shows how to enable client-side timestamps settings for the specified table.
    */
  var status: ClientSideTimestampsStatus
}
object ClientSideTimestamps {
  
  inline def apply(status: ClientSideTimestampsStatus): ClientSideTimestamps = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSideTimestamps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientSideTimestamps] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ClientSideTimestampsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
