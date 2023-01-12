package typings.atlaskitPopper

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactPopper.mod.ReferenceChildrenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-popper.react-popper.ManagerProps> */
  trait ReadonlyManagerProps extends StObject {
    
    val children: ReactNode
  }
  object ReadonlyManagerProps {
    
    inline def apply(): ReadonlyManagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyManagerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyManagerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-popper.react-popper.ReferenceProps> */
  trait ReadonlyReferenceProps extends StObject {
    
    val children: js.Function1[/* props */ ReferenceChildrenProps, ReactNode]
    
    val innerRef: js.UndefOr[Ref[Any]] = js.undefined
  }
  object ReadonlyReferenceProps {
    
    inline def apply(children: /* props */ ReferenceChildrenProps => ReactNode): ReadonlyReferenceProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ReadonlyReferenceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyReferenceProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: /* props */ ReferenceChildrenProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
}
