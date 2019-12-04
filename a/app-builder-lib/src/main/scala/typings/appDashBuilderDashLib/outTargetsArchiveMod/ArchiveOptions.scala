package typings.appDashBuilderDashLib.outTargetsArchiveMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.Copy
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.DEFAULT
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.Deflate
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.LZMA
import typings.appDashBuilderDashLib.outCoreMod.CompressionLevel
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
    compression: CompressionLevel = null,
    dictSize: Int | Double = null,
    excluded: js.Array[String] = null,
    isArchiveHeaderCompressed: js.UndefOr[Boolean] = js.undefined,
    isRegularFile: js.UndefOr[Boolean] = js.undefined,
    method: Copy | LZMA | Deflate | DEFAULT = null,
    solid: js.UndefOr[Boolean] = js.undefined,
    withoutDir: js.UndefOr[Boolean] = js.undefined
  ): ArchiveOptions = {
    val __obj = js.Dynamic.literal()
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (dictSize != null) __obj.updateDynamic("dictSize")(dictSize.asInstanceOf[js.Any])
    if (excluded != null) __obj.updateDynamic("excluded")(excluded.asInstanceOf[js.Any])
    if (!js.isUndefined(isArchiveHeaderCompressed)) __obj.updateDynamic("isArchiveHeaderCompressed")(isArchiveHeaderCompressed.asInstanceOf[js.Any])
    if (!js.isUndefined(isRegularFile)) __obj.updateDynamic("isRegularFile")(isRegularFile.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(solid)) __obj.updateDynamic("solid")(solid.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutDir)) __obj.updateDynamic("withoutDir")(withoutDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveOptions]
  }
}

