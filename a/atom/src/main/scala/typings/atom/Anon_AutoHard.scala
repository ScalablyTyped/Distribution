package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import typings.atom.atomStrings.auto
import typings.atom.atomStrings.hard
import typings.atom.atomStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHard extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: auto | soft | hard
}

object Anon_AutoHard {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: auto | soft | hard): Anon_AutoHard = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoHard]
  }
}

