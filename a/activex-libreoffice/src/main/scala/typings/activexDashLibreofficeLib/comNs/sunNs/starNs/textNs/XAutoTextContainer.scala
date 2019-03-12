package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * handles blocks of {@link AutoTextEntry} .
  * @see AutoTextContainer
  */
trait XAutoTextContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /**
    * creates a new AutoText group.
    * @param aGroupName the name of the {@link AutoTextContainer}  The name must follow the pattern `groupname*pathid` , where:  `groupname` should contain on
    */
  def insertNewByName(aGroupName: java.lang.String): XAutoTextGroup
  /**
    * deletes the specified AutoText group.
    * @param aGroupName see the documentation for {@link XAutoTextContainer.insertNewByName()}
    */
  def removeByName(aGroupName: java.lang.String): scala.Unit
}

object XAutoTextContainer {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    insertNewByName: java.lang.String => XAutoTextGroup,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByName: java.lang.String => scala.Unit
  ): XAutoTextContainer = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction1(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
  
    __obj.asInstanceOf[XAutoTextContainer]
  }
}

