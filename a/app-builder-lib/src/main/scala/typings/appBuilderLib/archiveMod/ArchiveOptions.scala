package typings.appBuilderLib.archiveMod

import typings.appBuilderLib.appBuilderLibStrings.Copy
import typings.appBuilderLib.appBuilderLibStrings.DEFAULT
import typings.appBuilderLib.appBuilderLibStrings.Deflate
import typings.appBuilderLib.appBuilderLibStrings.LZMA
import typings.appBuilderLib.coreMod.CompressionLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveOptions extends js.Object {
  var compression: js.UndefOr[CompressionLevel | Null] = js.undefined
  var dictSize: js.UndefOr[Double] = js.undefined
  var excluded: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * @default true
    */
  var isArchiveHeaderCompressed: js.UndefOr[Boolean] = js.undefined
  var isRegularFile: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[Copy | LZMA | Deflate | DEFAULT] = js.undefined
  /**
    * @default true
    */
  var solid: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var withoutDir: js.UndefOr[Boolean] = js.undefined
}

object ArchiveOptions {
  @scala.inline
  def apply(
    compression: js.UndefOr[Null | CompressionLevel] = js.undefined,
    dictSize: js.UndefOr[Double] = js.undefined,
    excluded: js.UndefOr[Null | js.Array[String]] = js.undefined,
    isArchiveHeaderCompressed: js.UndefOr[Boolean] = js.undefined,
    isRegularFile: js.UndefOr[Boolean] = js.undefined,
    method: Copy | LZMA | Deflate | DEFAULT = null,
    solid: js.UndefOr[Boolean] = js.undefined,
    withoutDir: js.UndefOr[Boolean] = js.undefined
  ): ArchiveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(dictSize)) __obj.updateDynamic("dictSize")(dictSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(excluded)) __obj.updateDynamic("excluded")(excluded.asInstanceOf[js.Any])
    if (!js.isUndefined(isArchiveHeaderCompressed)) __obj.updateDynamic("isArchiveHeaderCompressed")(isArchiveHeaderCompressed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isRegularFile)) __obj.updateDynamic("isRegularFile")(isRegularFile.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(solid)) __obj.updateDynamic("solid")(solid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutDir)) __obj.updateDynamic("withoutDir")(withoutDir.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveOptions]
  }
}

