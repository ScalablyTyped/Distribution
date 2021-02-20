package typings.anyPromise

import org.scalablytyped.runtime.Instantiable1
import typings.anyPromise.anon.TypeofPromise
import typings.anyPromise.mod.Thenable
import typings.anyPromise.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @JSImport("any-promise/register", JSImport.Namespace)
  @js.native
  def apply(): Register = js.native
  @JSImport("any-promise/register", JSImport.Namespace)
  @js.native
  def apply(module: js.UndefOr[scala.Nothing], options: Options): Register = js.native
  @JSImport("any-promise/register", JSImport.Namespace)
  @js.native
  def apply(module: String): Register = js.native
  @JSImport("any-promise/register", JSImport.Namespace)
  @js.native
  def apply(module: String, options: Options): Register = js.native
  
  @js.native
  trait Options extends StObject {
    
    var Promise: js.UndefOr[
        TypeofPromise with (Instantiable1[
          /* callback */ js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[
                (/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any) | (Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any])
              ], 
              Unit
            ], 
            /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          ^[js.Object]
        ])
      ] = js.native
    
    var global: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setPromise(
        value: TypeofPromise with (Instantiable1[
              /* callback */ js.Function2[
                /* resolve */ js.Function1[
                  /* value */ js.UndefOr[
                    (/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any) | (Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any])
                  ], 
                  Unit
                ], 
                /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
                Unit
              ], 
              ^[js.Object]
            ])
      ): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    }
  }
  
  @js.native
  trait Register extends StObject {
    
    var Promise: TypeofPromise with (Instantiable1[
        /* callback */ js.Function2[
          /* resolve */ js.Function1[
            /* value */ js.UndefOr[
              (/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any) | (Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any])
            ], 
            Unit
          ], 
          /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
          Unit
        ], 
        ^[js.Object]
      ]) = js.native
    
    var implementation: String = js.native
  }
  object Register {
    
    @scala.inline
    def apply(
      Promise: TypeofPromise with (Instantiable1[
          /* callback */ js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[
                (/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any) | (Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any])
              ], 
              Unit
            ], 
            /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          ^[js.Object]
        ]),
      implementation: String
    ): Register = {
      val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Register]
    }
    
    @scala.inline
    implicit class RegisterMutableBuilder[Self <: Register] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImplementation(value: String): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromise(
        value: TypeofPromise with (Instantiable1[
              /* callback */ js.Function2[
                /* resolve */ js.Function1[
                  /* value */ js.UndefOr[
                    (/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any) | (Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any])
                  ], 
                  Unit
                ], 
                /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
                Unit
              ], 
              ^[js.Object]
            ])
      ): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    }
  }
}
