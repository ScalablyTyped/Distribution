package typings.antvG2

import org.scalablytyped.runtime.Instantiable2
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionInteractionMod {
  
  @JSImport("@antv/g2/lib/interaction/interaction", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Interaction {
    def this(view: View, cfg: LooseObject) = this()
    
    /** 配置项 */
    /* protected */ /* CompleteClass */
    var cfg: LooseObject = js.native
    
    /**
      * 销毁事件
      */
    /* protected */ /* CompleteClass */
    override def clearEvents(): Unit = js.native
    
    /**
      * 销毁。
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * 初始化。
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /**
      * 绑定事件
      */
    /* protected */ /* CompleteClass */
    override def initEvents(): Unit = js.native
    
    /** view 或者 chart */
    /* protected */ /* CompleteClass */
    var view: View = js.native
  }
  
  trait Interaction extends StObject {
    
    /** 配置项 */
    /* protected */ var cfg: LooseObject
    
    /**
      * 销毁事件
      */
    /* protected */ def clearEvents(): Unit
    
    /**
      * 销毁。
      */
    def destroy(): Unit
    
    /**
      * 初始化。
      */
    def init(): Unit
    
    /**
      * 绑定事件
      */
    /* protected */ def initEvents(): Unit
    
    /** view 或者 chart */
    /* protected */ var view: View
  }
  object Interaction {
    
    inline def apply(
      cfg: LooseObject,
      clearEvents: () => Unit,
      destroy: () => Unit,
      init: () => Unit,
      initEvents: () => Unit,
      view: View
    ): Interaction = {
      val __obj = js.Dynamic.literal(cfg = cfg.asInstanceOf[js.Any], clearEvents = js.Any.fromFunction0(clearEvents), destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init), initEvents = js.Any.fromFunction0(initEvents), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interaction]
    }
    
    extension [Self <: Interaction](x: Self) {
      
      inline def setCfg(value: LooseObject): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setClearEvents(value: () => Unit): Self = StObject.set(x, "clearEvents", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInitEvents(value: () => Unit): Self = StObject.set(x, "initEvents", js.Any.fromFunction0(value))
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  type InteractionConstructor = Instantiable2[/* view */ View, /* cfg */ LooseObject, Interaction]
}
