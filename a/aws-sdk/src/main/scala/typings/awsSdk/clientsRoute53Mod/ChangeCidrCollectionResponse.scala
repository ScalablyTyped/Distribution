package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeCidrCollectionResponse extends StObject {
  
  /**
    * The ID that is returned by ChangeCidrCollection. You can use it as input to GetChange to see if a CIDR collection change has propagated or not.
    */
  var Id: ChangeId
}
object ChangeCidrCollectionResponse {
  
  inline def apply(Id: ChangeId): ChangeCidrCollectionResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeCidrCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeCidrCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: ChangeId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
