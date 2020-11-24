package typings.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlsConfigObj extends js.Object {
  
  var schemeMatches: js.UndefOr[Boolean] = js.native
  
  var tldMatches: js.UndefOr[Boolean] = js.native
  
  var wwwMatches: js.UndefOr[Boolean] = js.native
}
object UrlsConfigObj {
  
  @scala.inline
  def apply(): UrlsConfigObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlsConfigObj]
  }
  
  @scala.inline
  implicit class UrlsConfigObjOps[Self <: UrlsConfigObj] (val x: Self) extends AnyVal {
    
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
    def setSchemeMatches(value: Boolean): Self = this.set("schemeMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemeMatches: Self = this.set("schemeMatches", js.undefined)
    
    @scala.inline
    def setTldMatches(value: Boolean): Self = this.set("tldMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTldMatches: Self = this.set("tldMatches", js.undefined)
    
    @scala.inline
    def setWwwMatches(value: Boolean): Self = this.set("wwwMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWwwMatches: Self = this.set("wwwMatches", js.undefined)
  }
}
