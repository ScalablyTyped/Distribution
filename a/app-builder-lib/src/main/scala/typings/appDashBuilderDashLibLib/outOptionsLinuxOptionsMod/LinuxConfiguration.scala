package typings
package appDashBuilderDashLibLib.outOptionsLinuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LinuxConfiguration
  extends appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
     with CommonLinuxOptions {
  /**
       * @deprecated
       * @private
       */
  val depends: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
       * The executable name. Defaults to `productName`.
       * Cannot be specified per target, allowed only in the `linux`.
       */
  val executableName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * The path to icon set directory or one png file, relative to the [build resources](/configuration/configuration.md#MetadataDirectories-buildResources) or to the project directory. The icon filename must contain the size (e.g. 32x32.png) of the icon.
       * By default will be generated automatically based on the macOS icns file.
       */
  @JSName("icon")
  val icon_LinuxConfiguration: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The maintainer. Defaults to [author](/configuration/configuration.md#Metadata-author).
       */
  val maintainer: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * backward compatibility + to allow specify fpm-only category for all possible fpm targets in one place
       * @private
       */
  val packageCategory: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * Target package type: list of `AppImage`, `snap`, `deb`, `rpm`, `freebsd`, `pacman`, `p5p`, `apk`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
       *
       * electron-builder [docker image](/multi-platform-build#docker) can be used to build Linux targets on any platform.
       *
       * Please [do not put an AppImage into another archive](https://github.com/probonopd/AppImageKit/wiki/Creating-AppImages#common-mistake) like a .zip or .tar.gz.
       * @default AppImage
       */
  @JSName("target")
  val target_LinuxConfiguration: js.UndefOr[appDashBuilderDashLibLib.outCoreMod.TargetConfigType] = js.undefined
  /**
       * The vendor. Defaults to [author](/configuration/configuration.md#Metadata-author).
       */
  val vendor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

