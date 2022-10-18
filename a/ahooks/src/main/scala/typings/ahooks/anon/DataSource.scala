package typings.ahooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource[TData /* <: typings.ahooks.libUseAntdTableTypesMod.Data */] extends StObject {
  
  var dataSource: /* import warning: importer.ImportType#apply Failed type conversion: TData['list'] */ js.Any
  
  var loading: Boolean
  
  def onFilter(filterParams: Any): Unit
  
  def onSort(dataIndex: String, order: String): Unit
}
object DataSource {
  
  inline def apply[TData /* <: typings.ahooks.libUseAntdTableTypesMod.Data */](
    dataSource: /* import warning: importer.ImportType#apply Failed type conversion: TData['list'] */ js.Any,
    loading: Boolean,
    onFilter: Any => Unit,
    onSort: (String, String) => Unit
  ): DataSource[TData] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], onFilter = js.Any.fromFunction1(onFilter), onSort = js.Any.fromFunction2(onSort))
    __obj.asInstanceOf[DataSource[TData]]
  }
  
  extension [Self <: DataSource[?], TData /* <: typings.ahooks.libUseAntdTableTypesMod.Data */](x: Self & DataSource[TData]) {
    
    inline def setDataSource(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TData['list'] */ js.Any
    ): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setOnFilter(value: Any => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
    
    inline def setOnSort(value: (String, String) => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction2(value))
  }
}
