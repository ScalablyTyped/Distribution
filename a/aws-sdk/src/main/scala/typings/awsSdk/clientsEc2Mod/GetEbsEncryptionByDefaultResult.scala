package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEbsEncryptionByDefaultResult extends StObject {
  
  /**
    * Indicates whether encryption by default is enabled.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.undefined
}
object GetEbsEncryptionByDefaultResult {
  
  inline def apply(): GetEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEbsEncryptionByDefaultResult]
  }
  
  extension [Self <: GetEbsEncryptionByDefaultResult](x: Self) {
    
    inline def setEbsEncryptionByDefault(value: Boolean): Self = StObject.set(x, "EbsEncryptionByDefault", value.asInstanceOf[js.Any])
    
    inline def setEbsEncryptionByDefaultUndefined: Self = StObject.set(x, "EbsEncryptionByDefault", js.undefined)
  }
}
