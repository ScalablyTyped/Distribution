package typings.atom

import org.scalablytyped.runtime.StringDictionary
import typings.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScopeDescriptorValue extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: StringDictionary[js.Array[String]]
}

object AnonScopeDescriptorValue {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: StringDictionary[js.Array[String]]): AnonScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScopeDescriptorValue]
  }
}

