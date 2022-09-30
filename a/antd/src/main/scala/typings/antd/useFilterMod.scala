package typings.antd

import typings.antd.tableInterfaceMod.ColumnFilterItem
import typings.antd.tableInterfaceMod.ColumnGroupType
import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.ColumnsType
import typings.antd.tableInterfaceMod.FilterKey
import typings.antd.tableInterfaceMod.FilterValue
import typings.antd.tableInterfaceMod.GetPopupContainer
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TableLocale
import typings.antd.tableInterfaceMod.TransformColumns
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFilterMod {
  
  @JSImport("antd/lib/table/hooks/useFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](
    hasPrefixClsDropdownPrefixClsMergedColumnsOnFilterChangeGetPopupContainerTableLocale: FilterConfig[RecordType]
  ): js.Tuple3[
    TransformColumns[RecordType], 
    js.Array[FilterState[RecordType]], 
    Record[String, FilterValue | Null]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsDropdownPrefixClsMergedColumnsOnFilterChangeGetPopupContainerTableLocale.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    TransformColumns[RecordType], 
    js.Array[FilterState[RecordType]], 
    Record[String, FilterValue | Null]
  ]]
  
  inline def flattenKeys(): FilterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenKeys")().asInstanceOf[FilterValue]
  inline def flattenKeys(filters: js.Array[ColumnFilterItem]): FilterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenKeys")(filters.asInstanceOf[js.Any]).asInstanceOf[FilterValue]
  
  inline def getFilterData[RecordType](data: js.Array[RecordType], filterStates: js.Array[FilterState[RecordType]]): js.Array[RecordType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterData")(data.asInstanceOf[js.Any], filterStates.asInstanceOf[js.Any])).asInstanceOf[js.Array[RecordType]]
  
  trait FilterConfig[RecordType] extends StObject {
    
    var dropdownPrefixCls: String
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
    
    var locale: TableLocale
    
    var mergedColumns: ColumnsType[RecordType]
    
    def onFilterChange(filters: Record[String, FilterValue | Null], filterStates: js.Array[FilterState[RecordType]]): Unit
    
    var prefixCls: String
  }
  object FilterConfig {
    
    inline def apply[RecordType](
      dropdownPrefixCls: String,
      locale: TableLocale,
      mergedColumns: ColumnsType[RecordType],
      onFilterChange: (Record[String, FilterValue | Null], js.Array[FilterState[RecordType]]) => Unit,
      prefixCls: String
    ): FilterConfig[RecordType] = {
      val __obj = js.Dynamic.literal(dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mergedColumns = mergedColumns.asInstanceOf[js.Any], onFilterChange = js.Any.fromFunction2(onFilterChange), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterConfig[RecordType]]
    }
    
    extension [Self <: FilterConfig[?], RecordType](x: Self & FilterConfig[RecordType]) {
      
      inline def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMergedColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "mergedColumns", value.asInstanceOf[js.Any])
      
      inline def setMergedColumnsVarargs(value: (ColumnGroupType[RecordType] | ColumnType[RecordType])*): Self = StObject.set(x, "mergedColumns", js.Array(value*))
      
      inline def setOnFilterChange(value: (Record[String, FilterValue | Null], js.Array[FilterState[RecordType]]) => Unit): Self = StObject.set(x, "onFilterChange", js.Any.fromFunction2(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilterState[RecordType] extends StObject {
    
    var column: ColumnType[RecordType]
    
    var filteredKeys: js.UndefOr[FilterKey] = js.undefined
    
    var forceFiltered: js.UndefOr[Boolean] = js.undefined
    
    var key: Key
  }
  object FilterState {
    
    inline def apply[RecordType](column: ColumnType[RecordType], key: Key): FilterState[RecordType] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterState[RecordType]]
    }
    
    extension [Self <: FilterState[?], RecordType](x: Self & FilterState[RecordType]) {
      
      inline def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setFilteredKeys(value: FilterKey): Self = StObject.set(x, "filteredKeys", value.asInstanceOf[js.Any])
      
      inline def setFilteredKeysNull: Self = StObject.set(x, "filteredKeys", null)
      
      inline def setFilteredKeysUndefined: Self = StObject.set(x, "filteredKeys", js.undefined)
      
      inline def setFilteredKeysVarargs(value: Key*): Self = StObject.set(x, "filteredKeys", js.Array(value*))
      
      inline def setForceFiltered(value: Boolean): Self = StObject.set(x, "forceFiltered", value.asInstanceOf[js.Any])
      
      inline def setForceFilteredUndefined: Self = StObject.set(x, "forceFiltered", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
