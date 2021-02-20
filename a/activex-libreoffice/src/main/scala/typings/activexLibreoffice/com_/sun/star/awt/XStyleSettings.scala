package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XStyleSettings extends StObject {
  
  var ActiveBorderColor: Color = js.native
  
  var ActiveColor: Color = js.native
  
  var ActiveTabColor: Color = js.native
  
  var ActiveTextColor: Color = js.native
  
  var ApplicationFont: FontDescriptor = js.native
  
  var ButtonRolloverTextColor: Color = js.native
  
  var ButtonTextColor: Color = js.native
  
  var CheckedColor: Color = js.native
  
  var DarkShadowColor: Color = js.native
  
  var DeactiveBorderColor: Color = js.native
  
  var DeactiveColor: Color = js.native
  
  var DeactiveTextColor: Color = js.native
  
  var DialogColor: Color = js.native
  
  var DialogTextColor: Color = js.native
  
  var DisableColor: Color = js.native
  
  var FaceColor: Color = js.native
  
  var FaceGradientColor: Color = js.native
  
  var FieldColor: Color = js.native
  
  var FieldFont: FontDescriptor = js.native
  
  var FieldRolloverTextColor: Color = js.native
  
  var FieldTextColor: Color = js.native
  
  var FloatTitleFont: FontDescriptor = js.native
  
  var GroupFont: FontDescriptor = js.native
  
  var GroupTextColor: Color = js.native
  
  var HelpColor: Color = js.native
  
  var HelpFont: FontDescriptor = js.native
  
  var HelpTextColor: Color = js.native
  
  /** controls whether the an UI component should use a high-contrast mode */
  var HighContrastMode: Boolean = js.native
  
  var HighlightColor: Color = js.native
  
  var HighlightTextColor: Color = js.native
  
  var InactiveTabColor: Color = js.native
  
  var LabelFont: FontDescriptor = js.native
  
  var LabelTextColor: Color = js.native
  
  var LightColor: Color = js.native
  
  var MenuBarColor: Color = js.native
  
  var MenuBarTextColor: Color = js.native
  
  var MenuBorderColor: Color = js.native
  
  var MenuColor: Color = js.native
  
  var MenuFont: FontDescriptor = js.native
  
  var MenuHighlightColor: Color = js.native
  
  var MenuHighlightTextColor: Color = js.native
  
  var MenuTextColor: Color = js.native
  
  var MonoColor: Color = js.native
  
  var PushButtonFont: FontDescriptor = js.native
  
  var RadioCheckFont: FontDescriptor = js.native
  
  var RadioCheckTextColor: Color = js.native
  
  var SeparatorColor: Color = js.native
  
  var ShadowColor: Color = js.native
  
  var TitleFont: FontDescriptor = js.native
  
  var ToolFont: FontDescriptor = js.native
  
  var WindowColor: Color = js.native
  
  var WindowTextColor: Color = js.native
  
  var WorkspaceColor: Color = js.native
  
  def addStyleChangeListener(Listener: XStyleChangeListener): Unit = js.native
  
  def removeStyleChangeListener(Listener: XStyleChangeListener): Unit = js.native
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
  
  @scala.inline
  implicit class XStyleSettingsMutableBuilder[Self <: XStyleSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveBorderColor(value: Color): Self = StObject.set(x, "ActiveBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveColor(value: Color): Self = StObject.set(x, "ActiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTabColor(value: Color): Self = StObject.set(x, "ActiveTabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTextColor(value: Color): Self = StObject.set(x, "ActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddStyleChangeListener(value: XStyleChangeListener => Unit): Self = StObject.set(x, "addStyleChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplicationFont(value: FontDescriptor): Self = StObject.set(x, "ApplicationFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonRolloverTextColor(value: Color): Self = StObject.set(x, "ButtonRolloverTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextColor(value: Color): Self = StObject.set(x, "ButtonTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedColor(value: Color): Self = StObject.set(x, "CheckedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkShadowColor(value: Color): Self = StObject.set(x, "DarkShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactiveBorderColor(value: Color): Self = StObject.set(x, "DeactiveBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactiveColor(value: Color): Self = StObject.set(x, "DeactiveColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactiveTextColor(value: Color): Self = StObject.set(x, "DeactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogColor(value: Color): Self = StObject.set(x, "DialogColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogTextColor(value: Color): Self = StObject.set(x, "DialogTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableColor(value: Color): Self = StObject.set(x, "DisableColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceColor(value: Color): Self = StObject.set(x, "FaceColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceGradientColor(value: Color): Self = StObject.set(x, "FaceGradientColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldColor(value: Color): Self = StObject.set(x, "FieldColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldFont(value: FontDescriptor): Self = StObject.set(x, "FieldFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldRolloverTextColor(value: Color): Self = StObject.set(x, "FieldRolloverTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTextColor(value: Color): Self = StObject.set(x, "FieldTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatTitleFont(value: FontDescriptor): Self = StObject.set(x, "FloatTitleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupFont(value: FontDescriptor): Self = StObject.set(x, "GroupFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTextColor(value: Color): Self = StObject.set(x, "GroupTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpColor(value: Color): Self = StObject.set(x, "HelpColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpFont(value: FontDescriptor): Self = StObject.set(x, "HelpFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpTextColor(value: Color): Self = StObject.set(x, "HelpTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighContrastMode(value: Boolean): Self = StObject.set(x, "HighContrastMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightColor(value: Color): Self = StObject.set(x, "HighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightTextColor(value: Color): Self = StObject.set(x, "HighlightTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveTabColor(value: Color): Self = StObject.set(x, "InactiveTabColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFont(value: FontDescriptor): Self = StObject.set(x, "LabelFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTextColor(value: Color): Self = StObject.set(x, "LabelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightColor(value: Color): Self = StObject.set(x, "LightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuBarColor(value: Color): Self = StObject.set(x, "MenuBarColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuBarTextColor(value: Color): Self = StObject.set(x, "MenuBarTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuBorderColor(value: Color): Self = StObject.set(x, "MenuBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuColor(value: Color): Self = StObject.set(x, "MenuColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuFont(value: FontDescriptor): Self = StObject.set(x, "MenuFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuHighlightColor(value: Color): Self = StObject.set(x, "MenuHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuHighlightTextColor(value: Color): Self = StObject.set(x, "MenuHighlightTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuTextColor(value: Color): Self = StObject.set(x, "MenuTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonoColor(value: Color): Self = StObject.set(x, "MonoColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushButtonFont(value: FontDescriptor): Self = StObject.set(x, "PushButtonFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioCheckFont(value: FontDescriptor): Self = StObject.set(x, "RadioCheckFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioCheckTextColor(value: Color): Self = StObject.set(x, "RadioCheckTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStyleChangeListener(value: XStyleChangeListener => Unit): Self = StObject.set(x, "removeStyleChangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeparatorColor(value: Color): Self = StObject.set(x, "SeparatorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColor(value: Color): Self = StObject.set(x, "ShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFont(value: FontDescriptor): Self = StObject.set(x, "TitleFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolFont(value: FontDescriptor): Self = StObject.set(x, "ToolFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowColor(value: Color): Self = StObject.set(x, "WindowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTextColor(value: Color): Self = StObject.set(x, "WindowTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceColor(value: Color): Self = StObject.set(x, "WorkspaceColor", value.asInstanceOf[js.Any])
  }
}
