package typings.antvG2

import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.ActionCallback
import typings.antvG2.libInterfaceMod.IAction
import typings.antvG2.libInterfaceMod.IInteractionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionGrammarInteractionMod {
  
  @JSImport("@antv/g2/lib/interaction/grammar-interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2/lib/interaction/grammar-interaction", JSImport.Default)
  @js.native
  open class default protected () extends GrammarInteraction {
    def this(view: View, steps: InteractionSteps) = this()
  }
  
  inline def parseAction(actionStr: String, context: IInteractionContext): ActionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAction")(actionStr.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ActionObject]
  inline def parseAction(actionStr: String, context: IInteractionContext, arg: Any): ActionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAction")(actionStr.asInstanceOf[js.Any], context.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[ActionObject]
  
  /** 缓存 action 对象，仅用于当前文件 */
  trait ActionObject extends StObject {
    
    /**
      * 缓存的 action
      */
    var action: IAction
    
    /**
      * 用户传递的 action 方法的参数
      */
    var arg: js.UndefOr[Any] = js.undefined
    
    /**
      * action 的方法
      */
    var methodName: String
  }
  object ActionObject {
    
    inline def apply(action: IAction, methodName: String): ActionObject = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionObject] (val x: Self) extends AnyVal {
      
      inline def setAction(value: IAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setArg(value: Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DebounceOption extends StObject {
    
    /**
      * 是否马上执行
      */
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 等待时间
      */
    @JSName("wait")
    var wait_FDebounceOption: Double
  }
  object DebounceOption {
    
    inline def apply(wait_ : Double): DebounceOption = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebounceOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebounceOption] (val x: Self) extends AnyVal {
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GrammarInteraction
    extends typings.antvG2.libInteractionInteractionMod.default {
    
    /* private */ var afterExecute: Any = js.native
    
    /* private */ var bindEvent: Any = js.native
    
    /* private */ var callbackCaches: Any = js.native
    
    /**
      * 当前交互的上下文
      */
    var context: IInteractionContext = js.native
    
    /** 当前执行到的阶段 */
    var currentStepName: String = js.native
    
    /* private */ var emitCaches: Any = js.native
    
    /* private */ var enterStep: Any = js.native
    
    /* private */ var getActionCallback: Any = js.native
    
    /* private */ var getKey: Any = js.native
    
    /* private */ var initContext: Any = js.native
    
    /* private */ var isAllowExecute: Any = js.native
    
    /* private */ var isAllowStep: Any = js.native
    
    /* private */ var offEvent: Any = js.native
    
    /* private */ var steps: Any = js.native
  }
  
  trait InteractionStep extends StObject {
    
    /**
      * 反馈，支持三种方式：
      * - action:method : action 的名字和方法的组合
      * - [’action1:method1‘, ’action2:method‘]
      * - ActionCallback: 回调函数
      */
    var action: String | js.Array[String] | ActionCallback
    
    /**
      * @private
      * 不需要用户传入，通过上面的属性计算出来的属性
      */
    var actionObject: js.UndefOr[ActionObject | js.Array[ActionObject]] = js.undefined
    
    /**
      * 反馈，具体 action method 的参数：
      * - 当传递多个 action 时，args 必须是一个数组
      */
    var arg: js.UndefOr[Any | js.Array[Any]] = js.undefined
    
    /**
      * 回调函数，action 执行后执行
      */
    var callback: js.UndefOr[js.Function1[/* context */ IInteractionContext, Unit]] = js.undefined
    
    /**
      * 是否延迟
      */
    var debounce: js.UndefOr[DebounceOption] = js.undefined
    
    /**
      * 是否可以触发 action
      * @param context - 交互的上下文
      */
    var isEnable: js.UndefOr[js.Function1[/* context */ IInteractionContext, Boolean]] = js.undefined
    
    /**
      * 在一个环节内是否只允许执行一次
      */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 是否增加节流
      */
    var throttle: js.UndefOr[ThrottleOption] = js.undefined
    
    /**
      * 触发事件，支持 view，chart 的各种事件，也支持 document、window 的事件
      */
    var trigger: String
  }
  object InteractionStep {
    
    inline def apply(action: String | js.Array[String] | ActionCallback, trigger: String): InteractionStep = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionStep]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractionStep] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String | js.Array[String] | ActionCallback): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionFunction1(value: /* context */ IInteractionContext => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionObject(value: ActionObject | js.Array[ActionObject]): Self = StObject.set(x, "actionObject", value.asInstanceOf[js.Any])
      
      inline def setActionObjectUndefined: Self = StObject.set(x, "actionObject", js.undefined)
      
      inline def setActionObjectVarargs(value: ActionObject*): Self = StObject.set(x, "actionObject", js.Array(value*))
      
      inline def setActionVarargs(value: String*): Self = StObject.set(x, "action", js.Array(value*))
      
      inline def setArg(value: Any | js.Array[Any]): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
      
      inline def setArgVarargs(value: Any*): Self = StObject.set(x, "arg", js.Array(value*))
      
      inline def setCallback(value: /* context */ IInteractionContext => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDebounce(value: DebounceOption): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setIsEnable(value: /* context */ IInteractionContext => Boolean): Self = StObject.set(x, "isEnable", js.Any.fromFunction1(value))
      
      inline def setIsEnableUndefined: Self = StObject.set(x, "isEnable", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setThrottle(value: ThrottleOption): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractionSteps extends StObject {
    
    /**
      * 交互结束
      */
    var end: js.UndefOr[js.Array[InteractionStep]] = js.undefined
    
    /**
      * 交互持续
      */
    var processing: js.UndefOr[js.Array[InteractionStep]] = js.undefined
    
    /**
      * 交互回滚
      */
    var rollback: js.UndefOr[js.Array[InteractionStep]] = js.undefined
    
    /**
      * 显示交互可以进行
      */
    var showEnable: js.UndefOr[js.Array[InteractionStep]] = js.undefined
    
    /**
      * 交互开始
      */
    var start: js.UndefOr[js.Array[InteractionStep]] = js.undefined
  }
  object InteractionSteps {
    
    inline def apply(): InteractionSteps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionSteps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractionSteps] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: js.Array[InteractionStep]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: InteractionStep*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setProcessing(value: js.Array[InteractionStep]): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
      
      inline def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
      
      inline def setProcessingVarargs(value: InteractionStep*): Self = StObject.set(x, "processing", js.Array(value*))
      
      inline def setRollback(value: js.Array[InteractionStep]): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
      
      inline def setRollbackUndefined: Self = StObject.set(x, "rollback", js.undefined)
      
      inline def setRollbackVarargs(value: InteractionStep*): Self = StObject.set(x, "rollback", js.Array(value*))
      
      inline def setShowEnable(value: js.Array[InteractionStep]): Self = StObject.set(x, "showEnable", value.asInstanceOf[js.Any])
      
      inline def setShowEnableUndefined: Self = StObject.set(x, "showEnable", js.undefined)
      
      inline def setShowEnableVarargs(value: InteractionStep*): Self = StObject.set(x, "showEnable", js.Array(value*))
      
      inline def setStart(value: js.Array[InteractionStep]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStartVarargs(value: InteractionStep*): Self = StObject.set(x, "start", js.Array(value*))
    }
  }
  
  trait ThrottleOption extends StObject {
    
    /**
      * 马上就执行
      */
    var leading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 执行完毕后再执行一次
      */
    var trailing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 等待时间
      */
    @JSName("wait")
    var wait_FThrottleOption: Double
  }
  object ThrottleOption {
    
    inline def apply(wait_ : Double): ThrottleOption = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThrottleOption] (val x: Self) extends AnyVal {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    }
  }
}
