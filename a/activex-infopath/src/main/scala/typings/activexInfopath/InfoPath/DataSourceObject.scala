package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceObject extends StObject {
  
  val DOM: IXMLDOMDocument
  
  /* private */ @JSName("InfoPath.DataSourceObject_typekey")
  var InfoPathDotDataSourceObject_typekey: DataSourceObject
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAdapter: Any
}
object DataSourceObject {
  
  inline def apply(
    DOM: IXMLDOMDocument,
    InfoPathDotDataSourceObject_typekey: DataSourceObject,
    Name: String,
    Query: () => Unit,
    QueryAdapter: Any
  ): DataSourceObject = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAdapter = QueryAdapter.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DataSourceObject_typekey")(InfoPathDotDataSourceObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceObject] (val x: Self) extends AnyVal {
    
    inline def setDOM(value: IXMLDOMDocument): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotDataSourceObject_typekey(value: DataSourceObject): Self = StObject.set(x, "InfoPath.DataSourceObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    inline def setQueryAdapter(value: Any): Self = StObject.set(x, "QueryAdapter", value.asInstanceOf[js.Any])
  }
}
