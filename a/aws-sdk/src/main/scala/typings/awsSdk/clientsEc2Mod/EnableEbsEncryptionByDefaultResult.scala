package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableEbsEncryptionByDefaultResult extends StObject {
  
  /**
    * The updated status of encryption by default.
    */
  var EbsEncryptionByDefault: js.UndefOr[Boolean] = js.undefined
}
object EnableEbsEncryptionByDefaultResult {
  
  inline def apply(): EnableEbsEncryptionByDefaultResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableEbsEncryptionByDefaultResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableEbsEncryptionByDefaultResult] (val x: Self) extends AnyVal {
    
    inline def setEbsEncryptionByDefault(value: Boolean): Self = StObject.set(x, "EbsEncryptionByDefault", value.asInstanceOf[js.Any])
    
    inline def setEbsEncryptionByDefaultUndefined: Self = StObject.set(x, "EbsEncryptionByDefault", js.undefined)
  }
}
