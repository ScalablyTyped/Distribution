package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libUploadInterfaceMod.UploadProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUploadUploadMod extends Shortcut {
  
  @JSImport("antd/lib/upload/Upload", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[UploadProps[Any] & RefAttributes[Any]] = js.native
  
  @JSImport("antd/lib/upload/Upload", "LIST_IGNORE")
  @js.native
  val LIST_IGNORE: String = js.native
  
  type _To = ForwardRefExoticComponent[UploadProps[Any] & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libUploadUploadMod.foo` */
  override def _to: ForwardRefExoticComponent[UploadProps[Any] & RefAttributes[Any]] = default
}
