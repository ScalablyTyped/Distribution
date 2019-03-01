package typings
package adoneLib.adoneNs.templatingNs.dotNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateSettings extends js.Object {
  var append: scala.Boolean
  var conditional: stdLib.RegExp
  var define: stdLib.RegExp
  var defineParams: stdLib.RegExp
  var encode: stdLib.RegExp
  var evaluate: stdLib.RegExp
  var interpolate: stdLib.RegExp
  var iterate: stdLib.RegExp
  var selfcontained: scala.Boolean
  var strip: scala.Boolean
  var use: stdLib.RegExp
  var useParams: stdLib.RegExp
  var varname: java.lang.String
}

object TemplateSettings {
  @scala.inline
  def apply(
    append: scala.Boolean,
    conditional: stdLib.RegExp,
    define: stdLib.RegExp,
    defineParams: stdLib.RegExp,
    encode: stdLib.RegExp,
    evaluate: stdLib.RegExp,
    interpolate: stdLib.RegExp,
    iterate: stdLib.RegExp,
    selfcontained: scala.Boolean,
    strip: scala.Boolean,
    use: stdLib.RegExp,
    useParams: stdLib.RegExp,
    varname: java.lang.String
  ): TemplateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(append)
    __obj.updateDynamic("conditional")(conditional)
    __obj.updateDynamic("define")(define)
    __obj.updateDynamic("defineParams")(defineParams)
    __obj.updateDynamic("encode")(encode)
    __obj.updateDynamic("evaluate")(evaluate)
    __obj.updateDynamic("interpolate")(interpolate)
    __obj.updateDynamic("iterate")(iterate)
    __obj.updateDynamic("selfcontained")(selfcontained)
    __obj.updateDynamic("strip")(strip)
    __obj.updateDynamic("use")(use)
    __obj.updateDynamic("useParams")(useParams)
    __obj.updateDynamic("varname")(varname)
    __obj.asInstanceOf[TemplateSettings]
  }
}

