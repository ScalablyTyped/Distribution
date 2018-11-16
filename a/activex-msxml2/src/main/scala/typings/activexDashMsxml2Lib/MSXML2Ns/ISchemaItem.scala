package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema Item */
@JSGlobal("MSXML2.ISchemaItem")
@js.native
class ISchemaItem protected () extends js.Object {
  var `MSXML2.ISchemaItem_typekey`: ISchemaItem = js.native
  val id: java.lang.String = js.native
  val itemType: SOMITEMTYPE = js.native
  val name: java.lang.String = js.native
  val namespaceURI: java.lang.String = js.native
  val schema: ISchema = js.native
  val unhandledAttributes: IVBSAXAttributes = js.native
  def writeAnnotation(annotationSink: js.Any): scala.Boolean = js.native
}

