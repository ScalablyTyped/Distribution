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

