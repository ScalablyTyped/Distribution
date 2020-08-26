package typings.assetsWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If the "entrypoints" option is given, the output will be limited to the entrypoints and the chunks associated with them.
    * false by default
    */
  var entrypoints: js.UndefOr[Boolean] = js.native
  /**
    * When set and "includeAllFileTypes" is set false, only assets matching these types will be included in the assets file.
    * ['js', 'css'] by default
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Name for the created json file.
    * "webpack-assets.json" by default
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * If false the output will not include the full path of the generated file.
    * true by default
    */
  var fullPath: js.UndefOr[Boolean] = js.native
  /**
    * When set false, falls back to the "fileTypes" option array to decide which file types to include in the assets file.
    * true by default
    */
  var includeAllFileTypes: js.UndefOr[Boolean] = js.native
  /**
    * Inserts the manifest javascript as a text property in your assets.
    * Accepts the name of your manifest chunk.
    * A manifest is the last CommonChunk that only contains the webpack bootstrap code.
    * This is useful for production use when you want to inline the manifest
    * in your HTML skeleton for long-term caching.
    * false by default
    */
  var includeManifest: js.UndefOr[Boolean] = js.native
  /**
    * When set the assets file will only be generated in memory while running webpack-dev-server and not written to disk.
    * false by default
    */
  var keepInMemory: js.UndefOr[Boolean] = js.native
  /**
    * Orders the assets output so that manifest is the first entry.
    * This is useful for cases where script tags are generated from the assets json output, and order of import is important.
    * false by default
    */
  var manifestFirst: js.UndefOr[Boolean] = js.native
  /**
    * Inject metadata into the output file. All values will be injected into the key "metadata"
    */
  var metadata: js.UndefOr[js.Object] = js.native
  /**
    * Path where to save the created JSON file.
    * Defaults to the current directory
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Whether to format the JSON output for readability.
    * false by default
    */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Formats the assets output.
    * Defaults to JSON.stringify
    */
  var processOutput: js.UndefOr[ProcessOutputFn] = js.native
  /**
    * When set to true, the output JSON file will be updated instead of overwritten.
    * false by default
    */
  var update: js.UndefOr[Boolean] = js.native
  /**
    * Will override the path to use the compiler output path set in your webpack config.
    * false by default
    */
  var useCompilerPath: js.UndefOr[Boolean] = js.native
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
    def setEntrypoints(value: Boolean): Self = this.set("entrypoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrypoints: Self = this.set("entrypoints", js.undefined)
    @scala.inline
    def setFileTypesVarargs(value: String*): Self = this.set("fileTypes", js.Array(value :_*))
    @scala.inline
    def setFileTypes(value: js.Array[String]): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileTypes: Self = this.set("fileTypes", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFullPath(value: Boolean): Self = this.set("fullPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullPath: Self = this.set("fullPath", js.undefined)
    @scala.inline
    def setIncludeAllFileTypes(value: Boolean): Self = this.set("includeAllFileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAllFileTypes: Self = this.set("includeAllFileTypes", js.undefined)
    @scala.inline
    def setIncludeManifest(value: Boolean): Self = this.set("includeManifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeManifest: Self = this.set("includeManifest", js.undefined)
    @scala.inline
    def setKeepInMemory(value: Boolean): Self = this.set("keepInMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepInMemory: Self = this.set("keepInMemory", js.undefined)
    @scala.inline
    def setManifestFirst(value: Boolean): Self = this.set("manifestFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestFirst: Self = this.set("manifestFirst", js.undefined)
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setProcessOutput(value: /* assets */ Assets => String): Self = this.set("processOutput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProcessOutput: Self = this.set("processOutput", js.undefined)
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUseCompilerPath(value: Boolean): Self = this.set("useCompilerPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCompilerPath: Self = this.set("useCompilerPath", js.undefined)
  }
  
}

