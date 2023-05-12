package typings.atlaskitHeading

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitHeading.distTypesHeadingContextMod.HeadingContextProps
import typings.atlaskitHeading.distTypesTypesMod.HeadingProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * __Heading__
    *
    * A heading is a typography component used to display text in different sizes and formats.
    *
    * @example
    *
    * ```jsx
    * import Heading from '@atlaskit/heading';
    *
    * const H100 = () => (
    *   <Heading level="h100">h100</Heading>
    * );
    * ```
    */
  @JSImport("@atlaskit/heading", JSImport.Default)
  @js.native
  val default: FC[HeadingProps] = js.native
  
  /**
    * __Heading context__
    *
    * The HeadingContext
    *
    * @example
    * ```tsx
    * // Will correctly infer the heading level
    * <HeadingContext value={1}>
    *  <Heading>H1</Heading>
    *  <HeadingContext>
    *    <Heading>H2</Heading>
    *  </HeadingContext>
    * </HeadingContext>
    * ```
    */
  @JSImport("@atlaskit/heading", "HeadingContextProvider")
  @js.native
  val HeadingContextProvider: FC[HeadingContextProps] = js.native
  
  type _To = FC[HeadingProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[HeadingProps] = default
}
