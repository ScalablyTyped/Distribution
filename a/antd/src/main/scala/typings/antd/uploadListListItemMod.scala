package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.uploadInterfaceMod.ItemRender
import typings.antd.uploadInterfaceMod.UploadFile
import typings.antd.uploadInterfaceMod.UploadListProgressProps
import typings.antd.uploadInterfaceMod.UploadListType
import typings.antd.uploadInterfaceMod.UploadLocale
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadListListItemMod extends Shortcut {
  
  @JSImport("antd/lib/upload/UploadList/ListItem", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ListItemProps & RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait ListItemProps extends StObject {
    
    def actionIconRender(customIcon: ReactNode, callback: js.Function0[Unit], prefixCls: String): ReactNode = js.native
    def actionIconRender(customIcon: ReactNode, callback: js.Function0[Unit], prefixCls: String, title: String): ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var downloadIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])] = js.native
    
    var file: UploadFile[Any] = js.native
    
    def iconRender(file: UploadFile[Any]): ReactNode = js.native
    
    var isImgUrl: js.UndefOr[js.Function1[/* file */ UploadFile[Any], Boolean]] = js.native
    
    var itemRender: js.UndefOr[ItemRender[Any]] = js.native
    
    var items: js.Array[UploadFile[Any]] = js.native
    
    var listType: js.UndefOr[UploadListType] = js.native
    
    var locale: UploadLocale = js.native
    
    def onClose(file: UploadFile[Any]): Unit = js.native
    
    def onDownload(file: UploadFile[Any]): Unit = js.native
    
    def onPreview(file: UploadFile[Any], e: SyntheticEvent[HTMLElement, Event]): Unit = js.native
    
    var prefixCls: String = js.native
    
    var previewIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])] = js.native
    
    var progress: js.UndefOr[UploadListProgressProps] = js.native
    
    var removeIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[Any], ReactNode])] = js.native
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.native
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.native
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  
  type _To = ForwardRefExoticComponent[ListItemProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `uploadListListItemMod.foo` */
  override def _to: ForwardRefExoticComponent[ListItemProps & RefAttributes[HTMLDivElement]] = default
}
