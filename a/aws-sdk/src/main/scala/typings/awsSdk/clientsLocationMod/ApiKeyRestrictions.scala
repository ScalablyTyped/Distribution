package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeyRestrictions extends StObject {
  
  /**
    * A list of allowed actions that an API key resource grants permissions to perform  Currently, the only valid action is geo:GetMap* as an input to the list. For example, ["geo:GetMap*"] is valid but ["geo:GetMapTile"] is not. 
    */
  var AllowActions: ApiKeyRestrictionsAllowActionsList
  
  /**
    * An optional list of allowed HTTP referers for which requests must originate from. Requests using this API key from other domains will not be allowed. Requirements:   Contain only alphanumeric characters (A–Z, a–z, 0–9) or any symbols in this list $\-._+!*`(),;/?:@=&amp;    May contain a percent (%) if followed by 2 hexadecimal digits (A-F, a-f, 0-9); this is used for URL encoding purposes.   May contain wildcard characters question mark (?) and asterisk (*). Question mark (?) will replace any single character (including hexadecimal digits). Asterisk (*) will replace any multiple characters (including multiple hexadecimal digits).   No spaces allowed. For example, https://example.com.  
    */
  var AllowReferers: js.UndefOr[ApiKeyRestrictionsAllowReferersList] = js.undefined
  
  /**
    * A list of allowed resource ARNs that a API key bearer can perform actions on For more information about ARN format, see Amazon Resource Names (ARNs).  In this preview, you can allow only map resources.  Requirements:   Must be prefixed with arn.    partition and service must not be empty and should begin with only alphanumeric characters (A–Z, a–z, 0–9) and contain only alphanumeric numbers, hyphens (-) and periods (.).    region and account-id can be empty or should begin with only alphanumeric characters (A–Z, a–z, 0–9) and contain only alphanumeric numbers, hyphens (-) and periods (.).    resource-id can begin with any character except for forward slash (/) and contain any characters after, including forward slashes to form a path.  resource-id can also include wildcard characters, denoted by an asterisk (*).    arn, partition, service, region, account-id and resource-id must be delimited by a colon (:).   No spaces allowed. For example, arn:aws:geo:region:account-id:map/ExampleMap*.  
    */
  var AllowResources: ApiKeyRestrictionsAllowResourcesList
}
object ApiKeyRestrictions {
  
  inline def apply(
    AllowActions: ApiKeyRestrictionsAllowActionsList,
    AllowResources: ApiKeyRestrictionsAllowResourcesList
  ): ApiKeyRestrictions = {
    val __obj = js.Dynamic.literal(AllowActions = AllowActions.asInstanceOf[js.Any], AllowResources = AllowResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyRestrictions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiKeyRestrictions] (val x: Self) extends AnyVal {
    
    inline def setAllowActions(value: ApiKeyRestrictionsAllowActionsList): Self = StObject.set(x, "AllowActions", value.asInstanceOf[js.Any])
    
    inline def setAllowActionsVarargs(value: ApiKeyAction*): Self = StObject.set(x, "AllowActions", js.Array(value*))
    
    inline def setAllowReferers(value: ApiKeyRestrictionsAllowReferersList): Self = StObject.set(x, "AllowReferers", value.asInstanceOf[js.Any])
    
    inline def setAllowReferersUndefined: Self = StObject.set(x, "AllowReferers", js.undefined)
    
    inline def setAllowReferersVarargs(value: RefererPattern*): Self = StObject.set(x, "AllowReferers", js.Array(value*))
    
    inline def setAllowResources(value: ApiKeyRestrictionsAllowResourcesList): Self = StObject.set(x, "AllowResources", value.asInstanceOf[js.Any])
    
    inline def setAllowResourcesVarargs(value: GeoArn*): Self = StObject.set(x, "AllowResources", js.Array(value*))
  }
}
