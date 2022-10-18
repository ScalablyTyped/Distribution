package typings.antvG2plot

import typings.antvG2plot.libTypesButtonMod.ButtonCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionsActionsResetButtonMod {
  
  @JSImport("@antv/g2plot/lib/interactions/actions/reset-button", "BUTTON_ACTION_CONFIG")
  @js.native
  val BUTTON_ACTION_CONFIG: ButtonCfg = js.native
  
  /**
    * @override 复写 G2 Button Action, 后续直接使用 GUI
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action * / any */ @JSImport("@antv/g2plot/lib/interactions/actions/reset-button", "ButtonAction")
  @js.native
  open class ButtonAction () extends StObject {
    
    /* private */ var buttonCfg: Any = js.native
    
    /* private */ var buttonGroup: Any = js.native
    
    /**
      * 销毁
      */
    def destroy(): Unit = js.native
    
    /* private */ var drawBackground: Any = js.native
    
    /**
      * 绘制 Button 和 文本
      */
    /* private */ var drawButton: Any = js.native
    
    /**
      * 绘制文本
      */
    /* private */ var drawText: Any = js.native
    
    /**
      * 获取 mix 默认的配置和用户配置
      */
    /* private */ var getButtonCfg: Any = js.native
    
    /**
      * 隐藏
      */
    def hide(): Unit = js.native
    
    /* private */ var resetPosition: Any = js.native
    
    /**
      * 显示
      */
    def show(): Unit = js.native
  }
}
