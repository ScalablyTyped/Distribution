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

