package typings.antvGLite

import typings.antvGLite.anon.PartialRendererConfig
import typings.antvGLite.distTypesMod.RendererConfig
import typings.manaSyringe.libCoreMod.Syringe.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAbstractRendererMod {
  
  @JSImport("@antv/g-lite/dist/AbstractRenderer", "AbstractRenderer")
  @js.native
  open class AbstractRenderer ()
    extends StObject
       with IRenderer {
    def this(config: PartialRendererConfig) = this()
    
    /* private */ var config: Any = js.native
    
    /* CompleteClass */
    override def getConfig(): RendererConfig = js.native
    
    /**
      * get plugin by name
      */
    /* CompleteClass */
    override def getPlugin(name: String): RendererPlugin = js.native
    
    /**
      * return all registered plugins
      */
    /* CompleteClass */
    override def getPlugins(): js.Array[RendererPlugin] = js.native
    
    /* private */ var plugins: Any = js.native
    
    /**
      * register plugin at runtime
      */
    /* CompleteClass */
    override def registerPlugin(plugin: RendererPlugin): Unit = js.native
    
    def setConfig(config: PartialRendererConfig): Unit = js.native
    
    /**
      * unregister plugin at runtime
      */
    /* CompleteClass */
    override def unregisterPlugin(plugin: RendererPlugin): Unit = js.native
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/AbstractRenderer", "AbstractRendererPlugin")
  @js.native
  open class AbstractRendererPlugin ()
    extends StObject
       with RendererPlugin {
    
    /* CompleteClass */
    var container: Container = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait IRenderer extends StObject {
    
    def getConfig(): RendererConfig
    
    /**
      * get plugin by name
      */
    def getPlugin(name: String): RendererPlugin
    
    /**
      * return all registered plugins
      */
    def getPlugins(): js.Array[RendererPlugin]
    
    /**
      * register plugin at runtime
      */
    def registerPlugin(plugin: RendererPlugin): Unit
    
    /**
      * unregister plugin at runtime
      */
    def unregisterPlugin(plugin: RendererPlugin): Unit
  }
  object IRenderer {
    
    inline def apply(
      getConfig: () => RendererConfig,
      getPlugin: String => RendererPlugin,
      getPlugins: () => js.Array[RendererPlugin],
      registerPlugin: RendererPlugin => Unit,
      unregisterPlugin: RendererPlugin => Unit
    ): IRenderer = {
      val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), getPlugin = js.Any.fromFunction1(getPlugin), getPlugins = js.Any.fromFunction0(getPlugins), registerPlugin = js.Any.fromFunction1(registerPlugin), unregisterPlugin = js.Any.fromFunction1(unregisterPlugin))
      __obj.asInstanceOf[IRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRenderer] (val x: Self) extends AnyVal {
      
      inline def setGetConfig(value: () => RendererConfig): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      inline def setGetPlugin(value: String => RendererPlugin): Self = StObject.set(x, "getPlugin", js.Any.fromFunction1(value))
      
      inline def setGetPlugins(value: () => js.Array[RendererPlugin]): Self = StObject.set(x, "getPlugins", js.Any.fromFunction0(value))
      
      inline def setRegisterPlugin(value: RendererPlugin => Unit): Self = StObject.set(x, "registerPlugin", js.Any.fromFunction1(value))
      
      inline def setUnregisterPlugin(value: RendererPlugin => Unit): Self = StObject.set(x, "unregisterPlugin", js.Any.fromFunction1(value))
    }
  }
  
  trait RendererPlugin extends StObject {
    
    var container: Container
    
    def destroy(): Unit
    
    def init(): Unit
    
    var name: String
  }
  object RendererPlugin {
    
    inline def apply(container: Container, destroy: () => Unit, init: () => Unit, name: String): RendererPlugin = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RendererPlugin] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
