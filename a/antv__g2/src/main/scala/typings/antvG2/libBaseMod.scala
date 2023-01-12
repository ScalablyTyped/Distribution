package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseMod {
  
  @JSImport("@antv/g2/lib/base", JSImport.Default)
  @js.native
  open class default protected () extends Base {
    def this(cfg: BaseCfg) = this()
  }
  
  @js.native
  trait Base
    extends typings.antvEventEmitter.mod.default {
    
    /**
      * 显示或者隐藏。
      * @param visible
      * @returns
      */
    def changeVisible(visible: Boolean): Unit = js.native
    
    /**
      * 销毁。
      */
    def destroy(): Unit = js.native
    
    /** 标识对象是否已销毁 */
    var destroyed: Boolean = js.native
    
    /**
      * 隐藏。
      */
    def hide(): Unit = js.native
    
    /**
      * 显示。
      */
    def show(): Unit = js.native
    
    /** 是否可见 */
    var visible: Boolean = js.native
  }
  
  trait BaseCfg extends StObject {
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object BaseCfg {
    
    inline def apply(): BaseCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseCfg] (val x: Self) extends AnyVal {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
