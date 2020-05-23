package typings.appBuilderLib

import typings.appBuilderLib.appInfoMod.AppInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/macroExpander", JSImport.Namespace)
@js.native
object macroExpanderMod extends js.Object {
  def expandMacro(pattern: String, arch: js.UndefOr[Null | String], appInfo: AppInfo): String = js.native
  def expandMacro(pattern: String, arch: js.UndefOr[Null | String], appInfo: AppInfo, extra: js.Any): String = js.native
  def expandMacro(
    pattern: String,
    arch: js.UndefOr[Null | String],
    appInfo: AppInfo,
    extra: js.Any,
    isProductNameSanitized: Boolean
  ): String = js.native
}

