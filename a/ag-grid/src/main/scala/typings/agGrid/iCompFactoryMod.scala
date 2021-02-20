package typings.agGrid

import typings.agGrid.componentMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iCompFactoryMod {
  
  @js.native
  trait ICompFactory extends StObject {
    
    def create(): Component = js.native
  }
  object ICompFactory {
    
    @scala.inline
    def apply(create: () => Component): ICompFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
      __obj.asInstanceOf[ICompFactory]
    }
    
    @scala.inline
    implicit class ICompFactoryMutableBuilder[Self <: ICompFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: () => Component): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    }
  }
}
