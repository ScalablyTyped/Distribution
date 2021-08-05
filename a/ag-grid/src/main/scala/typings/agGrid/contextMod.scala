package typings.agGrid

import org.scalablytyped.runtime.Instantiable0
import typings.agGrid.componentMod.Component
import typings.agGrid.iLoggerMod.ILogger
import typings.std.Element
import typings.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("ag-grid/dist/lib/context/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Autowired(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Autowired")().asInstanceOf[js.Function]
  inline def Autowired(name: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Autowired")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def Bean(beanName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Bean")(beanName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @JSImport("ag-grid/dist/lib/context/context", "Context")
  @js.native
  class Context protected () extends StObject {
    def this(params: ContextParams, logger: ILogger) = this()
    
    /* private */ def addComponent(componentMeta: js.Any): js.Any = js.native
    
    /* private */ def autoWireBean(bean: js.Any): js.Any = js.native
    
    /* private */ def autoWireBeans(beans: js.Any): js.Any = js.native
    
    /* private */ var beans: js.Any = js.native
    
    /* private */ var componentsMappedByName: js.Any = js.native
    
    /* private */ var contextParams: js.Any = js.native
    
    /* private */ def createBeanEntry(Bean: js.Any): js.Any = js.native
    
    /* private */ def createBeans(): js.Any = js.native
    
    def createComponent(element: Element): Component = js.native
    def createComponent(element: Element, afterPreCreateCallback: js.Function1[/* comp */ Component, Unit]): Component = js.native
    
    def destroy(): Unit = js.native
    
    /* private */ var destroyed: js.Any = js.native
    
    def getBean(name: String): js.Any = js.native
    
    /* private */ def getBeanName(constructor: js.Any): js.Any = js.native
    
    /* private */ def getBeansForParameters(parameters: js.Any, beanName: js.Any): js.Any = js.native
    
    /* private */ var logger: js.Any = js.native
    
    /* private */ def lookupBeanInstance(wiringBean: js.Any, beanName: js.Any, optional: js.Any): js.Any = js.native
    
    /* private */ def methodWireBean(bean: js.Any): js.Any = js.native
    
    /* private */ def methodWireBeans(beans: js.Any): js.Any = js.native
    
    /* private */ def postConstruct(beans: js.Any): js.Any = js.native
    
    /* private */ def preConstruct(beans: js.Any): js.Any = js.native
    
    /* private */ def setupComponents(): js.Any = js.native
    
    def wireBean(bean: js.Any): Unit = js.native
    def wireBean(bean: js.Any, afterPreCreateCallback: js.Function1[/* comp */ Component, Unit]): Unit = js.native
    
    /* private */ def wireBeans(beans: js.Any, afterPreCreateCallback: js.Any): js.Any = js.native
  }
  
  inline def Optional(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")().asInstanceOf[js.Function]
  inline def Optional(name: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def PostConstruct(target: js.Object, methodName: String, descriptor: TypedPropertyDescriptor[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PostConstruct")(target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def PreConstruct(target: js.Object, methodName: String, descriptor: TypedPropertyDescriptor[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PreConstruct")(target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def PreDestroy(target: js.Object, methodName: String, descriptor: TypedPropertyDescriptor[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PreDestroy")(target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def Qualifier(name: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Qualifier")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  trait ComponentMeta extends StObject {
    
    var componentName: String
    
    var theClass: Instantiable0[js.Object]
  }
  object ComponentMeta {
    
    inline def apply(componentName: String, theClass: Instantiable0[js.Object]): ComponentMeta = {
      val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], theClass = theClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentMeta]
    }
    
    extension [Self <: ComponentMeta](x: Self) {
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setTheClass(value: Instantiable0[js.Object]): Self = StObject.set(x, "theClass", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextParams extends StObject {
    
    var beans: js.Array[js.Any]
    
    var components: js.Array[ComponentMeta]
    
    var debug: Boolean
    
    var overrideBeans: js.Array[js.Any]
    
    var seed: js.Any
  }
  object ContextParams {
    
    inline def apply(
      beans: js.Array[js.Any],
      components: js.Array[ComponentMeta],
      debug: Boolean,
      overrideBeans: js.Array[js.Any],
      seed: js.Any
    ): ContextParams = {
      val __obj = js.Dynamic.literal(beans = beans.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], overrideBeans = overrideBeans.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextParams]
    }
    
    extension [Self <: ContextParams](x: Self) {
      
      inline def setBeans(value: js.Array[js.Any]): Self = StObject.set(x, "beans", value.asInstanceOf[js.Any])
      
      inline def setBeansVarargs(value: js.Any*): Self = StObject.set(x, "beans", js.Array(value :_*))
      
      inline def setComponents(value: js.Array[ComponentMeta]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsVarargs(value: ComponentMeta*): Self = StObject.set(x, "components", js.Array(value :_*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setOverrideBeans(value: js.Array[js.Any]): Self = StObject.set(x, "overrideBeans", value.asInstanceOf[js.Any])
      
      inline def setOverrideBeansVarargs(value: js.Any*): Self = StObject.set(x, "overrideBeans", js.Array(value :_*))
      
      inline def setSeed(value: js.Any): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    }
  }
}
