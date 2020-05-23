package typings.activexLibreoffice.com_.sun.star.xml.xpath

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XXPathExtension extends XInterface {
  val Libxml2ExtensionHandle: typings.activexLibreoffice.com_.sun.star.xml.xpath.Libxml2ExtensionHandle
  def getLibxml2ExtensionHandle(): typings.activexLibreoffice.com_.sun.star.xml.xpath.Libxml2ExtensionHandle
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
}

