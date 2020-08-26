package typings.amqp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestroyOptions extends js.Object {
  /**
    * Default: false
    *
    * Will ony be deleted if the queue has no messages
    */
  var ifEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * Will only destroy the queue if it has no consumers
    */
  var ifUnused: js.UndefOr[Boolean] = js.native
}

object DestroyOptions {
  @scala.inline
  def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
  @scala.inline
  implicit class DestroyOptionsOps[Self <: DestroyOptions] (val x: Self) extends AnyVal {
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
    def setIfEmpty(value: Boolean): Self = this.set("ifEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfEmpty: Self = this.set("ifEmpty", js.undefined)
    @scala.inline
    def setIfUnused(value: Boolean): Self = this.set("ifUnused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfUnused: Self = this.set("ifUnused", js.undefined)
  }
  
}

