package typings.appBuilderLib.linuxOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonLinuxOptions extends js.Object {
  /**
    * The [application category](https://specifications.freedesktop.org/menu-spec/latest/apa.html#main-category-registry).
    */
  val category: js.UndefOr[String | Null] = js.undefined
  /**
    * As [description](/configuration/configuration#Metadata-description) from application package.json, but allows you to specify different for Linux.
    */
  val description: js.UndefOr[String | Null] = js.undefined
  /**
    * The [Desktop file](https://developer.gnome.org/integration-guide/stable/desktop-files.html.en) entries (name to value).
    */
  val desktop: js.UndefOr[js.Any | Null] = js.undefined
  /**
    * The executable parameters. Pass to executableName
    */
  val executableArgs: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * The mime types in addition to specified in the file associations. Use it if you don't want to register a new mime type, but reuse existing.
    */
  val mimeTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * The [short description](https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Description).
    */
  val synopsis: js.UndefOr[String | Null] = js.undefined
}

object CommonLinuxOptions {
  @scala.inline
  def apply(
    category: js.UndefOr[Null | String] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    desktop: js.UndefOr[Null | js.Any] = js.undefined,
    executableArgs: js.UndefOr[Null | js.Array[String]] = js.undefined,
    mimeTypes: js.UndefOr[Null | js.Array[String]] = js.undefined,
    synopsis: js.UndefOr[Null | String] = js.undefined
  ): CommonLinuxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(executableArgs)) __obj.updateDynamic("executableArgs")(executableArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(mimeTypes)) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(synopsis)) __obj.updateDynamic("synopsis")(synopsis.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonLinuxOptions]
  }
}

