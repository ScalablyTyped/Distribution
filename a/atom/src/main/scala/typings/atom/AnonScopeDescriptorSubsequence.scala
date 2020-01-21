package typings.atom

import typings.atom.atomStrings.Subsequence
import typings.atom.atomStrings.Symbol
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopeDescriptorSubsequence extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: Subsequence | Symbol
}

object AnonScopeDescriptorSubsequence {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: Subsequence | Symbol): AnonScopeDescriptorSubsequence = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScopeDescriptorSubsequence]
  }
}

