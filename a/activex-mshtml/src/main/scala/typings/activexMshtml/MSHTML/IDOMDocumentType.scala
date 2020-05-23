package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDOMDocumentType extends js.Object {
  @JSName("MSHTML.IDOMDocumentType_typekey")
  var MSHTMLDotIDOMDocumentType_typekey: IDOMDocumentType
  val entities: js.Any
  val internalSubset: js.Any
  val name: String
  val notations: js.Any
  val publicId: js.Any
  val systemId: js.Any
}

object IDOMDocumentType {
  @scala.inline
  def apply(
    MSHTMLDotIDOMDocumentType_typekey: IDOMDocumentType,
    entities: js.Any,
    internalSubset: js.Any,
    name: String,
    notations: js.Any,
    publicId: js.Any,
    systemId: js.Any
  ): IDOMDocumentType = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], internalSubset = internalSubset.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notations = notations.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMDocumentType_typekey")(MSHTMLDotIDOMDocumentType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMDocumentType]
  }
}

