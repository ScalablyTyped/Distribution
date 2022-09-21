package typings.antd

import typings.antd.antdBooleans.`false`
import typings.antd.tableInterfaceMod.TablePaginationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePaginationMod {
  
  @JSImport("antd/lib/table/hooks/usePagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    total: Double,
    pagination: Unit,
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit]
  ): js.Tuple2[TablePaginationConfig, js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(total.asInstanceOf[js.Any], pagination.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TablePaginationConfig, js.Function0[Unit]]]
  inline def default(
    total: Double,
    pagination: TablePaginationConfig,
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit]
  ): js.Tuple2[TablePaginationConfig, js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(total.asInstanceOf[js.Any], pagination.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TablePaginationConfig, js.Function0[Unit]]]
  
  @JSImport("antd/lib/table/hooks/usePagination", "DEFAULT_PAGE_SIZE")
  @js.native
  val DEFAULT_PAGE_SIZE: /* 10 */ Double = js.native
  
  inline def default_false(
    total: Double,
    pagination: `false`,
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit]
  ): js.Tuple2[TablePaginationConfig, js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(total.asInstanceOf[js.Any], pagination.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TablePaginationConfig, js.Function0[Unit]]]
  
  inline def getPaginationParam(pagination: Boolean, mergedPagination: TablePaginationConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationParam")(pagination.asInstanceOf[js.Any], mergedPagination.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPaginationParam(pagination: Unit, mergedPagination: TablePaginationConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationParam")(pagination.asInstanceOf[js.Any], mergedPagination.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getPaginationParam(pagination: TablePaginationConfig, mergedPagination: TablePaginationConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationParam")(pagination.asInstanceOf[js.Any], mergedPagination.asInstanceOf[js.Any])).asInstanceOf[Any]
}
