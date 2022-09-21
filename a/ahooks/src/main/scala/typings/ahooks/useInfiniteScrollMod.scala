package typings.ahooks

import typings.ahooks.anon.LoadMore
import typings.ahooks.useInfiniteScrollTypesMod.Data
import typings.ahooks.useInfiniteScrollTypesMod.InfiniteScrollOptions
import typings.ahooks.useInfiniteScrollTypesMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useInfiniteScrollMod {
  
  @JSImport("ahooks/lib/useInfiniteScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TData /* <: Data */](service: Service[TData]): LoadMore[TData] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any]).asInstanceOf[LoadMore[TData]]
  inline def default[TData /* <: Data */](service: Service[TData], options: InfiniteScrollOptions[TData]): LoadMore[TData] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LoadMore[TData]]
}
