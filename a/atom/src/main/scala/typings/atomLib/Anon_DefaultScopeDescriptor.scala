package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultScopeDescriptor extends js.Object {
  var scopeDescriptor: atomLib.atomMod.ScopeDescriptor
  var value: atomLib.atomLibStrings.default | atomLib.atomLibStrings.srgb
}

object Anon_DefaultScopeDescriptor {
  @scala.inline
  def apply(
    scopeDescriptor: atomLib.atomMod.ScopeDescriptor,
    value: atomLib.atomLibStrings.default | atomLib.atomLibStrings.srgb
  ): Anon_DefaultScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DefaultScopeDescriptor]
  }
}

