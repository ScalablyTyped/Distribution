package typings.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.UndefOr[Anon_AutomaticFacetFilters] = js.undefined
  /**
    * Objects to promote as hits. Each object must contain the following fields
    */
  var promote: js.UndefOr[js.Array[Anon_ObjectID]] = js.undefined
  /**
    *  Custom JSON object that will be appended to the userData array in the response.
    * This object is not interpreted by the API. It is limited to 1kB of minified JSON.
    */
  var userData: js.UndefOr[js.Object] = js.undefined
}

object Anon_Params {
  @scala.inline
  def apply(
    params: Anon_AutomaticFacetFilters = null,
    promote: js.Array[Anon_ObjectID] = null,
    userData: js.Object = null
  ): Anon_Params = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params)
    if (promote != null) __obj.updateDynamic("promote")(promote)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[Anon_Params]
  }
}

