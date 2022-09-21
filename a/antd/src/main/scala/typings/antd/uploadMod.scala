package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.draggerMod.DraggerProps
import typings.antd.uploadInterfaceMod.UploadProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadMod extends Shortcut {
  
  @JSImport("antd/lib/upload", JSImport.Default)
  @js.native
  val default: UploadInterface[Any] = js.native
  
  type InternalUploadType = ForwardRefExoticComponent[UploadProps[Any] & RefAttributes[Any]]
  
  @js.native
  trait UploadInterface[T]
    extends StObject
       with ForwardRefExoticComponent[UploadProps[Any] & RefAttributes[Any]] {
    
    var Dragger: FC[DraggerProps] = js.native
    
    var LIST_IGNORE: String = js.native
  }
  
  type _To = UploadInterface[Any]
  
  /* This means you don't have to write `default`, but can instead just say `uploadMod.foo` */
  override def _to: UploadInterface[Any] = default
}
