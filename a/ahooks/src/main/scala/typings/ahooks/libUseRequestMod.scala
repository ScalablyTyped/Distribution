package typings.ahooks

import typings.ahooks.libUseRequestSrcTypesMod.Options
import typings.ahooks.libUseRequestSrcTypesMod.Plugin
import typings.ahooks.libUseRequestSrcTypesMod.Result
import typings.ahooks.libUseRequestSrcTypesMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseRequestMod {
  
  @JSImport("ahooks/lib/useRequest", JSImport.Namespace)
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
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  inline def clearCache(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clearCache(key: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
