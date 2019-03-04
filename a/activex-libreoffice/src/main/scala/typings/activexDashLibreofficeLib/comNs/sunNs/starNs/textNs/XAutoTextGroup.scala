package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface provide methods to insert, rename and delete autotext entries from the current autotext group. */
trait XAutoTextGroup
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /** returns the titles of all autotext entries. The order of the entries corresponds to the output of the function {@link getElementNames()} . */
  val Titles: activexDashInteropLib.SafeArray[java.lang.String]
  /** returns the titles of all autotext entries. The order of the entries corresponds to the output of the function {@link getElementNames()} . */
  def getTitles(): activexDashInteropLib.SafeArray[java.lang.String]
  /** creates a new {@link AutoTextEntry} entry. */
  def insertNewByName(aName: java.lang.String, aTitle: java.lang.String, xTextRange: XTextRange): XAutoTextEntry
  /** removes the specified autotext entry. */
  def removeByName(aEntryName: java.lang.String): scala.Unit
  /**
    * renames an entry in the autotext group.
    *
    * The position of the autotext entry is not changed.
    */
  def renameByName(
    aElementName: java.lang.String,
    aNewElementName: java.lang.String,
    aNewElementTitle: java.lang.String
  ): scala.Unit
}

object XAutoTextGroup {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    Titles: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getTitles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertNewByName: js.Function3[java.lang.String, java.lang.String, XTextRange, XAutoTextEntry],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    renameByName: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit]
  ): XAutoTextGroup = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, Titles = Titles, acquire = acquire, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, getTitles = getTitles, hasByName = hasByName, hasElements = hasElements, insertNewByName = insertNewByName, queryInterface = queryInterface, release = release, removeByName = removeByName, renameByName = renameByName)
  
    __obj.asInstanceOf[XAutoTextGroup]
  }
}

