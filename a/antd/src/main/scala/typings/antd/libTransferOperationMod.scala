package typings.antd

import typings.antd.libConfigProviderContextMod.DirectionType
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransferOperationMod {
  
  @JSImport("antd/lib/transfer/operation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: TransferOperationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TransferOperationProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[DirectionType] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var leftActive: js.UndefOr[Boolean] = js.undefined
    
    var leftArrowText: js.UndefOr[String] = js.undefined
    
    var moveToLeft: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var moveToRight: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var oneWay: js.UndefOr[Boolean] = js.undefined
    
    var rightActive: js.UndefOr[Boolean] = js.undefined
    
    var rightArrowText: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TransferOperationProps {
    
    inline def apply(): TransferOperationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferOperationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransferOperationProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLeftActive(value: Boolean): Self = StObject.set(x, "leftActive", value.asInstanceOf[js.Any])
      
      inline def setLeftActiveUndefined: Self = StObject.set(x, "leftActive", js.undefined)
      
      inline def setLeftArrowText(value: String): Self = StObject.set(x, "leftArrowText", value.asInstanceOf[js.Any])
      
      inline def setLeftArrowTextUndefined: Self = StObject.set(x, "leftArrowText", js.undefined)
      
      inline def setMoveToLeft(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "moveToLeft", js.Any.fromFunction1(value))
      
      inline def setMoveToLeftUndefined: Self = StObject.set(x, "moveToLeft", js.undefined)
      
      inline def setMoveToRight(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "moveToRight", js.Any.fromFunction1(value))
      
      inline def setMoveToRightUndefined: Self = StObject.set(x, "moveToRight", js.undefined)
      
      inline def setOneWay(value: Boolean): Self = StObject.set(x, "oneWay", value.asInstanceOf[js.Any])
      
      inline def setOneWayUndefined: Self = StObject.set(x, "oneWay", js.undefined)
      
      inline def setRightActive(value: Boolean): Self = StObject.set(x, "rightActive", value.asInstanceOf[js.Any])
      
      inline def setRightActiveUndefined: Self = StObject.set(x, "rightActive", js.undefined)
      
      inline def setRightArrowText(value: String): Self = StObject.set(x, "rightArrowText", value.asInstanceOf[js.Any])
      
      inline def setRightArrowTextUndefined: Self = StObject.set(x, "rightArrowText", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
