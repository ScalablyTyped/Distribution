package typings.asn1js.mod

import typings.asn1js.anon.Error
import typings.asn1js.asn1jsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompareSchemaFail
  extends StObject
     with CompareSchemaResult {
  
  var name: js.UndefOr[String] = js.undefined
  
  var result: AsnType | Error
  
  var verified: `false`
}
object CompareSchemaFail {
  
  inline def apply(result: AsnType | Error): CompareSchemaFail = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], verified = false)
    __obj.asInstanceOf[CompareSchemaFail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompareSchemaFail] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResult(value: AsnType | Error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: `false`): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
