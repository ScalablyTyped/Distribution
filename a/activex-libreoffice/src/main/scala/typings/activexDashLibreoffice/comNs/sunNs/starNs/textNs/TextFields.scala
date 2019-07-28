package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a collection of {@link TextField} instances. */
trait TextFields
  extends XEnumerationAccess
     with XRefreshable

object TextFields {
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    addRefreshListener: XRefreshListener => Unit,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeRefreshListener: XRefreshListener => Unit
  ): TextFields = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener))
  
    __obj.asInstanceOf[TextFields]
  }
}

