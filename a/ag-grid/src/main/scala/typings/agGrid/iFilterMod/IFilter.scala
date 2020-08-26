package typings.agGrid.iFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilter extends js.Object {
  /** If using React or Angular 2, returns the underlying component instance, so you can call methods
    * on it if you want. */
  var getFrameworkComponentInstance: js.UndefOr[js.Function0[_]] = js.native
  /**
    * Optional method used by ag-Grid when rendering floating filters and there isn't a floating filter
    * associated for this filter, this will happen if you create a custom filter and NOT a custom floating
    * filter.
    */
  var getModelAsString: js.UndefOr[js.Function1[/* model */ js.Any, String]] = js.native
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
  var onFloatingFilterChanged: js.UndefOr[js.Function1[/* change */ js.Any, Unit]] = js.native
  /** Gets called when new rows are inserted into the grid. If the filter needs to change it's state
    after rows are loaded, it can do it here. */
  var onNewRowsLoaded: js.UndefOr[js.Function0[Unit]] = js.native
  /** The grid will ask each active filter, in turn, whether each row in the grid passes. If any
    filter fails, then the row will be excluded from the final set. The method is provided a
    params object with attributes node (the rodNode the grid creates that wraps the data) and data
    (the data object that you provided to the grid for that row). */
  def doesFilterPass(params: IDoesFilterPassParams): Boolean = js.native
  /** Gets the filter state for storing */
  def getModel(): js.Any = js.native
  /** This is used to show the filter icon in the header. If true, the filter icon will be shown. */
  def isFilterActive(): Boolean = js.native
  /** Restores the filter state. */
  def setModel(model: js.Any): Unit = js.native
}

object IFilter {
  @scala.inline
  def apply(
    doesFilterPass: IDoesFilterPassParams => Boolean,
    getModel: () => js.Any,
    isFilterActive: () => Boolean,
    setModel: js.Any => Unit
  ): IFilter = {
    val __obj = js.Dynamic.literal(doesFilterPass = js.Any.fromFunction1(doesFilterPass), getModel = js.Any.fromFunction0(getModel), isFilterActive = js.Any.fromFunction0(isFilterActive), setModel = js.Any.fromFunction1(setModel))
    __obj.asInstanceOf[IFilter]
  }
  @scala.inline
  implicit class IFilterOps[Self <: IFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDoesFilterPass(value: IDoesFilterPassParams => Boolean): Self = this.set("doesFilterPass", js.Any.fromFunction1(value))
    @scala.inline
    def setGetModel(value: () => js.Any): Self = this.set("getModel", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFilterActive(value: () => Boolean): Self = this.set("isFilterActive", js.Any.fromFunction0(value))
    @scala.inline
    def setSetModel(value: js.Any => Unit): Self = this.set("setModel", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFrameworkComponentInstance(value: () => _): Self = this.set("getFrameworkComponentInstance", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFrameworkComponentInstance: Self = this.set("getFrameworkComponentInstance", js.undefined)
    @scala.inline
    def setGetModelAsString(value: /* model */ js.Any => String): Self = this.set("getModelAsString", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetModelAsString: Self = this.set("getModelAsString", js.undefined)
    @scala.inline
    def setOnFloatingFilterChanged(value: /* change */ js.Any => Unit): Self = this.set("onFloatingFilterChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFloatingFilterChanged: Self = this.set("onFloatingFilterChanged", js.undefined)
    @scala.inline
    def setOnNewRowsLoaded(value: () => Unit): Self = this.set("onNewRowsLoaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnNewRowsLoaded: Self = this.set("onNewRowsLoaded", js.undefined)
  }
  
}

