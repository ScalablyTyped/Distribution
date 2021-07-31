package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IAugmentedJQuery
import typings.angularStrap.anon.Hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Button
// see http://mgcrea.github.io/angular-strap/#/buttons
///////////////////////////////////////////////////////////////////////////
// No definitions for this module
///////////////////////////////////////////////////////////////////////////
// Select
// see http://mgcrea.github.io/angular-strap/#/selects
///////////////////////////////////////////////////////////////////////////
object select {
  
  trait ISelect extends StObject {
    
    def active(index: Double): Double
    
    def hide(): Unit
    
    def select(index: Double): Unit
    
    def show(): Unit
    
    def update(matches: js.Any): Unit
  }
  object ISelect {
    
    @scala.inline
    def apply(
      active: Double => Double,
      hide: () => Unit,
      select: Double => Unit,
      show: () => Unit,
      update: js.Any => Unit
    ): ISelect = {
      val __obj = js.Dynamic.literal(active = js.Any.fromFunction1(active), hide = js.Any.fromFunction0(hide), select = js.Any.fromFunction1(select), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[ISelect]
    }
    
    @scala.inline
    implicit class ISelectMutableBuilder[Self <: ISelect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Double => Double): Self = StObject.set(x, "active", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSelect(value: Double => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: js.Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait ISelectOptions extends StObject {
    
    var allNoneButtons: js.UndefOr[Boolean] = js.undefined
    
    var allText: js.UndefOr[String] = js.undefined
    
    var animation: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var iconCheckmark: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var maxLengthHtml: js.UndefOr[String] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var noneText: js.UndefOr[String] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var sort: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var toggle: js.UndefOr[Boolean] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
  }
  object ISelectOptions {
    
    @scala.inline
    def apply(): ISelectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISelectOptions]
    }
    
    @scala.inline
    implicit class ISelectOptionsMutableBuilder[Self <: ISelectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllNoneButtons(value: Boolean): Self = StObject.set(x, "allNoneButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllNoneButtonsUndefined: Self = StObject.set(x, "allNoneButtons", js.undefined)
      
      @scala.inline
      def setAllText(value: String): Self = StObject.set(x, "allText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllTextUndefined: Self = StObject.set(x, "allText", js.undefined)
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setIconCheckmark(value: String): Self = StObject.set(x, "iconCheckmark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconCheckmarkUndefined: Self = StObject.set(x, "iconCheckmark", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthHtml(value: String): Self = StObject.set(x, "maxLengthHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthHtmlUndefined: Self = StObject.set(x, "maxLengthHtml", js.undefined)
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setNoneText(value: String): Self = StObject.set(x, "noneText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoneTextUndefined: Self = StObject.set(x, "noneText", js.undefined)
      
      @scala.inline
      def setOnBeforeHide(value: /* select */ ISelect => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      @scala.inline
      def setOnBeforeShow(value: /* select */ ISelect => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      @scala.inline
      def setOnHide(value: /* select */ ISelect => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* select */ ISelect => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  trait ISelectProvider extends StObject {
    
    var defaults: ISelectOptions
  }
  object ISelectProvider {
    
    @scala.inline
    def apply(defaults: ISelectOptions): ISelectProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectProvider]
    }
    
    @scala.inline
    implicit class ISelectProviderMutableBuilder[Self <: ISelectProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: ISelectOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type ISelectService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ ISelectOptions, 
    ISelect
  ]
}
