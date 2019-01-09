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

