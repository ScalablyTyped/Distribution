package typings
package atAngularCompilerLib.srcRender3ViewCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHostBindings extends js.Object {
  var attributes: org.scalablytyped.runtime.StringDictionary[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]
  var listeners: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var properties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var specialAttributes: atAngularCompilerLib.Anon_ClassAttr
}

object ParsedHostBindings {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression],
    listeners: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    specialAttributes: atAngularCompilerLib.Anon_ClassAttr
  ): ParsedHostBindings = {
    val __obj = js.Dynamic.literal(attributes = attributes, listeners = listeners, properties = properties, specialAttributes = specialAttributes)
  
    __obj.asInstanceOf[ParsedHostBindings]
  }
}

