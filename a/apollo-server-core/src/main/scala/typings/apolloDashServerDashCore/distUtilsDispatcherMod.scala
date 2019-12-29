package typings.apolloDashServerDashCore

import typings.apolloDashServerDashPluginDashBase.apolloDashServerDashPluginDashBaseMod.GraphQLRequestListener
import typings.std.Record
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/utils/dispatcher", JSImport.Namespace)
@js.native
object distUtilsDispatcherMod extends js.Object {
  @js.native
  class Dispatcher[T /* <: GraphQLRequestListener[Record[String, _]] */] protected () extends js.Object {
    def this(targets: js.Array[T]) = this()
    var targets: js.Array[T] = js.native
    def invokeDidStartHook[TMethodName /* <: String */, TEndHookArgs /* <: Args[
        ReturnType[
          AsFunction[
            /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
          ]
        ]
      ] */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
          /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
        ]
    ): DidEndHook[TEndHookArgs] = js.native
    def invokeHookAsync[TMethodName /* <: String */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
          /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
        ]
    ): js.Promise[
        js.Array[
          UnwrapPromise[
            ReturnType[
              AsFunction[
                /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
              ]
            ]
          ]
        ]
      ] = js.native
    def invokeHooksUntilNonNull[TMethodName /* <: String */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
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
  }
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type Args[F] = js.Any
  type AsFunction[F] = F
  type DidEndHook[TArgs /* <: js.Array[_] */] = js.Function1[/* args */ TArgs, Unit]
  type UnwrapPromise[T] = T
}

