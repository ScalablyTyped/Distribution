package typings.asn1js.mod

import org.scalablytyped.runtime.StringDictionary
import typings.asn1js.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.asn1js.mod.CompareSchemaSuccess
  - typings.asn1js.mod.CompareSchemaFail
*/
trait CompareSchemaResult extends StObject
object CompareSchemaResult {
  
  inline def CompareSchemaFail(result: AsnType | Error): typings.asn1js.mod.CompareSchemaFail = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], verified = false)
    __obj.asInstanceOf[typings.asn1js.mod.CompareSchemaFail]
  }
  
  inline def CompareSchemaSuccess(result: AsnType & StringDictionary[scala.Any]): typings.asn1js.mod.CompareSchemaSuccess = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], verified = true)
    __obj.asInstanceOf[typings.asn1js.mod.CompareSchemaSuccess]
  }
}
