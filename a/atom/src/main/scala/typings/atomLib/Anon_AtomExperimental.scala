package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AtomExperimental extends js.Object {
  var scopeDescriptor: atomLib.atomMod.ScopeDescriptor
  var value: atomLib.atomLibStrings.native | atomLib.atomLibStrings.experimental | atomLib.atomLibStrings.poll | atomLib.atomLibStrings.atom
}

object Anon_AtomExperimental {
  @scala.inline
  def apply(
    scopeDescriptor: atomLib.atomMod.ScopeDescriptor,
    value: atomLib.atomLibStrings.native | atomLib.atomLibStrings.experimental | atomLib.atomLibStrings.poll | atomLib.atomLibStrings.atom
  ): Anon_AtomExperimental = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AtomExperimental]
  }
}

