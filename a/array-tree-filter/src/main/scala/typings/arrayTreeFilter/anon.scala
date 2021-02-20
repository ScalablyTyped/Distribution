package typings.arrayTreeFilter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ChildrenKeyName extends StObject {
    
    var childrenKeyName: js.UndefOr[String] = js.native
  }
  object ChildrenKeyName {
    
    @scala.inline
    def apply(): ChildrenKeyName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildrenKeyName]
    }
    
    @scala.inline
    implicit class ChildrenKeyNameMutableBuilder[Self <: ChildrenKeyName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrenKeyName(value: String): Self = StObject.set(x, "childrenKeyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenKeyNameUndefined: Self = StObject.set(x, "childrenKeyName", js.undefined)
    }
  }
}
