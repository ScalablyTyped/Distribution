package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceObject extends js.Object {
  val DOM: IXMLDOMDocument = js.native
  @JSName("InfoPath.DataSourceObject_typekey")
  var InfoPathDotDataSourceObject_typekey: DataSourceObject = js.native
  val Name: String = js.native
  val QueryAdapter: js.Any = js.native
  def Query(): Unit = js.native
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
  implicit class DataSourceObjectOps[Self <: DataSourceObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDOM(value: IXMLDOMDocument): Self = this.set("DOM", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoPathDotDataSourceObject_typekey(value: DataSourceObject): Self = this.set("InfoPath.DataSourceObject_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: () => Unit): Self = this.set("Query", js.Any.fromFunction0(value))
    @scala.inline
    def setQueryAdapter(value: js.Any): Self = this.set("QueryAdapter", value.asInstanceOf[js.Any])
  }
  
}

