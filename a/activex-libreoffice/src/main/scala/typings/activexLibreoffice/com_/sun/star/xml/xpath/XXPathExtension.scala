package typings.activexLibreoffice.com_.sun.star.xml.xpath

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XXPathExtension extends XInterface {
  val Libxml2ExtensionHandle: typings.activexLibreoffice.com_.sun.star.xml.xpath.Libxml2ExtensionHandle = js.native
  def getLibxml2ExtensionHandle(): typings.activexLibreoffice.com_.sun.star.xml.xpath.Libxml2ExtensionHandle = js.native
}

object XXPathExtension {
  @scala.inline
  def apply(
    Libxml2ExtensionHandle: Libxml2ExtensionHandle,
    acquire: () => Unit,
    getLibxml2ExtensionHandle: () => Libxml2ExtensionHandle,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XXPathExtension = {
    val __obj = js.Dynamic.literal(Libxml2ExtensionHandle = Libxml2ExtensionHandle.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLibxml2ExtensionHandle = js.Any.fromFunction0(getLibxml2ExtensionHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XXPathExtension]
  }
  @scala.inline
  implicit class XXPathExtensionOps[Self <: XXPathExtension] (val x: Self) extends AnyVal {
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
    def setLibxml2ExtensionHandle(value: Libxml2ExtensionHandle): Self = this.set("Libxml2ExtensionHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLibxml2ExtensionHandle(value: () => Libxml2ExtensionHandle): Self = this.set("getLibxml2ExtensionHandle", js.Any.fromFunction0(value))
  }
  
}

