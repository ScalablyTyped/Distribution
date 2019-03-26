package typings
package agDashGridLib.distLibFilterBaseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/baseFilter", "ComparableBaseFilter")
@js.native
abstract class ComparableBaseFilter[T, P /* <: IComparableFilterParams */, M] () extends BaseFilter[T, P, M] {
  var eTypeConditionSelector: js.Any = js.native
  var eTypeSelector: js.Any = js.native
  var suppressAndOrCondition: js.Any = js.native
  def filterValues(`type`: FilterConditionType): T | js.Array[T] = js.native
  def getApplicableFilterTypes(): js.Array[java.lang.String] = js.native
  def getDefaultType(): java.lang.String = js.native
  def individualFilterPasses(
    params: agDashGridLib.distLibInterfacesIFilterMod.IDoesFilterPassParams,
    `type`: FilterConditionType
  ): scala.Boolean = js.native
  @JSName("init")
  def init_MComparableBaseFilter(params: P): scala.Unit = js.native
  /* private */ def onFilterTypeChanged(`type`: js.Any): js.Any = js.native
  def setFilterType(filterType: java.lang.String, `type`: FilterConditionType): scala.Unit = js.native
}

