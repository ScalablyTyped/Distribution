package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectLockConfigurationOutput extends StObject {
  
  var RequestCharged: js.UndefOr[typings.awsSdk.clientsS3Mod.RequestCharged] = js.undefined
}
object PutObjectLockConfigurationOutput {
  
  inline def apply(): PutObjectLockConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectLockConfigurationOutput]
  }
  
  extension [Self <: PutObjectLockConfigurationOutput](x: Self) {
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
