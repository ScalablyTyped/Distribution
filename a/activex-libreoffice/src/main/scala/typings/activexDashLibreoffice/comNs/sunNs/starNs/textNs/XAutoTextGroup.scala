package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface provide methods to insert, rename and delete autotext entries from the current autotext group. */
trait XAutoTextGroup extends XNameAccess {
  /** returns the titles of all autotext entries. The order of the entries corresponds to the output of the function {@link getElementNames()} . */
  val Titles: SafeArray[String]
  /** returns the titles of all autotext entries. The order of the entries corresponds to the output of the function {@link getElementNames()} . */
  def getTitles(): SafeArray[String]
  /** creates a new {@link AutoTextEntry} entry. */
  def insertNewByName(aName: String, aTitle: String, xTextRange: XTextRange): XAutoTextEntry
  /** removes the specified autotext entry. */
  def removeByName(aEntryName: String): Unit
  /**
    * renames an entry in the autotext group.
    *
    * The position of the autotext entry is not changed.
    */
  def renameByName(aElementName: String, aNewElementName: String, aNewElementTitle: String): Unit
}

object XAutoTextGroup {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    Titles: SafeArray[String],
    acquire: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getTitles: () => SafeArray[String],
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertNewByName: (String, String, XTextRange) => XAutoTextEntry,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit,
    renameByName: (String, String, String) => Unit
  ): XAutoTextGroup = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, Titles = Titles, acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getTitles = js.Any.fromFunction0(getTitles), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction3(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), renameByName = js.Any.fromFunction3(renameByName))
  
    __obj.asInstanceOf[XAutoTextGroup]
  }
}

