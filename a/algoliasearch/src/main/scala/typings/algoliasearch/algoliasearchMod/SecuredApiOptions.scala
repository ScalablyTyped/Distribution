package typings.algoliasearch.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the options used when generating new api keys
  */
trait SecuredApiOptions extends js.Object {
  /**
    * Filter the query with numeric, facet or/and tag filters
    * default: ""
    */
  var filters: js.UndefOr[String] = js.undefined
  /**
    * Restricts the key to a list of index names allowed for the secured API key
    */
  var restrictIndices: js.UndefOr[String] = js.undefined
  /**
    * Allows you to restrict a single user to performing a maximum of N API calls per hour
    */
  var userToken: js.UndefOr[String] = js.undefined
  /**
    * Defines the expiration date of the API key
    */
  var validUntil: js.UndefOr[Double] = js.undefined
}

object SecuredApiOptions {
  @scala.inline
  def apply(
    filters: String = null,
    restrictIndices: String = null,
    userToken: String = null,
    validUntil: Int | Double = null
  ): SecuredApiOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (restrictIndices != null) __obj.updateDynamic("restrictIndices")(restrictIndices)
    if (userToken != null) __obj.updateDynamic("userToken")(userToken)
    if (validUntil != null) __obj.updateDynamic("validUntil")(validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuredApiOptions]
  }
}

