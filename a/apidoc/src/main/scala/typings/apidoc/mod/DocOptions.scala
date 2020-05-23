package typings.apidoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocOptions extends js.Object {
  var apiprivate: js.UndefOr[Boolean] = js.undefined
  var colorize: js.UndefOr[Boolean] = js.undefined
  var config: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var dest: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var markdown: js.UndefOr[Boolean] = js.undefined
  var parse: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var simulate: js.UndefOr[Boolean] = js.undefined
  var single: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateSingleFile: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object DocOptions {
  @scala.inline
  def apply(
    apiprivate: js.UndefOr[Boolean] = js.undefined,
    colorize: js.UndefOr[Boolean] = js.undefined,
    config: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dest: String = null,
    encoding: String = null,
    markdown: js.UndefOr[Boolean] = js.undefined,
    parse: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    simulate: js.UndefOr[Boolean] = js.undefined,
    single: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateSingleFile: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): DocOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apiprivate)) __obj.updateDynamic("apiprivate")(apiprivate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorize)) __obj.updateDynamic("colorize")(colorize.get.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(markdown)) __obj.updateDynamic("markdown")(markdown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simulate)) __obj.updateDynamic("simulate")(simulate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateSingleFile != null) __obj.updateDynamic("templateSingleFile")(templateSingleFile.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocOptions]
  }
}

