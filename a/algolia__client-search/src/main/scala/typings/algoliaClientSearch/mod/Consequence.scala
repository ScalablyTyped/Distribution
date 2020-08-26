package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ConsequenceParamsPickSear
import typings.algoliaClientSearch.anon.ObjectID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consequence extends js.Object {
  /**
    * Whether the Query Rule should promote or not promoted items.
    */
  val filterPromotes: js.UndefOr[Boolean] = js.native
  /**
    * Objects to hide from hits.
    */
  val hide: js.UndefOr[js.Array[ObjectID]] = js.native
  /**
    * Additional search parameters. Any valid search parameter is allowed.
    */
  val params: js.UndefOr[ConsequenceParamsPickSear] = js.native
  /**
    * Objects to promote as hits.
    */
  val promote: js.UndefOr[js.Array[ConsequencePromote]] = js.native
  /**
    * Custom JSON object that will be appended to the userData array in the response.
    * This object is not interpreted by the API. It is limited to 1kB of minified JSON.
    */
  val userData: js.UndefOr[js.Any] = js.native
}

object Consequence {
  @scala.inline
  def apply(): Consequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Consequence]
  }
  @scala.inline
  implicit class ConsequenceOps[Self <: Consequence] (val x: Self) extends AnyVal {
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
    def setFilterPromotes(value: Boolean): Self = this.set("filterPromotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPromotes: Self = this.set("filterPromotes", js.undefined)
    @scala.inline
    def setHideVarargs(value: ObjectID*): Self = this.set("hide", js.Array(value :_*))
    @scala.inline
    def setHide(value: js.Array[ObjectID]): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setParams(value: ConsequenceParamsPickSear): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setPromoteVarargs(value: ConsequencePromote*): Self = this.set("promote", js.Array(value :_*))
    @scala.inline
    def setPromote(value: js.Array[ConsequencePromote]): Self = this.set("promote", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromote: Self = this.set("promote", js.undefined)
    @scala.inline
    def setUserData(value: js.Any): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
  }
  
}

