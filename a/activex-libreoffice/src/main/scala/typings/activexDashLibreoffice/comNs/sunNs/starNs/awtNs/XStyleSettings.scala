package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
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
  var ActiveBorderColor: Color
  var ActiveColor: Color
  var ActiveTabColor: Color
  var ActiveTextColor: Color
  var ApplicationFont: FontDescriptor
  var ButtonRolloverTextColor: Color
  var ButtonTextColor: Color
  var CheckedColor: Color
  var DarkShadowColor: Color
  var DeactiveBorderColor: Color
  var DeactiveColor: Color
  var DeactiveTextColor: Color
  var DialogColor: Color
  var DialogTextColor: Color
  var DisableColor: Color
  var FaceColor: Color
  var FaceGradientColor: Color
  var FieldColor: Color
  var FieldFont: FontDescriptor
  var FieldRolloverTextColor: Color
  var FieldTextColor: Color
  var FloatTitleFont: FontDescriptor
  var GroupFont: FontDescriptor
  var GroupTextColor: Color
  var HelpColor: Color
  var HelpFont: FontDescriptor
  var HelpTextColor: Color
  /** controls whether the an UI component should use a high-contrast mode */
  var HighContrastMode: Boolean
  var HighlightColor: Color
  var HighlightTextColor: Color
  var InactiveTabColor: Color
  var LabelFont: FontDescriptor
  var LabelTextColor: Color
  var LightColor: Color
  var MenuBarColor: Color
  var MenuBarTextColor: Color
  var MenuBorderColor: Color
  var MenuColor: Color
  var MenuFont: FontDescriptor
  var MenuHighlightColor: Color
  var MenuHighlightTextColor: Color
  var MenuTextColor: Color
  var MonoColor: Color
  var PushButtonFont: FontDescriptor
  var RadioCheckFont: FontDescriptor
  var RadioCheckTextColor: Color
  var SeparatorColor: Color
  var ShadowColor: Color
  var TitleFont: FontDescriptor
  var ToolFont: FontDescriptor
  var WindowColor: Color
  var WindowTextColor: Color
  var WorkspaceColor: Color
  def addStyleChangeListener(Listener: XStyleChangeListener): Unit
  def removeStyleChangeListener(Listener: XStyleChangeListener): Unit
}

object XStyleSettings {
  @scala.inline
  def apply(
    ActiveBorderColor: Color,
    ActiveColor: Color,
    ActiveTabColor: Color,
    ActiveTextColor: Color,
    ApplicationFont: FontDescriptor,
    ButtonRolloverTextColor: Color,
    ButtonTextColor: Color,
    CheckedColor: Color,
    DarkShadowColor: Color,
    DeactiveBorderColor: Color,
    DeactiveColor: Color,
    DeactiveTextColor: Color,
    DialogColor: Color,
    DialogTextColor: Color,
    DisableColor: Color,
    FaceColor: Color,
    FaceGradientColor: Color,
    FieldColor: Color,
    FieldFont: FontDescriptor,
    FieldRolloverTextColor: Color,
    FieldTextColor: Color,
    FloatTitleFont: FontDescriptor,
    GroupFont: FontDescriptor,
    GroupTextColor: Color,
    HelpColor: Color,
    HelpFont: FontDescriptor,
    HelpTextColor: Color,
    HighContrastMode: Boolean,
    HighlightColor: Color,
    HighlightTextColor: Color,
    InactiveTabColor: Color,
    LabelFont: FontDescriptor,
    LabelTextColor: Color,
    LightColor: Color,
    MenuBarColor: Color,
    MenuBarTextColor: Color,
    MenuBorderColor: Color,
    MenuColor: Color,
    MenuFont: FontDescriptor,
    MenuHighlightColor: Color,
    MenuHighlightTextColor: Color,
    MenuTextColor: Color,
    MonoColor: Color,
    PushButtonFont: FontDescriptor,
    RadioCheckFont: FontDescriptor,
    RadioCheckTextColor: Color,
    SeparatorColor: Color,
    ShadowColor: Color,
    TitleFont: FontDescriptor,
    ToolFont: FontDescriptor,
    WindowColor: Color,
    WindowTextColor: Color,
    WorkspaceColor: Color,
    addStyleChangeListener: XStyleChangeListener => Unit,
    removeStyleChangeListener: XStyleChangeListener => Unit
  ): XStyleSettings = {
    val __obj = js.Dynamic.literal(ActiveBorderColor = ActiveBorderColor, ActiveColor = ActiveColor, ActiveTabColor = ActiveTabColor, ActiveTextColor = ActiveTextColor, ApplicationFont = ApplicationFont, ButtonRolloverTextColor = ButtonRolloverTextColor, ButtonTextColor = ButtonTextColor, CheckedColor = CheckedColor, DarkShadowColor = DarkShadowColor, DeactiveBorderColor = DeactiveBorderColor, DeactiveColor = DeactiveColor, DeactiveTextColor = DeactiveTextColor, DialogColor = DialogColor, DialogTextColor = DialogTextColor, DisableColor = DisableColor, FaceColor = FaceColor, FaceGradientColor = FaceGradientColor, FieldColor = FieldColor, FieldFont = FieldFont, FieldRolloverTextColor = FieldRolloverTextColor, FieldTextColor = FieldTextColor, FloatTitleFont = FloatTitleFont, GroupFont = GroupFont, GroupTextColor = GroupTextColor, HelpColor = HelpColor, HelpFont = HelpFont, HelpTextColor = HelpTextColor, HighContrastMode = HighContrastMode, HighlightColor = HighlightColor, HighlightTextColor = HighlightTextColor, InactiveTabColor = InactiveTabColor, LabelFont = LabelFont, LabelTextColor = LabelTextColor, LightColor = LightColor, MenuBarColor = MenuBarColor, MenuBarTextColor = MenuBarTextColor, MenuBorderColor = MenuBorderColor, MenuColor = MenuColor, MenuFont = MenuFont, MenuHighlightColor = MenuHighlightColor, MenuHighlightTextColor = MenuHighlightTextColor, MenuTextColor = MenuTextColor, MonoColor = MonoColor, PushButtonFont = PushButtonFont, RadioCheckFont = RadioCheckFont, RadioCheckTextColor = RadioCheckTextColor, SeparatorColor = SeparatorColor, ShadowColor = ShadowColor, TitleFont = TitleFont, ToolFont = ToolFont, WindowColor = WindowColor, WindowTextColor = WindowTextColor, WorkspaceColor = WorkspaceColor, addStyleChangeListener = js.Any.fromFunction1(addStyleChangeListener), removeStyleChangeListener = js.Any.fromFunction1(removeStyleChangeListener))
  
    __obj.asInstanceOf[XStyleSettings]
  }
}

