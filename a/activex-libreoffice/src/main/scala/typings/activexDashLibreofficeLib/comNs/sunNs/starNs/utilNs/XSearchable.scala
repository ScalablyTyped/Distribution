package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enables the object to look for specified contents of the object (in particular, for a text range which contains a specific string pattern).
  *
  * Example: in a {@link com.sun.star.text.TextDocument} : set all "search for" to bold using {@link findFirst()} /findNext():
  *
  * {{program example here, see documentation}}
  */
trait XSearchable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a {@link SearchDescriptor} which contains properties that specify a search in this container.
    * @see SearchDescriptor
    */
  def createSearchDescriptor(): XSearchDescriptor
  /**
    * searches the contained texts for all occurrences of whatever is specified.
    * @see SearchDescriptor
    */
  def findAll(xDesc: XSearchDescriptor): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * searches the contained texts for the next occurrence of whatever is specified.
    * @returns the position within the component, e.g. a {@link com.sun.star.text.XTextRange} which determines the found elements.
    * @see SearchDescriptor
    */
  def findFirst(xDesc: XSearchDescriptor): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * searches the contained texts for the next occurrence of whatever is specified.
    * @param xStartAt represents a position within the component at which the search continues. This position is returned by {@link XSearchable.findFirst()} o
    * @param xDesc the descriptor used for searching.
    * @see SearchDescriptor
    */
  def findNext(xStartAt: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, xDesc: XSearchDescriptor): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

