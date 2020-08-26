package typings.angularCore.anon

import typings.angularCore.angularCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  /**
    * If an `@Attribute` decorator is used, this represents the injected attribute's name. If the
    * attribute name is a dynamic expression instead of a string literal, this will be the unknown
    * type.
    */
  var attribute: js.UndefOr[String | js.Any] = js.native
  /**
    * If `@Host` is used, this key is set to true.
    */
  var host: js.UndefOr[`true`] = js.native
  /**
    * If `@Optional()` is used, this key is set to true.
    */
  var optional: js.UndefOr[`true`] = js.native
  /**
    * If `@Self` is used, this key is set to true.
    */
  var self: js.UndefOr[`true`] = js.native
  /**
    * If `@SkipSelf` is used, this key is set to true.
    */
  var skipSelf: js.UndefOr[`true`] = js.native
}

object Attribute {
  @scala.inline
  def apply(): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribute]
  }
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
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
    def setAttribute(value: String | js.Any): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    @scala.inline
    def setHost(value: `true`): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setOptional(value: `true`): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setSelf(value: `true`): Self = this.set("self", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
    @scala.inline
    def setSkipSelf(value: `true`): Self = this.set("skipSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipSelf: Self = this.set("skipSelf", js.undefined)
  }
  
}

