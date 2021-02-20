package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.rcImage.imageMod.ImageProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod extends Shortcut {
  
  @JSImport("antd/lib/image", JSImport.Default)
  @js.native
  val default: FC[ImageProps] = js.native
  
  type _To = FC[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageMod.foo` */
  override def _to: FC[ImageProps] = default
}
