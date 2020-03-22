package typings.antd

import typings.antd.antdBooleans.`false`
import typings.antd.antdNumbers.`10`
import typings.antd.paginationPaginationMod.PaginationConfig
import typings.antd.tableInterfaceMod.TablePaginationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/hooks/usePagination", JSImport.Namespace)
@js.native
object usePaginationMod extends js.Object {
  val DEFAULT_PAGE_SIZE: `10` = js.native
  def default(
    total: Double,
    pagination: js.UndefOr[scala.Nothing],
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit]
  ): js.Tuple2[TablePaginationConfig, js.Function0[Unit]] = js.native
  def default(
    total: Double,
    pagination: TablePaginationConfig,
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit]
  ): js.Tuple2[TablePaginationConfig, js.Function0[Unit]] = js.native
  @JSName("default")
  def default_false(
    total: Double,
    pagination: `false`,
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit]
  ): js.Tuple2[TablePaginationConfig, js.Function0[Unit]] = js.native
  def getPaginationParam(pagination: js.UndefOr[scala.Nothing], mergedPagination: PaginationConfig): js.Any = js.native
  def getPaginationParam(pagination: Boolean, mergedPagination: PaginationConfig): js.Any = js.native
  def getPaginationParam(pagination: PaginationConfig, mergedPagination: PaginationConfig): js.Any = js.native
}

