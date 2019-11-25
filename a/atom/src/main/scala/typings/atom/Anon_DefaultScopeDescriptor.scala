package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import typings.atom.atomStrings.default
import typings.atom.atomStrings.srgb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultScopeDescriptor extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: default | srgb
}

object Anon_DefaultScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: default | srgb): Anon_DefaultScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DefaultScopeDescriptor]
  }
}

