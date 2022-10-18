package typings.atom.anon

import typings.atom.srcOtherTypesMod.FileEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueFileEncoding extends StObject {
  
  var scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: FileEncoding
}
object ValueFileEncoding {
  
  inline def apply(scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor, value: FileEncoding): ValueFileEncoding = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueFileEncoding]
  }
  
  extension [Self <: ValueFileEncoding](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FileEncoding): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
