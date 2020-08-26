package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialUpdateObjectsOptions extends js.Object {
  /**
    * If the object should be created when does not exist.
    */
  val createIfNotExists: js.UndefOr[Boolean] = js.native
}

object PartialUpdateObjectsOptions {
  @scala.inline
  def apply(): PartialUpdateObjectsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUpdateObjectsOptions]
  }
  @scala.inline
  implicit class PartialUpdateObjectsOptionsOps[Self <: PartialUpdateObjectsOptions] (val x: Self) extends AnyVal {
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
    def setCreateIfNotExists(value: Boolean): Self = this.set("createIfNotExists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateIfNotExists: Self = this.set("createIfNotExists", js.undefined)
  }
  
}

