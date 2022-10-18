package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectSourceServerRequest extends StObject {
  
  /**
    * The ID of the Source Server to disconnect.
    */
  var sourceServerID: SourceServerID
}
object DisconnectSourceServerRequest {
  
  inline def apply(sourceServerID: SourceServerID): DisconnectSourceServerRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectSourceServerRequest]
  }
  
  extension [Self <: DisconnectSourceServerRequest](x: Self) {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
