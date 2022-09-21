package typings.antd

import typings.antd.antdStrings.menu
import typings.antd.antdStrings.tree
import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.FilterSearchType
import typings.antd.tableInterfaceMod.GetPopupContainer
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TableLocale
import typings.antd.useFilterMod.FilterState
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterDropdownMod {
  
  @JSImport("antd/lib/table/hooks/useFilter/FilterDropdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](props: FilterDropdownProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait FilterDropdownProps[RecordType] extends StObject {
    
    var children: ReactNode
    
    var column: ColumnType[RecordType]
    
    var columnKey: Key
    
    var dropdownPrefixCls: String
    
    var filterMode: js.UndefOr[menu | tree] = js.undefined
    
    var filterMultiple: Boolean
    
    var filterResetToDefaultFilteredValue: js.UndefOr[Boolean] = js.undefined
    
    var filterSearch: js.UndefOr[FilterSearchType] = js.undefined
    
    var filterState: js.UndefOr[FilterState[RecordType]] = js.undefined
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
    
    var locale: TableLocale
    
    var prefixCls: String
    
    var tablePrefixCls: String
    
    def triggerFilter(filterState: FilterState[RecordType]): Unit
  }
  object FilterDropdownProps {
    
    inline def apply[RecordType](
      column: ColumnType[RecordType],
      columnKey: Key,
      dropdownPrefixCls: String,
      filterMultiple: Boolean,
      locale: TableLocale,
      prefixCls: String,
      tablePrefixCls: String,
      triggerFilter: FilterState[RecordType] => Unit
    ): FilterDropdownProps[RecordType] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], tablePrefixCls = tablePrefixCls.asInstanceOf[js.Any], triggerFilter = js.Any.fromFunction1(triggerFilter))
      __obj.asInstanceOf[FilterDropdownProps[RecordType]]
    }
    
    extension [Self <: FilterDropdownProps[?], RecordType](x: Self & FilterDropdownProps[RecordType]) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setFilterMode(value: menu | tree): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
      inline def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
      
      inline def setFilterResetToDefaultFilteredValue(value: Boolean): Self = StObject.set(x, "filterResetToDefaultFilteredValue", value.asInstanceOf[js.Any])
      
      inline def setFilterResetToDefaultFilteredValueUndefined: Self = StObject.set(x, "filterResetToDefaultFilteredValue", js.undefined)
      
      inline def setFilterSearch(value: FilterSearchType): Self = StObject.set(x, "filterSearch", value.asInstanceOf[js.Any])
      
      inline def setFilterSearchFunction2(value: (/* input */ String, /* record */ js.Object) => Boolean): Self = StObject.set(x, "filterSearch", js.Any.fromFunction2(value))
      
      inline def setFilterSearchUndefined: Self = StObject.set(x, "filterSearch", js.undefined)
      
      inline def setFilterState(value: FilterState[RecordType]): Self = StObject.set(x, "filterState", value.asInstanceOf[js.Any])
      
      inline def setFilterStateUndefined: Self = StObject.set(x, "filterState", js.undefined)
      
      inline def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setTablePrefixCls(value: String): Self = StObject.set(x, "tablePrefixCls", value.asInstanceOf[js.Any])
      
      inline def setTriggerFilter(value: FilterState[RecordType] => Unit): Self = StObject.set(x, "triggerFilter", js.Any.fromFunction1(value))
    }
  }
}
