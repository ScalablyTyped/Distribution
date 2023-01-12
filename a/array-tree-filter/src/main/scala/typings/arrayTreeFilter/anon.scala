package typings.arrayTreeFilter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ChildrenKeyName extends StObject {
    
    var childrenKeyName: js.UndefOr[String] = js.undefined
  }
  object ChildrenKeyName {
    
    inline def apply(): ChildrenKeyName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildrenKeyName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildrenKeyName] (val x: Self) extends AnyVal {
      
      inline def setChildrenKeyName(value: String): Self = StObject.set(x, "childrenKeyName", value.asInstanceOf[js.Any])
      
      inline def setChildrenKeyNameUndefined: Self = StObject.set(x, "childrenKeyName", js.undefined)
    }
  }
}
