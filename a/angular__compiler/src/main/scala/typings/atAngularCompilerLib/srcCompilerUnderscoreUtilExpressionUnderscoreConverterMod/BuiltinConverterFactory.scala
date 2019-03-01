package typings
package atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltinConverterFactory extends js.Object {
  def createLiteralArrayConverter(argCount: scala.Double): BuiltinConverter
  def createLiteralMapConverter(keys: js.Array[atAngularCompilerLib.Anon_Key]): BuiltinConverter
  def createPipeConverter(name: java.lang.String, argCount: scala.Double): BuiltinConverter
}

object BuiltinConverterFactory {
  @scala.inline
  def apply(
    createLiteralArrayConverter: js.Function1[scala.Double, BuiltinConverter],
    createLiteralMapConverter: js.Function1[js.Array[atAngularCompilerLib.Anon_Key], BuiltinConverter],
    createPipeConverter: js.Function2[java.lang.String, scala.Double, BuiltinConverter]
  ): BuiltinConverterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createLiteralArrayConverter")(createLiteralArrayConverter)
    __obj.updateDynamic("createLiteralMapConverter")(createLiteralMapConverter)
    __obj.updateDynamic("createPipeConverter")(createPipeConverter)
    __obj.asInstanceOf[BuiltinConverterFactory]
  }
}

