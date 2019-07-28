package typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleExtendedAttributes extends XInterface {
  val ExtendedAttributes: js.Any
  def getExtendedAttributes(): js.Any
}

object XAccessibleExtendedAttributes {
  @scala.inline
  def apply(
    ExtendedAttributes: js.Any,
    acquire: () => Unit,
    getExtendedAttributes: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleExtendedAttributes = {
    val __obj = js.Dynamic.literal(ExtendedAttributes = ExtendedAttributes, acquire = js.Any.fromFunction0(acquire), getExtendedAttributes = js.Any.fromFunction0(getExtendedAttributes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAccessibleExtendedAttributes]
  }
}

