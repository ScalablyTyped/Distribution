package typings.adone.adoneNs.fastNs.INs.pluginNs.sourcemapsNs

import typings.adone.adoneNs.fastNs.INs.FileCloneOptions
import typings.adone.adoneNs.fsNs.INs.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions[T] extends js.Object {
  /**
    * By default a comment containing / referencing the source map is added.
    * Set this to false to disable the comment (e.g. if you want to load the source maps by header)
    */
  var addComment: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the charset for inline source maps
    */
  var charset: js.UndefOr[Encoding] = js.undefined
  /**
    * Clone options
    */
  @JSName("clone")
  var clone_FWriteOptions: js.UndefOr[FileCloneOptions] = js.undefined
  /**
    * Set the destination path
    */
  var destPath: js.UndefOr[String] = js.undefined
  /**
    * By default the source maps include the source code. Pass false to use the original files
    */
  var includeContent: js.UndefOr[Boolean] = js.undefined
  /**
    * This option allows to rename the map file.
    * It takes a function that is called for every map and receives the default map path as a parameter
    */
  var mapFile: js.UndefOr[js.Function1[/* file */ T, String]] = js.undefined
  /**
    * Function that is called for every source and receives the default source path as a parameter and the original file
    */
  var mapSources: js.UndefOr[js.Function2[/* path */ String, /* file */ T, String]] = js.undefined
  var mapSourcesAbsolute: js.UndefOr[Boolean] = js.undefined
  /**
    * The output of the function must be the full URL to the source map (in function of the output file)
    */
  var sourceMappingURL: js.UndefOr[js.Function1[/* file */ T, String]] = js.undefined
  /**
    * Specify a prefix to be prepended onto the source map URL when writing external source maps.
    */
  var sourceMappingURLPrefix: js.UndefOr[String | (js.Function1[/* file */ T, String])] = js.undefined
  /**
    * Set the location where the source files are hosted (use this when includeContent is set to false)
    */
  var sourceRoot: js.UndefOr[String | (js.Function1[/* file */ T, String])] = js.undefined
}

object WriteOptions {
  @scala.inline
  def apply[T](
    addComment: js.UndefOr[Boolean] = js.undefined,
    charset: Encoding = null,
    clone: FileCloneOptions = null,
    destPath: String = null,
    includeContent: js.UndefOr[Boolean] = js.undefined,
    mapFile: /* file */ T => String = null,
    mapSources: (/* path */ String, /* file */ T) => String = null,
    mapSourcesAbsolute: js.UndefOr[Boolean] = js.undefined,
    sourceMappingURL: /* file */ T => String = null,
    sourceMappingURLPrefix: String | (js.Function1[/* file */ T, String]) = null,
    sourceRoot: String | (js.Function1[/* file */ T, String]) = null
  ): WriteOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addComment)) __obj.updateDynamic("addComment")(addComment)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (clone != null) __obj.updateDynamic("clone")(clone)
    if (destPath != null) __obj.updateDynamic("destPath")(destPath)
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent)
    if (mapFile != null) __obj.updateDynamic("mapFile")(js.Any.fromFunction1(mapFile))
    if (mapSources != null) __obj.updateDynamic("mapSources")(js.Any.fromFunction2(mapSources))
    if (!js.isUndefined(mapSourcesAbsolute)) __obj.updateDynamic("mapSourcesAbsolute")(mapSourcesAbsolute)
    if (sourceMappingURL != null) __obj.updateDynamic("sourceMappingURL")(js.Any.fromFunction1(sourceMappingURL))
    if (sourceMappingURLPrefix != null) __obj.updateDynamic("sourceMappingURLPrefix")(sourceMappingURLPrefix.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions[T]]
  }
}

