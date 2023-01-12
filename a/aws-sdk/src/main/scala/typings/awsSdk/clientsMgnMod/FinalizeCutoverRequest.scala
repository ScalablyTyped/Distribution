package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalizeCutoverRequest extends StObject {
  
  /**
    * Request to finalize Cutover by Source Server ID.
    */
  var sourceServerID: SourceServerID
}
object FinalizeCutoverRequest {
  
  inline def apply(sourceServerID: SourceServerID): FinalizeCutoverRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalizeCutoverRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FinalizeCutoverRequest] (val x: Self) extends AnyVal {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
