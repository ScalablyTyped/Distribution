package typings.atom

import org.scalablytyped.runtime.StringDictionary
import typings.atom.atomMod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyScopeDescriptor extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: StringDictionary[js.Array[String]]
}

object Anon_KeyScopeDescriptor {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: StringDictionary[js.Array[String]]): Anon_KeyScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyScopeDescriptor]
  }
}

