package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyOutput extends StObject {
  
  /**
    *  The ARN of the Project or ReportGroup resource that is associated with a resource policy. 
    */
  var resourceArn: js.UndefOr[NonEmptyString] = js.undefined
}
object PutResourcePolicyOutput {
  
  inline def apply(): PutResourcePolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyOutput]
  }
  
  extension [Self <: PutResourcePolicyOutput](x: Self) {
    
    inline def setResourceArn(value: NonEmptyString): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
  }
}
