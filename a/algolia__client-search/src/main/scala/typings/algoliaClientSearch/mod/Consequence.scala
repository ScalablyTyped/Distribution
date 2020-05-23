package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ConsequenceParamsPickSear
import typings.algoliaClientSearch.anon.ObjectID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consequence extends js.Object {
  /**
    * Whether the Query Rule should promote or not promoted items.
    */
  val filterPromotes: js.UndefOr[Boolean] = js.undefined
  /**
    * Objects to hide from hits.
    */
  val hide: js.UndefOr[js.Array[ObjectID]] = js.undefined
  /**
    * Additional search parameters. Any valid search parameter is allowed.
    */
  val params: js.UndefOr[ConsequenceParamsPickSear] = js.undefined
  /**
    * Objects to promote as hits.
    */
  val promote: js.UndefOr[js.Array[ConsequencePromote]] = js.undefined
  /**
    * Custom JSON object that will be appended to the userData array in the response.
    * This object is not interpreted by the API. It is limited to 1kB of minified JSON.
    */
  val userData: js.UndefOr[js.Any] = js.undefined
}

object Consequence {
  @scala.inline
  def apply(
    filterPromotes: js.UndefOr[Boolean] = js.undefined,
    hide: js.Array[ObjectID] = null,
    params: ConsequenceParamsPickSear = null,
    promote: js.Array[ConsequencePromote] = null,
    userData: js.Any = null
  ): Consequence = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterPromotes)) __obj.updateDynamic("filterPromotes")(filterPromotes.get.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (promote != null) __obj.updateDynamic("promote")(promote.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consequence]
  }
}

