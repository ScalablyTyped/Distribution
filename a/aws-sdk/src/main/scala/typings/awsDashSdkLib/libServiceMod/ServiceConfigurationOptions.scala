package typings
package awsDashSdkLib.libServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceConfigurationOptions
  extends awsDashSdkLib.libConfigMod.ConfigurationOptions {
  /**
       * The endpoint URI to send requests to. The default endpoint is built from the configured region. 
       * The endpoint should be a string like 'https://{service}.{region}.amazonaws.com'.
       */
  var endpoint: js.UndefOr[java.lang.String] = js.native
  /**
       * An optional map of parameters to bind to every request sent by this service object. 
       * For more information on bound parameters, see "Working with Services" in the Getting Started Guide.
       */
  var params: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.native
}

