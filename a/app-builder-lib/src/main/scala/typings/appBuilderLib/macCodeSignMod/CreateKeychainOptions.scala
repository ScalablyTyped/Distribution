package typings.appBuilderLib.macCodeSignMod

import typings.builderUtil.mod.TmpDir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeychainOptions extends js.Object {
  var cscIKeyPassword: js.UndefOr[String | Null] = js.native
  var cscILink: js.UndefOr[String | Null] = js.native
  var cscKeyPassword: String = js.native
  var cscLink: String = js.native
  var currentDir: String = js.native
  var tmpDir: TmpDir = js.native
}

object CreateKeychainOptions {
  @scala.inline
  def apply(cscKeyPassword: String, cscLink: String, currentDir: String, tmpDir: TmpDir): CreateKeychainOptions = {
    val __obj = js.Dynamic.literal(cscKeyPassword = cscKeyPassword.asInstanceOf[js.Any], cscLink = cscLink.asInstanceOf[js.Any], currentDir = currentDir.asInstanceOf[js.Any], tmpDir = tmpDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeychainOptions]
  }
  @scala.inline
  implicit class CreateKeychainOptionsOps[Self <: CreateKeychainOptions] (val x: Self) extends AnyVal {
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
    def setCscKeyPassword(value: String): Self = this.set("cscKeyPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setCscLink(value: String): Self = this.set("cscLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentDir(value: String): Self = this.set("currentDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setTmpDir(value: TmpDir): Self = this.set("tmpDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setCscIKeyPassword(value: String): Self = this.set("cscIKeyPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCscIKeyPassword: Self = this.set("cscIKeyPassword", js.undefined)
    @scala.inline
    def setCscIKeyPasswordNull: Self = this.set("cscIKeyPassword", null)
    @scala.inline
    def setCscILink(value: String): Self = this.set("cscILink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCscILink: Self = this.set("cscILink", js.undefined)
    @scala.inline
    def setCscILinkNull: Self = this.set("cscILink", null)
  }
  
}

