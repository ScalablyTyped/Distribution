package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskCredentials extends StObject {
  
  /**
    * The ARN of an IAM role that Step Functions assumes for the task. The role can allow cross-account access to resources.
    */
  var roleArn: js.UndefOr[LongArn] = js.undefined
}
object TaskCredentials {
  
  inline def apply(): TaskCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskCredentials] (val x: Self) extends AnyVal {
    
    inline def setRoleArn(value: LongArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
