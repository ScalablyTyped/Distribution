package typings.agGrid.baseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/baseFilter", "ScalarBaseFilter")
@js.native
abstract class ScalarBaseFilter[T, P /* <: IScalarFilterParams */, M] () extends ComparableBaseFilter[T, P, M] {
  def comparator(): Comparator[T] = js.native
  /* private */ def doIndividualFilterPasses(params: js.Any, `type`: js.Any, filter: js.Any): js.Any = js.native
  /* private */ def nullComparator(`type`: js.Any): js.Any = js.native
  /* private */ def translateNull(`type`: js.Any): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/filter/baseFilter", "ScalarBaseFilter")
@js.native
object ScalarBaseFilter extends js.Object {
  val DEFAULT_NULL_COMPARATOR: NullComparator = js.native
}

