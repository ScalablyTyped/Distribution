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
    val __obj = js.Dynamic.literal(append = append, conditional = conditional, define = define, defineParams = defineParams, encode = encode, evaluate = evaluate, interpolate = interpolate, iterate = iterate, selfcontained = selfcontained, strip = strip, use = use, useParams = useParams, varname = varname)
  
    __obj.asInstanceOf[TemplateSettings]
  }
}

