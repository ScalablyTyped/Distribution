package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.KeyWiseTransferItem
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferListItemMod extends Shortcut {
  
  @JSImport("antd/lib/transfer/ListItem", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], Element]] = js.native
  
  @js.native
  trait ListItemProps[RecordType] extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var item: RecordType = js.native
    
    def onClick(item: RecordType): Unit = js.native
    
    var onRemove: js.UndefOr[js.Function1[/* item */ RecordType, Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var renderedEl: ReactNode = js.native
    
    var renderedText: js.UndefOr[String | Double] = js.native
    
    var showRemove: js.UndefOr[Boolean] = js.native
  }
  object ListItemProps {
    
    @scala.inline
    def apply[RecordType](item: RecordType, onClick: RecordType => Unit, prefixCls: String): ListItemProps[RecordType] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemProps[RecordType]]
    }
    
    @scala.inline
    implicit class ListItemPropsMutableBuilder[Self <: ListItemProps[_], RecordType] (val x: Self with ListItemProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setItem(value: RecordType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: RecordType => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemove(value: /* item */ RecordType => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedEl(value: ReactNode): Self = StObject.set(x, "renderedEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedElUndefined: Self = StObject.set(x, "renderedEl", js.undefined)
      
      @scala.inline
      def setRenderedText(value: String | Double): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedTextUndefined: Self = StObject.set(x, "renderedText", js.undefined)
      
      @scala.inline
      def setShowRemove(value: Boolean): Self = StObject.set(x, "showRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveUndefined: Self = StObject.set(x, "showRemove", js.undefined)
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], Element]]
  
  /* This means you don't have to write `default`, but can instead just say `transferListItemMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], Element]] = default
}
