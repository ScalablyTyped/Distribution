package typings.angularCompiler.expressionConverterMod

import typings.angularCompiler.AnonQuoted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltinConverterFactory extends js.Object {
  def createLiteralArrayConverter(argCount: Double): BuiltinConverter
  def createLiteralMapConverter(keys: js.Array[AnonQuoted]): BuiltinConverter
  def createPipeConverter(name: String, argCount: Double): BuiltinConverter
}

object BuiltinConverterFactory {
  @scala.inline
  def apply(
    createLiteralArrayConverter: Double => BuiltinConverter,
    createLiteralMapConverter: js.Array[AnonQuoted] => BuiltinConverter,
    createPipeConverter: (String, Double) => BuiltinConverter
  ): BuiltinConverterFactory = {
    val __obj = js.Dynamic.literal(createLiteralArrayConverter = js.Any.fromFunction1(createLiteralArrayConverter), createLiteralMapConverter = js.Any.fromFunction1(createLiteralMapConverter), createPipeConverter = js.Any.fromFunction2(createPipeConverter))
  
    __obj.asInstanceOf[BuiltinConverterFactory]
  }
}

