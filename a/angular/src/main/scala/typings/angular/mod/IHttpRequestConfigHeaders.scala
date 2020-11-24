package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHttpRequestConfigHeaders
  extends /**
  * Indexer which should return ng.INgModelController for most properties but cannot because of "All named properties must be assignable to string indexer type" constraint - see https://github.com/Microsoft/TypeScript/issues/272
  */
/* name */ StringDictionary[js.Any] {
  
  var common: js.UndefOr[js.Any] = js.native
  
  var get: js.UndefOr[js.Any] = js.native
  
  var patch: js.UndefOr[js.Any] = js.native
  
  var post: js.UndefOr[js.Any] = js.native
  
  var put: js.UndefOr[js.Any] = js.native
}
object IHttpRequestConfigHeaders {
  
  @scala.inline
  def apply(): IHttpRequestConfigHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttpRequestConfigHeaders]
  }
  
  @scala.inline
  implicit class IHttpRequestConfigHeadersOps[Self <: IHttpRequestConfigHeaders] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: js.Any): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setGet(value: js.Any): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setPatch(value: js.Any): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    
    @scala.inline
    def setPost(value: js.Any): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPut(value: js.Any): Self = this.set("put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePut: Self = this.set("put", js.undefined)
  }
}
