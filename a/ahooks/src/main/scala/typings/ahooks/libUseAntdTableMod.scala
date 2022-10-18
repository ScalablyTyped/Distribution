package typings.ahooks

import typings.ahooks.libUseAntdTableTypesMod.AntdTableOptions
import typings.ahooks.libUseAntdTableTypesMod.AntdTableResult
import typings.ahooks.libUseAntdTableTypesMod.Data
import typings.ahooks.libUseAntdTableTypesMod.Params
import typings.ahooks.libUseAntdTableTypesMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseAntdTableMod {
  
  @JSImport("ahooks/lib/useAntdTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams]): AntdTableResult[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any]).asInstanceOf[AntdTableResult[TData, TParams]]
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams], options: AntdTableOptions[TData, TParams]): AntdTableResult[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AntdTableResult[TData, TParams]]
}
