package typings.ahooks

import typings.ahooks.libUseAntdTableTypesMod.Data
import typings.ahooks.libUseAntdTableTypesMod.Params
import typings.ahooks.libUseAntdTableTypesMod.Service
import typings.ahooks.libUseFusionTableTypesMod.FusionTableOptions
import typings.ahooks.libUseFusionTableTypesMod.FusionTableResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseFusionTableMod {
  
  @JSImport("ahooks/lib/useFusionTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams]): FusionTableResult[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any]).asInstanceOf[FusionTableResult[TData, TParams]]
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams], options: FusionTableOptions[TData, TParams]): FusionTableResult[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FusionTableResult[TData, TParams]]
}
