package typings.adobeNodeFetchRetry.mod

import typings.nodeFetch.mod.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * options for fetch-retry
  */
@js.native
trait Options extends RequestInit {
  
  /**
    * options for retry or false if want to disable retry
    * ... other options for fetch call (method, headers, etc...)
    */
  var retryOptions: js.UndefOr[RetryOptions] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setRetryOptions(value: RetryOptions): Self = this.set("retryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryOptions: Self = this.set("retryOptions", js.undefined)
  }
}
