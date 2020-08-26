package typings.algoliaCacheInMemory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InMemoryCacheOptions extends js.Object {
  /**
    * If keys and values should be serialized using `JSON.stringify`.
    */
  val serializable: js.UndefOr[Boolean] = js.native
}

object InMemoryCacheOptions {
  @scala.inline
  def apply(): InMemoryCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InMemoryCacheOptions]
  }
  @scala.inline
  implicit class InMemoryCacheOptionsOps[Self <: InMemoryCacheOptions] (val x: Self) extends AnyVal {
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
    def setSerializable(value: Boolean): Self = this.set("serializable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializable: Self = this.set("serializable", js.undefined)
  }
  
}

