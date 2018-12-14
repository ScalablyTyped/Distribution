package typings
package awsDashSdkLib.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/config", "ConfigBase")
@js.native
class ConfigBase () extends ConfigurationOptions {
  def this(options: ConfigurationOptions) = this()
  /**
       * Loads credentials from the configuration object.
       */
  def getCredentials(callback: js.Function1[/* err */ awsDashSdkLib.libErrorMod.AWSError, scala.Unit]): scala.Unit = js.native
  /**
       * Gets the promise dependency the SDK will use wherever Promises are returned.
       */
  def getPromisesDependency(): stdLib.PromiseConstructor | scala.Unit = js.native
  /**
       * Loads configuration data from a JSON file into this config object.
       * Loading configuration willr eset all existing configuration on the object.
       * This feature is not supported in the browser environment of the SDK.
       *
       * @param {string} path - the path relative to your process's current working directory to load configuration from.
       */
  def loadFromPath(path: java.lang.String): ConfigBase = js.native
  /**
       * Sets the promise dependency the SDK will use wherever Promises are returned.
       * @param {function} dep - a reference to a Promise constructor
       */
  def setPromisesDependency(dep: js.Any): scala.Unit = js.native
  /**
       * Updates the current configuration object with new options.
       *
       * @param {ConfigurationOptions} options - a map of option keys and values.
       * @param {boolean} allowUnknownKeys - Whether unknown keys can be set on the configuration object.
       */
  def update(
    options: ConfigurationOptions with org.scalablytyped.runtime.StringDictionary[js.Any],
    allowUnknownKeys: awsDashSdkLib.awsDashSdkLibNumbers.`true`
  ): scala.Unit = js.native
  /**
       * Updates the current configuration object with new options.
       *
       * @param {ConfigurationOptions} options - a map of option keys and values.
       * @param {boolean} allowUnknownKeys - Defaults to false. Whether unknown keys can be set on the configuration object.
       */
  def update(options: ConfigurationOptions): scala.Unit = js.native
  /**
       * Updates the current configuration object with new options.
       *
       * @param {ConfigurationOptions} options - a map of option keys and values.
       * @param {boolean} allowUnknownKeys - Defaults to false. Whether unknown keys can be set on the configuration object.
       */
  def update(options: ConfigurationOptions, allowUnknownKeys: awsDashSdkLib.awsDashSdkLibNumbers.`false`): scala.Unit = js.native
}

