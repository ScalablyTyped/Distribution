package typings.antvGBase

import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.LooseObject
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphEventMod {
  
  @JSImport("@antv/g-base/lib/event/graph-event", JSImport.Default)
  @js.native
  class default protected () extends GraphEvent {
    def this(`type`: js.Any, event: js.Any) = this()
  }
  
  @js.native
  trait GraphEvent extends StObject {
    
    /**
      * 是否允许冒泡
      * @type {boolean}
      */
    var bubbles: Boolean = js.native
    
    /**
      * 窗口上的位置 x
      * @type {number}
      */
    var clientX: Double = js.native
    
    /**
      * 窗口上的位置 y
      * @type {number}
      */
    var clientY: Double = js.native
    
    /**
      * 监听对象
      * @type {object}
      */
    var currentTarget: LooseObject = js.native
    
    /**
      * 是否阻止了原生事件
      * @type {boolean}
      */
    var defaultPrevented: Boolean = js.native
    
    /**
      * 委托事件监听对象的代理对象，即 ev.delegateObject = ev.currentTarget.get('delegateObject')
      * @type {object}
      */
    var delegateObject: js.Object = js.native
    
    /**
      * 委托对象
      * @type {object}
      */
    var delegateTarget: LooseObject = js.native
    
    /**
      * 开始触发事件的图形
      * @type {IShape}
      */
    var fromShape: IShape = js.native
    
    /**
      * 事件名称
      * @type {string}
      */
    var name: String = js.native
    
    /**
      * 触发时的对象
      * @type {object}
      */
    var originalEvent: Event = js.native
    
    /**
      * 阻止浏览器默认的行为
      */
    def preventDefault(): Unit = js.native
    
    var propagationPath: js.Array[_] = js.native
    
    /**
      * 是否阻止传播（向上冒泡）
      * @type {boolean}
      */
    var propagationStopped: Boolean = js.native
    
    def restore(): Unit = js.native
    
    def save(): Unit = js.native
    
    /**
      * 触发事件的图形
      * @type {IShape}
      */
    var shape: IShape = js.native
    
    /**
      * 阻止冒泡
      */
    def stopPropagation(): Unit = js.native
    
    /**
      * 触发对象
      * @type {object}
      */
    var target: LooseObject = js.native
    
    /**
      * 触发时的时间
      * @type {number}
      */
    var timeStamp: Double = js.native
    
    /**
      * 事件结束时的触发图形
      * @type {IShape}
      */
    var toShape: IShape = js.native
    
    /**
      * 事件类型
      * @type {string}
      */
    var `type`: String = js.native
    
    /**
      * 画布上的位置 x
      * @type {number}
      */
    var x: Double = js.native
    
    /**
      * 画布上的位置 y
      * @type {number}
      */
    var y: Double = js.native
  }
  object GraphEvent {
    
    @scala.inline
    def apply(
      bubbles: Boolean,
      clientX: Double,
      clientY: Double,
      currentTarget: LooseObject,
      defaultPrevented: Boolean,
      delegateObject: js.Object,
      delegateTarget: LooseObject,
      fromShape: IShape,
      name: String,
      originalEvent: Event,
      preventDefault: () => Unit,
      propagationPath: js.Array[_],
      propagationStopped: Boolean,
      restore: () => Unit,
      save: () => Unit,
      shape: IShape,
      stopPropagation: () => Unit,
      target: LooseObject,
      timeStamp: Double,
      toShape: IShape,
      `type`: String,
      x: Double,
      y: Double
    ): GraphEvent = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], delegateObject = delegateObject.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], fromShape = fromShape.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), propagationPath = propagationPath.asInstanceOf[js.Any], propagationStopped = propagationStopped.asInstanceOf[js.Any], restore = js.Any.fromFunction0(restore), save = js.Any.fromFunction0(save), shape = shape.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toShape = toShape.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphEvent]
    }
    
    @scala.inline
    implicit class GraphEventMutableBuilder[Self <: GraphEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTarget(value: LooseObject): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateObject(value: js.Object): Self = StObject.set(x, "delegateObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateTarget(value: LooseObject): Self = StObject.set(x, "delegateTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromShape(value: IShape): Self = StObject.set(x, "fromShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPropagationPath(value: js.Array[_]): Self = StObject.set(x, "propagationPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropagationPathVarargs(value: js.Any*): Self = StObject.set(x, "propagationPath", js.Array(value :_*))
      
      @scala.inline
      def setPropagationStopped(value: Boolean): Self = StObject.set(x, "propagationStopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShape(value: IShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTarget(value: LooseObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToShape(value: IShape): Self = StObject.set(x, "toShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
