package typings
package appDashBuilderDashLibLib.outOptionsLinuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait LinuxTargetSpecificOptions extends CommonLinuxOptions {
  val afterInstall: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val afterRemove: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The compression type.
    * @default xz
    */
  val compression: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.gz | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.bzip2 | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.xz | scala.Null
  ] = js.undefined
  /**
    * Package dependencies.
    */
  val depends: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * *Advanced only* The [fpm](https://github.com/jordansissel/fpm/wiki#usage) options.
    *
    * Example: `["--before-install=build/deb-preinstall.sh", "--after-upgrade=build/deb-postinstall.sh"]`
    */
  val fpm: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  val icon: js.UndefOr[java.lang.String] = js.undefined
  val maintainer: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The package category.
    */
  val packageCategory: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val vendor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object LinuxTargetSpecificOptions {
  @scala.inline
  def apply(
    afterInstall: java.lang.String = null,
    afterRemove: java.lang.String = null,
    category: java.lang.String = null,
    compression: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.gz | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.bzip2 | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.xz = null,
    depends: js.Array[java.lang.String] = null,
    description: java.lang.String = null,
    desktop: js.Any = null,
    fpm: js.Array[java.lang.String] = null,
    icon: java.lang.String = null,
    maintainer: java.lang.String = null,
    mimeTypes: js.Array[java.lang.String] = null,
    packageCategory: java.lang.String = null,
    synopsis: java.lang.String = null,
    vendor: java.lang.String = null
  ): LinuxTargetSpecificOptions = {
    val __obj = js.Dynamic.literal()
    if (afterInstall != null) __obj.updateDynamic("afterInstall")(afterInstall)
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(afterRemove)
    if (category != null) __obj.updateDynamic("category")(category)
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (depends != null) __obj.updateDynamic("depends")(depends)
    if (description != null) __obj.updateDynamic("description")(description)
    if (desktop != null) __obj.updateDynamic("desktop")(desktop)
    if (fpm != null) __obj.updateDynamic("fpm")(fpm)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (maintainer != null) __obj.updateDynamic("maintainer")(maintainer)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    if (packageCategory != null) __obj.updateDynamic("packageCategory")(packageCategory)
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[LinuxTargetSpecificOptions]
  }
}

