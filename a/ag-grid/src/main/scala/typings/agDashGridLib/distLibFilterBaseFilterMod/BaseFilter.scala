package typings
package agDashGridLib.distLibFilterBaseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- agDashGridLib.distLibInterfacesIFilterMod.IFilterComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter")
@js.native
abstract class BaseFilter[T, P /* <: agDashGridLib.distLibInterfacesIFilterMod.IFilterParams */, M] ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  var applyActive: scala.Boolean = js.native
  var clearActive: scala.Boolean = js.native
  var conditionValue: java.lang.String = js.native
  var context: agDashGridLib.distLibContextContextMod.Context = js.native
  var defaultFilter: java.lang.String = js.native
  var eApplyButton: js.Any = js.native
  var eButtonsPanel: js.Any = js.native
  var eClearButton: js.Any = js.native
  var eConditionWrapper: js.Any = js.native
  var eFilterBodyWrapper: js.Any = js.native
  var filter: java.lang.String = js.native
  var filterCondition: java.lang.String = js.native
  var filterParams: P = js.native
  var gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper = js.native
  var newRowsActionKeep: js.Any = js.native
  def acceptsBooleanLogic(): scala.Boolean = js.native
  def bodyTemplate(`type`: FilterConditionType): java.lang.String = js.native
  /* private */ def createConditionBody(`type`: js.Any): js.Any = js.native
  /* private */ def createConditionTemplate(`type`: js.Any): js.Any = js.native
  def customInit(): scala.Unit = js.native
  /* private */ def doOnFilterChanged(): js.Any = js.native
  /* private */ def doOnFilterChanged(applyNow: js.Any): js.Any = js.native
  def doesFilterPass(params: agDashGridLib.distLibInterfacesIFilterMod.IDoesFilterPassParams): scala.Boolean = js.native
  def floatingFilter(from: java.lang.String): scala.Unit = js.native
  def generateFilterHeader(`type`: FilterConditionType): java.lang.String = js.native
  /* private */ def generateTemplate(): js.Any = js.native
  def getDebounceMs(filterParams: agDashGridLib.distLibFilterTextFilterMod.INumberFilterParams): scala.Double = js.native
  def getDebounceMs(filterParams: agDashGridLib.distLibFilterTextFilterMod.ITextFilterParams): scala.Double = js.native
  def getModel(): M | CombinedFilter[M] = js.native
  def getNullableModel(): M | CombinedFilter[M] = js.native
  @JSName("init")
  def init_MBaseFilter(params: P): scala.Unit = js.native
  def initialiseFilterBodyUi(`type`: FilterConditionType): scala.Unit = js.native
  def isFilterActive(): scala.Boolean = js.native
  def isFilterConditionActive(`type`: FilterConditionType): scala.Boolean = js.native
  def modelFromFloatingFilter(from: java.lang.String): M = js.native
  def onClearButton(): scala.Unit = js.native
  def onFilterChanged(): scala.Unit = js.native
  def onFilterChanged(applyNow: scala.Boolean): scala.Unit = js.native
  def onFloatingFilterChanged(change: agDashGridLib.distLibFilterFloatingFilterMod.FloatingFilterChange): scala.Boolean = js.native
  def onNewRowsLoaded(): scala.Unit = js.native
  def parse(toParse: M, `type`: FilterConditionType): scala.Unit = js.native
  /* private */ def redrawCondition(): js.Any = js.native
  def refreshFilterBodyUi(`type`: FilterConditionType): scala.Unit = js.native
  /* private */ def refreshOperatorUi(): js.Any = js.native
  def resetState(): scala.Unit = js.native
  def serialize(`type`: FilterConditionType): M = js.native
  def setModel(model: M): scala.Unit = js.native
  def setModel(model: CombinedFilter[M]): scala.Unit = js.native
  def translate(toTranslate: java.lang.String): java.lang.String = js.native
  def wrapCondition(mainCondition: java.lang.String): java.lang.String = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter")
@js.native
object BaseFilter extends js.Object {
  var CONTAINS: java.lang.String = js.native
  var ENDS_WITH: java.lang.String = js.native
  var EQUALS: java.lang.String = js.native
  var GREATER_THAN: java.lang.String = js.native
  var GREATER_THAN_OR_EQUAL: java.lang.String = js.native
  var IN_RANGE: java.lang.String = js.native
  var LESS_THAN: java.lang.String = js.native
  var LESS_THAN_OR_EQUAL: java.lang.String = js.native
  var NOT_CONTAINS: java.lang.String = js.native
  var NOT_EQUAL: java.lang.String = js.native
  var STARTS_WITH: java.lang.String = js.native
}

