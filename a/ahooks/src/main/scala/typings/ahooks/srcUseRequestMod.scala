package typings.ahooks

import typings.ahooks.srcTypesMod.Options
import typings.ahooks.srcTypesMod.Plugin
import typings.ahooks.srcTypesMod.Result
import typings.ahooks.srcTypesMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUseRequestMod {
  
  @JSImport("ahooks/lib/useRequest/src/useRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TData, TParams /* <: js.Array[Any] */](service: Service[TData, TParams]): Result[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any]).asInstanceOf[Result[TData, TParams]]
  inline def default[TData, TParams /* <: js.Array[Any] */](service: Service[TData, TParams], options: Unit, plugins: js.Array[Plugin[TData, TParams]]): Result[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Result[TData, TParams]]
  inline def default[TData, TParams /* <: js.Array[Any] */](service: Service[TData, TParams], options: Options[TData, TParams]): Result[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result[TData, TParams]]
  inline def default[TData, TParams /* <: js.Array[Any] */](
    service: Service[TData, TParams],
    options: Options[TData, TParams],
    plugins: js.Array[Plugin[TData, TParams]]
  ): Result[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Result[TData, TParams]]
}
