package typings.agGrid

import typings.agGrid.anon.InstantiableAny
import typings.agGrid.iComponentMod.IComponent
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameworkComponentWrapperMod {
  
  @JSImport("ag-grid/dist/lib/components/framework/frameworkComponentWrapper", "BaseComponentWrapper")
  @js.native
  abstract class BaseComponentWrapper[F /* <: WrapableInterface */] () extends FrameworkComponentWrapper {
    
    /* private */ def createMethod(wrapper: js.Any, methodName: js.Any, mandatory: js.Any): js.Any = js.native
    
    /* private */ def createMethodProxy(wrapper: js.Any, methodName: js.Any, mandatory: js.Any): js.Any = js.native
    
    def createWrapper(OriginalConstructor: InstantiableAny): F = js.native
    def createWrapper(OriginalConstructor: InstantiableAny, componentName: String): F = js.native
  }
  
  @js.native
  trait FrameworkComponentWrapper extends StObject {
    
    def wrap[A /* <: IComponent[_] */](frameworkComponent: InstantiableAny, methodList: js.Array[String]): A = js.native
    def wrap[A /* <: IComponent[_] */](
      frameworkComponent: InstantiableAny,
      methodList: js.Array[String],
      optionalMethodList: js.UndefOr[scala.Nothing],
      componentName: String
    ): A = js.native
    def wrap[A /* <: IComponent[_] */](
      frameworkComponent: InstantiableAny,
      methodList: js.Array[String],
      optionalMethodList: js.Array[String]
    ): A = js.native
    def wrap[A /* <: IComponent[_] */](
      frameworkComponent: InstantiableAny,
      methodList: js.Array[String],
      optionalMethodList: js.Array[String],
      componentName: String
    ): A = js.native
  }
  
  @js.native
  trait WrapableInterface extends StObject {
    
    def addMethod(name: String, callback: js.Function): Unit = js.native
    
    def callMethod(name: String, args: IArguments): Unit = js.native
    
    def hasMethod(name: String): Boolean = js.native
  }
  object WrapableInterface {
    
    @scala.inline
    def apply(
      addMethod: (String, js.Function) => Unit,
      callMethod: (String, IArguments) => Unit,
      hasMethod: String => Boolean
    ): WrapableInterface = {
      val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction2(addMethod), callMethod = js.Any.fromFunction2(callMethod), hasMethod = js.Any.fromFunction1(hasMethod))
      __obj.asInstanceOf[WrapableInterface]
    }
    
    @scala.inline
    implicit class WrapableInterfaceMutableBuilder[Self <: WrapableInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddMethod(value: (String, js.Function) => Unit): Self = StObject.set(x, "addMethod", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallMethod(value: (String, IArguments) => Unit): Self = StObject.set(x, "callMethod", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHasMethod(value: String => Boolean): Self = StObject.set(x, "hasMethod", js.Any.fromFunction1(value))
    }
  }
}
