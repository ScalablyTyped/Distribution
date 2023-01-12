package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyspaceResponse extends StObject {
  
  /**
    * The unique identifier of the keyspace in the format of an Amazon Resource Name (ARN).
    */
  var resourceArn: ARN
}
object CreateKeyspaceResponse {
  
  inline def apply(resourceArn: ARN): CreateKeyspaceResponse = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyspaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateKeyspaceResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
