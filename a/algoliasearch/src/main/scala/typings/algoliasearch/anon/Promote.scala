package typings.algoliasearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promote extends js.Object {
  var params: js.UndefOr[AutomaticFacetFilters] = js.undefined
  /**
    * Objects to promote as hits. Each object must contain the following fields
    */
  var promote: js.UndefOr[js.Array[ObjectID]] = js.undefined
  /**
    *  Custom JSON object that will be appended to the userData array in the response.
    * This object is not interpreted by the API. It is limited to 1kB of minified JSON.
    */
  var userData: js.UndefOr[js.Object] = js.undefined
}

object Promote {
  @scala.inline
  def apply(
    params: AutomaticFacetFilters = null,
    promote: js.Array[ObjectID] = null,
    userData: js.Object = null
  ): Promote = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (promote != null) __obj.updateDynamic("promote")(promote.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promote]
  }
}

