package typings
package atAngularCompilerLib.srcRender3ViewApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3HostMetadata extends js.Object {
  /**
    * A mapping of attribute binding keys to `o.Expression`s.
    */
  var attributes: org.scalablytyped.runtime.StringDictionary[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]
  /**
    * A mapping of event binding keys to unparsed expressions.
    */
  var listeners: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * A mapping of property binding keys to unparsed expressions.
    */
  var properties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var specialAttributes: atAngularCompilerLib.Anon_ClassAttr
}

object R3HostMetadata {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression],
    listeners: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    specialAttributes: atAngularCompilerLib.Anon_ClassAttr
  ): R3HostMetadata = {
    val __obj = js.Dynamic.literal(attributes = attributes, listeners = listeners, properties = properties, specialAttributes = specialAttributes)
  
    __obj.asInstanceOf[R3HostMetadata]
  }
}

