package typings.antvGBase.graphEventMod

import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.LooseObject
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphEvent extends js.Object {
  
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
  implicit class GraphEventOps[Self <: GraphEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: LooseObject): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = this.set("defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateObject(value: js.Object): Self = this.set("delegateObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateTarget(value: LooseObject): Self = this.set("delegateTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromShape(value: IShape): Self = this.set("fromShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPropagationPathVarargs(value: js.Any*): Self = this.set("propagationPath", js.Array(value :_*))
    
    @scala.inline
    def setPropagationPath(value: js.Array[_]): Self = this.set("propagationPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagationStopped(value: Boolean): Self = this.set("propagationStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestore(value: () => Unit): Self = this.set("restore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShape(value: IShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: LooseObject): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToShape(value: IShape): Self = this.set("toShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
