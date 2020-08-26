package typings.appBuilderLib.msiOptionsMod

import typings.appBuilderLib.commonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsiOptions
  extends CommonWindowsInstallerConfiguration
     with TargetSpecificOptions {
  /**
    * The [upgrade code](https://msdn.microsoft.com/en-us/library/windows/desktop/aa372375(v=vs.85).aspx). Optional, by default generated using app id.
    */
  val upgradeCode: js.UndefOr[String | Null] = js.native
  /**
    * If `warningsAsErrors` is `true` (default): treat warnings as errors. If `warningsAsErrors` is `false`: allow warnings.
    * @default true
    */
  val warningsAsErrors: js.UndefOr[Boolean] = js.native
}

object MsiOptions {
  @scala.inline
  def apply(): MsiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsiOptions]
  }
  @scala.inline
  implicit class MsiOptionsOps[Self <: MsiOptions] (val x: Self) extends AnyVal {
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
    def setUpgradeCode(value: String): Self = this.set("upgradeCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgradeCode: Self = this.set("upgradeCode", js.undefined)
    @scala.inline
    def setUpgradeCodeNull: Self = this.set("upgradeCode", null)
    @scala.inline
    def setWarningsAsErrors(value: Boolean): Self = this.set("warningsAsErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarningsAsErrors: Self = this.set("warningsAsErrors", js.undefined)
  }
  
}

