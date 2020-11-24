package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLAppBehavior extends js.Object {
  
  @JSName("MSHTML.HTMLAppBehavior_typekey")
  var MSHTMLDotHTMLAppBehavior_typekey: HTMLAppBehavior = js.native
  
  var applicationName: String = js.native
  
  var border: String = js.native
  
  var borderStyle: String = js.native
  
  var caption: String = js.native
  
  val commandLine: String = js.native
  
  var contextMenu: String = js.native
  
  var icon: String = js.native
  
  var innerBorder: String = js.native
  
  var maximizeButton: String = js.native
  
  var minimizeButton: String = js.native
  
  var scroll: String = js.native
  
  var scrollFlat: String = js.native
  
  var selection: String = js.native
  
  var showInTaskBar: String = js.native
  
  var singleInstance: String = js.native
  
  var sysMenu: String = js.native
  
  var version: String = js.native
  
  var windowState: String = js.native
}
object HTMLAppBehavior {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLAppBehavior_typekey: HTMLAppBehavior,
    applicationName: String,
    border: String,
    borderStyle: String,
    caption: String,
    commandLine: String,
    contextMenu: String,
    icon: String,
    innerBorder: String,
    maximizeButton: String,
    minimizeButton: String,
    scroll: String,
    scrollFlat: String,
    selection: String,
    showInTaskBar: String,
    singleInstance: String,
    sysMenu: String,
    version: String,
    windowState: String
  ): HTMLAppBehavior = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], commandLine = commandLine.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], innerBorder = innerBorder.asInstanceOf[js.Any], maximizeButton = maximizeButton.asInstanceOf[js.Any], minimizeButton = minimizeButton.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollFlat = scrollFlat.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], showInTaskBar = showInTaskBar.asInstanceOf[js.Any], singleInstance = singleInstance.asInstanceOf[js.Any], sysMenu = sysMenu.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windowState = windowState.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLAppBehavior_typekey")(MSHTMLDotHTMLAppBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAppBehavior]
  }
  
  @scala.inline
  implicit class HTMLAppBehaviorOps[Self <: HTMLAppBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSHTMLDotHTMLAppBehavior_typekey(value: HTMLAppBehavior): Self = this.set("MSHTML.HTMLAppBehavior_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: String): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: String): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandLine(value: String): Self = this.set("commandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerBorder(value: String): Self = this.set("innerBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizeButton(value: String): Self = this.set("maximizeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizeButton(value: String): Self = this.set("minimizeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: String): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollFlat(value: String): Self = this.set("scrollFlat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: String): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInTaskBar(value: String): Self = this.set("showInTaskBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleInstance(value: String): Self = this.set("singleInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysMenu(value: String): Self = this.set("sysMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowState(value: String): Self = this.set("windowState", value.asInstanceOf[js.Any])
  }
}
