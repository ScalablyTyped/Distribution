package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcConnectionResponse extends StObject {
  
  /**
    * 
    The state of the VPC connection.
    
    */
  var State: js.UndefOr[VpcConnectionState] = js.undefined
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK VPC connection.
    
    */
  var VpcConnectionArn: js.UndefOr[string] = js.undefined
}
object DeleteVpcConnectionResponse {
  
  inline def apply(): DeleteVpcConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVpcConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVpcConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setState(value: VpcConnectionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setVpcConnectionArn(value: string): Self = StObject.set(x, "VpcConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectionArnUndefined: Self = StObject.set(x, "VpcConnectionArn", js.undefined)
  }
}
