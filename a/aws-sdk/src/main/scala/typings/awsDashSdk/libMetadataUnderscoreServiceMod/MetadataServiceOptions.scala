package typings.awsDashSdk.libMetadataUnderscoreServiceMod

import typings.awsDashSdk.Anon_Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataServiceOptions extends js.Object {
  /**
    * the hostname of the instance metadata service.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * a map of options to pass to the underlying HTTP request.
    */
  var httpOptions: js.UndefOr[Anon_Timeout] = js.undefined
  /**
    * the maximum number of retries to perform for timeout errors.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * A set of options to configure the retry delay on retryable errors. See AWS.Config for details.
    */
  var retryDelayOptions: js.UndefOr[js.Any] = js.undefined
}

object MetadataServiceOptions {
  @scala.inline
  def apply(
    host: String = null,
    httpOptions: Anon_Timeout = null,
    maxRetries: Int | Double = null,
    retryDelayOptions: js.Any = null
  ): MetadataServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (retryDelayOptions != null) __obj.updateDynamic("retryDelayOptions")(retryDelayOptions)
    __obj.asInstanceOf[MetadataServiceOptions]
  }
}

