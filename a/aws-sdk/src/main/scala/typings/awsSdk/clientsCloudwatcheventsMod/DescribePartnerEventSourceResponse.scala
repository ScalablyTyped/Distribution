package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePartnerEventSourceResponse extends StObject {
  
  /**
    * The ARN of the event source.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the event source.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object DescribePartnerEventSourceResponse {
  
  inline def apply(): DescribePartnerEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePartnerEventSourceResponse]
  }
  
  extension [Self <: DescribePartnerEventSourceResponse](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
