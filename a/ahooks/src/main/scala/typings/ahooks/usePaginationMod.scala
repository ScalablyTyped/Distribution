package typings.ahooks

import typings.ahooks.usePaginationTypesMod.Data
import typings.ahooks.usePaginationTypesMod.PaginationOptions
import typings.ahooks.usePaginationTypesMod.PaginationResult
import typings.ahooks.usePaginationTypesMod.Params
import typings.ahooks.usePaginationTypesMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePaginationMod {
  
  @JSImport("ahooks/lib/usePagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams]): PaginationResult[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any]).asInstanceOf[PaginationResult[TData, TParams]]
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams], options: PaginationOptions[TData, TParams]): PaginationResult[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PaginationResult[TData, TParams]]
}
