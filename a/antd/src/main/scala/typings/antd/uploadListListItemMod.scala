package typings.antd

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/upload/UploadList/ListItem", JSImport.Namespace)
@js.native
object uploadListListItemMod extends js.Object {
  
  val default: ForwardRefExoticComponent[ListItemProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait ListItemProps extends js.Object {
    
    def actionIconRender(customIcon: ReactNode, callback: js.Function0[Unit], prefixCls: String): ReactNode = js.native
    def actionIconRender(customIcon: ReactNode, callback: js.Function0[Unit], prefixCls: String, title: String): ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var downloadIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[_], ReactNode])] = js.native
    
    var file: UploadFile[_] = js.native
    
    def iconRender(file: UploadFile[_]): ReactNode = js.native
    
    var isImgUrl: js.UndefOr[js.Function1[/* file */ UploadFile[_], Boolean]] = js.native
    
    var itemRender: js.UndefOr[ItemRender[_]] = js.native
    
    var items: js.Array[UploadFile[_]] = js.native
    
    var listType: js.UndefOr[UploadListType] = js.native
    
    var locale: UploadLocale = js.native
    
    def onClose(file: UploadFile[_]): Unit = js.native
    
    def onDownload(file: UploadFile[_]): Unit = js.native
    
    def onPreview(file: UploadFile[_], e: SyntheticEvent[HTMLElement, Event]): Unit = js.native
    
    var prefixCls: String = js.native
    
    var progress: js.UndefOr[UploadListProgressProps] = js.native
    
    var removeIcon: js.UndefOr[ReactNode | (js.Function1[/* file */ UploadFile[_], ReactNode])] = js.native
    
    var showDownloadIcon: js.UndefOr[Boolean] = js.native
    
    var showPreviewIcon: js.UndefOr[Boolean] = js.native
    
    var showRemoveIcon: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
}
