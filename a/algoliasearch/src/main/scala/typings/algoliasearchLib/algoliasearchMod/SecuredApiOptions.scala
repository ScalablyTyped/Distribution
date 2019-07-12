package typings
package algoliasearchLib.algoliasearchMod

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
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Restricts the key to a list of index names allowed for the secured API key
    */
  var restrictIndices: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows you to restrict a single user to performing a maximum of N API calls per hour
    */
  var userToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the expiration date of the API key
    */
  var validUntil: js.UndefOr[scala.Double] = js.undefined
}

object SecuredApiOptions {
  @scala.inline
  def apply(
    filters: java.lang.String = null,
    restrictIndices: java.lang.String = null,
    userToken: java.lang.String = null,
    validUntil: scala.Int | scala.Double = null
  ): SecuredApiOptions = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (restrictIndices != null) __obj.updateDynamic("restrictIndices")(restrictIndices)
    if (userToken != null) __obj.updateDynamic("userToken")(userToken)
    if (validUntil != null) __obj.updateDynamic("validUntil")(validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuredApiOptions]
  }
}

