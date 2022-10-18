package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachTypedLinkResponse extends StObject {
  
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifier: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.TypedLinkSpecifier] = js.undefined
}
object AttachTypedLinkResponse {
  
  inline def apply(): AttachTypedLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachTypedLinkResponse]
  }
  
  extension [Self <: AttachTypedLinkResponse](x: Self) {
    
    inline def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = StObject.set(x, "TypedLinkSpecifier", value.asInstanceOf[js.Any])
    
    inline def setTypedLinkSpecifierUndefined: Self = StObject.set(x, "TypedLinkSpecifier", js.undefined)
  }
}
