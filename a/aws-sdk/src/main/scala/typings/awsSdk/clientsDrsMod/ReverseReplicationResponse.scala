package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReverseReplicationResponse extends StObject {
  
  /**
    * ARN of created SourceServer.
    */
  var reversedDirectionSourceServerArn: js.UndefOr[SourceServerARN] = js.undefined
}
object ReverseReplicationResponse {
  
  inline def apply(): ReverseReplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReverseReplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReverseReplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setReversedDirectionSourceServerArn(value: SourceServerARN): Self = StObject.set(x, "reversedDirectionSourceServerArn", value.asInstanceOf[js.Any])
    
    inline def setReversedDirectionSourceServerArnUndefined: Self = StObject.set(x, "reversedDirectionSourceServerArn", js.undefined)
  }
}
