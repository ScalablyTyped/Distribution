package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamIdentity extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM identity.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the principal that assumes the IAM identity.
    */
  var PrincipalId: js.UndefOr[String] = js.undefined
  
  /**
    * The person or application which assumes the IAM identity.
    */
  var SourceIdentity: js.UndefOr[String] = js.undefined
}
object IamIdentity {
  
  inline def apply(): IamIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IamIdentity] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    inline def setSourceIdentity(value: String): Self = StObject.set(x, "SourceIdentity", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentityUndefined: Self = StObject.set(x, "SourceIdentity", js.undefined)
  }
}
