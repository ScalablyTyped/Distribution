package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConnectionProperties extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the VPC connection.
    */
  var VpcConnectionArn: Arn
}
object VpcConnectionProperties {
  
  inline def apply(VpcConnectionArn: Arn): VpcConnectionProperties = {
    val __obj = js.Dynamic.literal(VpcConnectionArn = VpcConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConnectionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcConnectionProperties] (val x: Self) extends AnyVal {
    
    inline def setVpcConnectionArn(value: Arn): Self = StObject.set(x, "VpcConnectionArn", value.asInstanceOf[js.Any])
  }
}
