package typings.agDashGrid.distLibFilterBaseFilterMod

import typings.agDashGrid.distLibContextContextMod.Context
import typings.agDashGrid.distLibFilterFloatingFilterMod.FloatingFilterChange
import typings.agDashGrid.distLibFilterTextFilterMod.INumberFilterParams
import typings.agDashGrid.distLibFilterTextFilterMod.ITextFilterParams
import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibInterfacesIFilterMod.IDoesFilterPassParams
import typings.agDashGrid.distLibInterfacesIFilterMod.IFilterParams
import typings.agDashGrid.distLibWidgetsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.agDashGrid.distLibInterfacesIFilterMod.IFilterComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter")
@js.native
abstract class BaseFilter[T, P /* <: IFilterParams */, M] () extends Component {
  var applyActive: Boolean = js.native
  var clearActive: Boolean = js.native
  var conditionValue: String = js.native
  var context: Context = js.native
  var defaultFilter: String = js.native
  var eApplyButton: js.Any = js.native
  var eButtonsPanel: js.Any = js.native
  var eClearButton: js.Any = js.native
  var eConditionWrapper: js.Any = js.native
  var eFilterBodyWrapper: js.Any = js.native
  var filter: String = js.native
  var filterCondition: String = js.native
  var filterParams: P = js.native
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  var newRowsActionKeep: js.Any = js.native
  def acceptsBooleanLogic(): Boolean = js.native
  def bodyTemplate(`type`: FilterConditionType): String = js.native
  /* private */ def createConditionBody(`type`: js.Any): js.Any = js.native
  /* private */ def createConditionTemplate(`type`: js.Any): js.Any = js.native
  def customInit(): Unit = js.native
  /* private */ def doOnFilterChanged(): js.Any = js.native
  /* private */ def doOnFilterChanged(applyNow: js.Any): js.Any = js.native
  def doesFilterPass(params: IDoesFilterPassParams): Boolean = js.native
  def floatingFilter(from: String): Unit = js.native
  def generateFilterHeader(`type`: FilterConditionType): String = js.native
  /* private */ def generateTemplate(): js.Any = js.native
  def getDebounceMs(filterParams: INumberFilterParams): Double = js.native
  def getDebounceMs(filterParams: ITextFilterParams): Double = js.native
  def getModel(): M | CombinedFilter[M] = js.native
  def getNullableModel(): M | CombinedFilter[M] = js.native
  @JSName("init")
  def init_MBaseFilter(params: P): Unit = js.native
  def initialiseFilterBodyUi(`type`: FilterConditionType): Unit = js.native
  def isFilterActive(): Boolean = js.native
  def isFilterConditionActive(`type`: FilterConditionType): Boolean = js.native
  def modelFromFloatingFilter(from: String): M = js.native
  def onClearButton(): Unit = js.native
  def onFilterChanged(): Unit = js.native
  def onFilterChanged(applyNow: Boolean): Unit = js.native
  def onFloatingFilterChanged(change: FloatingFilterChange): Boolean = js.native
  def onNewRowsLoaded(): Unit = js.native
  def parse(toParse: M, `type`: FilterConditionType): Unit = js.native
  /* private */ def redrawCondition(): js.Any = js.native
  def refreshFilterBodyUi(`type`: FilterConditionType): Unit = js.native
  /* private */ def refreshOperatorUi(): js.Any = js.native
  def resetState(): Unit = js.native
  def serialize(`type`: FilterConditionType): M = js.native
  def setModel(model: M): Unit = js.native
  def setModel(model: CombinedFilter[M]): Unit = js.native
  def translate(toTranslate: String): String = js.native
  def wrapCondition(mainCondition: String): String = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter")
@js.native
object BaseFilter extends js.Object {
  var CONTAINS: String = js.native
  var ENDS_WITH: String = js.native
  var EQUALS: String = js.native
  var GREATER_THAN: String = js.native
  var GREATER_THAN_OR_EQUAL: String = js.native
  var IN_RANGE: String = js.native
  var LESS_THAN: String = js.native
  var LESS_THAN_OR_EQUAL: String = js.native
  var NOT_CONTAINS: String = js.native
  var NOT_EQUAL: String = js.native
  var STARTS_WITH: String = js.native
}

