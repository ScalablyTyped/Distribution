package typings.atAngularCompiler.srcRender3ViewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.Anon_ClassAttr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHostBindings extends js.Object {
  var attributes: StringDictionary[Expression]
  var listeners: StringDictionary[String]
  var properties: StringDictionary[String]
  var specialAttributes: Anon_ClassAttr
}

object ParsedHostBindings {
  @scala.inline
  def apply(
    attributes: StringDictionary[Expression],
    listeners: StringDictionary[String],
    properties: StringDictionary[String],
    specialAttributes: Anon_ClassAttr
  ): ParsedHostBindings = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], specialAttributes = specialAttributes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedHostBindings]
  }
}

