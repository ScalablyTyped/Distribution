package typings.adone

import typings.adone.adoneNs.fastNs.INs.File
import typings.adone.adoneNs.streamNs.coreNs.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanonicalUris extends js.Object {
  /**
    * Use canonical Uris when replacing filePaths,
    * i.e. when working with filepaths with non forward slash (/) path separators
    * we replace them with forward slash.
    * Default: true
    */
  var canonicalUris: js.UndefOr[Boolean] = js.undefined
  /**
    * Read JSON manifests written out by revisionHash
    */
  var manifest: js.UndefOr[js.Array[File] | (Stream[_, File])] = js.undefined
  /**
    * Modify the name of the reved files before using them
    */
  var modifyReved: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  /**
    * Modify the name of the unreved files before using them
    */
  var modifyUnreved: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  /**
    * Add the prefix string to each replacement
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Only substitute in new filenames in files of these types
    * Default: ['.js', '.css', '.html', '.hbs']
    */
  var replaceExtensions: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_CanonicalUris {
  @scala.inline
  def apply(
    canonicalUris: js.UndefOr[Boolean] = js.undefined,
    manifest: js.Array[File] | (Stream[_, File]) = null,
    modifyReved: /* path */ String => String = null,
    modifyUnreved: /* path */ String => String = null,
    prefix: String = null,
    replaceExtensions: js.Array[String] = null
  ): Anon_CanonicalUris = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canonicalUris)) __obj.updateDynamic("canonicalUris")(canonicalUris)
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (modifyReved != null) __obj.updateDynamic("modifyReved")(js.Any.fromFunction1(modifyReved))
    if (modifyUnreved != null) __obj.updateDynamic("modifyUnreved")(js.Any.fromFunction1(modifyUnreved))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (replaceExtensions != null) __obj.updateDynamic("replaceExtensions")(replaceExtensions)
    __obj.asInstanceOf[Anon_CanonicalUris]
  }
}

