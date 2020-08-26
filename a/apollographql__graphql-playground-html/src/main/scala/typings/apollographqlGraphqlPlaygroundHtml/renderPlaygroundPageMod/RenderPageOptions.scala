package typings.apollographqlGraphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderPageOptions extends MiddlewareOptions {
  var cdnUrl: js.UndefOr[String] = js.native
  var faviconUrl: js.UndefOr[String | Null] = js.native
  var title: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object RenderPageOptions {
  @scala.inline
  def apply(): RenderPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderPageOptions]
  }
  @scala.inline
  implicit class RenderPageOptionsOps[Self <: RenderPageOptions] (val x: Self) extends AnyVal {
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
    def setCdnUrl(value: String): Self = this.set("cdnUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdnUrl: Self = this.set("cdnUrl", js.undefined)
    @scala.inline
    def setFaviconUrl(value: String): Self = this.set("faviconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaviconUrl: Self = this.set("faviconUrl", js.undefined)
    @scala.inline
    def setFaviconUrlNull: Self = this.set("faviconUrl", null)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

