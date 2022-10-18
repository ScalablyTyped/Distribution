package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSubnetGroupResponse extends StObject {
  
  /**
    * A user-specified message for this action (i.e., a reason for deleting the subnet group).
    */
  var DeletionMessage: js.UndefOr[String] = js.undefined
}
object DeleteSubnetGroupResponse {
  
  inline def apply(): DeleteSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSubnetGroupResponse]
  }
  
  extension [Self <: DeleteSubnetGroupResponse](x: Self) {
    
    inline def setDeletionMessage(value: String): Self = StObject.set(x, "DeletionMessage", value.asInstanceOf[js.Any])
    
    inline def setDeletionMessageUndefined: Self = StObject.set(x, "DeletionMessage", js.undefined)
  }
}
