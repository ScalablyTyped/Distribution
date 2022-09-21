package typings.ahooks

import typings.ahooks.typesMod.Data
import typings.ahooks.typesMod.Params
import typings.ahooks.typesMod.Service
import typings.ahooks.useFusionTableTypesMod.FusionTableOptions
import typings.ahooks.useFusionTableTypesMod.FusionTableResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFusionTableMod {
  
  @JSImport("ahooks/lib/useFusionTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams]): FusionTableResult[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any]).asInstanceOf[FusionTableResult[TData, TParams]]
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams], options: FusionTableOptions[TData, TParams]): FusionTableResult[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FusionTableResult[TData, TParams]]
}
