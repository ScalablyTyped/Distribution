package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLAppBehavior extends StObject {
  
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
  implicit class HTMLAppBehaviorMutableBuilder[Self <: HTMLAppBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandLine(value: String): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerBorder(value: String): Self = StObject.set(x, "innerBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLAppBehavior_typekey(value: HTMLAppBehavior): Self = StObject.set(x, "MSHTML.HTMLAppBehavior_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizeButton(value: String): Self = StObject.set(x, "maximizeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimizeButton(value: String): Self = StObject.set(x, "minimizeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: String): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollFlat(value: String): Self = StObject.set(x, "scrollFlat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInTaskBar(value: String): Self = StObject.set(x, "showInTaskBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleInstance(value: String): Self = StObject.set(x, "singleInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysMenu(value: String): Self = StObject.set(x, "sysMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowState(value: String): Self = StObject.set(x, "windowState", value.asInstanceOf[js.Any])
  }
}
