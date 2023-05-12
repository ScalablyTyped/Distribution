package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmsKey extends StObject {
  
  /**
    * KMS Alias Arn.
    */
  var kmsAliasArn: js.UndefOr[KeyAliasArn] = js.undefined
  
  /**
    * KMS Key Arn.
    */
  var kmsKeyArn: js.UndefOr[KeyArn] = js.undefined
}
object KmsKey {
  
  inline def apply(): KmsKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KmsKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmsKey] (val x: Self) extends AnyVal {
    
    inline def setKmsAliasArn(value: KeyAliasArn): Self = StObject.set(x, "kmsAliasArn", value.asInstanceOf[js.Any])
    
    inline def setKmsAliasArnUndefined: Self = StObject.set(x, "kmsAliasArn", js.undefined)
    
    inline def setKmsKeyArn(value: KeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
  }
}
