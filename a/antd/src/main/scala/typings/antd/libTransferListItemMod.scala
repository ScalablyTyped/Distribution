package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libTransferMod.KeyWiseTransferItem
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransferListItemMod extends Shortcut {
  
  @JSImport("antd/lib/transfer/ListItem", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], Element]] = js.native
  
  trait ListItemProps[RecordType] extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var item: RecordType
    
    def onClick(item: RecordType): Unit
    
    var onRemove: js.UndefOr[js.Function1[/* item */ RecordType, Unit]] = js.undefined
    
    var prefixCls: String
    
    var renderedEl: ReactNode
    
    var renderedText: js.UndefOr[String | Double] = js.undefined
    
    var showRemove: js.UndefOr[Boolean] = js.undefined
  }
  object ListItemProps {
    
    inline def apply[RecordType](item: RecordType, onClick: RecordType => Unit, prefixCls: String): ListItemProps[RecordType] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemProps[RecordType]]
    }
    
    extension [Self <: ListItemProps[?], RecordType](x: Self & ListItemProps[RecordType]) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItem(value: RecordType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: RecordType => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnRemove(value: /* item */ RecordType => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRenderedEl(value: ReactNode): Self = StObject.set(x, "renderedEl", value.asInstanceOf[js.Any])
      
      inline def setRenderedElUndefined: Self = StObject.set(x, "renderedEl", js.undefined)
      
      inline def setRenderedText(value: String | Double): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
      
      inline def setRenderedTextUndefined: Self = StObject.set(x, "renderedText", js.undefined)
      
      inline def setShowRemove(value: Boolean): Self = StObject.set(x, "showRemove", value.asInstanceOf[js.Any])
      
      inline def setShowRemoveUndefined: Self = StObject.set(x, "showRemove", js.undefined)
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], Element]]
  
  /* This means you don't have to write `default`, but can instead just say `libTransferListItemMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* props */ ListItemProps[KeyWiseTransferItem], Element]] = default
}
