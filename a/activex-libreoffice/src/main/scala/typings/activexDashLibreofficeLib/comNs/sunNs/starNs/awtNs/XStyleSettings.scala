package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to certain style settings within an OpenOffice.org component, such as a window, or within OpenOffice.org as a whole.
  *
  * Note that there are constraints for those settings. For instance, if controls are drawn with the native widget framework, i.e. in the desktop theme's
  * look, then they won't necessarily respect all their style settings, because those have a lesser priority than the native look.
  *
  * On the other hand, some settings are respected only when rendering the controls in the native desktop/theme look. For instance, without native
  * theming, buttons do not support a "roll over" mode, i.e., they're painted the same way, no matter if they mouse hovers over them or not. But with
  * native theming, this changes, as here the general button look is drawn by the system's theming engine, while the text is drawn by OpenOffice.org. In
  * this case, the button respects the `ButtonRolloverTextColor` when painting its text.
  */
trait XStyleSettings extends js.Object {
  var ActiveBorderColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var ActiveColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var ActiveTabColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var ActiveTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var ApplicationFont: FontDescriptor
  var ButtonRolloverTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var ButtonTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var CheckedColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var DarkShadowColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var DeactiveBorderColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var DeactiveColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var DeactiveTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var DialogColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var DialogTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var DisableColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var FaceColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var FaceGradientColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var FieldColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var FieldFont: FontDescriptor
  var FieldRolloverTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var FieldTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var FloatTitleFont: FontDescriptor
  var GroupFont: FontDescriptor
  var GroupTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var HelpColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var HelpFont: FontDescriptor
  var HelpTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** controls whether the an UI component should use a high-contrast mode */
  var HighContrastMode: scala.Boolean
  var HighlightColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var HighlightTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var InactiveTabColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var LabelFont: FontDescriptor
  var LabelTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var LightColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var MenuBarColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var MenuBarTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var MenuBorderColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var MenuColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var MenuFont: FontDescriptor
  var MenuHighlightColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var MenuHighlightTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var MenuTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var MonoColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var PushButtonFont: FontDescriptor
  var RadioCheckFont: FontDescriptor
  var RadioCheckTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var SeparatorColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var ShadowColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var TitleFont: FontDescriptor
  var ToolFont: FontDescriptor
  var WindowColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var WindowTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var WorkspaceColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  def addStyleChangeListener(Listener: XStyleChangeListener): scala.Unit
  def removeStyleChangeListener(Listener: XStyleChangeListener): scala.Unit
}

