package typings.asyncLock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncLockOptions extends js.Object {
  
  var Promise: js.UndefOr[js.Any] = js.native
  
  var domainReentrant: js.UndefOr[Boolean] = js.native
  
  var maxPending: js.UndefOr[Double] = js.native
  
  var skipQueue: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object AsyncLockOptions {
  
  @scala.inline
  def apply(): AsyncLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncLockOptions]
  }
  
  @scala.inline
  implicit class AsyncLockOptionsOps[Self <: AsyncLockOptions] (val x: Self) extends AnyVal {
    
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
    def setPromise(value: js.Any): Self = this.set("Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    
    @scala.inline
    def setDomainReentrant(value: Boolean): Self = this.set("domainReentrant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainReentrant: Self = this.set("domainReentrant", js.undefined)
    
    @scala.inline
    def setMaxPending(value: Double): Self = this.set("maxPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPending: Self = this.set("maxPending", js.undefined)
    
    @scala.inline
    def setSkipQueue(value: Boolean): Self = this.set("skipQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipQueue: Self = this.set("skipQueue", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
