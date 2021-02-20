package typings.antDesignReactNative

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignReactNative.anon.Actionsheetitemfontsize
import typings.antDesignReactNative.anon.ThemeStyles
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStyleMod {
  
  @JSImport("@ant-design/react-native/lib/style", "ThemeContext")
  @js.native
  val ThemeContext: Context[Actionsheetitemfontsize] = js.native
  
  @JSImport("@ant-design/react-native/lib/style", "ThemeProvider")
  @js.native
  def ThemeProvider(props: ThemeProviderProps): Element = js.native
  
  @JSImport("@ant-design/react-native/lib/style", "WithTheme")
  @js.native
  class WithTheme[T, S] protected ()
    extends Component[WithThemeProps[T, S], js.Object, js.Any] {
    def this(props: WithThemeProps[T, S]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: WithThemeProps[T, S], context: js.Any) = this()
    
    def getStyles(theme: Theme): T = js.native
  }
  /* static members */
  object WithTheme {
    
    @JSImport("@ant-design/react-native/lib/style", "WithTheme")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/style", "WithTheme.defaultProps")
    @js.native
    def defaultProps: ThemeStyles = js.native
    @scala.inline
    def defaultProps_=(x: ThemeStyles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/react-native/lib/style", "useTheme")
  @js.native
  def useTheme(): Actionsheetitemfontsize = js.native
  @JSImport("@ant-design/react-native/lib/style", "useTheme")
  @js.native
  def useTheme(props: UseThemeContextProps): Actionsheetitemfontsize = js.native
  
  /* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/style.Theme> */
  @js.native
  trait PartialTheme extends StObject {
    
    var action_sheet_zindex: js.UndefOr[Double] = js.native
    
    var actionsheet_item_font_size: js.UndefOr[Double] = js.native
    
    var actionsheet_item_height: js.UndefOr[Double] = js.native
    
    var border_color_base: js.UndefOr[String] = js.native
    
    var border_width_lg: js.UndefOr[Double] = js.native
    
    var border_width_md: js.UndefOr[Double] = js.native
    
    var border_width_sm: js.UndefOr[Double] = js.native
    
    var brand_error: js.UndefOr[String] = js.native
    
    var brand_important: js.UndefOr[String] = js.native
    
    var brand_primary: js.UndefOr[String] = js.native
    
    var brand_primary_tap: js.UndefOr[String] = js.native
    
    var brand_success: js.UndefOr[String] = js.native
    
    var brand_wait: js.UndefOr[String] = js.native
    
    var brand_warning: js.UndefOr[String] = js.native
    
    var button_font_size: js.UndefOr[Double] = js.native
    
    var button_font_size_sm: js.UndefOr[Double] = js.native
    
    var button_height: js.UndefOr[Double] = js.native
    
    var button_height_sm: js.UndefOr[Double] = js.native
    
    var color_icon_base: js.UndefOr[String] = js.native
    
    var color_link: js.UndefOr[String] = js.native
    
    var color_text_base: js.UndefOr[String] = js.native
    
    var color_text_base_inverse: js.UndefOr[String] = js.native
    
    var color_text_caption: js.UndefOr[String] = js.native
    
    var color_text_disabled: js.UndefOr[String] = js.native
    
    var color_text_paragraph: js.UndefOr[String] = js.native
    
    var color_text_placeholder: js.UndefOr[String] = js.native
    
    var color_text_secondary: js.UndefOr[String] = js.native
    
    var ease_in_out_quint: js.UndefOr[String] = js.native
    
    var fill_base: js.UndefOr[String] = js.native
    
    var fill_body: js.UndefOr[String] = js.native
    
    var fill_disabled: js.UndefOr[String] = js.native
    
    var fill_grey: js.UndefOr[String] = js.native
    
    var fill_mask: js.UndefOr[String] = js.native
    
    var fill_tap: js.UndefOr[String] = js.native
    
    var font_size_base: js.UndefOr[Double] = js.native
    
    var font_size_caption: js.UndefOr[Double] = js.native
    
    var font_size_caption_sm: js.UndefOr[Double] = js.native
    
    var font_size_heading: js.UndefOr[Double] = js.native
    
    var font_size_icontext: js.UndefOr[Double] = js.native
    
    var font_size_subhead: js.UndefOr[Double] = js.native
    
    var ghost_button_color: js.UndefOr[String] = js.native
    
    var ghost_button_fill_tap: js.UndefOr[String] = js.native
    
    var h_spacing_lg: js.UndefOr[Double] = js.native
    
    var h_spacing_md: js.UndefOr[Double] = js.native
    
    var h_spacing_sm: js.UndefOr[Double] = js.native
    
    var icon_size_lg: js.UndefOr[Double] = js.native
    
    var icon_size_md: js.UndefOr[Double] = js.native
    
    var icon_size_sm: js.UndefOr[Double] = js.native
    
    var icon_size_xs: js.UndefOr[Double] = js.native
    
    var icon_size_xxs: js.UndefOr[Double] = js.native
    
    var input_color_icon: js.UndefOr[String] = js.native
    
    var input_color_icon_tap: js.UndefOr[String] = js.native
    
    var input_font_size: js.UndefOr[Double] = js.native
    
    var input_label_width: js.UndefOr[Double] = js.native
    
    var line_height_base: js.UndefOr[Double] = js.native
    
    var line_height_paragraph: js.UndefOr[Double] = js.native
    
    var link_button_fill_tap: js.UndefOr[String] = js.native
    
    var link_button_font_size: js.UndefOr[Double] = js.native
    
    var list_item_height: js.UndefOr[Double] = js.native
    
    var list_item_height_sm: js.UndefOr[Double] = js.native
    
    var list_title_height: js.UndefOr[Double] = js.native
    
    var modal_button_font_size: js.UndefOr[Double] = js.native
    
    var modal_button_height: js.UndefOr[Double] = js.native
    
    var modal_font_size_heading: js.UndefOr[Double] = js.native
    
    var modal_zindex: js.UndefOr[Double] = js.native
    
    var notice_bar_fill: js.UndefOr[String] = js.native
    
    var notice_bar_height: js.UndefOr[Double] = js.native
    
    var opacity_disabled: js.UndefOr[String] = js.native
    
    var option_height: js.UndefOr[Double] = js.native
    
    var popup_zindex: js.UndefOr[Double] = js.native
    
    var primary_button_fill: js.UndefOr[String] = js.native
    
    var primary_button_fill_tap: js.UndefOr[String] = js.native
    
    var radius_lg: js.UndefOr[Double] = js.native
    
    var radius_md: js.UndefOr[Double] = js.native
    
    var radius_sm: js.UndefOr[Double] = js.native
    
    var radius_xs: js.UndefOr[Double] = js.native
    
    var search_bar_fill: js.UndefOr[String] = js.native
    
    var search_bar_font_size: js.UndefOr[Double] = js.native
    
    var search_bar_height: js.UndefOr[Double] = js.native
    
    var search_bar_input_height: js.UndefOr[Double] = js.native
    
    var search_color_icon: js.UndefOr[String] = js.native
    
    var segmented_control_color: js.UndefOr[String] = js.native
    
    var segmented_control_fill_tap: js.UndefOr[String] = js.native
    
    var segmented_control_height: js.UndefOr[Double] = js.native
    
    var switch_fill: js.UndefOr[String] = js.native
    
    var tab_bar_fill: js.UndefOr[String] = js.native
    
    var tab_bar_height: js.UndefOr[Double] = js.native
    
    var tabs_color: js.UndefOr[String] = js.native
    
    var tabs_font_size_heading: js.UndefOr[Double] = js.native
    
    var tabs_height: js.UndefOr[Double] = js.native
    
    var tag_height: js.UndefOr[Double] = js.native
    
    var tag_small_height: js.UndefOr[Double] = js.native
    
    var toast_fill: js.UndefOr[String] = js.native
    
    var toast_zindex: js.UndefOr[Double] = js.native
    
    var v_spacing_lg: js.UndefOr[Double] = js.native
    
    var v_spacing_md: js.UndefOr[Double] = js.native
    
    var v_spacing_sm: js.UndefOr[Double] = js.native
    
    var v_spacing_xl: js.UndefOr[Double] = js.native
    
    var v_spacing_xs: js.UndefOr[Double] = js.native
    
    var warning_button_fill: js.UndefOr[String] = js.native
    
    var warning_button_fill_tap: js.UndefOr[String] = js.native
  }
  object PartialTheme {
    
    @scala.inline
    def apply(): PartialTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTheme]
    }
    
    @scala.inline
    implicit class PartialThemeMutableBuilder[Self <: PartialTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction_sheet_zindex(value: Double): Self = StObject.set(x, "action_sheet_zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAction_sheet_zindexUndefined: Self = StObject.set(x, "action_sheet_zindex", js.undefined)
      
      @scala.inline
      def setActionsheet_item_font_size(value: Double): Self = StObject.set(x, "actionsheet_item_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsheet_item_font_sizeUndefined: Self = StObject.set(x, "actionsheet_item_font_size", js.undefined)
      
      @scala.inline
      def setActionsheet_item_height(value: Double): Self = StObject.set(x, "actionsheet_item_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsheet_item_heightUndefined: Self = StObject.set(x, "actionsheet_item_height", js.undefined)
      
      @scala.inline
      def setBorder_color_base(value: String): Self = StObject.set(x, "border_color_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorder_color_baseUndefined: Self = StObject.set(x, "border_color_base", js.undefined)
      
      @scala.inline
      def setBorder_width_lg(value: Double): Self = StObject.set(x, "border_width_lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorder_width_lgUndefined: Self = StObject.set(x, "border_width_lg", js.undefined)
      
      @scala.inline
      def setBorder_width_md(value: Double): Self = StObject.set(x, "border_width_md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorder_width_mdUndefined: Self = StObject.set(x, "border_width_md", js.undefined)
      
      @scala.inline
      def setBorder_width_sm(value: Double): Self = StObject.set(x, "border_width_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorder_width_smUndefined: Self = StObject.set(x, "border_width_sm", js.undefined)
      
      @scala.inline
      def setBrand_error(value: String): Self = StObject.set(x, "brand_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_errorUndefined: Self = StObject.set(x, "brand_error", js.undefined)
      
      @scala.inline
      def setBrand_important(value: String): Self = StObject.set(x, "brand_important", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_importantUndefined: Self = StObject.set(x, "brand_important", js.undefined)
      
      @scala.inline
      def setBrand_primary(value: String): Self = StObject.set(x, "brand_primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_primaryUndefined: Self = StObject.set(x, "brand_primary", js.undefined)
      
      @scala.inline
      def setBrand_primary_tap(value: String): Self = StObject.set(x, "brand_primary_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_primary_tapUndefined: Self = StObject.set(x, "brand_primary_tap", js.undefined)
      
      @scala.inline
      def setBrand_success(value: String): Self = StObject.set(x, "brand_success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_successUndefined: Self = StObject.set(x, "brand_success", js.undefined)
      
      @scala.inline
      def setBrand_wait(value: String): Self = StObject.set(x, "brand_wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_waitUndefined: Self = StObject.set(x, "brand_wait", js.undefined)
      
      @scala.inline
      def setBrand_warning(value: String): Self = StObject.set(x, "brand_warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_warningUndefined: Self = StObject.set(x, "brand_warning", js.undefined)
      
      @scala.inline
      def setButton_font_size(value: Double): Self = StObject.set(x, "button_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton_font_sizeUndefined: Self = StObject.set(x, "button_font_size", js.undefined)
      
      @scala.inline
      def setButton_font_size_sm(value: Double): Self = StObject.set(x, "button_font_size_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton_font_size_smUndefined: Self = StObject.set(x, "button_font_size_sm", js.undefined)
      
      @scala.inline
      def setButton_height(value: Double): Self = StObject.set(x, "button_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton_heightUndefined: Self = StObject.set(x, "button_height", js.undefined)
      
      @scala.inline
      def setButton_height_sm(value: Double): Self = StObject.set(x, "button_height_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton_height_smUndefined: Self = StObject.set(x, "button_height_sm", js.undefined)
      
      @scala.inline
      def setColor_icon_base(value: String): Self = StObject.set(x, "color_icon_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_icon_baseUndefined: Self = StObject.set(x, "color_icon_base", js.undefined)
      
      @scala.inline
      def setColor_link(value: String): Self = StObject.set(x, "color_link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_linkUndefined: Self = StObject.set(x, "color_link", js.undefined)
      
      @scala.inline
      def setColor_text_base(value: String): Self = StObject.set(x, "color_text_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_baseUndefined: Self = StObject.set(x, "color_text_base", js.undefined)
      
      @scala.inline
      def setColor_text_base_inverse(value: String): Self = StObject.set(x, "color_text_base_inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_base_inverseUndefined: Self = StObject.set(x, "color_text_base_inverse", js.undefined)
      
      @scala.inline
      def setColor_text_caption(value: String): Self = StObject.set(x, "color_text_caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_captionUndefined: Self = StObject.set(x, "color_text_caption", js.undefined)
      
      @scala.inline
      def setColor_text_disabled(value: String): Self = StObject.set(x, "color_text_disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_disabledUndefined: Self = StObject.set(x, "color_text_disabled", js.undefined)
      
      @scala.inline
      def setColor_text_paragraph(value: String): Self = StObject.set(x, "color_text_paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_paragraphUndefined: Self = StObject.set(x, "color_text_paragraph", js.undefined)
      
      @scala.inline
      def setColor_text_placeholder(value: String): Self = StObject.set(x, "color_text_placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_placeholderUndefined: Self = StObject.set(x, "color_text_placeholder", js.undefined)
      
      @scala.inline
      def setColor_text_secondary(value: String): Self = StObject.set(x, "color_text_secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_secondaryUndefined: Self = StObject.set(x, "color_text_secondary", js.undefined)
      
      @scala.inline
      def setEase_in_out_quint(value: String): Self = StObject.set(x, "ease_in_out_quint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEase_in_out_quintUndefined: Self = StObject.set(x, "ease_in_out_quint", js.undefined)
      
      @scala.inline
      def setFill_base(value: String): Self = StObject.set(x, "fill_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_baseUndefined: Self = StObject.set(x, "fill_base", js.undefined)
      
      @scala.inline
      def setFill_body(value: String): Self = StObject.set(x, "fill_body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_bodyUndefined: Self = StObject.set(x, "fill_body", js.undefined)
      
      @scala.inline
      def setFill_disabled(value: String): Self = StObject.set(x, "fill_disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_disabledUndefined: Self = StObject.set(x, "fill_disabled", js.undefined)
      
      @scala.inline
      def setFill_grey(value: String): Self = StObject.set(x, "fill_grey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_greyUndefined: Self = StObject.set(x, "fill_grey", js.undefined)
      
      @scala.inline
      def setFill_mask(value: String): Self = StObject.set(x, "fill_mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_maskUndefined: Self = StObject.set(x, "fill_mask", js.undefined)
      
      @scala.inline
      def setFill_tap(value: String): Self = StObject.set(x, "fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_tapUndefined: Self = StObject.set(x, "fill_tap", js.undefined)
      
      @scala.inline
      def setFont_size_base(value: Double): Self = StObject.set(x, "font_size_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_baseUndefined: Self = StObject.set(x, "font_size_base", js.undefined)
      
      @scala.inline
      def setFont_size_caption(value: Double): Self = StObject.set(x, "font_size_caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_captionUndefined: Self = StObject.set(x, "font_size_caption", js.undefined)
      
      @scala.inline
      def setFont_size_caption_sm(value: Double): Self = StObject.set(x, "font_size_caption_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_caption_smUndefined: Self = StObject.set(x, "font_size_caption_sm", js.undefined)
      
      @scala.inline
      def setFont_size_heading(value: Double): Self = StObject.set(x, "font_size_heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_headingUndefined: Self = StObject.set(x, "font_size_heading", js.undefined)
      
      @scala.inline
      def setFont_size_icontext(value: Double): Self = StObject.set(x, "font_size_icontext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_icontextUndefined: Self = StObject.set(x, "font_size_icontext", js.undefined)
      
      @scala.inline
      def setFont_size_subhead(value: Double): Self = StObject.set(x, "font_size_subhead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_subheadUndefined: Self = StObject.set(x, "font_size_subhead", js.undefined)
      
      @scala.inline
      def setGhost_button_color(value: String): Self = StObject.set(x, "ghost_button_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhost_button_colorUndefined: Self = StObject.set(x, "ghost_button_color", js.undefined)
      
      @scala.inline
      def setGhost_button_fill_tap(value: String): Self = StObject.set(x, "ghost_button_fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhost_button_fill_tapUndefined: Self = StObject.set(x, "ghost_button_fill_tap", js.undefined)
      
      @scala.inline
      def setH_spacing_lg(value: Double): Self = StObject.set(x, "h_spacing_lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH_spacing_lgUndefined: Self = StObject.set(x, "h_spacing_lg", js.undefined)
      
      @scala.inline
      def setH_spacing_md(value: Double): Self = StObject.set(x, "h_spacing_md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH_spacing_mdUndefined: Self = StObject.set(x, "h_spacing_md", js.undefined)
      
      @scala.inline
      def setH_spacing_sm(value: Double): Self = StObject.set(x, "h_spacing_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH_spacing_smUndefined: Self = StObject.set(x, "h_spacing_sm", js.undefined)
      
      @scala.inline
      def setIcon_size_lg(value: Double): Self = StObject.set(x, "icon_size_lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_size_lgUndefined: Self = StObject.set(x, "icon_size_lg", js.undefined)
      
      @scala.inline
      def setIcon_size_md(value: Double): Self = StObject.set(x, "icon_size_md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_size_mdUndefined: Self = StObject.set(x, "icon_size_md", js.undefined)
      
      @scala.inline
      def setIcon_size_sm(value: Double): Self = StObject.set(x, "icon_size_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_size_smUndefined: Self = StObject.set(x, "icon_size_sm", js.undefined)
      
      @scala.inline
      def setIcon_size_xs(value: Double): Self = StObject.set(x, "icon_size_xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_size_xsUndefined: Self = StObject.set(x, "icon_size_xs", js.undefined)
      
      @scala.inline
      def setIcon_size_xxs(value: Double): Self = StObject.set(x, "icon_size_xxs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_size_xxsUndefined: Self = StObject.set(x, "icon_size_xxs", js.undefined)
      
      @scala.inline
      def setInput_color_icon(value: String): Self = StObject.set(x, "input_color_icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_color_iconUndefined: Self = StObject.set(x, "input_color_icon", js.undefined)
      
      @scala.inline
      def setInput_color_icon_tap(value: String): Self = StObject.set(x, "input_color_icon_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_color_icon_tapUndefined: Self = StObject.set(x, "input_color_icon_tap", js.undefined)
      
      @scala.inline
      def setInput_font_size(value: Double): Self = StObject.set(x, "input_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_font_sizeUndefined: Self = StObject.set(x, "input_font_size", js.undefined)
      
      @scala.inline
      def setInput_label_width(value: Double): Self = StObject.set(x, "input_label_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_label_widthUndefined: Self = StObject.set(x, "input_label_width", js.undefined)
      
      @scala.inline
      def setLine_height_base(value: Double): Self = StObject.set(x, "line_height_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine_height_baseUndefined: Self = StObject.set(x, "line_height_base", js.undefined)
      
      @scala.inline
      def setLine_height_paragraph(value: Double): Self = StObject.set(x, "line_height_paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine_height_paragraphUndefined: Self = StObject.set(x, "line_height_paragraph", js.undefined)
      
      @scala.inline
      def setLink_button_fill_tap(value: String): Self = StObject.set(x, "link_button_fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_button_fill_tapUndefined: Self = StObject.set(x, "link_button_fill_tap", js.undefined)
      
      @scala.inline
      def setLink_button_font_size(value: Double): Self = StObject.set(x, "link_button_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_button_font_sizeUndefined: Self = StObject.set(x, "link_button_font_size", js.undefined)
      
      @scala.inline
      def setList_item_height(value: Double): Self = StObject.set(x, "list_item_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList_item_heightUndefined: Self = StObject.set(x, "list_item_height", js.undefined)
      
      @scala.inline
      def setList_item_height_sm(value: Double): Self = StObject.set(x, "list_item_height_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList_item_height_smUndefined: Self = StObject.set(x, "list_item_height_sm", js.undefined)
      
      @scala.inline
      def setList_title_height(value: Double): Self = StObject.set(x, "list_title_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList_title_heightUndefined: Self = StObject.set(x, "list_title_height", js.undefined)
      
      @scala.inline
      def setModal_button_font_size(value: Double): Self = StObject.set(x, "modal_button_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal_button_font_sizeUndefined: Self = StObject.set(x, "modal_button_font_size", js.undefined)
      
      @scala.inline
      def setModal_button_height(value: Double): Self = StObject.set(x, "modal_button_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal_button_heightUndefined: Self = StObject.set(x, "modal_button_height", js.undefined)
      
      @scala.inline
      def setModal_font_size_heading(value: Double): Self = StObject.set(x, "modal_font_size_heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal_font_size_headingUndefined: Self = StObject.set(x, "modal_font_size_heading", js.undefined)
      
      @scala.inline
      def setModal_zindex(value: Double): Self = StObject.set(x, "modal_zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal_zindexUndefined: Self = StObject.set(x, "modal_zindex", js.undefined)
      
      @scala.inline
      def setNotice_bar_fill(value: String): Self = StObject.set(x, "notice_bar_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotice_bar_fillUndefined: Self = StObject.set(x, "notice_bar_fill", js.undefined)
      
      @scala.inline
      def setNotice_bar_height(value: Double): Self = StObject.set(x, "notice_bar_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotice_bar_heightUndefined: Self = StObject.set(x, "notice_bar_height", js.undefined)
      
      @scala.inline
      def setOpacity_disabled(value: String): Self = StObject.set(x, "opacity_disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity_disabledUndefined: Self = StObject.set(x, "opacity_disabled", js.undefined)
      
      @scala.inline
      def setOption_height(value: Double): Self = StObject.set(x, "option_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOption_heightUndefined: Self = StObject.set(x, "option_height", js.undefined)
      
      @scala.inline
      def setPopup_zindex(value: Double): Self = StObject.set(x, "popup_zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopup_zindexUndefined: Self = StObject.set(x, "popup_zindex", js.undefined)
      
      @scala.inline
      def setPrimary_button_fill(value: String): Self = StObject.set(x, "primary_button_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary_button_fillUndefined: Self = StObject.set(x, "primary_button_fill", js.undefined)
      
      @scala.inline
      def setPrimary_button_fill_tap(value: String): Self = StObject.set(x, "primary_button_fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary_button_fill_tapUndefined: Self = StObject.set(x, "primary_button_fill_tap", js.undefined)
      
      @scala.inline
      def setRadius_lg(value: Double): Self = StObject.set(x, "radius_lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius_lgUndefined: Self = StObject.set(x, "radius_lg", js.undefined)
      
      @scala.inline
      def setRadius_md(value: Double): Self = StObject.set(x, "radius_md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius_mdUndefined: Self = StObject.set(x, "radius_md", js.undefined)
      
      @scala.inline
      def setRadius_sm(value: Double): Self = StObject.set(x, "radius_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius_smUndefined: Self = StObject.set(x, "radius_sm", js.undefined)
      
      @scala.inline
      def setRadius_xs(value: Double): Self = StObject.set(x, "radius_xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius_xsUndefined: Self = StObject.set(x, "radius_xs", js.undefined)
      
      @scala.inline
      def setSearch_bar_fill(value: String): Self = StObject.set(x, "search_bar_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_bar_fillUndefined: Self = StObject.set(x, "search_bar_fill", js.undefined)
      
      @scala.inline
      def setSearch_bar_font_size(value: Double): Self = StObject.set(x, "search_bar_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_bar_font_sizeUndefined: Self = StObject.set(x, "search_bar_font_size", js.undefined)
      
      @scala.inline
      def setSearch_bar_height(value: Double): Self = StObject.set(x, "search_bar_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_bar_heightUndefined: Self = StObject.set(x, "search_bar_height", js.undefined)
      
      @scala.inline
      def setSearch_bar_input_height(value: Double): Self = StObject.set(x, "search_bar_input_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_bar_input_heightUndefined: Self = StObject.set(x, "search_bar_input_height", js.undefined)
      
      @scala.inline
      def setSearch_color_icon(value: String): Self = StObject.set(x, "search_color_icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_color_iconUndefined: Self = StObject.set(x, "search_color_icon", js.undefined)
      
      @scala.inline
      def setSegmented_control_color(value: String): Self = StObject.set(x, "segmented_control_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmented_control_colorUndefined: Self = StObject.set(x, "segmented_control_color", js.undefined)
      
      @scala.inline
      def setSegmented_control_fill_tap(value: String): Self = StObject.set(x, "segmented_control_fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmented_control_fill_tapUndefined: Self = StObject.set(x, "segmented_control_fill_tap", js.undefined)
      
      @scala.inline
      def setSegmented_control_height(value: Double): Self = StObject.set(x, "segmented_control_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmented_control_heightUndefined: Self = StObject.set(x, "segmented_control_height", js.undefined)
      
      @scala.inline
      def setSwitch_fill(value: String): Self = StObject.set(x, "switch_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitch_fillUndefined: Self = StObject.set(x, "switch_fill", js.undefined)
      
      @scala.inline
      def setTab_bar_fill(value: String): Self = StObject.set(x, "tab_bar_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab_bar_fillUndefined: Self = StObject.set(x, "tab_bar_fill", js.undefined)
      
      @scala.inline
      def setTab_bar_height(value: Double): Self = StObject.set(x, "tab_bar_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab_bar_heightUndefined: Self = StObject.set(x, "tab_bar_height", js.undefined)
      
      @scala.inline
      def setTabs_color(value: String): Self = StObject.set(x, "tabs_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs_colorUndefined: Self = StObject.set(x, "tabs_color", js.undefined)
      
      @scala.inline
      def setTabs_font_size_heading(value: Double): Self = StObject.set(x, "tabs_font_size_heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs_font_size_headingUndefined: Self = StObject.set(x, "tabs_font_size_heading", js.undefined)
      
      @scala.inline
      def setTabs_height(value: Double): Self = StObject.set(x, "tabs_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs_heightUndefined: Self = StObject.set(x, "tabs_height", js.undefined)
      
      @scala.inline
      def setTag_height(value: Double): Self = StObject.set(x, "tag_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag_heightUndefined: Self = StObject.set(x, "tag_height", js.undefined)
      
      @scala.inline
      def setTag_small_height(value: Double): Self = StObject.set(x, "tag_small_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag_small_heightUndefined: Self = StObject.set(x, "tag_small_height", js.undefined)
      
      @scala.inline
      def setToast_fill(value: String): Self = StObject.set(x, "toast_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToast_fillUndefined: Self = StObject.set(x, "toast_fill", js.undefined)
      
      @scala.inline
      def setToast_zindex(value: Double): Self = StObject.set(x, "toast_zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToast_zindexUndefined: Self = StObject.set(x, "toast_zindex", js.undefined)
      
      @scala.inline
      def setV_spacing_lg(value: Double): Self = StObject.set(x, "v_spacing_lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV_spacing_lgUndefined: Self = StObject.set(x, "v_spacing_lg", js.undefined)
      
      @scala.inline
      def setV_spacing_md(value: Double): Self = StObject.set(x, "v_spacing_md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV_spacing_mdUndefined: Self = StObject.set(x, "v_spacing_md", js.undefined)
      
      @scala.inline
      def setV_spacing_sm(value: Double): Self = StObject.set(x, "v_spacing_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV_spacing_smUndefined: Self = StObject.set(x, "v_spacing_sm", js.undefined)
      
      @scala.inline
      def setV_spacing_xl(value: Double): Self = StObject.set(x, "v_spacing_xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV_spacing_xlUndefined: Self = StObject.set(x, "v_spacing_xl", js.undefined)
      
      @scala.inline
      def setV_spacing_xs(value: Double): Self = StObject.set(x, "v_spacing_xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV_spacing_xsUndefined: Self = StObject.set(x, "v_spacing_xs", js.undefined)
      
      @scala.inline
      def setWarning_button_fill(value: String): Self = StObject.set(x, "warning_button_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning_button_fillUndefined: Self = StObject.set(x, "warning_button_fill", js.undefined)
      
      @scala.inline
      def setWarning_button_fill_tap(value: String): Self = StObject.set(x, "warning_button_fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning_button_fill_tapUndefined: Self = StObject.set(x, "warning_button_fill_tap", js.undefined)
    }
  }
  
  /* Inlined {  color_text_base :string,   color_text_base_inverse :string,   color_text_secondary :string,   color_text_placeholder :string,   color_text_disabled :string,   color_text_caption :string,   color_text_paragraph :string,   color_link :string,   fill_base :string,   fill_body :string,   fill_tap :string,   fill_disabled :string,   fill_mask :string,   color_icon_base :string,   fill_grey :string,   opacity_disabled :string,   brand_primary :string,   brand_primary_tap :string,   brand_success :string,   brand_warning :string,   brand_error :string,   brand_important :string,   brand_wait :string,   border_color_base :string,   font_size_icontext :number,   font_size_caption_sm :number,   font_size_base :number,   font_size_subhead :number,   font_size_caption :number,   font_size_heading :number,   radius_xs :number,   radius_sm :number,   radius_md :number,   radius_lg :number,   border_width_sm :number,   border_width_md :number,   border_width_lg :number,   h_spacing_sm :number,   h_spacing_md :number,   h_spacing_lg :number,   v_spacing_xs :number,   v_spacing_sm :number,   v_spacing_md :number,   v_spacing_lg :number,   v_spacing_xl :number,   line_height_base :number,   line_height_paragraph :number,   icon_size_xxs :number,   icon_size_xs :number,   icon_size_sm :number,   icon_size_md :number,   icon_size_lg :number,   ease_in_out_quint :string,   actionsheet_item_height :number,   actionsheet_item_font_size :number,   button_height :number,   button_font_size :number,   button_height_sm :number,   button_font_size_sm :number,   primary_button_fill :string,   primary_button_fill_tap :string,   ghost_button_color :string,   ghost_button_fill_tap :string,   warning_button_fill :string,   warning_button_fill_tap :string,   link_button_fill_tap :string,   link_button_font_size :number,   modal_font_size_heading :number,   modal_button_font_size :number,   modal_button_height :number,   list_title_height :number,   list_item_height_sm :number,   list_item_height :number,   input_label_width :number,   input_font_size :number,   input_color_icon :string,   input_color_icon_tap :string,   tabs_color :string,   tabs_height :number,   tabs_font_size_heading :number,   segmented_control_color :string,   segmented_control_height :number,   segmented_control_fill_tap :string,   tab_bar_fill :string,   tab_bar_height :number,   toast_fill :string,   search_bar_fill :string,   search_bar_height :number,   search_bar_input_height :number,   search_bar_font_size :number,   search_color_icon :string,   notice_bar_fill :string,   notice_bar_height :number,   switch_fill :string,   tag_height :number,   tag_small_height :number,   option_height :number,   toast_zindex :number,   action_sheet_zindex :number,   popup_zindex :number,   modal_zindex :number} & {[key: string] : any} */
  @js.native
  trait Theme
    extends /* key */ StringDictionary[js.Any] {
    
    var action_sheet_zindex: Double = js.native
    
    var actionsheet_item_font_size: Double = js.native
    
    var actionsheet_item_height: Double = js.native
    
    var border_color_base: String = js.native
    
    var border_width_lg: Double = js.native
    
    var border_width_md: Double = js.native
    
    var border_width_sm: Double = js.native
    
    var brand_error: String = js.native
    
    var brand_important: String = js.native
    
    var brand_primary: String = js.native
    
    var brand_primary_tap: String = js.native
    
    var brand_success: String = js.native
    
    var brand_wait: String = js.native
    
    var brand_warning: String = js.native
    
    var button_font_size: Double = js.native
    
    var button_font_size_sm: Double = js.native
    
    var button_height: Double = js.native
    
    var button_height_sm: Double = js.native
    
    var color_icon_base: String = js.native
    
    var color_link: String = js.native
    
    var color_text_base: String = js.native
    
    var color_text_base_inverse: String = js.native
    
    var color_text_caption: String = js.native
    
    var color_text_disabled: String = js.native
    
    var color_text_paragraph: String = js.native
    
    var color_text_placeholder: String = js.native
    
    var color_text_secondary: String = js.native
    
    var ease_in_out_quint: String = js.native
    
    var fill_base: String = js.native
    
    var fill_body: String = js.native
    
    var fill_disabled: String = js.native
    
    var fill_grey: String = js.native
    
    var fill_mask: String = js.native
    
    var fill_tap: String = js.native
    
    var font_size_base: Double = js.native
    
    var font_size_caption: Double = js.native
    
    var font_size_caption_sm: Double = js.native
    
    var font_size_heading: Double = js.native
    
    var font_size_icontext: Double = js.native
    
    var font_size_subhead: Double = js.native
    
    var ghost_button_color: String = js.native
    
    var ghost_button_fill_tap: String = js.native
    
    var h_spacing_lg: Double = js.native
    
    var h_spacing_md: Double = js.native
    
    var h_spacing_sm: Double = js.native
    
    var icon_size_lg: Double = js.native
    
    var icon_size_md: Double = js.native
    
    var icon_size_sm: Double = js.native
    
    var icon_size_xs: Double = js.native
    
    var icon_size_xxs: Double = js.native
    
    var input_color_icon: String = js.native
    
    var input_color_icon_tap: String = js.native
    
    var input_font_size: Double = js.native
    
    var input_label_width: Double = js.native
    
    var line_height_base: Double = js.native
    
    var line_height_paragraph: Double = js.native
    
    var link_button_fill_tap: String = js.native
    
    var link_button_font_size: Double = js.native
    
    var list_item_height: Double = js.native
    
    var list_item_height_sm: Double = js.native
    
    var list_title_height: Double = js.native
    
    var modal_button_font_size: Double = js.native
    
    var modal_button_height: Double = js.native
    
    var modal_font_size_heading: Double = js.native
    
    var modal_zindex: Double = js.native
    
    var notice_bar_fill: String = js.native
    
    var notice_bar_height: Double = js.native
    
    var opacity_disabled: String = js.native
    
    var option_height: Double = js.native
    
    var popup_zindex: Double = js.native
    
    var primary_button_fill: String = js.native
    
    var primary_button_fill_tap: String = js.native
    
    var radius_lg: Double = js.native
    
    var radius_md: Double = js.native
    
    var radius_sm: Double = js.native
    
    var radius_xs: Double = js.native
    
    var search_bar_fill: String = js.native
    
    var search_bar_font_size: Double = js.native
    
    var search_bar_height: Double = js.native
    
    var search_bar_input_height: Double = js.native
    
    var search_color_icon: String = js.native
    
    var segmented_control_color: String = js.native
    
    var segmented_control_fill_tap: String = js.native
    
    var segmented_control_height: Double = js.native
    
    var switch_fill: String = js.native
    
    var tab_bar_fill: String = js.native
    
    var tab_bar_height: Double = js.native
    
    var tabs_color: String = js.native
    
    var tabs_font_size_heading: Double = js.native
    
    var tabs_height: Double = js.native
    
    var tag_height: Double = js.native
    
    var tag_small_height: Double = js.native
    
    var toast_fill: String = js.native
    
    var toast_zindex: Double = js.native
    
    var v_spacing_lg: Double = js.native
    
    var v_spacing_md: Double = js.native
    
    var v_spacing_sm: Double = js.native
    
    var v_spacing_xl: Double = js.native
    
    var v_spacing_xs: Double = js.native
    
    var warning_button_fill: String = js.native
    
    var warning_button_fill_tap: String = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(
      action_sheet_zindex: Double,
      actionsheet_item_font_size: Double,
      actionsheet_item_height: Double,
      border_color_base: String,
      border_width_lg: Double,
      border_width_md: Double,
      border_width_sm: Double,
      brand_error: String,
      brand_important: String,
      brand_primary: String,
      brand_primary_tap: String,
      brand_success: String,
      brand_wait: String,
      brand_warning: String,
      button_font_size: Double,
      button_font_size_sm: Double,
      button_height: Double,
      button_height_sm: Double,
      color_icon_base: String,
      color_link: String,
      color_text_base: String,
      color_text_base_inverse: String,
      color_text_caption: String,
      color_text_disabled: String,
      color_text_paragraph: String,
      color_text_placeholder: String,
      color_text_secondary: String,
      ease_in_out_quint: String,
      fill_base: String,
      fill_body: String,
      fill_disabled: String,
      fill_grey: String,
      fill_mask: String,
      fill_tap: String,
      font_size_base: Double,
      font_size_caption: Double,
      font_size_caption_sm: Double,
      font_size_heading: Double,
      font_size_icontext: Double,
      font_size_subhead: Double,
      ghost_button_color: String,
      ghost_button_fill_tap: String,
      h_spacing_lg: Double,
      h_spacing_md: Double,
      h_spacing_sm: Double,
      icon_size_lg: Double,
      icon_size_md: Double,
      icon_size_sm: Double,
      icon_size_xs: Double,
      icon_size_xxs: Double,
      input_color_icon: String,
      input_color_icon_tap: String,
      input_font_size: Double,
      input_label_width: Double,
      line_height_base: Double,
      line_height_paragraph: Double,
      link_button_fill_tap: String,
      link_button_font_size: Double,
      list_item_height: Double,
      list_item_height_sm: Double,
      list_title_height: Double,
      modal_button_font_size: Double,
      modal_button_height: Double,
      modal_font_size_heading: Double,
      modal_zindex: Double,
      notice_bar_fill: String,
      notice_bar_height: Double,
      opacity_disabled: String,
      option_height: Double,
      popup_zindex: Double,
      primary_button_fill: String,
      primary_button_fill_tap: String,
      radius_lg: Double,
      radius_md: Double,
      radius_sm: Double,
      radius_xs: Double,
      search_bar_fill: String,
      search_bar_font_size: Double,
      search_bar_height: Double,
      search_bar_input_height: Double,
      search_color_icon: String,
      segmented_control_color: String,
      segmented_control_fill_tap: String,
      segmented_control_height: Double,
      switch_fill: String,
      tab_bar_fill: String,
      tab_bar_height: Double,
      tabs_color: String,
      tabs_font_size_heading: Double,
      tabs_height: Double,
      tag_height: Double,
      tag_small_height: Double,
      toast_fill: String,
      toast_zindex: Double,
      v_spacing_lg: Double,
      v_spacing_md: Double,
      v_spacing_sm: Double,
      v_spacing_xl: Double,
      v_spacing_xs: Double,
      warning_button_fill: String,
      warning_button_fill_tap: String
    ): Theme = {
      val __obj = js.Dynamic.literal(action_sheet_zindex = action_sheet_zindex.asInstanceOf[js.Any], actionsheet_item_font_size = actionsheet_item_font_size.asInstanceOf[js.Any], actionsheet_item_height = actionsheet_item_height.asInstanceOf[js.Any], border_color_base = border_color_base.asInstanceOf[js.Any], border_width_lg = border_width_lg.asInstanceOf[js.Any], border_width_md = border_width_md.asInstanceOf[js.Any], border_width_sm = border_width_sm.asInstanceOf[js.Any], brand_error = brand_error.asInstanceOf[js.Any], brand_important = brand_important.asInstanceOf[js.Any], brand_primary = brand_primary.asInstanceOf[js.Any], brand_primary_tap = brand_primary_tap.asInstanceOf[js.Any], brand_success = brand_success.asInstanceOf[js.Any], brand_wait = brand_wait.asInstanceOf[js.Any], brand_warning = brand_warning.asInstanceOf[js.Any], button_font_size = button_font_size.asInstanceOf[js.Any], button_font_size_sm = button_font_size_sm.asInstanceOf[js.Any], button_height = button_height.asInstanceOf[js.Any], button_height_sm = button_height_sm.asInstanceOf[js.Any], color_icon_base = color_icon_base.asInstanceOf[js.Any], color_link = color_link.asInstanceOf[js.Any], color_text_base = color_text_base.asInstanceOf[js.Any], color_text_base_inverse = color_text_base_inverse.asInstanceOf[js.Any], color_text_caption = color_text_caption.asInstanceOf[js.Any], color_text_disabled = color_text_disabled.asInstanceOf[js.Any], color_text_paragraph = color_text_paragraph.asInstanceOf[js.Any], color_text_placeholder = color_text_placeholder.asInstanceOf[js.Any], color_text_secondary = color_text_secondary.asInstanceOf[js.Any], ease_in_out_quint = ease_in_out_quint.asInstanceOf[js.Any], fill_base = fill_base.asInstanceOf[js.Any], fill_body = fill_body.asInstanceOf[js.Any], fill_disabled = fill_disabled.asInstanceOf[js.Any], fill_grey = fill_grey.asInstanceOf[js.Any], fill_mask = fill_mask.asInstanceOf[js.Any], fill_tap = fill_tap.asInstanceOf[js.Any], font_size_base = font_size_base.asInstanceOf[js.Any], font_size_caption = font_size_caption.asInstanceOf[js.Any], font_size_caption_sm = font_size_caption_sm.asInstanceOf[js.Any], font_size_heading = font_size_heading.asInstanceOf[js.Any], font_size_icontext = font_size_icontext.asInstanceOf[js.Any], font_size_subhead = font_size_subhead.asInstanceOf[js.Any], ghost_button_color = ghost_button_color.asInstanceOf[js.Any], ghost_button_fill_tap = ghost_button_fill_tap.asInstanceOf[js.Any], h_spacing_lg = h_spacing_lg.asInstanceOf[js.Any], h_spacing_md = h_spacing_md.asInstanceOf[js.Any], h_spacing_sm = h_spacing_sm.asInstanceOf[js.Any], icon_size_lg = icon_size_lg.asInstanceOf[js.Any], icon_size_md = icon_size_md.asInstanceOf[js.Any], icon_size_sm = icon_size_sm.asInstanceOf[js.Any], icon_size_xs = icon_size_xs.asInstanceOf[js.Any], icon_size_xxs = icon_size_xxs.asInstanceOf[js.Any], input_color_icon = input_color_icon.asInstanceOf[js.Any], input_color_icon_tap = input_color_icon_tap.asInstanceOf[js.Any], input_font_size = input_font_size.asInstanceOf[js.Any], input_label_width = input_label_width.asInstanceOf[js.Any], line_height_base = line_height_base.asInstanceOf[js.Any], line_height_paragraph = line_height_paragraph.asInstanceOf[js.Any], link_button_fill_tap = link_button_fill_tap.asInstanceOf[js.Any], link_button_font_size = link_button_font_size.asInstanceOf[js.Any], list_item_height = list_item_height.asInstanceOf[js.Any], list_item_height_sm = list_item_height_sm.asInstanceOf[js.Any], list_title_height = list_title_height.asInstanceOf[js.Any], modal_button_font_size = modal_button_font_size.asInstanceOf[js.Any], modal_button_height = modal_button_height.asInstanceOf[js.Any], modal_font_size_heading = modal_font_size_heading.asInstanceOf[js.Any], modal_zindex = modal_zindex.asInstanceOf[js.Any], notice_bar_fill = notice_bar_fill.asInstanceOf[js.Any], notice_bar_height = notice_bar_height.asInstanceOf[js.Any], opacity_disabled = opacity_disabled.asInstanceOf[js.Any], option_height = option_height.asInstanceOf[js.Any], popup_zindex = popup_zindex.asInstanceOf[js.Any], primary_button_fill = primary_button_fill.asInstanceOf[js.Any], primary_button_fill_tap = primary_button_fill_tap.asInstanceOf[js.Any], radius_lg = radius_lg.asInstanceOf[js.Any], radius_md = radius_md.asInstanceOf[js.Any], radius_sm = radius_sm.asInstanceOf[js.Any], radius_xs = radius_xs.asInstanceOf[js.Any], search_bar_fill = search_bar_fill.asInstanceOf[js.Any], search_bar_font_size = search_bar_font_size.asInstanceOf[js.Any], search_bar_height = search_bar_height.asInstanceOf[js.Any], search_bar_input_height = search_bar_input_height.asInstanceOf[js.Any], search_color_icon = search_color_icon.asInstanceOf[js.Any], segmented_control_color = segmented_control_color.asInstanceOf[js.Any], segmented_control_fill_tap = segmented_control_fill_tap.asInstanceOf[js.Any], segmented_control_height = segmented_control_height.asInstanceOf[js.Any], switch_fill = switch_fill.asInstanceOf[js.Any], tab_bar_fill = tab_bar_fill.asInstanceOf[js.Any], tab_bar_height = tab_bar_height.asInstanceOf[js.Any], tabs_color = tabs_color.asInstanceOf[js.Any], tabs_font_size_heading = tabs_font_size_heading.asInstanceOf[js.Any], tabs_height = tabs_height.asInstanceOf[js.Any], tag_height = tag_height.asInstanceOf[js.Any], tag_small_height = tag_small_height.asInstanceOf[js.Any], toast_fill = toast_fill.asInstanceOf[js.Any], toast_zindex = toast_zindex.asInstanceOf[js.Any], v_spacing_lg = v_spacing_lg.asInstanceOf[js.Any], v_spacing_md = v_spacing_md.asInstanceOf[js.Any], v_spacing_sm = v_spacing_sm.asInstanceOf[js.Any], v_spacing_xl = v_spacing_xl.asInstanceOf[js.Any], v_spacing_xs = v_spacing_xs.asInstanceOf[js.Any], warning_button_fill = warning_button_fill.asInstanceOf[js.Any], warning_button_fill_tap = warning_button_fill_tap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction_sheet_zindex(value: Double): Self = StObject.set(x, "action_sheet_zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsheet_item_font_size(value: Double): Self = StObject.set(x, "actionsheet_item_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsheet_item_height(value: Double): Self = StObject.set(x, "actionsheet_item_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorder_color_base(value: String): Self = StObject.set(x, "border_color_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorder_width_lg(value: Double): Self = StObject.set(x, "border_width_lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorder_width_md(value: Double): Self = StObject.set(x, "border_width_md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorder_width_sm(value: Double): Self = StObject.set(x, "border_width_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_error(value: String): Self = StObject.set(x, "brand_error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_important(value: String): Self = StObject.set(x, "brand_important", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_primary(value: String): Self = StObject.set(x, "brand_primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_primary_tap(value: String): Self = StObject.set(x, "brand_primary_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_success(value: String): Self = StObject.set(x, "brand_success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_wait(value: String): Self = StObject.set(x, "brand_wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_warning(value: String): Self = StObject.set(x, "brand_warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton_font_size(value: Double): Self = StObject.set(x, "button_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton_font_size_sm(value: Double): Self = StObject.set(x, "button_font_size_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton_height(value: Double): Self = StObject.set(x, "button_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton_height_sm(value: Double): Self = StObject.set(x, "button_height_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_icon_base(value: String): Self = StObject.set(x, "color_icon_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_link(value: String): Self = StObject.set(x, "color_link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_base(value: String): Self = StObject.set(x, "color_text_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_base_inverse(value: String): Self = StObject.set(x, "color_text_base_inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_caption(value: String): Self = StObject.set(x, "color_text_caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_disabled(value: String): Self = StObject.set(x, "color_text_disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_paragraph(value: String): Self = StObject.set(x, "color_text_paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_placeholder(value: String): Self = StObject.set(x, "color_text_placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_text_secondary(value: String): Self = StObject.set(x, "color_text_secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEase_in_out_quint(value: String): Self = StObject.set(x, "ease_in_out_quint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_base(value: String): Self = StObject.set(x, "fill_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_body(value: String): Self = StObject.set(x, "fill_body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_disabled(value: String): Self = StObject.set(x, "fill_disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_grey(value: String): Self = StObject.set(x, "fill_grey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_mask(value: String): Self = StObject.set(x, "fill_mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFill_tap(value: String): Self = StObject.set(x, "fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_base(value: Double): Self = StObject.set(x, "font_size_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_caption(value: Double): Self = StObject.set(x, "font_size_caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_caption_sm(value: Double): Self = StObject.set(x, "font_size_caption_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_heading(value: Double): Self = StObject.set(x, "font_size_heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_icontext(value: Double): Self = StObject.set(x, "font_size_icontext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont_size_subhead(value: Double): Self = StObject.set(x, "font_size_subhead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhost_button_color(value: String): Self = StObject.set(x, "ghost_button_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGhost_button_fill_tap(value: String): Self = StObject.set(x, "ghost_button_fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH_spacing_lg(value: Double): Self = StObject.set(x, "h_spacing_lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH_spacing_md(value: Double): Self = StObject.set(x, "h_spacing_md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH_spacing_sm(value: Double): Self = StObject.set(x, "h_spacing_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_size_lg(value: Double): Self = StObject.set(x, "icon_size_lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_size_md(value: Double): Self = StObject.set(x, "icon_size_md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_size_sm(value: Double): Self = StObject.set(x, "icon_size_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_size_xs(value: Double): Self = StObject.set(x, "icon_size_xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_size_xxs(value: Double): Self = StObject.set(x, "icon_size_xxs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_color_icon(value: String): Self = StObject.set(x, "input_color_icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_color_icon_tap(value: String): Self = StObject.set(x, "input_color_icon_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_font_size(value: Double): Self = StObject.set(x, "input_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_label_width(value: Double): Self = StObject.set(x, "input_label_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine_height_base(value: Double): Self = StObject.set(x, "line_height_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine_height_paragraph(value: Double): Self = StObject.set(x, "line_height_paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_button_fill_tap(value: String): Self = StObject.set(x, "link_button_fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink_button_font_size(value: Double): Self = StObject.set(x, "link_button_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList_item_height(value: Double): Self = StObject.set(x, "list_item_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList_item_height_sm(value: Double): Self = StObject.set(x, "list_item_height_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList_title_height(value: Double): Self = StObject.set(x, "list_title_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal_button_font_size(value: Double): Self = StObject.set(x, "modal_button_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal_button_height(value: Double): Self = StObject.set(x, "modal_button_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal_font_size_heading(value: Double): Self = StObject.set(x, "modal_font_size_heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal_zindex(value: Double): Self = StObject.set(x, "modal_zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotice_bar_fill(value: String): Self = StObject.set(x, "notice_bar_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotice_bar_height(value: Double): Self = StObject.set(x, "notice_bar_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity_disabled(value: String): Self = StObject.set(x, "opacity_disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOption_height(value: Double): Self = StObject.set(x, "option_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopup_zindex(value: Double): Self = StObject.set(x, "popup_zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary_button_fill(value: String): Self = StObject.set(x, "primary_button_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary_button_fill_tap(value: String): Self = StObject.set(x, "primary_button_fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius_lg(value: Double): Self = StObject.set(x, "radius_lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius_md(value: Double): Self = StObject.set(x, "radius_md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius_sm(value: Double): Self = StObject.set(x, "radius_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius_xs(value: Double): Self = StObject.set(x, "radius_xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_bar_fill(value: String): Self = StObject.set(x, "search_bar_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_bar_font_size(value: Double): Self = StObject.set(x, "search_bar_font_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_bar_height(value: Double): Self = StObject.set(x, "search_bar_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_bar_input_height(value: Double): Self = StObject.set(x, "search_bar_input_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_color_icon(value: String): Self = StObject.set(x, "search_color_icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmented_control_color(value: String): Self = StObject.set(x, "segmented_control_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmented_control_fill_tap(value: String): Self = StObject.set(x, "segmented_control_fill_tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmented_control_height(value: Double): Self = StObject.set(x, "segmented_control_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitch_fill(value: String): Self = StObject.set(x, "switch_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab_bar_fill(value: String): Self = StObject.set(x, "tab_bar_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab_bar_height(value: Double): Self = StObject.set(x, "tab_bar_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs_color(value: String): Self = StObject.set(x, "tabs_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs_font_size_heading(value: Double): Self = StObject.set(x, "tabs_font_size_heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs_height(value: Double): Self = StObject.set(x, "tabs_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag_height(value: Double): Self = StObject.set(x, "tag_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag_small_height(value: Double): Self = StObject.set(x, "tag_small_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToast_fill(value: String): Self = StObject.set(x, "toast_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToast_zindex(value: Double): Self = StObject.set(x, "toast_zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV_spacing_lg(value: Double): Self = StObject.set(x, "v_spacing_lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV_spacing_md(value: Double): Self = StObject.set(x, "v_spacing_md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV_spacing_sm(value: Double): Self = StObject.set(x, "v_spacing_sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV_spacing_xl(value: Double): Self = StObject.set(x, "v_spacing_xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV_spacing_xs(value: Double): Self = StObject.set(x, "v_spacing_xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning_button_fill(value: String): Self = StObject.set(x, "warning_button_fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning_button_fill_tap(value: String): Self = StObject.set(x, "warning_button_fill_tap", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var value: js.UndefOr[PartialTheme] = js.native
  }
  object ThemeProviderProps {
    
    @scala.inline
    def apply(): ThemeProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    @scala.inline
    implicit class ThemeProviderPropsMutableBuilder[Self <: ThemeProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setValue(value: PartialTheme): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait UseThemeContextProps extends StObject {
    
    var theme: js.UndefOr[PartialTheme] = js.native
  }
  object UseThemeContextProps {
    
    @scala.inline
    def apply(): UseThemeContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseThemeContextProps]
    }
    
    @scala.inline
    implicit class UseThemeContextPropsMutableBuilder[Self <: UseThemeContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: PartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait WithThemeProps[T, S] extends StObject {
    
    def children(styles: T with StringDictionary[js.Any], theme: Theme): ReactNode = js.native
    
    var styles: js.UndefOr[S] = js.native
    
    def themeStyles(theme: Theme): T = js.native
  }
  object WithThemeProps {
    
    @scala.inline
    def apply[T, S](children: (T with StringDictionary[js.Any], Theme) => ReactNode, themeStyles: Theme => T): WithThemeProps[T, S] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), themeStyles = js.Any.fromFunction1(themeStyles))
      __obj.asInstanceOf[WithThemeProps[T, S]]
    }
    
    @scala.inline
    implicit class WithThemePropsMutableBuilder[Self <: WithThemeProps[_, _], T, S] (val x: Self with (WithThemeProps[T, S])) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (T with StringDictionary[js.Any], Theme) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStyles(value: S): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setThemeStyles(value: Theme => T): Self = StObject.set(x, "themeStyles", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WithThemeStyles[T] extends StObject {
    
    var styles: js.UndefOr[Partial[T]] = js.native
  }
  object WithThemeStyles {
    
    @scala.inline
    def apply[T](): WithThemeStyles[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithThemeStyles[T]]
    }
    
    @scala.inline
    implicit class WithThemeStylesMutableBuilder[Self <: WithThemeStyles[_], T] (val x: Self with WithThemeStyles[T]) extends AnyVal {
      
      @scala.inline
      def setStyles(value: Partial[T]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
