package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItemNotification extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Simple Notification Service (Amazon SNS) topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Arn: js.UndefOr[String] = js.undefined
}
object OpsItemNotification {
  
  inline def apply(): OpsItemNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItemNotification]
  }
  
  extension [Self <: OpsItemNotification](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
