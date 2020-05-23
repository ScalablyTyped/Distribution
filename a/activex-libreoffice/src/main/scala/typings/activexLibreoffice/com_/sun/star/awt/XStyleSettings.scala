package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.util.Color
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
    val __obj = js.Dynamic.literal(ActiveBorderColor = ActiveBorderColor.asInstanceOf[js.Any], ActiveColor = ActiveColor.asInstanceOf[js.Any], ActiveTabColor = ActiveTabColor.asInstanceOf[js.Any], ActiveTextColor = ActiveTextColor.asInstanceOf[js.Any], ApplicationFont = ApplicationFont.asInstanceOf[js.Any], ButtonRolloverTextColor = ButtonRolloverTextColor.asInstanceOf[js.Any], ButtonTextColor = ButtonTextColor.asInstanceOf[js.Any], CheckedColor = CheckedColor.asInstanceOf[js.Any], DarkShadowColor = DarkShadowColor.asInstanceOf[js.Any], DeactiveBorderColor = DeactiveBorderColor.asInstanceOf[js.Any], DeactiveColor = DeactiveColor.asInstanceOf[js.Any], DeactiveTextColor = DeactiveTextColor.asInstanceOf[js.Any], DialogColor = DialogColor.asInstanceOf[js.Any], DialogTextColor = DialogTextColor.asInstanceOf[js.Any], DisableColor = DisableColor.asInstanceOf[js.Any], FaceColor = FaceColor.asInstanceOf[js.Any], FaceGradientColor = FaceGradientColor.asInstanceOf[js.Any], FieldColor = FieldColor.asInstanceOf[js.Any], FieldFont = FieldFont.asInstanceOf[js.Any], FieldRolloverTextColor = FieldRolloverTextColor.asInstanceOf[js.Any], FieldTextColor = FieldTextColor.asInstanceOf[js.Any], FloatTitleFont = FloatTitleFont.asInstanceOf[js.Any], GroupFont = GroupFont.asInstanceOf[js.Any], GroupTextColor = GroupTextColor.asInstanceOf[js.Any], HelpColor = HelpColor.asInstanceOf[js.Any], HelpFont = HelpFont.asInstanceOf[js.Any], HelpTextColor = HelpTextColor.asInstanceOf[js.Any], HighContrastMode = HighContrastMode.asInstanceOf[js.Any], HighlightColor = HighlightColor.asInstanceOf[js.Any], HighlightTextColor = HighlightTextColor.asInstanceOf[js.Any], InactiveTabColor = InactiveTabColor.asInstanceOf[js.Any], LabelFont = LabelFont.asInstanceOf[js.Any], LabelTextColor = LabelTextColor.asInstanceOf[js.Any], LightColor = LightColor.asInstanceOf[js.Any], MenuBarColor = MenuBarColor.asInstanceOf[js.Any], MenuBarTextColor = MenuBarTextColor.asInstanceOf[js.Any], MenuBorderColor = MenuBorderColor.asInstanceOf[js.Any], MenuColor = MenuColor.asInstanceOf[js.Any], MenuFont = MenuFont.asInstanceOf[js.Any], MenuHighlightColor = MenuHighlightColor.asInstanceOf[js.Any], MenuHighlightTextColor = MenuHighlightTextColor.asInstanceOf[js.Any], MenuTextColor = MenuTextColor.asInstanceOf[js.Any], MonoColor = MonoColor.asInstanceOf[js.Any], PushButtonFont = PushButtonFont.asInstanceOf[js.Any], RadioCheckFont = RadioCheckFont.asInstanceOf[js.Any], RadioCheckTextColor = RadioCheckTextColor.asInstanceOf[js.Any], SeparatorColor = SeparatorColor.asInstanceOf[js.Any], ShadowColor = ShadowColor.asInstanceOf[js.Any], TitleFont = TitleFont.asInstanceOf[js.Any], ToolFont = ToolFont.asInstanceOf[js.Any], WindowColor = WindowColor.asInstanceOf[js.Any], WindowTextColor = WindowTextColor.asInstanceOf[js.Any], WorkspaceColor = WorkspaceColor.asInstanceOf[js.Any], addStyleChangeListener = js.Any.fromFunction1(addStyleChangeListener), removeStyleChangeListener = js.Any.fromFunction1(removeStyleChangeListener))
    __obj.asInstanceOf[XStyleSettings]
  }
}

