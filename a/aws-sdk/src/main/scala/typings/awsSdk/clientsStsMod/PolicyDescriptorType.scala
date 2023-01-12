package typings.awsSdk.clientsStsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDescriptorType extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM managed policy to use as a session policy for the role. For more information about ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web Services General Reference.
    */
  var arn: js.UndefOr[arnType] = js.undefined
}
object PolicyDescriptorType {
  
  inline def apply(): PolicyDescriptorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDescriptorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyDescriptorType] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
  }
}
