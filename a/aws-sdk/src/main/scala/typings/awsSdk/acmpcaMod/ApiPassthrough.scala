package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiPassthrough extends StObject {
  
  /**
    * Specifies X.509 extension information for a certificate.
    */
  var Extensions: js.UndefOr[typings.awsSdk.acmpcaMod.Extensions] = js.undefined
  
  var Subject: js.UndefOr[ASN1Subject] = js.undefined
}
object ApiPassthrough {
  
  inline def apply(): ApiPassthrough = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiPassthrough]
  }
  
  extension [Self <: ApiPassthrough](x: Self) {
    
    inline def setExtensions(value: Extensions): Self = StObject.set(x, "Extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "Extensions", js.undefined)
    
    inline def setSubject(value: ASN1Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
  }
}
