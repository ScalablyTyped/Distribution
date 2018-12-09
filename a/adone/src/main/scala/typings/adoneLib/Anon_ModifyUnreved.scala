package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ModifyUnreved extends js.Object {
  /**
                       * Use canonical Uris when replacing filePaths,
                       * i.e. when working with filepaths with non forward slash (/) path separators
                       * we replace them with forward slash.
                       * Default: true
                       */
  var canonicalUris: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * Read JSON manifests written out by revisionHash
                       */
  var manifest: js.UndefOr[
    js.Array[adoneLib.adoneNs.fastNs.INs.File] | (adoneLib.adoneNs.streamNs.coreNs.Stream[_, adoneLib.adoneNs.fastNs.INs.File])
  ] = js.undefined
  /**
                       * Modify the name of the reved files before using them
                       */
  var modifyReved: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.undefined
  /**
                       * Modify the name of the unreved files before using them
                       */
  var modifyUnreved: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.undefined
  /**
                       * Add the prefix string to each replacement
                       */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
                       * Only substitute in new filenames in files of these types
                       * Default: ['.js', '.css', '.html', '.hbs']
                       */
  var replaceExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

