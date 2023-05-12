package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThemeRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the theme that you're deleting.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * An ID for the theme that you want to delete.
    */
  var ThemeId: ShortRestrictiveResourceId
  
  /**
    * The version of the theme that you want to delete.   Note: If you don't provide a version number, you're using this call to DeleteTheme to delete all versions of the theme.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VersionNumber] = js.undefined
}
object DeleteThemeRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, ThemeId: ShortRestrictiveResourceId): DeleteThemeRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThemeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteThemeRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setThemeId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    inline def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
