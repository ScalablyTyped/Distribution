package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLAppBehavior extends js.Object {
  @JSName("MSHTML.HTMLAppBehavior_typekey")
  var MSHTMLDotHTMLAppBehavior_typekey: HTMLAppBehavior
  var applicationName: String
  var border: String
  var borderStyle: String
  var caption: String
  val commandLine: String
  var contextMenu: String
  var icon: String
  var innerBorder: String
  var maximizeButton: String
  var minimizeButton: String
  var scroll: String
  var scrollFlat: String
  var selection: String
  var showInTaskBar: String
  var singleInstance: String
  var sysMenu: String
  var version: String
  var windowState: String
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
}

