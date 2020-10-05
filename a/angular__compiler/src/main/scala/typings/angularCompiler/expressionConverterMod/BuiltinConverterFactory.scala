package typings.angularCompiler.expressionConverterMod

import typings.angularCompiler.anon.Quoted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuiltinConverterFactory extends js.Object {
  def createLiteralArrayConverter(argCount: Double): BuiltinConverter = js.native
  def createLiteralMapConverter(keys: js.Array[Quoted]): BuiltinConverter = js.native
  def createPipeConverter(name: String, argCount: Double): BuiltinConverter = js.native
}

object BuiltinConverterFactory {
  @scala.inline
  def apply(
    createLiteralArrayConverter: Double => BuiltinConverter,
    createLiteralMapConverter: js.Array[Quoted] => BuiltinConverter,
    createPipeConverter: (String, Double) => BuiltinConverter
  ): BuiltinConverterFactory = {
    val __obj = js.Dynamic.literal(createLiteralArrayConverter = js.Any.fromFunction1(createLiteralArrayConverter), createLiteralMapConverter = js.Any.fromFunction1(createLiteralMapConverter), createPipeConverter = js.Any.fromFunction2(createPipeConverter))
    __obj.asInstanceOf[BuiltinConverterFactory]
  }
  @scala.inline
  implicit class BuiltinConverterFactoryOps[Self <: BuiltinConverterFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateLiteralArrayConverter(value: Double => BuiltinConverter): Self = this.set("createLiteralArrayConverter", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateLiteralMapConverter(value: js.Array[Quoted] => BuiltinConverter): Self = this.set("createLiteralMapConverter", js.Any.fromFunction1(value))
    @scala.inline
    def setCreatePipeConverter(value: (String, Double) => BuiltinConverter): Self = this.set("createPipeConverter", js.Any.fromFunction2(value))
  }
  
}

