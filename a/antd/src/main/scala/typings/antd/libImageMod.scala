package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.rcImage.libImageMod.ImageProps
import typings.rcImage.libPreviewGroupMod.GroupConsumerProps
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImageMod extends Shortcut {
  
  @JSImport("antd/lib/image", JSImport.Default)
  @js.native
  val default: CompositionImage[ImageProps] = js.native
  
  @js.native
  trait CompositionImage[P]
    extends StObject
       with FunctionComponent[P] {
    
    var PreviewGroup: FC[GroupConsumerProps] = js.native
  }
  
  type _To = CompositionImage[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `libImageMod.foo` */
  override def _to: CompositionImage[ImageProps] = default
}
