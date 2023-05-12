package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceBotRequest extends StObject {
  
  /**
    * The ARN of the AppInstanceBot.
    */
  var AppInstanceBotArn: ChimeArn
}
object DescribeAppInstanceBotRequest {
  
  inline def apply(AppInstanceBotArn: ChimeArn): DescribeAppInstanceBotRequest = {
    val __obj = js.Dynamic.literal(AppInstanceBotArn = AppInstanceBotArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppInstanceBotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppInstanceBotRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceBotArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceBotArn", value.asInstanceOf[js.Any])
  }
}
