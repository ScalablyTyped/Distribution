package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThemeRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the theme that you're updating.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The theme ID, defined by Amazon QuickSight, that a custom theme inherits from. All themes initially inherit from a default Amazon QuickSight theme.
    */
  var BaseThemeId: RestrictiveResourceId
  
  /**
    * The theme configuration, which contains the theme display properties.
    */
  var Configuration: js.UndefOr[ThemeConfiguration] = js.undefined
  
  /**
    * The name for the theme.
    */
  var Name: js.UndefOr[ThemeName] = js.undefined
  
  /**
    * The ID for the theme.
    */
  var ThemeId: RestrictiveResourceId
  
  /**
    * A description of the theme version that you're updating Every time that you call UpdateTheme, you create a new version of the theme. Each version of the theme maintains a description of the version in VersionDescription.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VersionDescription] = js.undefined
}
object UpdateThemeRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, BaseThemeId: RestrictiveResourceId, ThemeId: RestrictiveResourceId): UpdateThemeRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], BaseThemeId = BaseThemeId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThemeRequest]
  }
  
  extension [Self <: UpdateThemeRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setBaseThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "BaseThemeId", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ThemeConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setName(value: ThemeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    inline def setVersionDescription(value: VersionDescription): Self = StObject.set(x, "VersionDescription", value.asInstanceOf[js.Any])
    
    inline def setVersionDescriptionUndefined: Self = StObject.set(x, "VersionDescription", js.undefined)
  }
}
