package typings.antd.tableInterfaceMod

import typings.antd.anon.Compare
import typings.antd.responsiveObserveMod.Breakpoint
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnType[RecordType]
  extends typings.rcTable.interfaceMod.ColumnType[RecordType] {
  var defaultFilteredValue: js.UndefOr[js.Array[Key] | Null] = js.native
  var defaultSortOrder: js.UndefOr[SortOrder] = js.native
  var filterDropdown: js.UndefOr[ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])] = js.native
  var filterDropdownVisible: js.UndefOr[Boolean] = js.native
  var filterIcon: js.UndefOr[ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])] = js.native
  var filterMultiple: js.UndefOr[Boolean] = js.native
  var filtered: js.UndefOr[Boolean] = js.native
  var filteredValue: js.UndefOr[js.Array[Key] | Null] = js.native
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.native
  var onFilter: js.UndefOr[
    js.Function2[/* value */ String | Double | Boolean, /* record */ RecordType, Boolean]
  ] = js.native
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
  var responsive: js.UndefOr[js.Array[Breakpoint]] = js.native
  var showSorterTooltip: js.UndefOr[Boolean] = js.native
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.native
  var sortOrder: js.UndefOr[SortOrder] = js.native
  var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | Compare[RecordType]] = js.native
}

object ColumnType {
  @scala.inline
  def apply[RecordType](): ColumnType[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnType[RecordType]]
  }
  @scala.inline
  implicit class ColumnTypeOps[Self <: ColumnType[_], RecordType] (val x: Self with ColumnType[RecordType]) extends AnyVal {
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
    def setDefaultFilteredValueVarargs(value: Key*): Self = this.set("defaultFilteredValue", js.Array(value :_*))
    @scala.inline
    def setDefaultFilteredValue(value: js.Array[Key]): Self = this.set("defaultFilteredValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFilteredValue: Self = this.set("defaultFilteredValue", js.undefined)
    @scala.inline
    def setDefaultFilteredValueNull: Self = this.set("defaultFilteredValue", null)
    @scala.inline
    def setDefaultSortOrder(value: SortOrder): Self = this.set("defaultSortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSortOrder: Self = this.set("defaultSortOrder", js.undefined)
    @scala.inline
    def setDefaultSortOrderNull: Self = this.set("defaultSortOrder", null)
    @scala.inline
    def setFilterDropdownFunction1(value: /* props */ FilterDropdownProps => ReactNode): Self = this.set("filterDropdown", js.Any.fromFunction1(value))
    @scala.inline
    def setFilterDropdown(value: ReactNode | (js.Function1[/* props */ FilterDropdownProps, ReactNode])): Self = this.set("filterDropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDropdown: Self = this.set("filterDropdown", js.undefined)
    @scala.inline
    def setFilterDropdownVisible(value: Boolean): Self = this.set("filterDropdownVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterDropdownVisible: Self = this.set("filterDropdownVisible", js.undefined)
    @scala.inline
    def setFilterIconFunction1(value: /* filtered */ Boolean => ReactNode): Self = this.set("filterIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setFilterIcon(value: ReactNode | (js.Function1[/* filtered */ Boolean, ReactNode])): Self = this.set("filterIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterIcon: Self = this.set("filterIcon", js.undefined)
    @scala.inline
    def setFilterMultiple(value: Boolean): Self = this.set("filterMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterMultiple: Self = this.set("filterMultiple", js.undefined)
    @scala.inline
    def setFiltered(value: Boolean): Self = this.set("filtered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltered: Self = this.set("filtered", js.undefined)
    @scala.inline
    def setFilteredValueVarargs(value: Key*): Self = this.set("filteredValue", js.Array(value :_*))
    @scala.inline
    def setFilteredValue(value: js.Array[Key]): Self = this.set("filteredValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteredValue: Self = this.set("filteredValue", js.undefined)
    @scala.inline
    def setFilteredValueNull: Self = this.set("filteredValue", null)
    @scala.inline
    def setFiltersVarargs(value: ColumnFilterItem*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[ColumnFilterItem]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setOnFilter(value: (/* value */ String | Double | Boolean, /* record */ RecordType) => Boolean): Self = this.set("onFilter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    @scala.inline
    def setOnFilterDropdownVisibleChange(value: /* visible */ Boolean => Unit): Self = this.set("onFilterDropdownVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilterDropdownVisibleChange: Self = this.set("onFilterDropdownVisibleChange", js.undefined)
    @scala.inline
    def setResponsiveVarargs(value: Breakpoint*): Self = this.set("responsive", js.Array(value :_*))
    @scala.inline
    def setResponsive(value: js.Array[Breakpoint]): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setShowSorterTooltip(value: Boolean): Self = this.set("showSorterTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSorterTooltip: Self = this.set("showSorterTooltip", js.undefined)
    @scala.inline
    def setSortDirectionsVarargs(value: SortOrder*): Self = this.set("sortDirections", js.Array(value :_*))
    @scala.inline
    def setSortDirections(value: js.Array[SortOrder]): Self = this.set("sortDirections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDirections: Self = this.set("sortDirections", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    @scala.inline
    def setSortOrderNull: Self = this.set("sortOrder", null)
    @scala.inline
    def setSorterFunction3(value: (RecordType, RecordType, /* sortOrder */ js.UndefOr[SortOrder]) => Double): Self = this.set("sorter", js.Any.fromFunction3(value))
    @scala.inline
    def setSorter(value: Boolean | CompareFn[RecordType] | Compare[RecordType]): Self = this.set("sorter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorter: Self = this.set("sorter", js.undefined)
  }
  
}

