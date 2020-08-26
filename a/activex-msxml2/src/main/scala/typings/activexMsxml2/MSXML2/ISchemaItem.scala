package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema Item */
@js.native
trait ISchemaItem extends js.Object {
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
  @scala.inline
  implicit class ISchemaItemOps[Self <: ISchemaItem] (val x: Self) extends AnyVal {
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
    def setMSXML2DotISchemaItem_typekey(value: ISchemaItem): Self = this.set("MSXML2.ISchemaItem_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemType(value: SOMITEMTYPE): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("namespaceURI", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: ISchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnhandledAttributes(value: IVBSAXAttributes): Self = this.set("unhandledAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteAnnotation(value: js.Any => Boolean): Self = this.set("writeAnnotation", js.Any.fromFunction1(value))
  }
  
}

