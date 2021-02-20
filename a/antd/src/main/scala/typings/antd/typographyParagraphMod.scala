package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.baseMod.BlockProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyParagraphMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Paragraph", JSImport.Default)
  @js.native
  val default: FC[ParagraphProps] = js.native
  
  type ParagraphProps = BlockProps
  
  type _To = FC[ParagraphProps]
  
  /* This means you don't have to write `default`, but can instead just say `typographyParagraphMod.foo` */
  override def _to: FC[ParagraphProps] = default
}
