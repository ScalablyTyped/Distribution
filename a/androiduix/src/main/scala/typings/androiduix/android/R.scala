package typings.androiduix.android

import typings.androiduix.android.content.res.ColorStateList
import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.graphics.drawable.InsetDrawable
import typings.androiduix.android.graphics.drawable.StateListDrawable
import typings.androiduix.android.view.animation.AccelerateDecelerateInterpolator
import typings.androiduix.android.view.animation.AccelerateInterpolator
import typings.androiduix.android.view.animation.Animation
import typings.androiduix.android.view.animation.AnticipateInterpolator
import typings.androiduix.android.view.animation.AnticipateOvershootInterpolator
import typings.androiduix.android.view.animation.BounceInterpolator
import typings.androiduix.android.view.animation.CycleInterpolator
import typings.androiduix.android.view.animation.DecelerateInterpolator
import typings.androiduix.android.view.animation.LinearInterpolator
import typings.androiduix.android.view.animation.OvershootInterpolator
import typings.androiduix.androidui.image.ChangeImageSizeDrawable
import typings.androiduix.androidui.image.NetDrawable
import typings.androiduix.androidui.image.NinePatchDrawable
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.R")
@js.native
object R extends js.Object {
  @js.native
  class anim () extends js.Object
  
  @js.native
  class attr () extends js.Object
  
  @js.native
  class color () extends js.Object
  
  @js.native
  class drawable () extends js.Object
  
  @js.native
  class image () extends js.Object
  
  @js.native
  class image_base64 () extends js.Object
  
  @js.native
  class interpolator () extends js.Object
  
  @js.native
  class layout () extends js.Object
  
  @js.native
  class string_ () extends js.Object
  
  /* static members */
  @js.native
  object anim extends js.Object {
    val activity_close_enter: Animation = js.native
    val activity_close_enter_ios: Animation = js.native
    val activity_close_exit: Animation = js.native
    val activity_close_exit_ios: Animation = js.native
    val activity_open_enter: Animation = js.native
    val activity_open_enter_ios: Animation = js.native
    val activity_open_exit: Animation = js.native
    val activity_open_exit_ios: Animation = js.native
    val dialog_enter: Animation = js.native
    val dialog_exit: Animation = js.native
    val fade_in: Animation = js.native
    val fade_out: Animation = js.native
    val grow_fade_in: Animation = js.native
    val grow_fade_in_center: Animation = js.native
    val grow_fade_in_from_bottom: Animation = js.native
    val shrink_fade_out: Animation = js.native
    val shrink_fade_out_center: Animation = js.native
    val shrink_fade_out_from_bottom: Animation = js.native
    val toast_enter: Animation = js.native
    val toast_exit: Animation = js.native
  }
  
  /* static members */
  @js.native
  object attr extends js.Object {
    var absListViewStyle: Map[String, String] = js.native
    var actionBarStyle: Map[String, String] = js.native
    var buttonStyle: Map[String, String] = js.native
    var checkboxStyle: Map[String, String] = js.native
    var checkedTextViewStyle: Map[String, String] = js.native
    var dropDownListViewStyle: Map[String, String] = js.native
    var editTextStyle: Map[String, String] = js.native
    var expandableListViewStyle: Map[String, String] = js.native
    var gridViewStyle: Map[String, String] = js.native
    var imageButtonStyle: Map[String, String] = js.native
    var listPopupWindowStyle: Map[String, String] = js.native
    var listViewStyle: Map[String, String] = js.native
    var numberPickerStyle: Map[String, String] = js.native
    var popupMenuStyle: Map[String, String] = js.native
    var popupWindowStyle: Map[String, String] = js.native
    var progressBarStyle: Map[String, String] = js.native
    var progressBarStyleHorizontal: Map[String, String] = js.native
    var progressBarStyleLarge: Map[String, String] = js.native
    var progressBarStyleSmall: Map[String, String] = js.native
    var radiobuttonStyle: Map[String, String] = js.native
    var ratingBarStyle: Map[String, String] = js.native
    var ratingBarStyleIndicator: Map[String, String] = js.native
    var ratingBarStyleSmall: Map[String, String] = js.native
    var scrollViewStyle: Map[String, String] = js.native
    var seekBarStyle: Map[String, String] = js.native
    var spinnerStyle: Map[String, String] = js.native
    var textViewStyle: Map[String, String] = js.native
  }
  
