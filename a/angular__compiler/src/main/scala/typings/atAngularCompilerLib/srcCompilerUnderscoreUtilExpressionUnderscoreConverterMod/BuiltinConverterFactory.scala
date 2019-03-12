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
    createLiteralArrayConverter: scala.Double => BuiltinConverter,
    createLiteralMapConverter: js.Array[atAngularCompilerLib.Anon_Key] => BuiltinConverter,
    createPipeConverter: (java.lang.String, scala.Double) => BuiltinConverter
  ): BuiltinConverterFactory = {
    val __obj = js.Dynamic.literal(createLiteralArrayConverter = js.Any.fromFunction1(createLiteralArrayConverter), createLiteralMapConverter = js.Any.fromFunction1(createLiteralMapConverter), createPipeConverter = js.Any.fromFunction2(createPipeConverter))
  
    __obj.asInstanceOf[BuiltinConverterFactory]
  }
}

