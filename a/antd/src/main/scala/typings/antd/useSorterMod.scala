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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSorterMod {
  
  @JSImport("antd/lib/table/hooks/useSorter", JSImport.Default)
  @js.native
  def default[RecordType](
    hasPrefixClsMergedColumnsOnSorterChangeSortDirectionsTableLocaleShowSorterTooltip: SorterConfig[RecordType]
  ): js.Tuple4[
    TransformColumns[RecordType], 
    js.Array[SortState[RecordType]], 
    ColumnTitleProps[RecordType], 
    js.Function0[SorterResult[RecordType] | js.Array[SorterResult[RecordType]]]
  ] = js.native
  
  @JSImport("antd/lib/table/hooks/useSorter", "getSortData")
  @js.native
  def getSortData[RecordType](
    data: js.Array[RecordType],
    sortStates: js.Array[SortState[RecordType]],
    childrenColumnName: String
  ): js.Array[RecordType] = js.native
  
  @js.native
  trait SortState[RecordType] extends StObject {
    
    var column: ColumnType[RecordType] = js.native
    
    var key: Key = js.native
    
    var multiplePriority: Double | `false` = js.native
    
    var sortOrder: SortOrder | Null = js.native
  }
  object SortState {
    
    @scala.inline
    def apply[RecordType](column: ColumnType[RecordType], key: Key, multiplePriority: Double | `false`): SortState[RecordType] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], multiplePriority = multiplePriority.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortState[RecordType]]
    }
    
    @scala.inline
    implicit class SortStateMutableBuilder[Self <: SortState[_], RecordType] (val x: Self with SortState[RecordType]) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplePriority(value: Double | `false`): Self = StObject.set(x, "multiplePriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    }
  }
  
  @js.native
  trait SorterConfig[RecordType] extends StObject {
    
    var mergedColumns: ColumnsType[RecordType] = js.native
    
    def onSorterChange(sorterResult: js.Array[SorterResult[RecordType]], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
    def onSorterChange(sorterResult: SorterResult[RecordType], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
    
    var prefixCls: String = js.native
    
    var showSorterTooltip: js.UndefOr[Boolean] = js.native
    
    var sortDirections: js.Array[SortOrder] = js.native
    
    var tableLocale: js.UndefOr[TableLocale] = js.native
  }
}
