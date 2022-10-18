package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEbsDefaultKmsKeyIdResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the default KMS key for encryption by default.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
}
object GetEbsDefaultKmsKeyIdResult {
  
  inline def apply(): GetEbsDefaultKmsKeyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEbsDefaultKmsKeyIdResult]
  }
  
  extension [Self <: GetEbsDefaultKmsKeyIdResult](x: Self) {
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
