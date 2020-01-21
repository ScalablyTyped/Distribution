package typings.atom

import typings.atom.atomStrings.auto
import typings.atom.atomStrings.hard
import typings.atom.atomStrings.soft
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoHard extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: auto | soft | hard
}

object AnonAutoHard {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: auto | soft | hard): AnonAutoHard = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutoHard]
  }
}

