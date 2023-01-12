package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyspaceResponse extends StObject {
  
  /**
    * The name of the keyspace.
    */
  var keyspaceName: KeyspaceName
  
  /**
    * The ARN of the keyspace.
    */
  var resourceArn: ARN
}
object GetKeyspaceResponse {
  
  inline def apply(keyspaceName: KeyspaceName, resourceArn: ARN): GetKeyspaceResponse = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyspaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKeyspaceResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
