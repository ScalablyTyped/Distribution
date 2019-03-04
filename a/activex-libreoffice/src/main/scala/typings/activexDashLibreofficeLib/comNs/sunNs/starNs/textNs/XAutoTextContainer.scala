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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertNewByName: js.Function1[java.lang.String, XAutoTextGroup],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit]
  ): XAutoTextContainer = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, insertNewByName = insertNewByName, queryInterface = queryInterface, release = release, removeByName = removeByName)
  
    __obj.asInstanceOf[XAutoTextContainer]
  }
}

