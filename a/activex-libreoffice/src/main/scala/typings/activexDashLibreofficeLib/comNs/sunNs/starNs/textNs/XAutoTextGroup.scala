package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface provide methods to insert, rename and delete autotext entries from the current autotext group. */
trait XAutoTextGroup
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /** returns the titles of all autotext entries. The order of the entries corresponds to the output of the function {@link getElementNames()} . */
  val Titles: stdLib.SafeArray[java.lang.String]
  /** returns the titles of all autotext entries. The order of the entries corresponds to the output of the function {@link getElementNames()} . */
  def getTitles(): stdLib.SafeArray[java.lang.String]
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
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    Titles: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getTitles: () => stdLib.SafeArray[java.lang.String],
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    insertNewByName: (java.lang.String, java.lang.String, XTextRange) => XAutoTextEntry,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByName: java.lang.String => scala.Unit,
    renameByName: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit
  ): XAutoTextGroup = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, Titles = Titles, acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getTitles = js.Any.fromFunction0(getTitles), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction3(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), renameByName = js.Any.fromFunction3(renameByName))
  
    __obj.asInstanceOf[XAutoTextGroup]
  }
}

