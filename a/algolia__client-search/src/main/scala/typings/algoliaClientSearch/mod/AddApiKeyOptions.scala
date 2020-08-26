package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApiKeyOptions extends js.Object {
  /**
    * Specify a description of the API key. Used for informative purposes only. It has impact on the functionality of the API key.
    */
  val description: js.UndefOr[String] = js.native
  /**
    * Specify the list of targeted indices. You can target all indices starting with a prefix or ending with a suffix using the ‘*’ character.
    */
  val indexes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the maximum number of hits this API key can retrieve in one call.
    * This parameter can be used to protect you from attempts at retrieving your entire index contents by massively querying the index.
    */
  val maxHitsPerQuery: js.UndefOr[Double] = js.native
  /**
    * Specify the maximum number of API calls allowed from an IP address per hour. Each time an API call is performed with this key, a check is performed.
    */
  val maxQueriesPerIPPerHour: js.UndefOr[Double] = js.native
  /**
    * Specify the list of query parameters. You can force the query parameters for a query using the url string format.
    */
  val queryParameters: js.UndefOr[String] = js.native
  /**
    * Specify the list of referers. You can target all referers starting with a prefix, ending with a suffix using the ‘*’ character.
    */
  val referers: js.UndefOr[js.Array[String]] = js.native
  /**
    * A Unix timestamp used to define the expiration date of the API key.
    */
  val validity: js.UndefOr[Double] = js.native
}

object AddApiKeyOptions {
  @scala.inline
  def apply(): AddApiKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApiKeyOptions]
  }
  @scala.inline
  implicit class AddApiKeyOptionsOps[Self <: AddApiKeyOptions] (val x: Self) extends AnyVal {
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
    def setValidity(value: Double): Self = this.set("validity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidity: Self = this.set("validity", js.undefined)
  }
  
}

