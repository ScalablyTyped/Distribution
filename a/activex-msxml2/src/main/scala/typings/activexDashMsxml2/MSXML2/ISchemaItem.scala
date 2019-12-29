package typings.activexDashMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema Item */
@JSGlobal("MSXML2.ISchemaItem")
@js.native
class ISchemaItem protected () extends js.Object {
  @JSName("MSXML2.ISchemaItem_typekey")
  var MSXML2DotISchemaItem_typekey: ISchemaItem = js.native
  val id: String = js.native
  val itemType: SOMITEMTYPE = js.native
  val name: String = js.native
  val namespaceURI: String = js.native
  val schema: ISchema = js.native
  val unhandledAttributes: IVBSAXAttributes = js.native
  def writeAnnotation(annotationSink: js.Any): Boolean = js.native
}

