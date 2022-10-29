package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alert extends StObject {
  
  /**
    * The code for the alert. For example, NOT_PROCESSED.
    */
  var AlertCode: _String
  
  /**
    * If an alert is generated for a resource, an explanation of the reason for the alert.
    */
  var AlertMessage: _String
  
  /**
    * The timestamp when the alert was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The Amazon Resource Names (ARNs) related to this alert.
    */
  var RelatedResourceArns: listOfString
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: _String
}
object Alert {
  
  inline def apply(
    AlertCode: _String,
    AlertMessage: _String,
    LastModifiedTime: js.Date,
    RelatedResourceArns: listOfString,
    ResourceArn: _String
  ): Alert = {
    val __obj = js.Dynamic.literal(AlertCode = AlertCode.asInstanceOf[js.Any], AlertMessage = AlertMessage.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], RelatedResourceArns = RelatedResourceArns.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
  
  extension [Self <: Alert](x: Self) {
    
    inline def setAlertCode(value: _String): Self = StObject.set(x, "AlertCode", value.asInstanceOf[js.Any])
    
    inline def setAlertMessage(value: _String): Self = StObject.set(x, "AlertMessage", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setRelatedResourceArns(value: listOfString): Self = StObject.set(x, "RelatedResourceArns", value.asInstanceOf[js.Any])
    
    inline def setRelatedResourceArnsVarargs(value: _String*): Self = StObject.set(x, "RelatedResourceArns", js.Array(value*))
    
    inline def setResourceArn(value: _String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
