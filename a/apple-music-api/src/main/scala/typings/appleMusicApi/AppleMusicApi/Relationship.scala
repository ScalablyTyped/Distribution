package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/relationship
@js.native
trait Relationship[ResourceType] extends js.Object {
  var data: js.Array[ResourceType] = js.native
  var href: String = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var next: js.UndefOr[String] = js.native
}

object Relationship {
  @scala.inline
  def apply[ResourceType](data: js.Array[ResourceType], href: String): Relationship[ResourceType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship[ResourceType]]
  }
  @scala.inline
  implicit class RelationshipOps[Self <: Relationship[_], ResourceType] (val x: Self with Relationship[ResourceType]) extends AnyVal {
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
    def setDataVarargs(value: ResourceType*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[ResourceType]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