  /* static members */
  @js.native
  object color extends js.Object {
    var black: Double = js.native
    val primary_text_dark_disable_only: ColorStateList = js.native
    val primary_text_light_disable_only: ColorStateList = js.native
    val textView_textColor: ColorStateList = js.native
    var transparent: Double = js.native
    var white: Double = js.native
  }
  
  /* static members */
  @js.native
  object drawable extends js.Object {
    val btn_check: Drawable = js.native
    val btn_default: Drawable = js.native
    val btn_radio: Drawable = js.native
    val divider_horizontal: Drawable = js.native
    val divider_vertical: Drawable = js.native
    val editbox_background: Drawable = js.native
    val item_background: StateListDrawable = js.native
    val list_divider: Drawable = js.native
    val list_selector_background: Drawable = js.native
    val progress_horizontal_holo: Drawable = js.native
    val progress_indeterminate_horizontal_holo: Drawable = js.native
    val progress_large_holo: Drawable = js.native
    val progress_medium_holo: Drawable = js.native
    val progress_small_holo: Drawable = js.native
    val ratingbar_full_empty_holo_light: Drawable = js.native
    val ratingbar_full_filled_holo_light: Drawable = js.native
    val ratingbar_full_holo_light: Drawable = js.native
    val ratingbar_holo_light: Drawable = js.native
    val ratingbar_small_holo_light: Drawable = js.native
    val scrubber_control_selector_holo: Drawable = js.native
    val scrubber_primary_holo: Drawable = js.native
    val scrubber_progress_horizontal_holo_light: Drawable = js.native
    val scrubber_secondary_holo: Drawable = js.native
    val scrubber_track_holo_light: Drawable = js.native
    val toast_frame: InsetDrawable = js.native
  }
  
  @js.native
  object id extends js.Object {
    var action_bar_center_layout: String = js.native
    var action_bar_left: String = js.native
    var action_bar_right: String = js.native
    var action_bar_sub_title: String = js.native
    var action_bar_title: String = js.native
    var alertTitle: String = js.native
    var background: String = js.native
    var button1: String = js.native
    var button2: String = js.native
    var button3: String = js.native
    var buttonPanel: String = js.native
    var content: String = js.native
    var contentPanel: String = js.native
    var custom: String = js.native
    var customPanel: String = js.native
    var icon: String = js.native
    var leftSpacer: String = js.native
    var message: String = js.native
    var parentPanel: String = js.native
    var progress: String = js.native
    var progress_number: String = js.native
    var progress_percent: String = js.native
    var rightSpacer: String = js.native
    var scrollView: String = js.native
    var secondaryProgress: String = js.native
    var select_dialog_listview: String = js.native
    var shortcut: String = js.native
    var text1: String = js.native
    var title: String = js.native
    var titleDivider: String = js.native
    var titleDividerTop: String = js.native
    var title_template: String = js.native
    var topPanel: String = js.native
  }
  
