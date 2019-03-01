package typings
package adoneLib.adoneNs.templatingNs.nunjucksNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecompileOptions extends js.Object {
  var asFunction: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[adoneLib.adoneNs.templatingNs.nunjucksNs.Environment] = js.undefined
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var wrapper: js.UndefOr[
    js.Function2[/* templates */ adoneLib.Anon_NameTemplate, /* opts */ this.type, java.lang.String]
  ] = js.undefined
}

object PrecompileOptions {
  @scala.inline
  def apply(
    asFunction: js.UndefOr[scala.Boolean] = js.undefined,
    env: adoneLib.adoneNs.templatingNs.nunjucksNs.Environment = null,
    exclude: js.Array[java.lang.String] = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    include: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    wrapper: js.Function2[/* templates */ adoneLib.Anon_NameTemplate, PrecompileOptions, java.lang.String] = null
  ): PrecompileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asFunction)) __obj.updateDynamic("asFunction")(asFunction)
    if (env != null) __obj.updateDynamic("env")(env)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (include != null) __obj.updateDynamic("include")(include)
    if (name != null) __obj.updateDynamic("name")(name)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[PrecompileOptions]
  }
}

