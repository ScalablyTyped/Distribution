package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThemeRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account where you want to store the new theme. 
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the theme that a custom theme will inherit from. All themes inherit from one of the starting themes defined by Amazon QuickSight. For a list of the starting themes, use ListThemes or choose Themes from within an analysis. 
    */
  var BaseThemeId: ShortRestrictiveResourceId
  
  /**
    * The theme configuration, which contains the theme display properties.
    */
  var Configuration: ThemeConfiguration
  
  /**
    * A display name for the theme.
    */
  var Name: ThemeName
  
  /**
    * A valid grouping of resource permissions to apply to the new theme. 
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
  
  /**
    * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * An ID for the theme that you want to create. The theme ID is unique per Amazon Web Services Region in each Amazon Web Services account.
    */
  var ThemeId: ShortRestrictiveResourceId
  
  /**
    * A description of the first version of the theme that you're creating. Every time UpdateTheme is called, a new version is created. Each version of the theme has a description of the version in the VersionDescription field.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VersionDescription] = js.undefined
}
object CreateThemeRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    BaseThemeId: ShortRestrictiveResourceId,
    Configuration: ThemeConfiguration,
    Name: ThemeName,
    ThemeId: ShortRestrictiveResourceId
  ): CreateThemeRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], BaseThemeId = BaseThemeId.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThemeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateThemeRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setBaseThemeId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "BaseThemeId", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ThemeConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setName(value: ThemeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: ResourcePermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ResourcePermission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setThemeId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    inline def setVersionDescription(value: VersionDescription): Self = StObject.set(x, "VersionDescription", value.asInstanceOf[js.Any])
    
    inline def setVersionDescriptionUndefined: Self = StObject.set(x, "VersionDescription", js.undefined)
  }
}
