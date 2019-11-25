package typings.atAngularCompiler.srcRender3ViewApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.Anon_ClassAttr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3HostMetadata extends js.Object {
  /**
    * A mapping of attribute binding keys to `o.Expression`s.
    */
  var attributes: StringDictionary[Expression]
  /**
    * A mapping of event binding keys to unparsed expressions.
    */
  var listeners: StringDictionary[String]
  /**
    * A mapping of property binding keys to unparsed expressions.
    */
  var properties: StringDictionary[String]
  var specialAttributes: Anon_ClassAttr
}

object R3HostMetadata {
  @scala.inline
  def apply(
    attributes: StringDictionary[Expression],
    listeners: StringDictionary[String],
    properties: StringDictionary[String],
    specialAttributes: Anon_ClassAttr
  ): R3HostMetadata = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], specialAttributes = specialAttributes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[R3HostMetadata]
  }
}

