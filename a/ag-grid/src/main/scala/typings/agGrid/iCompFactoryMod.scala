package typings.agGrid

import typings.agGrid.componentMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iCompFactoryMod {
  
  trait ICompFactory extends StObject {
    
    def create(): Component
  }
  object ICompFactory {
    
    inline def apply(create: () => Component): ICompFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
      __obj.asInstanceOf[ICompFactory]
    }
    
    extension [Self <: ICompFactory](x: Self) {
      
      inline def setCreate(value: () => Component): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    }
  }
}
