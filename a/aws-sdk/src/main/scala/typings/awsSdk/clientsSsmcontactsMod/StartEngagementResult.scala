package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEngagementResult extends StObject {
  
  /**
    * The ARN of the engagement.
    */
  var EngagementArn: SsmContactsArn
}
object StartEngagementResult {
  
  inline def apply(EngagementArn: SsmContactsArn): StartEngagementResult = {
    val __obj = js.Dynamic.literal(EngagementArn = EngagementArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEngagementResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartEngagementResult] (val x: Self) extends AnyVal {
    
    inline def setEngagementArn(value: SsmContactsArn): Self = StObject.set(x, "EngagementArn", value.asInstanceOf[js.Any])
  }
}
