package typings.ahooks

import org.scalablytyped.runtime.StringDictionary
import typings.ahooks.ahooksStrings.advance
import typings.ahooks.ahooksStrings.simple
import typings.ahooks.anon.ChangeCurrent
import typings.ahooks.anon.ChangeType
import typings.ahooks.anon.DataSource
import typings.ahooks.anon.Dictkey
import typings.ahooks.usePaginationTypesMod.PaginationOptions
import typings.ahooks.usePaginationTypesMod.PaginationResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Antd3ValidateFields = js.Function2[
    /* fieldNames */ js.Array[String], 
    /* callback */ js.Function2[/* errors */ Any, /* values */ Record[String, Any], Unit], 
    Unit
  ]
  
  type Antd4ValidateFields = js.Function1[/* fieldNames */ js.UndefOr[js.Array[String]], js.Promise[Record[String, Any]]]
  
  trait AntdFormUtils
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var getFieldInstance: js.UndefOr[js.Function1[/* name */ String, Record[String, Any]]] = js.undefined
    
    def getFieldsValue(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Record[String, Any]
    
    var getInternalHooks: js.UndefOr[Any] = js.undefined
    
    def resetFields(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): Unit
    
    def setFieldsValue(value: Record[String, Any]): Unit
    
    var validateFields: Antd3ValidateFields | Antd4ValidateFields
  }
  object AntdFormUtils {
    
    inline def apply(
      getFieldsValue: Any => Record[String, Any],
      resetFields: Any => Unit,
      setFieldsValue: Record[String, Any] => Unit,
      validateFields: Antd3ValidateFields | Antd4ValidateFields
    ): AntdFormUtils = {
      val __obj = js.Dynamic.literal(getFieldsValue = js.Any.fromFunction1(getFieldsValue), resetFields = js.Any.fromFunction1(resetFields), setFieldsValue = js.Any.fromFunction1(setFieldsValue), validateFields = validateFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntdFormUtils]
    }
    
    extension [Self <: AntdFormUtils](x: Self) {
      
      inline def setGetFieldInstance(value: /* name */ String => Record[String, Any]): Self = StObject.set(x, "getFieldInstance", js.Any.fromFunction1(value))
      
      inline def setGetFieldInstanceUndefined: Self = StObject.set(x, "getFieldInstance", js.undefined)
      
      inline def setGetFieldsValue(value: Any => Record[String, Any]): Self = StObject.set(x, "getFieldsValue", js.Any.fromFunction1(value))
      
      inline def setGetInternalHooks(value: Any): Self = StObject.set(x, "getInternalHooks", value.asInstanceOf[js.Any])
      
      inline def setGetInternalHooksUndefined: Self = StObject.set(x, "getInternalHooks", js.undefined)
      
      inline def setResetFields(value: Any => Unit): Self = StObject.set(x, "resetFields", js.Any.fromFunction1(value))
      
      inline def setSetFieldsValue(value: Record[String, Any] => Unit): Self = StObject.set(x, "setFieldsValue", js.Any.fromFunction1(value))
      
      inline def setValidateFields(value: Antd3ValidateFields | Antd4ValidateFields): Self = StObject.set(x, "validateFields", value.asInstanceOf[js.Any])
      
      inline def setValidateFieldsFunction1(value: /* fieldNames */ js.UndefOr[js.Array[String]] => js.Promise[Record[String, Any]]): Self = StObject.set(x, "validateFields", js.Any.fromFunction1(value))
      
      inline def setValidateFieldsFunction2(
        value: (/* fieldNames */ js.Array[String], /* callback */ js.Function2[/* errors */ Any, /* values */ Record[String, Any], Unit]) => Unit
      ): Self = StObject.set(x, "validateFields", js.Any.fromFunction2(value))
    }
  }
  
  trait AntdTableOptions[TData /* <: Data */, TParams /* <: Params */]
    extends StObject
       with PaginationOptions[TData, TParams] {
    
    var defaultType: js.UndefOr[simple | advance] = js.undefined
    
    var form: js.UndefOr[AntdFormUtils] = js.undefined
  }
  object AntdTableOptions {
    
    inline def apply[TData /* <: Data */, TParams /* <: Params */](): AntdTableOptions[TData, TParams] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntdTableOptions[TData, TParams]]
    }
    
    extension [Self <: AntdTableOptions[?, ?], TData /* <: Data */, TParams /* <: Params */](x: Self & (AntdTableOptions[TData, TParams])) {
      
      inline def setDefaultType(value: simple | advance): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
      
      inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
      
      inline def setForm(value: AntdFormUtils): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    }
  }
  
  trait AntdTableResult[TData /* <: Data */, TParams /* <: Params */]
    extends StObject
       with PaginationResult[TData, TParams] {
    
    var search: ChangeType
    
    var tableProps: DataSource[TData]
  }
  object AntdTableResult {
    
    inline def apply[TData /* <: Data */, TParams /* <: Params */](
      cancel: () => Unit,
      loading: Boolean,
      mutate: /* data */ js.UndefOr[TData | (js.Function1[/* oldData */ js.UndefOr[TData], js.UndefOr[TData]])] => Unit,
      pagination: ChangeCurrent,
      params: TParams | js.Array[Any],
      refresh: () => Unit,
      refreshAsync: () => js.Promise[TData],
      run: TParams => Unit,
      runAsync: TParams => js.Promise[TData],
      search: ChangeType,
      tableProps: DataSource[TData]
    ): AntdTableResult[TData, TParams] = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), loading = loading.asInstanceOf[js.Any], mutate = js.Any.fromFunction1(mutate), pagination = pagination.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), refreshAsync = js.Any.fromFunction0(refreshAsync), run = js.Any.fromFunction1(run), runAsync = js.Any.fromFunction1(runAsync), search = search.asInstanceOf[js.Any], tableProps = tableProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntdTableResult[TData, TParams]]
    }
    
    extension [Self <: AntdTableResult[?, ?], TData /* <: Data */, TParams /* <: Params */](x: Self & (AntdTableResult[TData, TParams])) {
      
      inline def setSearch(value: ChangeType): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setTableProps(value: DataSource[TData]): Self = StObject.set(x, "tableProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var list: js.Array[Any]
    
    var total: Double
  }
  object Data {
    
    inline def apply(list: js.Array[Any], total: Double): Data = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setList(value: js.Array[Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: Any*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type Params = Array[Dictkey | Any]
  
  type Service[TData /* <: Data */, TParams /* <: Params */] = js.Function1[/* args */ TParams, js.Promise[TData]]
}
