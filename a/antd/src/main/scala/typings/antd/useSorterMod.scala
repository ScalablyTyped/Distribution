package typings.antd

import typings.antd.antdBooleans.`false`
import typings.antd.tableInterfaceMod.ColumnTitleProps
import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.ColumnsType
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.SortOrder
import typings.antd.tableInterfaceMod.SorterResult
import typings.antd.tableInterfaceMod.TableLocale
import typings.antd.tableInterfaceMod.TransformColumns
import typings.antd.tooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSorterMod {
  
  @JSImport("antd/lib/table/hooks/useSorter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](
    hasPrefixClsMergedColumnsOnSorterChangeSortDirectionsTableLocaleShowSorterTooltip: SorterConfig[RecordType]
  ): js.Tuple4[
    TransformColumns[RecordType], 
    js.Array[SortState[RecordType]], 
    ColumnTitleProps[RecordType], 
    js.Function0[SorterResult[RecordType] | js.Array[SorterResult[RecordType]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsMergedColumnsOnSorterChangeSortDirectionsTableLocaleShowSorterTooltip.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[
    TransformColumns[RecordType], 
    js.Array[SortState[RecordType]], 
    ColumnTitleProps[RecordType], 
    js.Function0[SorterResult[RecordType] | js.Array[SorterResult[RecordType]]]
  ]]
  
  inline def getSortData[RecordType](
    data: js.Array[RecordType],
    sortStates: js.Array[SortState[RecordType]],
    childrenColumnName: String
  ): js.Array[RecordType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortData")(data.asInstanceOf[js.Any], sortStates.asInstanceOf[js.Any], childrenColumnName.asInstanceOf[js.Any])).asInstanceOf[js.Array[RecordType]]
  
  trait SortState[RecordType] extends StObject {
    
    var column: ColumnType[RecordType]
    
    var key: Key
    
    var multiplePriority: Double | `false`
    
    var sortOrder: SortOrder | Null
  }
  object SortState {
    
    inline def apply[RecordType](column: ColumnType[RecordType], key: Key, multiplePriority: Double | `false`): SortState[RecordType] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], multiplePriority = multiplePriority.asInstanceOf[js.Any], sortOrder = null)
      __obj.asInstanceOf[SortState[RecordType]]
    }
    
    extension [Self <: SortState[?], RecordType](x: Self & SortState[RecordType]) {
      
      inline def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMultiplePriority(value: Double | `false`): Self = StObject.set(x, "multiplePriority", value.asInstanceOf[js.Any])
      
      inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    }
  }
  
  @js.native
  trait SorterConfig[RecordType] extends StObject {
    
    var mergedColumns: ColumnsType[RecordType] = js.native
    
    def onSorterChange(sorterResult: js.Array[SorterResult[RecordType]], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
    def onSorterChange(sorterResult: SorterResult[RecordType], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
    
    var prefixCls: String = js.native
    
    var showSorterTooltip: js.UndefOr[Boolean | TooltipProps] = js.native
    
    var sortDirections: js.Array[SortOrder] = js.native
    
    var tableLocale: js.UndefOr[TableLocale] = js.native
  }
}
