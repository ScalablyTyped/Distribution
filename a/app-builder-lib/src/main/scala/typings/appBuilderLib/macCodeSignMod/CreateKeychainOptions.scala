package typings.appBuilderLib.macCodeSignMod

import typings.builderUtil.mod.TmpDir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeychainOptions extends js.Object {
  var cscIKeyPassword: js.UndefOr[String | Null] = js.undefined
  var cscILink: js.UndefOr[String | Null] = js.undefined
  var cscKeyPassword: String
  var cscLink: String
  var currentDir: String
  var tmpDir: TmpDir
}

object CreateKeychainOptions {
  @scala.inline
  def apply(
    cscKeyPassword: String,
    cscLink: String,
    currentDir: String,
    tmpDir: TmpDir,
    cscIKeyPassword: js.UndefOr[Null | String] = js.undefined,
    cscILink: js.UndefOr[Null | String] = js.undefined
  ): CreateKeychainOptions = {
    val __obj = js.Dynamic.literal(cscKeyPassword = cscKeyPassword.asInstanceOf[js.Any], cscLink = cscLink.asInstanceOf[js.Any], currentDir = currentDir.asInstanceOf[js.Any], tmpDir = tmpDir.asInstanceOf[js.Any])
    if (!js.isUndefined(cscIKeyPassword)) __obj.updateDynamic("cscIKeyPassword")(cscIKeyPassword.asInstanceOf[js.Any])
    if (!js.isUndefined(cscILink)) __obj.updateDynamic("cscILink")(cscILink.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeychainOptions]
  }
}

