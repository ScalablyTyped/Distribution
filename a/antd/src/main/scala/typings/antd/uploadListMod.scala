package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.uploadInterfaceMod.UploadListProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadListMod extends Shortcut {
  
  @JSImport("antd/lib/upload/UploadList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[UploadListProps[Any] & RefAttributes[Any]] = js.native
  
  type _To = ForwardRefExoticComponent[UploadListProps[Any] & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `uploadListMod.foo` */
  override def _to: ForwardRefExoticComponent[UploadListProps[Any] & RefAttributes[Any]] = default
}
