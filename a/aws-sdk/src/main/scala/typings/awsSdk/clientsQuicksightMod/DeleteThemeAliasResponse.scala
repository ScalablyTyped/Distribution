package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThemeAliasResponse extends StObject {
  
  /**
    * The name for the theme alias.
    */
  var AliasName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AliasName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the theme resource using the deleted alias.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * An ID for the theme associated with the deletion.
    */
  var ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined
}
object DeleteThemeAliasResponse {
  
  inline def apply(): DeleteThemeAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteThemeAliasResponse]
  }
  
  extension [Self <: DeleteThemeAliasResponse](x: Self) {
    
    inline def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    inline def setThemeIdUndefined: Self = StObject.set(x, "ThemeId", js.undefined)
  }
}
