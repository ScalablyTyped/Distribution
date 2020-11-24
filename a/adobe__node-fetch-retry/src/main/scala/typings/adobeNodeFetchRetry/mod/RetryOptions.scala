package typings.adobeNodeFetchRetry.mod

import typings.nodeFetch.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * options for retry or false if want to disable retry
  */
@js.native
trait RetryOptions extends js.Object {
  
  /**
    * If true, socket timeout will be forced to use `socketTimeout` property declared (defaults to false)
    */
  var forceSocketTimeout: js.UndefOr[Boolean] = js.native
  
  /**
    * backoff factor for wait time between retries (defaults to 2.0)
    */
  var retryBackoff: js.UndefOr[Double] = js.native
  
  /**
    * time to wait between retries in milliseconds
    */
  var retryInitialDelay: js.UndefOr[Double] = js.native
  
  /**
    * time (in milliseconds) to retry until throwing an error
    */
  var retryMaxDuration: js.UndefOr[Double] = js.native
  
  /**
    * a function determining whether to retry on a specific HTTP code
    */
  var retryOnHttpResponse: js.UndefOr[js.Function1[/* response */ Response, Boolean]] = js.native
  
  /**
    * Optional socket timeout in milliseconds (defaults to 60000ms)
    */
  var socketTimeout: js.UndefOr[Double] = js.native
}
object RetryOptions {
  
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions] (val x: Self) extends AnyVal {
    
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
    def setForceSocketTimeout(value: Boolean): Self = this.set("forceSocketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceSocketTimeout: Self = this.set("forceSocketTimeout", js.undefined)
    
    @scala.inline
    def setRetryBackoff(value: Double): Self = this.set("retryBackoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryBackoff: Self = this.set("retryBackoff", js.undefined)
    
    @scala.inline
    def setRetryInitialDelay(value: Double): Self = this.set("retryInitialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryInitialDelay: Self = this.set("retryInitialDelay", js.undefined)
    
    @scala.inline
    def setRetryMaxDuration(value: Double): Self = this.set("retryMaxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryMaxDuration: Self = this.set("retryMaxDuration", js.undefined)
    
    @scala.inline
    def setRetryOnHttpResponse(value: /* response */ Response => Boolean): Self = this.set("retryOnHttpResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRetryOnHttpResponse: Self = this.set("retryOnHttpResponse", js.undefined)
    
    @scala.inline
    def setSocketTimeout(value: Double): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
  }
}
