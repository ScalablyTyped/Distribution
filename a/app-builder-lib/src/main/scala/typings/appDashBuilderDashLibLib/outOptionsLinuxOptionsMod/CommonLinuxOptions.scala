package typings
package appDashBuilderDashLibLib.outOptionsLinuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonLinuxOptions extends js.Object {
  /**
    * The [application category](https://specifications.freedesktop.org/menu-spec/latest/apa.html#main-category-registry).
    */
  val category: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * As [description](/configuration/configuration#Metadata-description) from application package.json, but allows you to specify different for Linux.
    */
  val description: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The [Desktop file](https://developer.gnome.org/integration-guide/stable/desktop-files.html.en) entries (name to value).
    */
  val desktop: js.UndefOr[js.Any | scala.Null] = js.undefined
  /**
    * The mime types in addition to specified in the file associations. Use it if you don't want to register a new mime type, but reuse existing.
    */
  val mimeTypes: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
  /**
    * The [short description](https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Description).
    */
  val synopsis: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object CommonLinuxOptions {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    description: java.lang.String = null,
    desktop: js.Any = null,
    mimeTypes: js.Array[java.lang.String] = null,
    synopsis: java.lang.String = null
  ): CommonLinuxOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (description != null) __obj.updateDynamic("description")(description)
    if (desktop != null) __obj.updateDynamic("desktop")(desktop)
    if (mimeTypes != null) __obj.updateDynamic("mimeTypes")(mimeTypes)
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis)
    __obj.asInstanceOf[CommonLinuxOptions]
  }
}

