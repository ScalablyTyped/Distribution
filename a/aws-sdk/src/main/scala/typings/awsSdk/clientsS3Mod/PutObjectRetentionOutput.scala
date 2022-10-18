package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectRetentionOutput extends StObject {
  
  var RequestCharged: js.UndefOr[typings.awsSdk.clientsS3Mod.RequestCharged] = js.undefined
}
object PutObjectRetentionOutput {
  
  inline def apply(): PutObjectRetentionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectRetentionOutput]
  }
  
  extension [Self <: PutObjectRetentionOutput](x: Self) {
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
