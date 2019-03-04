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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    FilePath: java.lang.String,
    Name: java.lang.String,
    Title: java.lang.String,
    Titles: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getCount: js.Function0[scala.Double],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getName: js.Function0[java.lang.String],
    getTitles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertNewByName: js.Function3[java.lang.String, java.lang.String, XTextRange, XAutoTextEntry],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    renameByName: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): AutoTextGroup = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, FilePath = FilePath, Name = Name, Title = Title, Titles = Titles, acquire = acquire, getByIndex = getByIndex, getByName = getByName, getCount = getCount, getElementNames = getElementNames, getElementType = getElementType, getName = getName, getTitles = getTitles, hasByName = hasByName, hasElements = hasElements, insertNewByName = insertNewByName, queryInterface = queryInterface, release = release, removeByName = removeByName, renameByName = renameByName, setName = setName)
  
    __obj.asInstanceOf[AutoTextGroup]
  }
}

