package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
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
  var specialAttributes: Anon_ClassAttr
}

object Anon_Attributes {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression],
    listeners: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    specialAttributes: Anon_ClassAttr
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes, listeners = listeners, properties = properties, specialAttributes = specialAttributes)
  
    __obj.asInstanceOf[Anon_Attributes]
  }
}

