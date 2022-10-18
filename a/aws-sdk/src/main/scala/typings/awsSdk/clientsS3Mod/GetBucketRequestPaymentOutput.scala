package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketRequestPaymentOutput extends StObject {
  
  /**
    * Specifies who pays for the download and request fees.
    */
  var Payer: js.UndefOr[typings.awsSdk.clientsS3Mod.Payer] = js.undefined
}
object GetBucketRequestPaymentOutput {
  
  inline def apply(): GetBucketRequestPaymentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketRequestPaymentOutput]
  }
  
  extension [Self <: GetBucketRequestPaymentOutput](x: Self) {
    
    inline def setPayer(value: Payer): Self = StObject.set(x, "Payer", value.asInstanceOf[js.Any])
    
    inline def setPayerUndefined: Self = StObject.set(x, "Payer", js.undefined)
  }
}
