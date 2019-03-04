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

object XStyleSettings {
  @scala.inline
  def apply(
    ActiveBorderColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ActiveColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ActiveTabColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ActiveTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ApplicationFont: FontDescriptor,
    ButtonRolloverTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ButtonTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CheckedColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    DarkShadowColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    DeactiveBorderColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    DeactiveColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    DeactiveTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    DialogColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    DialogTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    DisableColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FaceColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FaceGradientColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FieldColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FieldFont: FontDescriptor,
    FieldRolloverTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FieldTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FloatTitleFont: FontDescriptor,
    GroupFont: FontDescriptor,
    GroupTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    HelpColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    HelpFont: FontDescriptor,
    HelpTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    HighContrastMode: scala.Boolean,
    HighlightColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    HighlightTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    InactiveTabColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    LabelFont: FontDescriptor,
    LabelTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    LightColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    MenuBarColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    MenuBarTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    MenuBorderColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    MenuColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    MenuFont: FontDescriptor,
    MenuHighlightColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    MenuHighlightTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    MenuTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    MonoColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    PushButtonFont: FontDescriptor,
    RadioCheckFont: FontDescriptor,
    RadioCheckTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    SeparatorColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ShadowColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TitleFont: FontDescriptor,
    ToolFont: FontDescriptor,
    WindowColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    WindowTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    WorkspaceColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    addStyleChangeListener: js.Function1[XStyleChangeListener, scala.Unit],
    removeStyleChangeListener: js.Function1[XStyleChangeListener, scala.Unit]
  ): XStyleSettings = {
    val __obj = js.Dynamic.literal(ActiveBorderColor = ActiveBorderColor, ActiveColor = ActiveColor, ActiveTabColor = ActiveTabColor, ActiveTextColor = ActiveTextColor, ApplicationFont = ApplicationFont, ButtonRolloverTextColor = ButtonRolloverTextColor, ButtonTextColor = ButtonTextColor, CheckedColor = CheckedColor, DarkShadowColor = DarkShadowColor, DeactiveBorderColor = DeactiveBorderColor, DeactiveColor = DeactiveColor, DeactiveTextColor = DeactiveTextColor, DialogColor = DialogColor, DialogTextColor = DialogTextColor, DisableColor = DisableColor, FaceColor = FaceColor, FaceGradientColor = FaceGradientColor, FieldColor = FieldColor, FieldFont = FieldFont, FieldRolloverTextColor = FieldRolloverTextColor, FieldTextColor = FieldTextColor, FloatTitleFont = FloatTitleFont, GroupFont = GroupFont, GroupTextColor = GroupTextColor, HelpColor = HelpColor, HelpFont = HelpFont, HelpTextColor = HelpTextColor, HighContrastMode = HighContrastMode, HighlightColor = HighlightColor, HighlightTextColor = HighlightTextColor, InactiveTabColor = InactiveTabColor, LabelFont = LabelFont, LabelTextColor = LabelTextColor, LightColor = LightColor, MenuBarColor = MenuBarColor, MenuBarTextColor = MenuBarTextColor, MenuBorderColor = MenuBorderColor, MenuColor = MenuColor, MenuFont = MenuFont, MenuHighlightColor = MenuHighlightColor, MenuHighlightTextColor = MenuHighlightTextColor, MenuTextColor = MenuTextColor, MonoColor = MonoColor, PushButtonFont = PushButtonFont, RadioCheckFont = RadioCheckFont, RadioCheckTextColor = RadioCheckTextColor, SeparatorColor = SeparatorColor, ShadowColor = ShadowColor, TitleFont = TitleFont, ToolFont = ToolFont, WindowColor = WindowColor, WindowTextColor = WindowTextColor, WorkspaceColor = WorkspaceColor, addStyleChangeListener = addStyleChangeListener, removeStyleChangeListener = removeStyleChangeListener)
  
    __obj.asInstanceOf[XStyleSettings]
  }
}

