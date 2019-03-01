package typings
package appDashBuilderDashLibLib.outOptionsLinuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait LinuxConfiguration extends CommonLinuxOptions {
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
    * The path to icon set directory or one png file, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory. The icon filename must contain the size (e.g. 32x32.png) of the icon.
    * By default will be generated automatically based on the macOS icns file.
    */
  val icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maintainer. Defaults to [author](/configuration/configuration#Metadata-author).
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
  val target: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TargetConfigType */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TargetConfigType */ js.Any
  ] = js.undefined
  /**
    * The vendor. Defaults to [author](/configuration/configuration#Metadata-author).
    */
  val vendor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object LinuxConfiguration {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    depends: js.Array[java.lang.String] = null,
    description: java.lang.String = null,
    desktop: js.Any = null,
    executableName: java.lang.String = null,
    icon: java.lang.String = null,
    maintainer: java.lang.String = null,
    mimeTypes: js.Array[java.lang.String] = null,
    packageCategory: java.lang.String = null,
    synopsis: java.lang.String = null,
    target: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TargetConfigType */ js.Any = null,
    vendor: java.lang.String = null
  ): LinuxConfiguration = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (depends != null) __obj.updateDynamic("depends")(depends)
    if (description != null) __obj.updateDynamic("description")(description)
    if (desktop != null) __obj.updateDynamic("desktop")(desktop)
    if (executableName != null) __obj.updateDynamic("executableName")(executableName)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (maintainer != null) __obj.updateDynamic("maintainer")(maintainer)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    if (packageCategory != null) __obj.updateDynamic("packageCategory")(packageCategory)
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis)
    if (target != null) __obj.updateDynamic("target")(target)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[LinuxConfiguration]
  }
}

