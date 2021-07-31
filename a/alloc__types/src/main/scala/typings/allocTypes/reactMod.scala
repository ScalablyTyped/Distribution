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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  type ComponentPropsWithRef[T /* <: ElementType[js.Any] */] = PropsWithRef[ComponentProps[T]] | (PropsWithoutRef[js.Any] & RefAttributes[InstanceType[T]])
  
  type ComponentType[P] = (ComponentClass[P, ComponentState]) | LeafFunctionComponent[P]
  
  type ElementType[P] = typings.react.mod.ElementType[P] | LeafFunctionComponent[P]
  
  // Function component without children
  @js.native
  trait LeafFunctionComponent[P] extends StObject {
    
    def apply(props: P): ReactElement | Null = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type RefProp[T] = MutableRefObject[js.UndefOr[T | Null]]
}
