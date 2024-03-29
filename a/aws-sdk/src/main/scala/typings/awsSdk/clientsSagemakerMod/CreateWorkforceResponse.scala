package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkforceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the workforce.
    */
  var WorkforceArn: typings.awsSdk.clientsSagemakerMod.WorkforceArn
}
object CreateWorkforceResponse {
  
  inline def apply(WorkforceArn: WorkforceArn): CreateWorkforceResponse = {
    val __obj = js.Dynamic.literal(WorkforceArn = WorkforceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkforceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkforceResponse] (val x: Self) extends AnyVal {
    
    inline def setWorkforceArn(value: WorkforceArn): Self = StObject.set(x, "WorkforceArn", value.asInstanceOf[js.Any])
  }
}
