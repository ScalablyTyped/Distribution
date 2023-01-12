package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitDistinctChangesOnlyRead extends StObject {
  
  var emitDistinctChangesOnly: js.UndefOr[Boolean] = js.undefined
  
  var read: js.UndefOr[Any] = js.undefined
}
object EmitDistinctChangesOnlyRead {
  
  inline def apply(): EmitDistinctChangesOnlyRead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitDistinctChangesOnlyRead]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmitDistinctChangesOnlyRead] (val x: Self) extends AnyVal {
    
    inline def setEmitDistinctChangesOnly(value: Boolean): Self = StObject.set(x, "emitDistinctChangesOnly", value.asInstanceOf[js.Any])
    
    inline def setEmitDistinctChangesOnlyUndefined: Self = StObject.set(x, "emitDistinctChangesOnly", js.undefined)
    
    inline def setRead(value: Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
  }
}
