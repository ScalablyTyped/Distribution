package typings.atlaskitDsExplorations

import typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.div
import typings.atlaskitDsExplorations.distTypesComponentsBoxDotpartialMod.BoxComponent
import typings.atlaskitDsExplorations.distTypesComponentsInlineDotpartialMod.InlineProps
import typings.atlaskitDsExplorations.distTypesComponentsInteractionSurfaceDotpartialMod.InteractionSurfaceProps
import typings.atlaskitDsExplorations.distTypesComponentsStackDotpartialMod.StackProps
import typings.atlaskitDsExplorations.distTypesComponentsTextDotpartialMod.TextProps
import typings.emotionReact.mod.jsx.JSX.Element
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/ds-explorations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atlaskit/ds-explorations", "UNSAFE_Box")
  @js.native
  val UNSAFEBox: BoxComponent[div] = js.native
  
  /**
    * __Inline__
    *
    * Inline is a primitive component based on flexbox that manages the horizontal layout of direct children.
    * Renders a `div` by default.
    *
    * @private
    * @deprecated DSP-8009: This primitive is scheduled for deletion.
    * Please use `Inline` from `@atlaskit/primitives` instead.
    *
    * @example
    * ```tsx
    * const App = () => (
    *   <Inline gap="space.100">
    *     <Button />
    *     <Button />
    *   </Inline>
    * )
    * ```
    */
  @JSImport("@atlaskit/ds-explorations", "UNSAFE_Inline")
  @js.native
  val UNSAFEInline: MemoExoticComponent[ForwardRefExoticComponent[InlineProps & RefAttributes[HTMLDivElement]]] = js.native
  
  /**
    *
    * @example
    * ```js
    * // a minimal icon button
    * <Box as="button">
    *   <InteractionSurface>
    *    <WarningIcon label="icon button" />
    *  </InteractionSurface>
    * </Box>
    * ```
    */
  inline def UNSAFEInteractionSurface(param0: InteractionSurfaceProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("UNSAFE_InteractionSurface")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * __Stack__
    *
    * Stack is a primitive component based on flexbox that manages the vertical layout of direct children.
    * Renders a `div` by default.
    *
    * @private
    * @deprecated DSP-8009: This primitive is scheduled for deletion.
    * Please use `Stack` from `@atlaskit/primitives` instead.
    *
    */
  @JSImport("@atlaskit/ds-explorations", "UNSAFE_Stack")
  @js.native
  val UNSAFEStack: MemoExoticComponent[ForwardRefExoticComponent[StackProps & RefAttributes[HTMLDivElement]]] = js.native
  
  /**
    * __Text__
    *
    * Text is a primitive component that has the Atlassian Design System's design guidelines baked in.
    * This includes considerations for text attributes such as color, font size, font weight, and line height.
    * It renders a `span` by default.
    *
    * @internal
    */
  @JSImport("@atlaskit/ds-explorations", "UNSAFE_Text")
  @js.native
  val UNSAFEText: FC[TextProps] = js.native
}
