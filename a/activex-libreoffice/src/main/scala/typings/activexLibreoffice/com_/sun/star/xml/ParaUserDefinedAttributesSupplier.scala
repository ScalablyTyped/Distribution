package typings.activexLibreoffice.com_.sun.star.xml

import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A component that supports this service preserves XML attributes, unknown by its parser, that belong to the XML element representing it (the
  * component).
  * @since OOo 2.0.4
  */
@js.native
trait ParaUserDefinedAttributesSupplier extends js.Object {
  /**
    * This container holds the {@link AttributeData} elements that represent uninterpreted XML attributes of a paragraph.
    *
    * The idea behind this property is that a parser can stow away all attributes that it cannot handle by itself on reading an XML file. When the file is
    * stored again, the unknown attributes can be written back without loss.
    *
    * The {@link com.sun.star.container.XNameContainer} supports the service {@link AttributeContainer} .
    */
  var ParaUserDefinedAttributes: XNameContainer = js.native
}

object ParaUserDefinedAttributesSupplier {
  @scala.inline
  def apply(ParaUserDefinedAttributes: XNameContainer): ParaUserDefinedAttributesSupplier = {
    val __obj = js.Dynamic.literal(ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParaUserDefinedAttributesSupplier]
  }
  @scala.inline
  implicit class ParaUserDefinedAttributesSupplierOps[Self <: ParaUserDefinedAttributesSupplier] (val x: Self) extends AnyVal {
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
    def setParaUserDefinedAttributes(value: XNameContainer): Self = this.set("ParaUserDefinedAttributes", value.asInstanceOf[js.Any])
  }
  
}

