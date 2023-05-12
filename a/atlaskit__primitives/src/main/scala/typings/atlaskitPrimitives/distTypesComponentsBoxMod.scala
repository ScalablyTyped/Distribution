package typings.atlaskitPrimitives

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.className
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.div
import typings.atlaskitPrimitives.distTypesComponentsInternalBaseBoxMod.BaseBoxProps
import typings.atlaskitPrimitives.distTypesComponentsTypesMod.PublicBoxPropsBase
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsBoxMod extends Shortcut {
  
  /**
    * __Box__
    *
    * A Box is a primitive component that has the design decisions of the Atlassian Design System baked in.
    * Renders a `div` by default.
    *
    * - [Examples](https://atlassian.design/components/primitives/box/examples)
    * - [Code](https://atlassian.design/components/primitives/box/code)
    * - [Usage](https://atlassian.design/components/primitives/box/usage)
    */
  @JSImport("@atlaskit/primitives/dist/types/components/box", JSImport.Default)
  @js.native
  val default: BoxComponent[div] = js.native
  
  type BoxComponent[T /* <: ElementType[Any] */] = (js.Function1[/* props */ BoxProps[div], ReactElement | Null]) & FC[BoxProps[T]]
  
  type BoxProps[T /* <: ElementType[Any] */] = (Omit[BaseBoxProps[T], className]) & PublicBoxPropsBase
  
  type _To = BoxComponent[div]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesComponentsBoxMod.foo` */
  override def _to: BoxComponent[div] = default
}
