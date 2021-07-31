package typings.atom.anon

import typings.atom.atomStrings.`12px`
import typings.atom.atomStrings.`14px`
import typings.atom.atomStrings.`16px`
import typings.atom.atomStrings.`18px`
import typings.atom.atomStrings.`21px`
import typings.atom.atomStrings.`24px`
import typings.atom.atomStrings.`28px`
import typings.atom.atomStrings.`32px`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  
  var value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`
}
object `24` {
  
  @scala.inline
  def apply(
    scopeDescriptor: typings.atom.mod.ScopeDescriptor,
    value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`
  ): `24` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit class `24MutableBuilder`[Self <: `24`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
