package typings.apolloServerCore

import typings.apolloServerTypes.mod.AnyFunctionMap
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/utils/dispatcher", JSImport.Namespace)
@js.native
object dispatcherMod extends js.Object {
  @js.native
  class Dispatcher[T /* <: AnyFunctionMap */] protected () extends js.Object {
    def this(targets: js.Array[T]) = this()
    var callTargets: js.Any = js.native
    var targets: js.Array[T] = js.native
    def invokeDidStartHook[TMethodName /* <: /* keyof T */ String */, TEndHookArgs /* <: Args[
        ReturnType[
          AsFunction[
            /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
          ]
        ]
      ] */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
          /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
        ]
    ): DidEndHook[TEndHookArgs] = js.native
    def invokeHookAsync[TMethodName /* <: /* keyof T */ String */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
          /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
        ]
    ): js.Promise[
        js.Array[
          ReturnType[
            AsFunction[
              /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
            ]
          ]
        ]
      ] = js.native
    def invokeHookSync[TMethodName /* <: /* keyof T */ String */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
          /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
        ]
    ): js.Array[
        ReturnType[
          AsFunction[
            /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
          ]
        ]
      ] = js.native
    def invokeHooksUntilNonNull[TMethodName /* <: /* keyof T */ String */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
          /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
        ]
    ): js.Promise[
        (UnwrapPromise[
          ReturnType[
            AsFunction[
              /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
            ]
          ]
        ]) | Null
      ] = js.native
    def reverseInvokeHookSync[TMethodName /* <: /* keyof T */ String */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
          /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
        ]
    ): js.Array[
        ReturnType[
          AsFunction[
            /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
          ]
        ]
      ] = js.native
  }
  
  type Args[F] = js.Any
  type AsFunction[F] = F
  type DidEndHook[TArgs /* <: js.Array[_] */] = js.Function1[/* args */ TArgs, Unit]
  type UnwrapPromise[T] = T
}

