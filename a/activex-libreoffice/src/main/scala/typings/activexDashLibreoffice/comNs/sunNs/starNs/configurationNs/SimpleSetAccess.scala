package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainerListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XStringEscape
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a dynamic, homogeneous, nonhierarchical set of values or objects.
  *
  * Also provides information about the template for elements. Allows normalizing externally generated names.
  *
  * **Sets** are dynamic containers.
  *
  * The number and names of contained elements is not fixed in advance, but all elements have to be of one predetermined type.
  */
trait SimpleSetAccess
  extends XNameAccess
     with XTemplateContainer
     with XStringEscape
     with XContainer

object SimpleSetAccess {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementTemplateName: String,
    ElementType: `type`,
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    escapeString: String => String,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementTemplateName: () => String,
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeContainerListener: XContainerListener => Unit,
    unescapeString: String => String
  ): SimpleSetAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementTemplateName = ElementTemplateName, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), escapeString = js.Any.fromFunction1(escapeString), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementTemplateName = js.Any.fromFunction0(getElementTemplateName), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), unescapeString = js.Any.fromFunction1(unescapeString))
  
    __obj.asInstanceOf[SimpleSetAccess]
  }
}

