package typings.antvGLite

import typings.antvGLite.antvGLiteBooleans.`false`
import typings.antvGLite.antvGLiteBooleans.`true`
import typings.antvGLite.antvGLiteStrings.async
import typings.antvGLite.antvGLiteStrings.call
import typings.antvGLite.antvGLiteStrings.callAsync
import typings.antvGLite.antvGLiteStrings.promise
import typings.antvGLite.antvGLiteStrings.sync
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsTapableHookMod {
  
  @JSImport("@antv/g-lite/dist/utils/tapable/Hook", "Hook")
  @js.native
  open class Hook[T, R, AdditionalOptions] () extends StObject {
    def this(args: js.Array[Any]) = this()
    def this(args: js.Array[Any], name: Any) = this()
    def this(args: Unit, name: Any) = this()
    
    def _createCall(`type`: Any): Unit = js.native
    
    def _insert(item: Any): Unit = js.native
    
    /* private */ var _promise: Any = js.native
    
    def _resetCompilation(): Unit = js.native
    
    def _runRegisterInterceptors(options: Any): Any = js.native
    
    def _tap(
      `type`: String,
      options: Tap & IfSet[AdditionalOptions],
      fn: js.Function1[/* args */ AsArray[T], R]
    ): Unit = js.native
    def _tap(`type`: String, options: String, fn: js.Function1[/* args */ AsArray[T], R]): Unit = js.native
    
    def call(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AsArray<T> is not an array type */ args: AsArray[T]
    ): R = js.native
    
    def callAsync(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Append<AsArray<T>, Callback<Error, R>> is not an array type */ args: Append[AsArray[T], Callback[js.Error, R]]
    ): Unit = js.native
    
    def compile(options: Any): Unit = js.native
    
    def isUsed(): Boolean = js.native
    
    var name: js.UndefOr[String] = js.native
    
    def promise(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AsArray<T> is not an array type */ args: AsArray[T]
    ): js.Promise[R] = js.native
    
    def tap(options: Tap & IfSet[AdditionalOptions], fn: js.Function1[/* args */ AsArray[T], R]): Unit = js.native
    def tap(options: String, fn: js.Function1[/* args */ AsArray[T], R]): Unit = js.native
    
    def tapAsync(
      options: Tap & IfSet[AdditionalOptions],
      fn: js.Function1[/* args */ Append[AsArray[T], InnerCallback[js.Error, R]], Unit]
    ): Unit = js.native
    def tapAsync(options: String, fn: js.Function1[/* args */ Append[AsArray[T], InnerCallback[js.Error, R]], Unit]): Unit = js.native
    
    def tapPromise(options: Tap & IfSet[AdditionalOptions], fn: js.Function1[/* args */ AsArray[T], js.Promise[R]]): Unit = js.native
    def tapPromise(options: String, fn: js.Function1[/* args */ AsArray[T], js.Promise[R]]): Unit = js.native
    
    var taps: js.Array[FullTap] = js.native
    
    def withOptions(options: TapOptions & IfSet[AdditionalOptions]): Omit[this.type, call | callAsync | promise] = js.native
  }
  
  @JSImport("@antv/g-lite/dist/utils/tapable/Hook", "UnsetAdditionalOptions")
  @js.native
  open class UnsetAdditionalOptions () extends StObject {
    
    var _UnsetAdditionalOptions: `true` = js.native
  }
  
  type Append[T /* <: js.Array[Any] */, U] = /* import warning: importer.ImportType#apply Failed type conversion: @antv/g-lite.anon.0<U, T>[@antv/g-lite.@antv/g-lite/dist/utils/tapable/Hook.Measure<T['length']>] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<any> ? T : [T]
    }}}
    */
  type AsArray[T] = T
  
  type Callback[E, T] = js.Function2[/* error */ E | Null, /* result */ js.UndefOr[T], Unit]
  
  trait FullTap
    extends StObject
       with Tap {
    
    var fn: js.Function
    
    var `type`: sync | async | promise
  }
  object FullTap {
    
    inline def apply(fn: js.Function, name: String, `type`: sync | async | promise): FullTap = {
      val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullTap]
    }
    
    extension [Self <: FullTap](x: Self) {
      
      inline def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setType(value: sync | async | promise): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    X extends @antv/g-lite.@antv/g-lite/dist/utils/tapable/Hook.UnsetAdditionalOptions ? {} : X
    }}}
    */
  type IfSet[X] = X
  
  type InnerCallback[E, T] = js.Function2[/* error */ js.UndefOr[E | Null | `false`], /* result */ js.UndefOr[T], Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 ? T : never
    }}}
    */
  type Measure[T /* <: Double */] = T
  
  trait Tap
    extends StObject
       with TapOptions {
    
    var name: String
  }
  object Tap {
    
    inline def apply(name: String): Tap = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tap]
    }
    
    extension [Self <: Tap](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TapOptions extends StObject {
    
    var before: js.UndefOr[String] = js.undefined
    
    var stage: js.UndefOr[Double] = js.undefined
  }
  object TapOptions {
    
    inline def apply(): TapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TapOptions]
    }
    
    extension [Self <: TapOptions](x: Self) {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setStage(value: Double): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    }
  }
}
