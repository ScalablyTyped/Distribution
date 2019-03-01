package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyScopeDescriptor extends js.Object {
  var scopeDescriptor: atomLib.atomMod.ScopeDescriptor
  var value: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
}

object Anon_KeyScopeDescriptor {
  @scala.inline
  def apply(
    scopeDescriptor: atomLib.atomMod.ScopeDescriptor,
    value: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  ): Anon_KeyScopeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scopeDescriptor")(scopeDescriptor)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_KeyScopeDescriptor]
  }
}

