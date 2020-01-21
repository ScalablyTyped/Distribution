package typings.appBuilderLib.linuxOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.bzip2
import typings.appBuilderLib.appBuilderLibStrings.gz
import typings.appBuilderLib.appBuilderLibStrings.xz
import typings.appBuilderLib.coreMod.Publish
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
    if (afterInstall != null) __obj.updateDynamic("afterInstall")(afterInstall.asInstanceOf[js.Any])
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(afterRemove.asInstanceOf[js.Any])
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (depends != null) __obj.updateDynamic("depends")(depends.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fpm != null) __obj.updateDynamic("fpm")(fpm.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (maintainer != null) __obj.updateDynamic("maintainer")(maintainer.asInstanceOf[js.Any])
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (packageCategory != null) __obj.updateDynamic("packageCategory")(packageCategory.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebOptions]
  }
}

