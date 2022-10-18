package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSourceServerRequest extends StObject {
  
  /**
    * Request to delete Source Server from service by Server ID.
    */
  var sourceServerID: SourceServerID
}
object DeleteSourceServerRequest {
  
  inline def apply(sourceServerID: SourceServerID): DeleteSourceServerRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSourceServerRequest]
  }
  
  extension [Self <: DeleteSourceServerRequest](x: Self) {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
