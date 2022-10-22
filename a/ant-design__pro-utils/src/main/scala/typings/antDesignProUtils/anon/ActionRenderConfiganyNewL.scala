package typings.antDesignProUtils.anon

import typings.antDesignProUtils.antDesignProUtilsStrings.Map
import typings.antDesignProUtils.esUseEditableArrayMod.AddLineOptions
import typings.antDesignProUtils.esUseEditableArrayMod.NewLineConfig
import typings.antDesignProUtils.esUseEditableArrayMod.RecordKey
import typings.rcFieldForm.esInterfaceMod.NamePath
import typings.react.mod.Key
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ant-design/pro-utils.@ant-design/pro-utils/es/useEditableArray.ActionRenderConfig<any, @ant-design/pro-utils.@ant-design/pro-utils/es/useEditableArray.NewLineConfig<any>> & {  row :any} */
trait ActionRenderConfiganyNewL extends StObject {
  
  var addEditRecord: js.UndefOr[js.Function2[/* row */ Any, /* options */ js.UndefOr[AddLineOptions], Boolean]] = js.undefined
  
  def cancelEditable(key: RecordKey): Unit
  
  var cancelText: js.UndefOr[ReactNode] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var deletePopconfirmMessage: js.UndefOr[ReactNode] = js.undefined
  
  var deleteText: js.UndefOr[ReactNode] = js.undefined
  
  var editableKeys: js.UndefOr[js.Array[Key]] = js.undefined
  
  var editorType: js.UndefOr[typings.antDesignProUtils.antDesignProUtilsStrings.Array | Map] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var newLineConfig: js.UndefOr[NewLineConfig[Any]] = js.undefined
  
  var onCancel: js.UndefOr[
    js.Function4[
      /* key */ RecordKey, 
      /* record */ Any & `0`, 
      /* originRow */ Any & `0`, 
      /* newLineConfig */ js.UndefOr[NewLineConfig[Any]], 
      js.Promise[Any | Unit]
    ]
  ] = js.undefined
  
  var onDelete: js.UndefOr[js.Function2[/* key */ RecordKey, /* row */ Any & `0`, js.Promise[Any | Unit]]] = js.undefined
  
  var onSave: js.UndefOr[
    js.Function4[
      /* key */ RecordKey, 
      /* record */ Any & `0`, 
      /* originRow */ Any & `0`, 
      /* newLineConfig */ js.UndefOr[NewLineConfig[Any]], 
      js.Promise[Any | Unit]
    ]
  ] = js.undefined
  
  var recordKey: RecordKey
  
  var row: Any
  
  var saveText: js.UndefOr[ReactNode] = js.undefined
  
  def setEditableRowKeys(value: js.Array[Key]): Unit
  
  var tableName: js.UndefOr[NamePath] = js.undefined
}
object ActionRenderConfiganyNewL {
  
  inline def apply(
    cancelEditable: RecordKey => Unit,
    recordKey: RecordKey,
    row: Any,
    setEditableRowKeys: js.Array[Key] => Unit
  ): ActionRenderConfiganyNewL = {
    val __obj = js.Dynamic.literal(cancelEditable = js.Any.fromFunction1(cancelEditable), recordKey = recordKey.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], setEditableRowKeys = js.Any.fromFunction1(setEditableRowKeys))
    __obj.asInstanceOf[ActionRenderConfiganyNewL]
  }
  
  extension [Self <: ActionRenderConfiganyNewL](x: Self) {
    
    inline def setAddEditRecord(value: (/* row */ Any, /* options */ js.UndefOr[AddLineOptions]) => Boolean): Self = StObject.set(x, "addEditRecord", js.Any.fromFunction2(value))
    
    inline def setAddEditRecordUndefined: Self = StObject.set(x, "addEditRecord", js.undefined)
    
    inline def setCancelEditable(value: RecordKey => Unit): Self = StObject.set(x, "cancelEditable", js.Any.fromFunction1(value))
    
    inline def setCancelText(value: ReactNode): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDeletePopconfirmMessage(value: ReactNode): Self = StObject.set(x, "deletePopconfirmMessage", value.asInstanceOf[js.Any])
    
    inline def setDeletePopconfirmMessageUndefined: Self = StObject.set(x, "deletePopconfirmMessage", js.undefined)
    
    inline def setDeleteText(value: ReactNode): Self = StObject.set(x, "deleteText", value.asInstanceOf[js.Any])
    
    inline def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
    
    inline def setEditableKeys(value: js.Array[Key]): Self = StObject.set(x, "editableKeys", value.asInstanceOf[js.Any])
    
    inline def setEditableKeysUndefined: Self = StObject.set(x, "editableKeys", js.undefined)
    
    inline def setEditableKeysVarargs(value: Key*): Self = StObject.set(x, "editableKeys", js.Array(value*))
    
    inline def setEditorType(value: typings.antDesignProUtils.antDesignProUtilsStrings.Array | Map): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    inline def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNewLineConfig(value: NewLineConfig[Any]): Self = StObject.set(x, "newLineConfig", value.asInstanceOf[js.Any])
    
    inline def setNewLineConfigUndefined: Self = StObject.set(x, "newLineConfig", js.undefined)
    
    inline def setOnCancel(
      value: (/* key */ RecordKey, /* record */ Any & `0`, /* originRow */ Any & `0`, /* newLineConfig */ js.UndefOr[NewLineConfig[Any]]) => js.Promise[Any | Unit]
    ): Self = StObject.set(x, "onCancel", js.Any.fromFunction4(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnDelete(value: (/* key */ RecordKey, /* row */ Any & `0`) => js.Promise[Any | Unit]): Self = StObject.set(x, "onDelete", js.Any.fromFunction2(value))
    
    inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    inline def setOnSave(
      value: (/* key */ RecordKey, /* record */ Any & `0`, /* originRow */ Any & `0`, /* newLineConfig */ js.UndefOr[NewLineConfig[Any]]) => js.Promise[Any | Unit]
    ): Self = StObject.set(x, "onSave", js.Any.fromFunction4(value))
    
    inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
    
    inline def setRecordKey(value: RecordKey): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
    
    inline def setRecordKeyVarargs(value: Key*): Self = StObject.set(x, "recordKey", js.Array(value*))
    
    inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSaveText(value: ReactNode): Self = StObject.set(x, "saveText", value.asInstanceOf[js.Any])
    
    inline def setSaveTextUndefined: Self = StObject.set(x, "saveText", js.undefined)
    
    inline def setSetEditableRowKeys(value: js.Array[Key] => Unit): Self = StObject.set(x, "setEditableRowKeys", js.Any.fromFunction1(value))
    
    inline def setTableName(value: NamePath): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    
    inline def setTableNameVarargs(value: (String | Double)*): Self = StObject.set(x, "tableName", js.Array(value*))
  }
}