  /* static members */
  @js.native
  object image extends js.Object {
    val actionbar_ic_back_white: NetDrawable = js.native
    val btn_check_off_disabled_focused_holo_light: NetDrawable = js.native
    val btn_check_off_disabled_holo_light: NetDrawable = js.native
    val btn_check_off_focused_holo_light: NetDrawable = js.native
    val btn_check_off_holo_light: NetDrawable = js.native
    val btn_check_off_pressed_holo_light: NetDrawable = js.native
    val btn_check_on_disabled_focused_holo_light: NetDrawable = js.native
    val btn_check_on_disabled_holo_light: NetDrawable = js.native
    val btn_check_on_focused_holo_light: NetDrawable = js.native
    val btn_check_on_holo_light: NetDrawable = js.native
    val btn_check_on_pressed_holo_light: NetDrawable = js.native
    val btn_default_disabled_focused_holo_light: NinePatchDrawable = js.native
    val btn_default_disabled_holo_light: NinePatchDrawable = js.native
    val btn_default_focused_holo_light: NinePatchDrawable = js.native
    val btn_default_normal_holo_light: NinePatchDrawable = js.native
    val btn_default_pressed_holo_light: NinePatchDrawable = js.native
    val btn_radio_off_disabled_focused_holo_light: NetDrawable = js.native
    val btn_radio_off_disabled_holo_light: NetDrawable = js.native
    val btn_radio_off_focused_holo_light: NetDrawable = js.native
    val btn_radio_off_holo_light: NetDrawable = js.native
    val btn_radio_off_pressed_holo_light: NetDrawable = js.native
    val btn_radio_on_disabled_focused_holo_light: NetDrawable = js.native
    val btn_radio_on_disabled_holo_light: NetDrawable = js.native
    val btn_radio_on_focused_holo_light: NetDrawable = js.native
    val btn_radio_on_holo_light: NetDrawable = js.native
    val btn_radio_on_pressed_holo_light: NetDrawable = js.native
    val btn_rating_star_off_normal_holo_light: NetDrawable = js.native
    val btn_rating_star_off_pressed_holo_light: NetDrawable = js.native
    val btn_rating_star_on_normal_holo_light: NetDrawable = js.native
    val btn_rating_star_on_pressed_holo_light: NetDrawable = js.native
    val dropdown_background_dark: NinePatchDrawable = js.native
    val editbox_background_focus_yellow: NinePatchDrawable = js.native
    val editbox_background_normal: NinePatchDrawable = js.native
    val ic_menu_moreoverflow_normal_holo_dark: NetDrawable = js.native
    val menu_panel_holo_dark: NinePatchDrawable = js.native
    val menu_panel_holo_light: NinePatchDrawable = js.native
    val popup_bottom_bright: NinePatchDrawable = js.native
    val popup_center_bright: NinePatchDrawable = js.native
    val popup_full_bright: NinePatchDrawable = js.native
    val popup_top_bright: NinePatchDrawable = js.native
    val progressbar_indeterminate_holo1: NetDrawable = js.native
    val progressbar_indeterminate_holo2: NetDrawable = js.native
    val progressbar_indeterminate_holo3: NetDrawable = js.native
    val progressbar_indeterminate_holo4: NetDrawable = js.native
    val progressbar_indeterminate_holo5: NetDrawable = js.native
    val progressbar_indeterminate_holo6: NetDrawable = js.native
    val progressbar_indeterminate_holo7: NetDrawable = js.native
    val progressbar_indeterminate_holo8: NetDrawable = js.native
    val rate_star_big_half_holo_light: NetDrawable = js.native
    val rate_star_big_off_holo_light: NetDrawable = js.native
    val rate_star_big_on_holo_light: NetDrawable = js.native
    val rate_star_small_half_holo_light: ChangeImageSizeDrawable = js.native
    val rate_star_small_off_holo_light: ChangeImageSizeDrawable = js.native
    val rate_star_small_on_holo_light: ChangeImageSizeDrawable = js.native
    val scrubber_control_disabled_holo: NetDrawable = js.native
    val scrubber_control_focused_holo: NetDrawable = js.native
    val scrubber_control_normal_holo: NetDrawable = js.native
    val scrubber_control_pressed_holo: NetDrawable = js.native
    val spinner_16_inner_holo: ChangeImageSizeDrawable = js.native
    val spinner_16_outer_holo: ChangeImageSizeDrawable = js.native
    val spinner_48_inner_holo: ChangeImageSizeDrawable = js.native
    val spinner_48_outer_holo: ChangeImageSizeDrawable = js.native
    val spinner_76_inner_holo: NetDrawable = js.native
    val spinner_76_outer_holo: NetDrawable = js.native
  }
  
