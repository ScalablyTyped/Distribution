package typings.atom.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeDescriptorValue extends js.Object {
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  var value: StringDictionary[js.Array[String]]
}

object ScopeDescriptorValue {
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: StringDictionary[js.Array[String]]): ScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorValue]
  }
}

