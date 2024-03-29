package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAutoMLJobResponse extends StObject {
  
  /**
    * The unique ARN assigned to the AutoML job when it is created.
    */
  var AutoMLJobArn: typings.awsSdk.clientsSagemakerMod.AutoMLJobArn
}
object CreateAutoMLJobResponse {
  
  inline def apply(AutoMLJobArn: AutoMLJobArn): CreateAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAutoMLJobResponse] (val x: Self) extends AnyVal {
    
    inline def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
  }
}
