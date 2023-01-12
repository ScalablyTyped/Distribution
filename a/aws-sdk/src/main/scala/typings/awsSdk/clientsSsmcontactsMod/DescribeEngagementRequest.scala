package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEngagementRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the engagement you want the details of.
    */
  var EngagementId: SsmContactsArn
}
object DescribeEngagementRequest {
  
  inline def apply(EngagementId: SsmContactsArn): DescribeEngagementRequest = {
    val __obj = js.Dynamic.literal(EngagementId = EngagementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEngagementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEngagementRequest] (val x: Self) extends AnyVal {
    
    inline def setEngagementId(value: SsmContactsArn): Self = StObject.set(x, "EngagementId", value.asInstanceOf[js.Any])
  }
}
