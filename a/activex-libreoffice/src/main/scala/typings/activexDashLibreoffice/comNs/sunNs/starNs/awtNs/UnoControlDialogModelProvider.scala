package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a service to load a dialog model and allows to access the control models inside
  * @since OOo 3.3
  */
trait UnoControlDialogModelProvider extends XNameContainer {
  /** Creates a new dialog model */
  def create(URL: String): Unit
}

object UnoControlDialogModelProvider {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    create: String => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertByName: (String, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit,
    replaceByName: (String, js.Any) => Unit
  ): UnoControlDialogModelProvider = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction1(create), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), replaceByName = js.Any.fromFunction2(replaceByName))
  
    __obj.asInstanceOf[UnoControlDialogModelProvider]
  }
}

