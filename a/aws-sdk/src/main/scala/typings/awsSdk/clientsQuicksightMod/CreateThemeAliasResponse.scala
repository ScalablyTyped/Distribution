package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThemeAliasResponse extends StObject {
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * Information about the theme alias.
    */
  var ThemeAlias: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ThemeAlias] = js.undefined
}
object CreateThemeAliasResponse {
  
  inline def apply(): CreateThemeAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThemeAliasResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateThemeAliasResponse] (val x: Self) extends AnyVal {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThemeAlias(value: ThemeAlias): Self = StObject.set(x, "ThemeAlias", value.asInstanceOf[js.Any])
    
    inline def setThemeAliasUndefined: Self = StObject.set(x, "ThemeAlias", js.undefined)
  }
}
