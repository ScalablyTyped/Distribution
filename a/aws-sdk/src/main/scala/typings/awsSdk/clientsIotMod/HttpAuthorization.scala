package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpAuthorization extends StObject {
  
  /**
    * Use Sig V4 authorization. For more information, see Signature Version 4 Signing Process.
    */
  var sigv4: js.UndefOr[SigV4Authorization] = js.undefined
}
object HttpAuthorization {
  
  inline def apply(): HttpAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpAuthorization]
  }
  
  extension [Self <: HttpAuthorization](x: Self) {
    
    inline def setSigv4(value: SigV4Authorization): Self = StObject.set(x, "sigv4", value.asInstanceOf[js.Any])
    
    inline def setSigv4Undefined: Self = StObject.set(x, "sigv4", js.undefined)
  }
}
