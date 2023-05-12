package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAutoMLJobV2Response extends StObject {
  
  /**
    * The unique ARN assigned to the AutoMLJob when it is created.
    */
  var AutoMLJobArn: typings.awsSdk.clientsSagemakerMod.AutoMLJobArn
}
object CreateAutoMLJobV2Response {
  
  inline def apply(AutoMLJobArn: AutoMLJobArn): CreateAutoMLJobV2Response = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobV2Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAutoMLJobV2Response] (val x: Self) extends AnyVal {
    
    inline def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
  }
}
