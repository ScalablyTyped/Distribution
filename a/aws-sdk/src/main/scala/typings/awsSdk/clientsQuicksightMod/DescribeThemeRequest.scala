package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThemeRequest extends StObject {
  
  /**
    * The alias of the theme that you want to describe. If you name a specific alias, you describe the version that the alias points to. You can specify the latest version of the theme by providing the keyword $LATEST in the AliasName parameter. The keyword $PUBLISHED doesn't apply to themes.
    */
  var AliasName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AliasName] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that contains the theme that you're describing.
    */
  var AwsAccountId: AwsAndAccountId
  
  /**
    * The ID for the theme.
    */
  var ThemeId: RestrictiveResourceId
  
  /**
    * The version number for the version to describe. If a VersionNumber parameter value isn't provided, the latest version of the theme is described.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VersionNumber] = js.undefined
}
object DescribeThemeRequest {
  
  inline def apply(AwsAccountId: AwsAndAccountId, ThemeId: RestrictiveResourceId): DescribeThemeRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThemeRequest]
  }
  
  extension [Self <: DescribeThemeRequest](x: Self) {
    
    inline def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    inline def setAwsAccountId(value: AwsAndAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    inline def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
