package typings.appDashBuilderDashLib.outOptionsLinuxOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.bzip2
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.gz
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.xz
import typings.appDashBuilderDashLib.outCoreMod.Publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebOptions extends LinuxTargetSpecificOptions {
  /**
    * The [Priority](https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Priority) attribute.
    */
  val priority: js.UndefOr[String | Null] = js.undefined
}

object DebOptions {
  @scala.inline
  def apply(
    afterInstall: String = null,
    afterRemove: String = null,
    artifactName: String = null,
    category: String = null,
    compression: gz | bzip2 | xz = null,
    depends: js.Array[String] = null,
    description: String = null,
    desktop: js.Any = null,
    fpm: js.Array[String] = null,
    icon: String = null,
    maintainer: String = null,
    mimeTypes: js.Array[String] = null,
    packageCategory: String = null,
    priority: String = null,
    publish: Publish = null,
    synopsis: String = null,
    vendor: String = null
  ): DebOptions = {
    val __obj = js.Dynamic.literal()
    if (afterInstall != null) __obj.updateDynamic("afterInstall")(afterInstall)
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(afterRemove)
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
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
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[DebOptions]
  }
}

