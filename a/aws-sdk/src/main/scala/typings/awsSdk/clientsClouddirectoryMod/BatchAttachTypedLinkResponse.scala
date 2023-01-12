package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAttachTypedLinkResponse extends StObject {
  
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifier: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.TypedLinkSpecifier] = js.undefined
}
object BatchAttachTypedLinkResponse {
  
  inline def apply(): BatchAttachTypedLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAttachTypedLinkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchAttachTypedLinkResponse] (val x: Self) extends AnyVal {
    
    inline def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = StObject.set(x, "TypedLinkSpecifier", value.asInstanceOf[js.Any])
    
    inline def setTypedLinkSpecifierUndefined: Self = StObject.set(x, "TypedLinkSpecifier", js.undefined)
  }
}
