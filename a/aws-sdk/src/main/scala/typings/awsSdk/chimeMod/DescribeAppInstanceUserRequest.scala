package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the app instance user.
    */
  var AppInstanceUserArn: ChimeArn
}
object DescribeAppInstanceUserRequest {
  
  inline def apply(AppInstanceUserArn: ChimeArn): DescribeAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppInstanceUserRequest]
  }
  
  extension [Self <: DescribeAppInstanceUserRequest](x: Self) {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
  }
}
