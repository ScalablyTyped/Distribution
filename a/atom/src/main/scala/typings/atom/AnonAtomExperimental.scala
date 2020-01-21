package typings.atom

import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.native
import typings.atom.atomStrings.poll
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAtomExperimental extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: native | experimental | poll | typings.atom.atomStrings.atom
}

object AnonAtomExperimental {
  @scala.inline
  def apply(
    scopeDescriptor: ScopeDescriptor,
    value: native | experimental | poll | typings.atom.atomStrings.atom
  ): AnonAtomExperimental = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAtomExperimental]
  }
}

