package typings.antd

import typings.antd.tableInterfaceMod.ColumnType
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
  
  @scala.inline
  def default[RecordType](props: FilterDropdownProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait FilterDropdownProps[RecordType] extends StObject {
    
    var children: ReactNode
    
    var column: ColumnType[RecordType]
    
    var columnKey: Key
    
    var dropdownPrefixCls: String
    
    var filterMultiple: Boolean
    
    var filterState: js.UndefOr[FilterState[RecordType]] = js.undefined
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
    
    var locale: TableLocale
    
    var prefixCls: String
    
    def triggerFilter(filterState: FilterState[RecordType]): Unit
  }
  object FilterDropdownProps {
    
    @scala.inline
    def apply[RecordType](
      column: ColumnType[RecordType],
      columnKey: Key,
      dropdownPrefixCls: String,
      filterMultiple: Boolean,
      locale: TableLocale,
      prefixCls: String,
      triggerFilter: FilterState[RecordType] => Unit
    ): FilterDropdownProps[RecordType] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], triggerFilter = js.Any.fromFunction1(triggerFilter))
      __obj.asInstanceOf[FilterDropdownProps[RecordType]]
    }
    
    @scala.inline
    implicit class FilterDropdownPropsMutableBuilder[Self <: FilterDropdownProps[?], RecordType] (val x: Self & FilterDropdownProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterState(value: FilterState[RecordType]): Self = StObject.set(x, "filterState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterStateUndefined: Self = StObject.set(x, "filterState", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerFilter(value: FilterState[RecordType] => Unit): Self = StObject.set(x, "triggerFilter", js.Any.fromFunction1(value))
    }
  }
}
