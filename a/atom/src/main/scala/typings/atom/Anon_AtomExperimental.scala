package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.native
import typings.atom.atomStrings.poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AtomExperimental extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: native | experimental | poll | typings.atom.atomStrings.atom
}

object Anon_AtomExperimental {
  @scala.inline
  def apply(
    scopeDescriptor: ScopeDescriptor,
    value: native | experimental | poll | typings.atom.atomStrings.atom
  ): Anon_AtomExperimental = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AtomExperimental]
  }
}

