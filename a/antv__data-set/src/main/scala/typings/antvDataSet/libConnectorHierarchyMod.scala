package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectorHierarchyMod {
  
  trait Options extends StObject {
    
    var children: js.UndefOr[js.Function1[/* data */ Any, js.Array[Any]]] = js.undefined
    
    var pureData: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: /* data */ Any => js.Array[Any]): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPureData(value: Boolean): Self = StObject.set(x, "pureData", value.asInstanceOf[js.Any])
      
      inline def setPureDataUndefined: Self = StObject.set(x, "pureData", js.undefined)
    }
  }
}
