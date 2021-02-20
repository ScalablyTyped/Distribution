package typings.antd

import typings.antd.antdStrings.SELECT_ALL
import typings.antd.antdStrings.SELECT_INVERT
import typings.antd.tableInterfaceMod.ExpandType
import typings.antd.tableInterfaceMod.GetPopupContainer
import typings.antd.tableInterfaceMod.Key
import typings.antd.tableInterfaceMod.TableLocale
import typings.antd.tableInterfaceMod.TableRowSelection
import typings.antd.tableInterfaceMod.TransformColumns
import typings.rcTable.interfaceMod.GetRowKey
import typings.std.HTMLElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSelectionMod {
  
  @JSImport("antd/lib/table/hooks/useSelection", JSImport.Default)
  @js.native
  def default[RecordType](rowSelection: js.UndefOr[scala.Nothing], config: UseSelectionConfig[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = js.native
  @JSImport("antd/lib/table/hooks/useSelection", JSImport.Default)
  @js.native
  def default[RecordType](rowSelection: TableRowSelection[RecordType], config: UseSelectionConfig[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = js.native
  
  @JSImport("antd/lib/table/hooks/useSelection", "SELECTION_ALL")
  @js.native
  val SELECTION_ALL: SELECT_ALL = js.native
  
  @JSImport("antd/lib/table/hooks/useSelection", "SELECTION_INVERT")
  @js.native
  val SELECTION_INVERT: SELECT_INVERT = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.tableInterfaceMod.SelectionItem
    - typings.antd.antdStrings.SELECT_ALL
    - typings.antd.antdStrings.SELECT_INVERT
  */
  trait INTERNAL_SELECTION_ITEM extends StObject
  
  @js.native
  trait UseSelectionConfig[RecordType] extends StObject {
    
    var childrenColumnName: String = js.native
    
    var data: js.Array[RecordType] = js.native
    
    var expandIconColumnIndex: js.UndefOr[Double] = js.native
    
    var expandType: ExpandType = js.native
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
    
    def getRecordByKey(key: Key): RecordType = js.native
    
    var getRowKey: GetRowKey[RecordType] = js.native
    
    var locale: TableLocale = js.native
    
    var pageData: js.Array[RecordType] = js.native
    
    var prefixCls: String = js.native
  }
  object UseSelectionConfig {
    
    @scala.inline
    def apply[RecordType](
      childrenColumnName: String,
      data: js.Array[RecordType],
      getRecordByKey: Key => RecordType,
      getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => typings.rcTable.interfaceMod.Key,
      locale: TableLocale,
      pageData: js.Array[RecordType],
      prefixCls: String
    ): UseSelectionConfig[RecordType] = {
      val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getRecordByKey = js.Any.fromFunction1(getRecordByKey), getRowKey = js.Any.fromFunction2(getRowKey), locale = locale.asInstanceOf[js.Any], pageData = pageData.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseSelectionConfig[RecordType]]
    }
    
    @scala.inline
    implicit class UseSelectionConfigMutableBuilder[Self <: UseSelectionConfig[_], RecordType] (val x: Self with UseSelectionConfig[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconColumnIndexUndefined: Self = StObject.set(x, "expandIconColumnIndex", js.undefined)
      
      @scala.inline
      def setExpandType(value: ExpandType): Self = StObject.set(x, "expandType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandTypeNull: Self = StObject.set(x, "expandType", null)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setGetRecordByKey(value: Key => RecordType): Self = StObject.set(x, "getRecordByKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => typings.rcTable.interfaceMod.Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageData(value: js.Array[RecordType]): Self = StObject.set(x, "pageData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageDataVarargs(value: RecordType*): Self = StObject.set(x, "pageData", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
