package typings.activexLibreoffice.com_.sun.star.xml.xpath

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.xforms.XModel
import typings.activexLibreoffice.com_.sun.star.xml.dom.XNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XPathExtension extends XXPathExtension {
  def createWithModel(Model: XModel, ContextNode: XNode): Unit = js.native
}

object XPathExtension {
  @scala.inline
  def apply(
    Libxml2ExtensionHandle: Libxml2ExtensionHandle,
    acquire: () => Unit,
    createWithModel: (XModel, XNode) => Unit,
    getLibxml2ExtensionHandle: () => Libxml2ExtensionHandle,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPathExtension = {
    val __obj = js.Dynamic.literal(Libxml2ExtensionHandle = Libxml2ExtensionHandle.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createWithModel = js.Any.fromFunction2(createWithModel), getLibxml2ExtensionHandle = js.Any.fromFunction0(getLibxml2ExtensionHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPathExtension]
  }
  @scala.inline
  implicit class XPathExtensionOps[Self <: XPathExtension] (val x: Self) extends AnyVal {
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
    def setCreateWithModel(value: (XModel, XNode) => Unit): Self = this.set("createWithModel", js.Any.fromFunction2(value))
  }
  
}

