package typings.assetsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If the "entrypoints" option is given, the output will be limited to the entrypoints and the chunks associated with them.
    * false by default
    */
  var entrypoints: js.UndefOr[Boolean] = js.undefined
  /**
    * When set and "includeAllFileTypes" is set false, only assets matching these types will be included in the assets file.
    * ['js', 'css'] by default
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Name for the created json file.
    * "webpack-assets.json" by default
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * If false the output will not include the full path of the generated file.
    * true by default
    */
  var fullPath: js.UndefOr[Boolean] = js.undefined
  /**
    * When set false, falls back to the "fileTypes" option array to decide which file types to include in the assets file.
    * true by default
    */
  var includeAllFileTypes: js.UndefOr[Boolean] = js.undefined
  /**
    * Inserts the manifest javascript as a text property in your assets.
    * Accepts the name of your manifest chunk.
    * A manifest is the last CommonChunk that only contains the webpack bootstrap code.
    * This is useful for production use when you want to inline the manifest
    * in your HTML skeleton for long-term caching.
    * false by default
    */
  var includeManifest: js.UndefOr[Boolean] = js.undefined
  /**
    * When set the assets file will only be generated in memory while running webpack-dev-server and not written to disk.
    * false by default
    */
  var keepInMemory: js.UndefOr[Boolean] = js.undefined
  /**
    * Orders the assets output so that manifest is the first entry.
    * This is useful for cases where script tags are generated from the assets json output, and order of import is important.
    * false by default
    */
  var manifestFirst: js.UndefOr[Boolean] = js.undefined
  /**
    * Inject metadata into the output file. All values will be injected into the key "metadata"
    */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /**
    * Path where to save the created JSON file.
    * Defaults to the current directory
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Whether to format the JSON output for readability.
    * false by default
    */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Formats the assets output.
    * Defaults to JSON.stringify
    */
  var processOutput: js.UndefOr[ProcessOutputFn] = js.undefined
  /**
    * When set to true, the output JSON file will be updated instead of overwritten.
    * false by default
    */
  var update: js.UndefOr[Boolean] = js.undefined
  /**
    * Will override the path to use the compiler output path set in your webpack config.
    * false by default
    */
  var useCompilerPath: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    entrypoints: js.UndefOr[Boolean] = js.undefined,
    fileTypes: js.Array[String] = null,
    filename: String = null,
    fullPath: js.UndefOr[Boolean] = js.undefined,
    includeAllFileTypes: js.UndefOr[Boolean] = js.undefined,
    includeManifest: js.UndefOr[Boolean] = js.undefined,
    keepInMemory: js.UndefOr[Boolean] = js.undefined,
    manifestFirst: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Object = null,
    path: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    processOutput: /* assets */ Assets => String = null,
    update: js.UndefOr[Boolean] = js.undefined,
    useCompilerPath: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entrypoints)) __obj.updateDynamic("entrypoints")(entrypoints.asInstanceOf[js.Any])
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(fullPath)) __obj.updateDynamic("fullPath")(fullPath.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAllFileTypes)) __obj.updateDynamic("includeAllFileTypes")(includeAllFileTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(includeManifest)) __obj.updateDynamic("includeManifest")(includeManifest.asInstanceOf[js.Any])
    if (!js.isUndefined(keepInMemory)) __obj.updateDynamic("keepInMemory")(keepInMemory.asInstanceOf[js.Any])
    if (!js.isUndefined(manifestFirst)) __obj.updateDynamic("manifestFirst")(manifestFirst.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (processOutput != null) __obj.updateDynamic("processOutput")(js.Any.fromFunction1(processOutput))
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (!js.isUndefined(useCompilerPath)) __obj.updateDynamic("useCompilerPath")(useCompilerPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

