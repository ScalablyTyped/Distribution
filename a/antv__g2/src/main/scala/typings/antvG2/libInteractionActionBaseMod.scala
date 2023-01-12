package typings.antvG2

import typings.antvG2.libInterfaceMod.IAction
import typings.antvG2.libInterfaceMod.IInteractionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionBaseMod {
  
  /**
    * Action 的基类
    */
  /* note: abstract class */ @JSImport("@antv/g2/lib/interaction/action/base", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Action[T] {
    def this(context: IInteractionContext) = this()
    def this(context: IInteractionContext, cfg: T) = this()
    
    /**
      * 设置配置项传入的值
      * @param cfg
      */
    /* protected */ /* CompleteClass */
    override def applyCfg(cfg: Any): Unit = js.native
    
    /** Action 配置 */
    /* protected */ /* CompleteClass */
    var cfg: T = js.native
    
    /** 配置项的字段，自动负值到 this 上 */
    /* protected */ /* CompleteClass */
    var cfgFields: js.Array[String] = js.native
    
    /**
      * 上下文
      */
    /* CompleteClass */
    var context: IInteractionContext = js.native
    
    /**
      * 销毁函数
      */
    /* CompleteClass */
    override def destroy(): Any = js.native
    
    /**
      * 初始化
      */
    /* CompleteClass */
    override def init(): Any = js.native
    
    /**
      * 交互 action (反馈)的名称
      */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * Action 的基类
    */
  trait Action[T]
    extends StObject
       with IAction {
    
    /**
      * 设置配置项传入的值
      * @param cfg
      */
    /* protected */ def applyCfg(cfg: Any): Unit
    
    /** Action 配置 */
    /* protected */ var cfg: T
    
    /** 配置项的字段，自动负值到 this 上 */
    /* protected */ var cfgFields: js.Array[String]
  }
  object Action {
    
    inline def apply[T](
      applyCfg: Any => Unit,
      cfg: T,
      cfgFields: js.Array[String],
      context: IInteractionContext,
      destroy: () => Any,
      init: () => Any,
      name: String
    ): Action[T] = {
      val __obj = js.Dynamic.literal(applyCfg = js.Any.fromFunction1(applyCfg), cfg = cfg.asInstanceOf[js.Any], cfgFields = cfgFields.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action[?], T] (val x: Self & Action[T]) extends AnyVal {
      
      inline def setApplyCfg(value: Any => Unit): Self = StObject.set(x, "applyCfg", js.Any.fromFunction1(value))
      
      inline def setCfg(value: T): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setCfgFields(value: js.Array[String]): Self = StObject.set(x, "cfgFields", value.asInstanceOf[js.Any])
      
      inline def setCfgFieldsVarargs(value: String*): Self = StObject.set(x, "cfgFields", js.Array(value*))
    }
  }
}
