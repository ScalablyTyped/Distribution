package typings.antd

import typings.antd.antdStrings.SELECT_ALL
import typings.antd.antdStrings.SELECT_INVERT
import typings.antd.antdStrings.SELECT_NONE
import typings.antd.libTableInterfaceMod.ExpandType
import typings.antd.libTableInterfaceMod.GetPopupContainer
import typings.antd.libTableInterfaceMod.Key
import typings.antd.libTableInterfaceMod.TableLocale
import typings.antd.libTableInterfaceMod.TableRowSelection
import typings.antd.libTableInterfaceMod.TransformColumns
import typings.rcTable.libInterfaceMod.GetRowKey
import typings.std.HTMLElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTableHooksUseSelectionMod {
  
  @JSImport("antd/lib/table/hooks/useSelection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](rowSelection: Unit, config: UseSelectionConfig[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(rowSelection.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TransformColumns[RecordType], Set[Key]]]
  inline def default[RecordType](rowSelection: TableRowSelection[RecordType], config: UseSelectionConfig[RecordType]): js.Tuple2[TransformColumns[RecordType], Set[Key]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(rowSelection.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TransformColumns[RecordType], Set[Key]]]
  
  @JSImport("antd/lib/table/hooks/useSelection", "SELECTION_ALL")
  @js.native
  val SELECTION_ALL: SELECT_ALL = js.native
  
  @JSImport("antd/lib/table/hooks/useSelection", "SELECTION_INVERT")
  @js.native
  val SELECTION_INVERT: SELECT_INVERT = js.native
  
  @JSImport("antd/lib/table/hooks/useSelection", "SELECTION_NONE")
  @js.native
  val SELECTION_NONE: SELECT_NONE = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.libTableInterfaceMod.SelectionItem
    - typings.antd.antdStrings.SELECT_ALL
    - typings.antd.antdStrings.SELECT_INVERT
    - typings.antd.antdStrings.SELECT_NONE
  */
  trait INTERNAL_SELECTION_ITEM extends StObject
  
  trait UseSelectionConfig[RecordType] extends StObject {
    
    var childrenColumnName: String
    
    var data: js.Array[RecordType]
    
    var expandType: ExpandType
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
    
    def getRecordByKey(key: Key): RecordType
    
    var getRowKey: GetRowKey[RecordType]
    
    var locale: TableLocale
    
    var pageData: js.Array[RecordType]
    
    var prefixCls: String
  }
  object UseSelectionConfig {
    
    inline def apply[RecordType](
      childrenColumnName: String,
      data: js.Array[RecordType],
      getRecordByKey: Key => RecordType,
      getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => typings.rcTable.libInterfaceMod.Key,
      locale: TableLocale,
      pageData: js.Array[RecordType],
      prefixCls: String
    ): UseSelectionConfig[RecordType] = {
      val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getRecordByKey = js.Any.fromFunction1(getRecordByKey), getRowKey = js.Any.fromFunction2(getRowKey), locale = locale.asInstanceOf[js.Any], pageData = pageData.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], expandType = null)
      __obj.asInstanceOf[UseSelectionConfig[RecordType]]
    }
    
    extension [Self <: UseSelectionConfig[?], RecordType](x: Self & UseSelectionConfig[RecordType]) {
      
      inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setExpandType(value: ExpandType): Self = StObject.set(x, "expandType", value.asInstanceOf[js.Any])
      
      inline def setExpandTypeNull: Self = StObject.set(x, "expandType", null)
      
      inline def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setGetRecordByKey(value: Key => RecordType): Self = StObject.set(x, "getRecordByKey", js.Any.fromFunction1(value))
      
      inline def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => typings.rcTable.libInterfaceMod.Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
      
      inline def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setPageData(value: js.Array[RecordType]): Self = StObject.set(x, "pageData", value.asInstanceOf[js.Any])
      
      inline def setPageDataVarargs(value: RecordType*): Self = StObject.set(x, "pageData", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
