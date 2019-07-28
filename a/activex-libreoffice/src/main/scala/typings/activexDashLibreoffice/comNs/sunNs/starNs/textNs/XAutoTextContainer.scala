package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * handles blocks of {@link AutoTextEntry} .
  * @see AutoTextContainer
  */
trait XAutoTextContainer extends XNameAccess {
  /**
    * creates a new AutoText group.
    * @param aGroupName the name of the {@link AutoTextContainer}  The name must follow the pattern `groupname*pathid` , where:  `groupname` should contain on
    */
  def insertNewByName(aGroupName: String): XAutoTextGroup
  /**
    * deletes the specified AutoText group.
    * @param aGroupName see the documentation for {@link XAutoTextContainer.insertNewByName()}
    */
  def removeByName(aGroupName: String): Unit
}

object XAutoTextContainer {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertNewByName: String => XAutoTextGroup,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit
  ): XAutoTextContainer = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction1(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
  
    __obj.asInstanceOf[XAutoTextContainer]
  }
}

