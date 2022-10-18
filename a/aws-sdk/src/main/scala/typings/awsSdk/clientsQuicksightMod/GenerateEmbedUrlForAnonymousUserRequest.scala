package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateEmbedUrlForAnonymousUserRequest extends StObject {
  
  /**
    * The domains that you want to add to the allow list for access to the generated URL that is then embedded. This optional parameter overrides the static domains that are configured in the Manage QuickSight menu in the Amazon QuickSight console. Instead, it allows only the domains that you include in this parameter. You can list up to three domains or subdomains in each API call. To include all subdomains under a specific domain to the allow list, use *. For example, https:// *.sapp.amazon.com includes all subdomains under https://sapp.amazon.com.
    */
  var AllowedDomains: js.UndefOr[StringList] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) for the Amazon QuickSight resources that the user is authorized to access during the lifetime of the session. If you choose Dashboard embedding experience, pass the list of dashboard ARNs in the account that you want the user to be able to view. Currently, you can pass up to 25 dashboard ARNs in each API call.
    */
  var AuthorizedResourceArns: ArnList
  
  /**
    * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The configuration of the experience that you are embedding.
    */
  var ExperienceConfiguration: AnonymousUserEmbeddingExperienceConfiguration
  
  /**
    * The Amazon QuickSight namespace that the anonymous user virtually belongs to. If you are not using an Amazon QuickSight custom namespace, set this to default.
    */
  var Namespace: typings.awsSdk.clientsQuicksightMod.Namespace
  
  /**
    * How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
    */
  var SessionLifetimeInMinutes: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SessionLifetimeInMinutes] = js.undefined
  
  /**
    * The session tags used for row-level security. Before you use this parameter, make sure that you have configured the relevant datasets using the DataSet$RowLevelPermissionTagConfiguration parameter so that session tags can be used to provide row-level security. These are not the tags used for the Amazon Web Services resource tagging feature. For more information, see Using Row-Level Security (RLS) with Tagsin the Amazon QuickSight User Guide.
    */
  var SessionTags: js.UndefOr[SessionTagList] = js.undefined
}
object GenerateEmbedUrlForAnonymousUserRequest {
  
  inline def apply(
    AuthorizedResourceArns: ArnList,
    AwsAccountId: AwsAccountId,
    ExperienceConfiguration: AnonymousUserEmbeddingExperienceConfiguration,
    Namespace: Namespace
  ): GenerateEmbedUrlForAnonymousUserRequest = {
    val __obj = js.Dynamic.literal(AuthorizedResourceArns = AuthorizedResourceArns.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ExperienceConfiguration = ExperienceConfiguration.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateEmbedUrlForAnonymousUserRequest]
  }
  
  extension [Self <: GenerateEmbedUrlForAnonymousUserRequest](x: Self) {
    
    inline def setAllowedDomains(value: StringList): Self = StObject.set(x, "AllowedDomains", value.asInstanceOf[js.Any])
    
    inline def setAllowedDomainsUndefined: Self = StObject.set(x, "AllowedDomains", js.undefined)
    
    inline def setAllowedDomainsVarargs(value: String*): Self = StObject.set(x, "AllowedDomains", js.Array(value*))
    
    inline def setAuthorizedResourceArns(value: ArnList): Self = StObject.set(x, "AuthorizedResourceArns", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedResourceArnsVarargs(value: Arn*): Self = StObject.set(x, "AuthorizedResourceArns", js.Array(value*))
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setExperienceConfiguration(value: AnonymousUserEmbeddingExperienceConfiguration): Self = StObject.set(x, "ExperienceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setSessionLifetimeInMinutes(value: SessionLifetimeInMinutes): Self = StObject.set(x, "SessionLifetimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setSessionLifetimeInMinutesUndefined: Self = StObject.set(x, "SessionLifetimeInMinutes", js.undefined)
    
    inline def setSessionTags(value: SessionTagList): Self = StObject.set(x, "SessionTags", value.asInstanceOf[js.Any])
    
    inline def setSessionTagsUndefined: Self = StObject.set(x, "SessionTags", js.undefined)
    
    inline def setSessionTagsVarargs(value: SessionTag*): Self = StObject.set(x, "SessionTags", js.Array(value*))
  }
}
