package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceObject extends js.Object {
  val DOM: IXMLDOMDocument
  @JSName("InfoPath.DataSourceObject_typekey")
  var InfoPathDotDataSourceObject_typekey: DataSourceObject
  val Name: String
  val QueryAdapter: js.Any
  def Query(): Unit
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
}

