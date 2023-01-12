package typings.asn1js.mod

import org.scalablytyped.runtime.StringDictionary
import typings.asn1js.asn1jsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompareSchemaSuccess
  extends StObject
     with CompareSchemaResult {
  
  var result: AsnType & StringDictionary[scala.Any]
  
  var verified: `true`
}
object CompareSchemaSuccess {
  
  inline def apply(result: AsnType & StringDictionary[scala.Any]): CompareSchemaSuccess = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], verified = true)
    __obj.asInstanceOf[CompareSchemaSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompareSchemaSuccess] (val x: Self) extends AnyVal {
    
    inline def setResult(value: AsnType & StringDictionary[scala.Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: `true`): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
