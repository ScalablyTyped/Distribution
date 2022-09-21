package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cert extends StObject {
  
  var cert: js.UndefOr[String] = js.undefined
  
  var pub: js.UndefOr[String] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
}
object Cert {
  
  inline def apply(): Cert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cert]
  }
  
  extension [Self <: Cert](x: Self) {
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
    
    inline def setPubUndefined: Self = StObject.set(x, "pub", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
