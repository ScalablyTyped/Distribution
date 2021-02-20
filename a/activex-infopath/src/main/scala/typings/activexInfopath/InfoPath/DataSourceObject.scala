package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceObject extends StObject {
  
  val DOM: IXMLDOMDocument = js.native
  
  @JSName("InfoPath.DataSourceObject_typekey")
  var InfoPathDotDataSourceObject_typekey: DataSourceObject = js.native
  
  val Name: String = js.native
  
  def Query(): Unit = js.native
  
  val QueryAdapter: js.Any = js.native
}
object DataSourceObject {
  
  @scala.inline
  def apply(
    DOM: IXMLDOMDocument,
    InfoPathDotDataSourceObject_typekey: DataSourceObject,
    Name: String,
    Query: () => Unit,
    QueryAdapter: js.Any
  ): DataSourceObject = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAdapter = QueryAdapter.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DataSourceObject_typekey")(InfoPathDotDataSourceObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceObject]
  }
  
  @scala.inline
  implicit class DataSourceObjectMutableBuilder[Self <: DataSourceObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDOM(value: IXMLDOMDocument): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotDataSourceObject_typekey(value: DataSourceObject): Self = StObject.set(x, "InfoPath.DataSourceObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: () => Unit): Self = StObject.set(x, "Query", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryAdapter(value: js.Any): Self = StObject.set(x, "QueryAdapter", value.asInstanceOf[js.Any])
  }
}
