package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LimitedNo extends js.Object {
  var scopeDescriptor: atomLib.atomMod.ScopeDescriptor
  var value: atomLib.atomLibStrings.limited | atomLib.atomLibStrings.no | atomLib.atomLibStrings.undecided
}

object Anon_LimitedNo {
  @scala.inline
  def apply(
    scopeDescriptor: atomLib.atomMod.ScopeDescriptor,
    value: atomLib.atomLibStrings.limited | atomLib.atomLibStrings.no | atomLib.atomLibStrings.undecided
  ): Anon_LimitedNo = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LimitedNo]
  }
}

