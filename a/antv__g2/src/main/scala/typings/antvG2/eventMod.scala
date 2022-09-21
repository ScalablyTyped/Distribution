package typings.antvG2

import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.viewMod.View
import typings.antvGBase.interfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("@antv/g2/lib/chart/event", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Event {
    def this(view: View, gEvent: typings.antvG2.dependentsMod.Event) = this()
    def this(view: View, gEvent: typings.antvG2.dependentsMod.Event, data: Datum) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@antv/g2/lib/chart/event", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 非交互产生的事件
      * @param view
      * @param type
      * @param data
      */
    inline def fromData(view: View, `type`: String, data: Datum): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(view.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Event]
  }
  
  @js.native
  trait Event extends StObject {
    
    /** x 窗口坐标 */
    def clientX: Double = js.native
    
    /** y 窗口坐标 */
    def clientY: Double = js.native
    
    /** 原始数据 */
    var data: js.UndefOr[Datum] = js.native
    
    /** 获取对应的 dom 原生时间 */
    def event: Any = js.native
    
    /** 被包装的原生 G 事件 */
    var gEvent: typings.antvG2.dependentsMod.Event = js.native
    
    /** the real trigger shape of the event */
    def target: IShape = js.native
    
    /** 事件类型 */
    var `type`: String = js.native
    
    /** 当前 target 归属的 view 实例 */
    var view: View = js.native
    
    /** x 画布坐标 */
    def x: Double = js.native
    
    /** y 画布坐标 */
    def y: Double = js.native
  }
}
