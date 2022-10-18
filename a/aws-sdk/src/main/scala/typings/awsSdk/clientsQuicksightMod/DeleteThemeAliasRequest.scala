package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThemeAliasRequest extends StObject {
  
  /**
    * The unique name for the theme alias to delete.
    */
  var AliasName: typings.awsSdk.clientsQuicksightMod.AliasName
  
  /**
    * The ID of the Amazon Web Services account that contains the theme alias to delete.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID for the theme that the specified alias is for.
    */
  var ThemeId: RestrictiveResourceId
}
object DeleteThemeAliasRequest {
  
  inline def apply(AliasName: AliasName, AwsAccountId: AwsAccountId, ThemeId: RestrictiveResourceId): DeleteThemeAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThemeAliasRequest]
  }
  
  extension [Self <: DeleteThemeAliasRequest](x: Self) {
    
    inline def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
  }
}
