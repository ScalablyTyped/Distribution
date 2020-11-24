package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApiKeyResponse extends js.Object {
  
  /**
    * List of permissions the key contains.
    */
  var acl: js.Array[ApiKeyACLType] = js.native
  
  /**
    * Date of creation.
    */
  var createdAt: String = js.native
  
  /**
    * Specify a description of the API key. Used for informative purposes only. It has impact on the functionality of the API key.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Specify the list of targeted indices. You can target all indices starting with a prefix or ending with a suffix using the ‘*’ character.
    */
  var indexes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specify the maximum number of hits this API key can retrieve in one call.
    * This parameter can be used to protect you from attempts at retrieving your entire index contents by massively querying the index.
    */
  var maxHitsPerQuery: js.UndefOr[Double] = js.native
  
  /**
    * Specify the maximum number of API calls allowed from an IP address per hour. Each time an API call is performed with this key, a check is performed.
    */
  var maxQueriesPerIPPerHour: js.UndefOr[Double] = js.native
  
  /**
    * Specify the list of query parameters. You can force the query parameters for a query using the url string format.
    */
  var queryParameters: js.UndefOr[String] = js.native
  
  /**
    * Specify the list of referers. You can target all referers starting with a prefix, ending with a suffix using the ‘*’ character.
    */
  var referers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * IPv4 network allowed to use the generated key.
    * This is used for more protection against API key leaking and reuse.
    * Note that you can only provide a single source, but you can specify a range of IPs (e.g., 192.168.1.0/24).
    */
  var restrictSources: js.UndefOr[String] = js.native
  
  /**
    * A Unix timestamp used to define the expiration date of the API key.
    */
  var validity: Double = js.native
  
  /**
    * A Unix timestamp used to define the expiration date of the API key.
    */
  var value: String = js.native
}
object GetApiKeyResponse {
  
  @scala.inline
  def apply(acl: js.Array[ApiKeyACLType], createdAt: String, validity: Double, value: String): GetApiKeyResponse = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiKeyResponse]
  }
  
  @scala.inline
  implicit class GetApiKeyResponseOps[Self <: GetApiKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAclVarargs(value: ApiKeyACLType*): Self = this.set("acl", js.Array(value :_*))
    
    @scala.inline
    def setAcl(value: js.Array[ApiKeyACLType]): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidity(value: Double): Self = this.set("validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: String*): Self = this.set("indexes", js.Array(value :_*))
    
    @scala.inline
    def setIndexes(value: js.Array[String]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    
    @scala.inline
    def setMaxHitsPerQuery(value: Double): Self = this.set("maxHitsPerQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHitsPerQuery: Self = this.set("maxHitsPerQuery", js.undefined)
    
    @scala.inline
    def setMaxQueriesPerIPPerHour(value: Double): Self = this.set("maxQueriesPerIPPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxQueriesPerIPPerHour: Self = this.set("maxQueriesPerIPPerHour", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: String): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParameters: Self = this.set("queryParameters", js.undefined)
    
    @scala.inline
    def setReferersVarargs(value: String*): Self = this.set("referers", js.Array(value :_*))
    
    @scala.inline
    def setReferers(value: js.Array[String]): Self = this.set("referers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferers: Self = this.set("referers", js.undefined)
    
    @scala.inline
    def setRestrictSources(value: String): Self = this.set("restrictSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictSources: Self = this.set("restrictSources", js.undefined)
  }
}
