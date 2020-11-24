package typings.allocTypes

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.MutableRefObject
import typings.react.mod.PropsWithRef
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@alloc/types/react", JSImport.Namespace)
@js.native
object reactMod extends js.Object {
  
  // Function component without children
  @js.native
  trait LeafFunctionComponent[P] extends js.Object {
    
    def apply(props: P): ReactElement | Null = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type ComponentPropsWithRef[T /* <: ElementType[_] */] = PropsWithRef[ComponentProps[T]] | (PropsWithoutRef[_] with RefAttributes[InstanceType[T]])
  
  type ComponentType[P] = (ComponentClass[P, ComponentState]) | LeafFunctionComponent[P]
  
  type ElementType[P] = typings.react.mod.ElementType[P] | LeafFunctionComponent[P]
  
  type RefProp[T] = MutableRefObject[js.UndefOr[T | Null]]
}
