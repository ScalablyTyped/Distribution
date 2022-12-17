package typings.aureliaDependencyInjection

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.aureliaDependencyInjection.mod.Args
import typings.aureliaDependencyInjection.mod.Container
import typings.aureliaDependencyInjection.mod.ContainerConfiguration
import typings.aureliaDependencyInjection.mod.Impl
import typings.aureliaDependencyInjection.mod.PrimitiveOrDependencyCtor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] extends StObject {
    
    def get(container: Container, key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): TImpl
  }
  object `0` {
    
    inline def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](get: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): `0`[TBase, TImpl, TArgs] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[`0`[TBase, TImpl, TArgs]]
    }
    
    extension [Self <: `0`[?, ?, ?], TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](x: Self & (`0`[TBase, TImpl, TArgs])) {
      
      inline def setGet(value: (Container, PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) => TImpl): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
  
  trait `1` extends StObject {
    
    var inject: js.UndefOr[Any] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setInject(value: Any): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
    }
  }
  
  trait Decorates extends StObject {
    
    var decorates: js.UndefOr[
        js.Function1[/* key */ Any, /* is aurelia-dependency-injection.anon.Get */ Boolean]
      ] = js.undefined
  }
  object Decorates {
    
    inline def apply(): Decorates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Decorates]
    }
    
    extension [Self <: Decorates](x: Self) {
      
      inline def setDecorates(value: /* key */ Any => /* is aurelia-dependency-injection.anon.Get */ Boolean): Self = StObject.set(x, "decorates", js.Any.fromFunction1(value))
      
      inline def setDecoratesUndefined: Self = StObject.set(x, "decorates", js.undefined)
    }
  }
  
  trait Get extends StObject {
    
    def get(container: Container, key: Any): Any
  }
  object Get {
    
    inline def apply(get: (Container, Any) => Any): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[Get]
    }
    
    extension [Self <: Get](x: Self) {
      
      inline def setGet(value: (Container, Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
  
  trait Inject[TArgs /* <: Args[TBase] */, TBase] extends StObject {
    
    var inject: js.UndefOr[
        js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
        ]
      ] = js.undefined
  }
  object Inject {
    
    inline def apply[TArgs /* <: Args[TBase] */, TBase](): Inject[TArgs, TBase] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inject[TArgs, TBase]]
    }
    
    extension [Self <: Inject[?, ?], TArgs /* <: Args[TBase] */, TBase](x: Self & (Inject[TArgs, TBase])) {
      
      inline def setInject(
        value: js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any
            ]
      ): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setInjectVarargs(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TArgs[number] */ js.Any)*
      ): Self = StObject.set(x, "inject", js.Array(value*))
    }
  }
  
  @js.native
  trait TypeofContainer
    extends StObject
       with Instantiable0[Container]
       with Instantiable1[/* configuration */ ContainerConfiguration, Container] {
    
    var instance: Container = js.native
  }
}
