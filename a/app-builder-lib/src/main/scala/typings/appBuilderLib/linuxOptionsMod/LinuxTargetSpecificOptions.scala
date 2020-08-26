package typings.appBuilderLib.linuxOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.bzip2
import typings.appBuilderLib.appBuilderLibStrings.gz
import typings.appBuilderLib.appBuilderLibStrings.xz
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxTargetSpecificOptions
  extends CommonLinuxOptions
     with TargetSpecificOptions {
  val afterInstall: js.UndefOr[String | Null] = js.native
  val afterRemove: js.UndefOr[String | Null] = js.native
  /**
    * The compression type.
    * @default xz
    */
  val compression: js.UndefOr[gz | bzip2 | xz | Null] = js.native
  /**
    * Package dependencies.
    */
  val depends: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * *Advanced only* The [fpm](https://github.com/jordansissel/fpm/wiki#usage) options.
    *
    * Example: `["--before-install=build/deb-preinstall.sh", "--after-upgrade=build/deb-postinstall.sh"]`
    */
  val fpm: js.UndefOr[js.Array[String] | Null] = js.native
  val icon: js.UndefOr[String] = js.native
  val maintainer: js.UndefOr[String | Null] = js.native
  /**
    * The package category.
    */
  val packageCategory: js.UndefOr[String | Null] = js.native
  val vendor: js.UndefOr[String | Null] = js.native
}

object LinuxTargetSpecificOptions {
  @scala.inline
  def apply(): LinuxTargetSpecificOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxTargetSpecificOptions]
  }
  @scala.inline
  implicit class LinuxTargetSpecificOptionsOps[Self <: LinuxTargetSpecificOptions] (val x: Self) extends AnyVal {
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
    def setAfterInstall(value: String): Self = this.set("afterInstall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterInstall: Self = this.set("afterInstall", js.undefined)
    @scala.inline
    def setAfterInstallNull: Self = this.set("afterInstall", null)
    @scala.inline
    def setAfterRemove(value: String): Self = this.set("afterRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRemove: Self = this.set("afterRemove", js.undefined)
    @scala.inline
    def setAfterRemoveNull: Self = this.set("afterRemove", null)
    @scala.inline
    def setCompression(value: gz | bzip2 | xz): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setCompressionNull: Self = this.set("compression", null)
    @scala.inline
    def setDependsVarargs(value: String*): Self = this.set("depends", js.Array(value :_*))
    @scala.inline
    def setDepends(value: js.Array[String]): Self = this.set("depends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepends: Self = this.set("depends", js.undefined)
    @scala.inline
    def setDependsNull: Self = this.set("depends", null)
    @scala.inline
    def setFpmVarargs(value: String*): Self = this.set("fpm", js.Array(value :_*))
    @scala.inline
    def setFpm(value: js.Array[String]): Self = this.set("fpm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpm: Self = this.set("fpm", js.undefined)
    @scala.inline
    def setFpmNull: Self = this.set("fpm", null)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMaintainer(value: String): Self = this.set("maintainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainer: Self = this.set("maintainer", js.undefined)
    @scala.inline
    def setMaintainerNull: Self = this.set("maintainer", null)
    @scala.inline
    def setPackageCategory(value: String): Self = this.set("packageCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageCategory: Self = this.set("packageCategory", js.undefined)
    @scala.inline
    def setPackageCategoryNull: Self = this.set("packageCategory", null)
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
    @scala.inline
    def setVendorNull: Self = this.set("vendor", null)
  }
  
}

