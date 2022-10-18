package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHapgRequest extends StObject {
  
  /**
    * The ARN of the high-availability partition group to describe.
    */
  var HapgArn: typings.awsSdk.clientsCloudhsmMod.HapgArn
}
object DescribeHapgRequest {
  
  inline def apply(HapgArn: HapgArn): DescribeHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHapgRequest]
  }
  
  extension [Self <: DescribeHapgRequest](x: Self) {
    
    inline def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
  }
}
