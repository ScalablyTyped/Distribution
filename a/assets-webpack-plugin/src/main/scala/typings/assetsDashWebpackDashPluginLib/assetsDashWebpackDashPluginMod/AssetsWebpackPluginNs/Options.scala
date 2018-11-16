package typings
package assetsDashWebpackDashPluginLib.assetsDashWebpackDashPluginMod.AssetsWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * Name for the created json file.
           * "webpack-assets.json" by default
           */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If false the output will not include the full path of the generated file.
           * true by default
           */
  var fullPath: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Inserts the manifest javascript as a text property in your assets.
           * Accepts the name of your manifest chunk.
           * A manifest is the last CommonChunk that only contains the webpack bootstrap code.
           * This is useful for production use when you want to inline the manifest
           * in your HTML skeleton for long-term caching.
           * false by default
           */
  var includeManifest: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Inject metadata into the output file. All values will be injected into the key "metadata"
           */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /**
           * Path where to save the created JSON file.
           * Defaults to the current directory
           */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Whether to format the JSON output for readability.
           * false by default
           */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Formats the assets output.
           * Defaults to JSON.stringify
           */
  var processOutput: js.UndefOr[ProcessOutputFn] = js.undefined
  /**
           * When set to true, the output JSON file will be updated instead of overwritten.
           * false by default
           */
  var update: js.UndefOr[scala.Boolean] = js.undefined
}

