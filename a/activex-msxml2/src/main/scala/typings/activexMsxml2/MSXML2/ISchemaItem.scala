package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema Item */
trait ISchemaItem extends js.Object {
  @JSName("MSXML2.ISchemaItem_typekey")
  var MSXML2DotISchemaItem_typekey: ISchemaItem
  val id: String
  val itemType: SOMITEMTYPE
  val name: String
  val namespaceURI: String
  val schema: ISchema
  val unhandledAttributes: IVBSAXAttributes
  def writeAnnotation(annotationSink: js.Any): Boolean
}

object ISchemaItem {
  @scala.inline
  def apply(
    MSXML2DotISchemaItem_typekey: ISchemaItem,
    id: String,
    itemType: SOMITEMTYPE,
    name: String,
    namespaceURI: String,
    schema: ISchema,
    unhandledAttributes: IVBSAXAttributes,
    writeAnnotation: js.Any => Boolean
  ): ISchemaItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], unhandledAttributes = unhandledAttributes.asInstanceOf[js.Any], writeAnnotation = js.Any.fromFunction1(writeAnnotation))
    __obj.updateDynamic("MSXML2.ISchemaItem_typekey")(MSXML2DotISchemaItem_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchemaItem]
  }
}

