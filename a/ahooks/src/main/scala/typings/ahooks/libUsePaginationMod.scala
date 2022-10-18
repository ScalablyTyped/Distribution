package typings.ahooks

import typings.ahooks.libUsePaginationTypesMod.Data
import typings.ahooks.libUsePaginationTypesMod.PaginationOptions
import typings.ahooks.libUsePaginationTypesMod.PaginationResult
import typings.ahooks.libUsePaginationTypesMod.Params
import typings.ahooks.libUsePaginationTypesMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUsePaginationMod {
  
  @JSImport("ahooks/lib/usePagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams]): PaginationResult[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any]).asInstanceOf[PaginationResult[TData, TParams]]
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams], options: PaginationOptions[TData, TParams]): PaginationResult[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PaginationResult[TData, TParams]]
}
