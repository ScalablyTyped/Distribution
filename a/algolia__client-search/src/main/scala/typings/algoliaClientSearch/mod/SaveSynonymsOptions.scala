package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveSynonymsOptions extends js.Object {
  /**
    * If the saved synonyms should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.native
  /**
    * If the existing synonyms should be removed.
    */
  val replaceExistingSynonyms: js.UndefOr[Boolean] = js.native
}

object SaveSynonymsOptions {
  @scala.inline
  def apply(): SaveSynonymsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveSynonymsOptions]
  }
  @scala.inline
  implicit class SaveSynonymsOptionsOps[Self <: SaveSynonymsOptions] (val x: Self) extends AnyVal {
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
    def setForwardToReplicas(value: Boolean): Self = this.set("forwardToReplicas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardToReplicas: Self = this.set("forwardToReplicas", js.undefined)
    @scala.inline
    def setReplaceExistingSynonyms(value: Boolean): Self = this.set("replaceExistingSynonyms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceExistingSynonyms: Self = this.set("replaceExistingSynonyms", js.undefined)
  }
  
}

