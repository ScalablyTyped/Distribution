package typings.antDesignProUtils

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProUtils.dropdownFooterMod.DropdownFooterProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterDropdownMod extends Shortcut {
  
  @JSImport("@ant-design/pro-utils/lib/components/FilterDropdown", JSImport.Default)
  @js.native
  val default: FC[DropdownProps] = js.native
  
  trait DropdownProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[DropdownFooterProps] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownProps {
    
    @scala.inline
    def apply(): DropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps]
    }
    
    @scala.inline
    implicit class DropdownPropsMutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFooter(value: DropdownFooterProps): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = FC[DropdownProps]
  
  /* This means you don't have to write `default`, but can instead just say `filterDropdownMod.foo` */
  override def _to: FC[DropdownProps] = default
}
