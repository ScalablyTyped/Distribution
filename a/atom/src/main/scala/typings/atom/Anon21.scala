package typings.atom

import typings.atom.atomStrings.none
import typings.atom.atomStrings.textOrSnippet
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon21 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: none | textOrSnippet
}

object Anon21 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: none | textOrSnippet): Anon21 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon21]
  }
}

