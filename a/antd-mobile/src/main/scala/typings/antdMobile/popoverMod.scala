package typings.antdMobile

import typings.antdMobile.anon.Placement
import typings.antdMobile.anon.TypeofItemInstantiable
import typings.antdMobile.antdMobileStrings.bottom
import typings.antdMobile.antdMobileStrings.bottomLeft
import typings.antdMobile.antdMobileStrings.bottomRight
import typings.antdMobile.antdMobileStrings.left
import typings.antdMobile.antdMobileStrings.right
import typings.antdMobile.antdMobileStrings.top
import typings.antdMobile.antdMobileStrings.topLeft
import typings.antdMobile.antdMobileStrings.topRight
import typings.antdMobile.popoverPropsTypeMod.PopoverPropsType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  @JSImport("antd-mobile/lib/popover", JSImport.Default)
  @js.native
  class default () extends Popover
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/popover", "default.Item")
    @js.native
    def Item: TypeofItemInstantiable = js.native
    @scala.inline
    def Item_=(x: TypeofItemInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/popover", "default.defaultProps")
    @js.native
    def defaultProps: Placement = js.native
    @scala.inline
    def defaultProps_=(x: Placement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PopOverPropsType extends PopoverPropsType {
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var placement: js.UndefOr[left | right | top | bottom | topLeft | topRight | bottomLeft | bottomRight] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object PopOverPropsType {
    
    @scala.inline
    def apply(): PopOverPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopOverPropsType]
    }
    
    @scala.inline
    implicit class PopOverPropsTypeMutableBuilder[Self <: PopOverPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setPlacement(value: left | right | top | bottom | topLeft | topRight | bottomLeft | bottomRight): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait Popover
    extends Component[PopOverPropsType, js.Any, js.Any]
}
