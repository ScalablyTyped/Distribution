package typings.atom

import typings.atom.atomMod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescriptor extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: js.Array[String]
}

object Anon_ScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: js.Array[String]): Anon_ScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor, value = value)
  
    __obj.asInstanceOf[Anon_ScopeDescriptor]
  }
}

