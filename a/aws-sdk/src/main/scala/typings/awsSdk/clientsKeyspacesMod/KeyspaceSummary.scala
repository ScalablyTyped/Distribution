package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyspaceSummary extends StObject {
  
  /**
    * The name of the keyspace.
    */
  var keyspaceName: KeyspaceName
  
  /**
    * The unique identifier of the keyspace in the format of an Amazon Resource Name (ARN).
    */
  var resourceArn: ARN
}
object KeyspaceSummary {
  
  inline def apply(keyspaceName: KeyspaceName, resourceArn: ARN): KeyspaceSummary = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyspaceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyspaceSummary] (val x: Self) extends AnyVal {
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
