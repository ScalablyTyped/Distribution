package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSigningSignature extends StObject {
  
  /**
    * A base64 encoded binary representation of the code signing signature.
    */
  var inlineDocument: js.UndefOr[Signature] = js.undefined
}
object CodeSigningSignature {
  
  inline def apply(): CodeSigningSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningSignature]
  }
  
  extension [Self <: CodeSigningSignature](x: Self) {
    
    inline def setInlineDocument(value: Signature): Self = StObject.set(x, "inlineDocument", value.asInstanceOf[js.Any])
    
    inline def setInlineDocumentUndefined: Self = StObject.set(x, "inlineDocument", js.undefined)
  }
}
