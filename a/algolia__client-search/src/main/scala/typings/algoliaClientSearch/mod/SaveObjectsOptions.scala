package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveObjectsOptions extends js.Object {
  /**
    * If the object id should be generated when does not exists.
    */
  val autoGenerateObjectIDIfNotExist: js.UndefOr[Boolean] = js.native
}

object SaveObjectsOptions {
  @scala.inline
  def apply(): SaveObjectsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveObjectsOptions]
  }
  @scala.inline
  implicit class SaveObjectsOptionsOps[Self <: SaveObjectsOptions] (val x: Self) extends AnyVal {
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
    def setAutoGenerateObjectIDIfNotExist(value: Boolean): Self = this.set("autoGenerateObjectIDIfNotExist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGenerateObjectIDIfNotExist: Self = this.set("autoGenerateObjectIDIfNotExist", js.undefined)
  }
  
}

