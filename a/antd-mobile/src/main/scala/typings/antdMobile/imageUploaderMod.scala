package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.imageUploaderImageUploaderMod.ImageUploaderProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageUploaderMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/image-uploader", JSImport.Default)
  @js.native
  val default: FC[ImageUploaderProps] = js.native
  
  type _To = FC[ImageUploaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageUploaderMod.foo` */
  override def _to: FC[ImageUploaderProps] = default
}
