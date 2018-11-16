package typings
package awsDashSdkLib.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait APIVersions extends js.Object {
  /**
       * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in all services (unless overridden by apiVersions). Specify \'latest\' to use the latest possible version.
       */
  var apiVersion: js.UndefOr[awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String] = js.undefined
  /**
       * A map of service identifiers (the lowercase service class name) with the API version to use when instantiating a service. Specify 'latest' for each individual that can use the latest available version.
       */
  var apiVersions: js.UndefOr[
    awsDashSdkLib.libConfigUnderscoreServiceUnderscorePlaceholdersMod.ConfigurationServiceApiVersions
  ] = js.undefined
}

