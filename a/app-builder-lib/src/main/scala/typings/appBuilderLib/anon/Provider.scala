package typings.appBuilderLib.anon

import typings.builderUtilRuntime.publishOptionsMod.PublishProvider
import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends js.Object {
  
  var provider: PublishProvider = js.native
  
  var publishAutoUpdate: js.UndefOr[Boolean] = js.native
  
  var publisherName: js.UndefOr[js.Array[String] | Null] = js.native
  
  var requestHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  var updaterCacheDirName: String = js.native
}
object Provider {
  
  @scala.inline
  def apply(provider: PublishProvider, updaterCacheDirName: String): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], updaterCacheDirName = updaterCacheDirName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    
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
    def setProvider(value: PublishProvider): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdaterCacheDirName(value: String): Self = this.set("updaterCacheDirName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishAutoUpdate(value: Boolean): Self = this.set("publishAutoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishAutoUpdate: Self = this.set("publishAutoUpdate", js.undefined)
    
    @scala.inline
    def setPublisherNameVarargs(value: String*): Self = this.set("publisherName", js.Array(value :_*))
    
    @scala.inline
    def setPublisherName(value: js.Array[String]): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherName: Self = this.set("publisherName", js.undefined)
    
    @scala.inline
    def setPublisherNameNull: Self = this.set("publisherName", null)
    
    @scala.inline
    def setRequestHeaders(value: OutgoingHttpHeaders): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
  }
}
