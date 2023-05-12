package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelCardSecurityConfig extends StObject {
  
  /**
    * A Key Management Service key ID to use for encrypting a model card.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
}
object ModelCardSecurityConfig {
  
  inline def apply(): ModelCardSecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelCardSecurityConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelCardSecurityConfig] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
