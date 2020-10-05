package typings.angularCompiler.viewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.ClassAttr
import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedHostBindings extends js.Object {
  var attributes: StringDictionary[Expression] = js.native
  var listeners: StringDictionary[String] = js.native
  var properties: StringDictionary[String] = js.native
  var specialAttributes: ClassAttr = js.native
}

object ParsedHostBindings {
  @scala.inline
  def apply(
    attributes: StringDictionary[Expression],
    listeners: StringDictionary[String],
    properties: StringDictionary[String],
    specialAttributes: ClassAttr
  ): ParsedHostBindings = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], specialAttributes = specialAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHostBindings]
  }
  @scala.inline
  implicit class ParsedHostBindingsOps[Self <: ParsedHostBindings] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[Expression]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setListeners(value: StringDictionary[String]): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecialAttributes(value: ClassAttr): Self = this.set("specialAttributes", value.asInstanceOf[js.Any])
  }
  
}

