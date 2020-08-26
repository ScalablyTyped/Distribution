package typings.antDesignReactNative.popoverMod

import typings.antDesignReactNative.antDesignReactNativeStrings.auto
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.popoverStyleMod.PopoverStyle
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModalPopover.popoverGeometryMod.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverProps extends WithThemeStyles[PopoverStyle] {
  var disabled: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onSelect: js.UndefOr[js.Function2[/* node */ js.Any, /* index */ js.UndefOr[Double], Unit]] = js.native
  var overlay: ReactNode = js.native
  var placement: js.UndefOr[Placement | auto] = js.native
  var renderOverlayComponent: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]] = js.native
  var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var useNativeDriver: js.UndefOr[Boolean] = js.native
}

object PopoverProps {
  @scala.inline
  def apply(): PopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverProps]
  }
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: /* show */ Boolean => js.Function1[/* value */ Double, Double]): Self = this.set("easing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnSelect(value: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOverlay(value: ReactNode): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPlacement(value: Placement | auto): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setRenderOverlayComponent(value: /* node */ ReactNode => ReactNode): Self = this.set("renderOverlayComponent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderOverlayComponent: Self = this.set("renderOverlayComponent", js.undefined)
    @scala.inline
    def setTriggerStyle(value: StyleProp[ViewStyle]): Self = this.set("triggerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerStyle: Self = this.set("triggerStyle", js.undefined)
    @scala.inline
    def setTriggerStyleNull: Self = this.set("triggerStyle", null)
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
  }
  
}

