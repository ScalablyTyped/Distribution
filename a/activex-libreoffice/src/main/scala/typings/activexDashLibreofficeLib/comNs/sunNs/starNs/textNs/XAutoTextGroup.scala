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

