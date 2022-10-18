package typings.atom.anon

import typings.atom.atomStrings.separator
import typings.atom.srcContextMenuManagerMod.ContextMenuOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with ContextMenuOptions {
  
  var `type`: separator
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("separator")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