  /* static members */
  @js.native
  object image_base64 extends js.Object {
    val actionbar_ic_back_white: js.Any = js.native
    val btn_check_off_disabled_focused_holo_light: js.Any = js.native
    val btn_check_off_disabled_holo_light: js.Any = js.native
    val btn_check_off_focused_holo_light: js.Any = js.native
    val btn_check_off_holo_light: js.Any = js.native
    val btn_check_off_pressed_holo_light: js.Any = js.native
    val btn_check_on_disabled_focused_holo_light: js.Any = js.native
    val btn_check_on_disabled_holo_light: js.Any = js.native
    val btn_check_on_focused_holo_light: js.Any = js.native
    val btn_check_on_holo_light: js.Any = js.native
    val btn_check_on_pressed_holo_light: js.Any = js.native
    val btn_default_disabled_focused_holo_light: js.Any = js.native
    val btn_default_disabled_holo_light: js.Any = js.native
    val btn_default_focused_holo_light: js.Any = js.native
    val btn_default_normal_holo_light: js.Any = js.native
    val btn_default_pressed_holo_light: js.Any = js.native
    val btn_radio_off_disabled_focused_holo_light: js.Any = js.native
    val btn_radio_off_disabled_holo_light: js.Any = js.native
    val btn_radio_off_focused_holo_light: js.Any = js.native
    val btn_radio_off_holo_light: js.Any = js.native
    val btn_radio_off_pressed_holo_light: js.Any = js.native
    val btn_radio_on_disabled_focused_holo_light: js.Any = js.native
    val btn_radio_on_disabled_holo_light: js.Any = js.native
    val btn_radio_on_focused_holo_light: js.Any = js.native
    val btn_radio_on_holo_light: js.Any = js.native
    val btn_radio_on_pressed_holo_light: js.Any = js.native
    val btn_rating_star_off_normal_holo_light: js.Any = js.native
    val btn_rating_star_off_pressed_holo_light: js.Any = js.native
    val btn_rating_star_on_normal_holo_light: js.Any = js.native
    val btn_rating_star_on_pressed_holo_light: js.Any = js.native
    val dropdown_background_dark: js.Any = js.native
    val editbox_background_focus_yellow: js.Any = js.native
    val editbox_background_normal: js.Any = js.native
    val ic_menu_moreoverflow_normal_holo_dark: js.Any = js.native
    val menu_panel_holo_dark: js.Any = js.native
    val menu_panel_holo_light: js.Any = js.native
    val popup_bottom_bright: js.Any = js.native
    val popup_center_bright: js.Any = js.native
    val popup_full_bright: js.Any = js.native
    val popup_top_bright: js.Any = js.native
    val progressbar_indeterminate_holo1: js.Any = js.native
    val progressbar_indeterminate_holo2: js.Any = js.native
    val progressbar_indeterminate_holo3: js.Any = js.native
    val progressbar_indeterminate_holo4: js.Any = js.native
    val progressbar_indeterminate_holo5: js.Any = js.native
    val progressbar_indeterminate_holo6: js.Any = js.native
    val progressbar_indeterminate_holo7: js.Any = js.native
    val progressbar_indeterminate_holo8: js.Any = js.native
    val rate_star_big_half_holo_light: js.Any = js.native
    val rate_star_big_off_holo_light: js.Any = js.native
    val rate_star_big_on_holo_light: js.Any = js.native
    val scrubber_control_disabled_holo: js.Any = js.native
    val scrubber_control_focused_holo: js.Any = js.native
    val scrubber_control_normal_holo: js.Any = js.native
    val scrubber_control_pressed_holo: js.Any = js.native
    val spinner_76_inner_holo: js.Any = js.native
    val spinner_76_outer_holo: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object interpolator extends js.Object {
    var accelerate_cubic: AccelerateInterpolator = js.native
    var accelerate_decelerate: AccelerateDecelerateInterpolator = js.native
    var accelerate_quad: AccelerateInterpolator = js.native
    var accelerate_quint: AccelerateInterpolator = js.native
    var anticipate: AnticipateInterpolator = js.native
    var anticipate_overshoot: AnticipateOvershootInterpolator = js.native
    var bounce: BounceInterpolator = js.native
    var cycle: CycleInterpolator = js.native
    var decelerate_cubic: DecelerateInterpolator = js.native
    var decelerate_quad: DecelerateInterpolator = js.native
    var decelerate_quint: DecelerateInterpolator = js.native
    var linear: LinearInterpolator = js.native
    var overshoot: OvershootInterpolator = js.native
  }
  
  /* static members */
  @js.native
  object layout extends js.Object {
    var action_bar: String = js.native
    var alert_dialog: String = js.native
    var alert_dialog_progress: String = js.native
    var popup_menu_item_layout: String = js.native
    var select_dialog: String = js.native
    var select_dialog_item: String = js.native
    var select_dialog_multichoice: String = js.native
    var select_dialog_singlechoice: String = js.native
    var simple_spinner_dropdown_item: String = js.native
    var simple_spinner_item: String = js.native
    var transient_notification: String = js.native
    def getLayoutData(layoutName: String): HTMLElement = js.native
  }
  
  /* static members */
  @js.native
  object string_ extends js.Object {
    var back: String = js.native
    var cancel: String = js.native
    var close: String = js.native
    var crash_catch_alert: String = js.native
    var ok: String = js.native
    var prll_footer_state_fail: String = js.native
    var prll_footer_state_loading: String = js.native
    var prll_footer_state_no_more: String = js.native
    var prll_footer_state_normal: String = js.native
    var prll_footer_state_ready: String = js.native
    var prll_header_state_fail: String = js.native
    var prll_header_state_loading: String = js.native
    var prll_header_state_normal: String = js.native
    var prll_header_state_ready: String = js.native
    /* private */ def zh(): js.Any = js.native
  }
  
}

