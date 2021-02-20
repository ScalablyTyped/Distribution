package typings.antd

import typings.antd.antdBooleans.`false`
import typings.antd.tableInterfaceMod.TablePaginationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePaginationMod {
  
  @JSImport("antd/lib/table/hooks/usePagination", JSImport.Default)
  @js.native
  def default(
    total: Double,
    pagination: js.UndefOr[scala.Nothing],
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit]
  ): js.Tuple2[TablePaginationConfig, js.Function0[Unit]] = js.native
  @JSImport("antd/lib/table/hooks/usePagination", JSImport.Default)
  @js.native
  def default(
    total: Double,
    pagination: TablePaginationConfig,
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit]
  ): js.Tuple2[TablePaginationConfig, js.Function0[Unit]] = js.native
  
  @JSImport("antd/lib/table/hooks/usePagination", "DEFAULT_PAGE_SIZE")
  @js.native
  val DEFAULT_PAGE_SIZE: /* 10 */ Double = js.native
  
  @JSImport("antd/lib/table/hooks/usePagination", JSImport.Default)
  @js.native
  def default_false(
    total: Double,
    pagination: `false`,
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit]
  ): js.Tuple2[TablePaginationConfig, js.Function0[Unit]] = js.native
  
  @JSImport("antd/lib/table/hooks/usePagination", "getPaginationParam")
  @js.native
  def getPaginationParam(pagination: js.UndefOr[scala.Nothing], mergedPagination: TablePaginationConfig): js.Any = js.native
  @JSImport("antd/lib/table/hooks/usePagination", "getPaginationParam")
  @js.native
  def getPaginationParam(pagination: Boolean, mergedPagination: TablePaginationConfig): js.Any = js.native
  @JSImport("antd/lib/table/hooks/usePagination", "getPaginationParam")
  @js.native
  def getPaginationParam(pagination: TablePaginationConfig, mergedPagination: TablePaginationConfig): js.Any = js.native
}
