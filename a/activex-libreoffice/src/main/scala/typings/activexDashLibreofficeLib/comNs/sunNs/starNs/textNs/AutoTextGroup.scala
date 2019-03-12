package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to text blocks in a group.
  * @see com.sun.star.text.AutoTextContainer
  */
trait AutoTextGroup
  extends XAutoTextGroup
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** The path to the file containing the {@link AutoTextEntry} 's in this group */
  var FilePath: java.lang.String
  /** The title of this {@link AutoTextGroup} */
  var Title: java.lang.String
}

object AutoTextGroup {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    FilePath: java.lang.String,
    Name: java.lang.String,
    Title: java.lang.String,
    Titles: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getByName: java.lang.String => js.Any,
    getCount: () => scala.Double,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getName: () => java.lang.String,
    getTitles: () => stdLib.SafeArray[java.lang.String],
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    insertNewByName: (java.lang.String, java.lang.String, XTextRange) => XAutoTextEntry,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByName: java.lang.String => scala.Unit,
    renameByName: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    setName: java.lang.String => scala.Unit
  ): AutoTextGroup = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, FilePath = FilePath, Name = Name, Title = Title, Titles = Titles, acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), getTitles = js.Any.fromFunction0(getTitles), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction3(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), renameByName = js.Any.fromFunction3(renameByName), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[AutoTextGroup]
  }
}

