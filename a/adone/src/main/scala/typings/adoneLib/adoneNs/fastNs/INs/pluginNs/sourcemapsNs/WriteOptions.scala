package typings
package adoneLib.adoneNs.fastNs.INs.pluginNs.sourcemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WriteOptions[T] extends js.Object {
  /**
                       * By default a comment containing / referencing the source map is added.
                       * Set this to false to disable the comment (e.g. if you want to load the source maps by header)
                       */
  var addComment: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * Sets the charset for inline source maps
                       */
  var charset: js.UndefOr[adoneLib.adoneNs.fsNs.INs.Encoding] = js.undefined
  /**
                       * Clone options
                       */
  @JSName("clone")
  var clone_FWriteOptions: js.UndefOr[adoneLib.adoneNs.fastNs.INs.FileCloneOptions] = js.undefined
  /**
                       * Set the destination path
                       */
  var destPath: js.UndefOr[java.lang.String] = js.undefined
  /**
                       * By default the source maps include the source code. Pass false to use the original files
                       */
  var includeContent: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * This option allows to rename the map file.
                       * It takes a function that is called for every map and receives the default map path as a parameter
                       */
  var mapFile: js.UndefOr[js.Function1[/* file */ T, java.lang.String]] = js.undefined
  /**
                       * Function that is called for every source and receives the default source path as a parameter and the original file
                       */
  var mapSources: js.UndefOr[js.Function2[/* path */ java.lang.String, /* file */ T, java.lang.String]] = js.undefined
  var mapSourcesAbsolute: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * The output of the function must be the full URL to the source map (in function of the output file)
                       */
  var sourceMappingURL: js.UndefOr[js.Function1[/* file */ T, java.lang.String]] = js.undefined
  /**
                       * Specify a prefix to be prepended onto the source map URL when writing external source maps.
                       */
  var sourceMappingURLPrefix: js.UndefOr[java.lang.String | (js.Function1[/* file */ T, java.lang.String])] = js.undefined
  /**
                       * Set the location where the source files are hosted (use this when includeContent is set to false)
                       */
  var sourceRoot: js.UndefOr[java.lang.String | (js.Function1[/* file */ T, java.lang.String])] = js.undefined
}

