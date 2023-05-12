package typings.atlaskitHeading

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitHeading.distTypesTypesMod.HeadingProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeadingMod extends Shortcut {
  
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
  @JSImport("@atlaskit/heading/dist/types/heading", JSImport.Default)
  @js.native
  val default: FC[HeadingProps] = js.native
  
  type _To = FC[HeadingProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesHeadingMod.foo` */
  override def _to: FC[HeadingProps] = default
}
