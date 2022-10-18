package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachedManagedPolicy extends StObject {
  
  /**
    * The ARN of the AWS managed policy. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var Arn: js.UndefOr[ManagedPolicyArn] = js.undefined
  
  /**
    * The name of the AWS managed policy.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsSsoadminMod.Name] = js.undefined
}
object AttachedManagedPolicy {
  
  inline def apply(): AttachedManagedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedManagedPolicy]
  }
  
  extension [Self <: AttachedManagedPolicy](x: Self) {
    
    inline def setArn(value: ManagedPolicyArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
