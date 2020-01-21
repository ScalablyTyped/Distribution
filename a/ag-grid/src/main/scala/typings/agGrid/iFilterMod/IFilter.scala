package typings.agGrid.iFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilter extends js.Object {
  /** If using React or Angular 2, returns the underlying component instance, so you can call methods
    * on it if you want. */
  var getFrameworkComponentInstance: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Optional method used by ag-Grid when rendering floating filters and there isn't a floating filter
    * associated for this filter, this will happen if you create a custom filter and NOT a custom floating
    * filter.
    */
  var getModelAsString: js.UndefOr[js.Function1[/* model */ js.Any, String]] = js.undefined
  /**
    * Optional method used by ag-Grid when rendering floating filters.
    *
    * If this method IS NOT IMPLEMENTED, when the floating filter changes, ag-Grid will automatically call
    * IFilterParams.filterChangedCallback,  triggering the filtering of the data based on the changes from
    * the floating filter. For the simplest cases this is enough.
    *
    * IF IT IS IMPLEMENTED. ag-Grid will delegate into this method the responsibility of calling
    * IFilterParams.filterChangedCallback. This is useful if additional logic is necessary, for instance
    * ag-Grid uses this in addition with the applyNow flag to handle the apply button logic in the default
    * ag-Grid filters.
    *
    *     change: The exact same object passed on FloatingFilter.onFloatingFilterChanged
    */
  var onFloatingFilterChanged: js.UndefOr[js.Function1[/* change */ js.Any, Unit]] = js.undefined
  /** Gets called when new rows are inserted into the grid. If the filter needs to change it's state
    after rows are loaded, it can do it here. */
  var onNewRowsLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** The grid will ask each active filter, in turn, whether each row in the grid passes. If any
    filter fails, then the row will be excluded from the final set. The method is provided a
    params object with attributes node (the rodNode the grid creates that wraps the data) and data
    (the data object that you provided to the grid for that row). */
  def doesFilterPass(params: IDoesFilterPassParams): Boolean
  /** Gets the filter state for storing */
  def getModel(): js.Any
  /** This is used to show the filter icon in the header. If true, the filter icon will be shown. */
  def isFilterActive(): Boolean
  /** Restores the filter state. */
  def setModel(model: js.Any): Unit
}

object IFilter {
  @scala.inline
  def apply(
    doesFilterPass: IDoesFilterPassParams => Boolean,
    getModel: () => js.Any,
    isFilterActive: () => Boolean,
    setModel: js.Any => Unit,
    getFrameworkComponentInstance: () => _ = null,
    getModelAsString: /* model */ js.Any => String = null,
    onFloatingFilterChanged: /* change */ js.Any => Unit = null,
    onNewRowsLoaded: () => Unit = null
  ): IFilter = {
    val __obj = js.Dynamic.literal(doesFilterPass = js.Any.fromFunction1(doesFilterPass), getModel = js.Any.fromFunction0(getModel), isFilterActive = js.Any.fromFunction0(isFilterActive), setModel = js.Any.fromFunction1(setModel))
    if (getFrameworkComponentInstance != null) __obj.updateDynamic("getFrameworkComponentInstance")(js.Any.fromFunction0(getFrameworkComponentInstance))
    if (getModelAsString != null) __obj.updateDynamic("getModelAsString")(js.Any.fromFunction1(getModelAsString))
    if (onFloatingFilterChanged != null) __obj.updateDynamic("onFloatingFilterChanged")(js.Any.fromFunction1(onFloatingFilterChanged))
    if (onNewRowsLoaded != null) __obj.updateDynamic("onNewRowsLoaded")(js.Any.fromFunction0(onNewRowsLoaded))
    __obj.asInstanceOf[IFilter]
  }
}

