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
    
    def update(matches: Any): Unit
  }
  object ISelect {
    
    inline def apply(
      active: Double => Double,
      hide: () => Unit,
      select: Double => Unit,
      show: () => Unit,
      update: Any => Unit
    ): ISelect = {
      val __obj = js.Dynamic.literal(active = js.Any.fromFunction1(active), hide = js.Any.fromFunction0(hide), select = js.Any.fromFunction1(select), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[ISelect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISelect] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Double => Double): Self = StObject.set(x, "active", js.Any.fromFunction1(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setSelect(value: Double => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
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
    
    inline def apply(): ISelectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISelectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISelectOptions] (val x: Self) extends AnyVal {
      
      inline def setAllNoneButtons(value: Boolean): Self = StObject.set(x, "allNoneButtons", value.asInstanceOf[js.Any])
      
      inline def setAllNoneButtonsUndefined: Self = StObject.set(x, "allNoneButtons", js.undefined)
      
      inline def setAllText(value: String): Self = StObject.set(x, "allText", value.asInstanceOf[js.Any])
      
      inline def setAllTextUndefined: Self = StObject.set(x, "allText", js.undefined)
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setIconCheckmark(value: String): Self = StObject.set(x, "iconCheckmark", value.asInstanceOf[js.Any])
      
      inline def setIconCheckmarkUndefined: Self = StObject.set(x, "iconCheckmark", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthHtml(value: String): Self = StObject.set(x, "maxLengthHtml", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthHtmlUndefined: Self = StObject.set(x, "maxLengthHtml", js.undefined)
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setNoneText(value: String): Self = StObject.set(x, "noneText", value.asInstanceOf[js.Any])
      
      inline def setNoneTextUndefined: Self = StObject.set(x, "noneText", js.undefined)
      
      inline def setOnBeforeHide(value: /* select */ ISelect => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* select */ ISelect => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* select */ ISelect => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* select */ ISelect => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  trait ISelectProvider extends StObject {
    
    var defaults: ISelectOptions
  }
  object ISelectProvider {
    
    inline def apply(defaults: ISelectOptions): ISelectProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISelectProvider] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: ISelectOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type ISelectService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ Any, 
    /* config */ ISelectOptions, 
    ISelect
  ]
}
