package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectorHierarchyMod {
  
  @js.native
  trait Options extends StObject {
    
    var children: js.UndefOr[js.Function1[/* data */ js.Any, js.Array[_]]] = js.native
    
    var pureData: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* data */ js.Any => js.Array[_]): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setPureData(value: Boolean): Self = StObject.set(x, "pureData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPureDataUndefined: Self = StObject.set(x, "pureData", js.undefined)
    }
  }
}
