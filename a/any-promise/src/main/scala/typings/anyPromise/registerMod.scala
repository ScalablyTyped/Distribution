package typings.anyPromise

import org.scalablytyped.runtime.Instantiable1
import typings.anyPromise.anon.TypeofPromise
import typings.anyPromise.mod.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  inline def apply(): Register = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Register]
  inline def apply(module: String): Register = ^.asInstanceOf[js.Dynamic].apply(module.asInstanceOf[js.Any]).asInstanceOf[Register]
  inline def apply(module: String, options: Options): Register = (^.asInstanceOf[js.Dynamic].apply(module.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Register]
  inline def apply(module: Unit, options: Options): Register = (^.asInstanceOf[js.Dynamic].apply(module.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Register]
  
  @JSImport("any-promise/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var Promise: js.UndefOr[
        TypeofPromise & (Instantiable1[
          /* callback */ js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[
                (/* import warning: RewrittenClass.unapply cls was tparam R */ Any) | (Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any])
              ], 
              Unit
            ], 
            /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
            Unit
          ], 
          typings.anyPromise.mod.^[js.Object]
        ])
      ] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setPromise(
        value: TypeofPromise & (Instantiable1[
              /* callback */ js.Function2[
                /* resolve */ js.Function1[
                  /* value */ js.UndefOr[
                    (/* import warning: RewrittenClass.unapply cls was tparam R */ Any) | (Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any])
                  ], 
                  Unit
                ], 
                /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
                Unit
              ], 
              typings.anyPromise.mod.^[js.Object]
            ])
      ): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    }
  }
  
  trait Register extends StObject {
    
    var Promise: TypeofPromise & (Instantiable1[
        /* callback */ js.Function2[
          /* resolve */ js.Function1[
            /* value */ js.UndefOr[
              (/* import warning: RewrittenClass.unapply cls was tparam R */ Any) | (Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any])
            ], 
            Unit
          ], 
          /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
          Unit
        ], 
        typings.anyPromise.mod.^[js.Object]
      ])
    
    var implementation: String
  }
  object Register {
    
    inline def apply(
      Promise: TypeofPromise & (Instantiable1[
          /* callback */ js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[
                (/* import warning: RewrittenClass.unapply cls was tparam R */ Any) | (Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any])
              ], 
              Unit
            ], 
            /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
            Unit
          ], 
          typings.anyPromise.mod.^[js.Object]
        ]),
      implementation: String
    ): Register = {
      val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Register]
    }
    
    extension [Self <: Register](x: Self) {
      
      inline def setImplementation(value: String): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setPromise(
        value: TypeofPromise & (Instantiable1[
              /* callback */ js.Function2[
                /* resolve */ js.Function1[
                  /* value */ js.UndefOr[
                    (/* import warning: RewrittenClass.unapply cls was tparam R */ Any) | (Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ Any])
                  ], 
                  Unit
                ], 
                /* reject */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
                Unit
              ], 
              typings.anyPromise.mod.^[js.Object]
            ])
      ): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    }
  }
}
