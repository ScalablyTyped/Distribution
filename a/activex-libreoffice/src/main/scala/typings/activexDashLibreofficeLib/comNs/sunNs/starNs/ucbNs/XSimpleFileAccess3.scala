package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is an extension to the interface {@link XSimpleFileAccess2} .
  * @since OOo 1.1.2
  */
trait XSimpleFileAccess3 extends XSimpleFileAccess2 {
  /**
    * Checks if a file is "hidden"
    * @param FileURL URL to be checked
    * @returns true, if the given File is "hidden", false otherwise
    */
  def isHidden(FileURL: java.lang.String): scala.Boolean
  /**
    * Sets the "hidden" of a file according to the boolean parameter, if the actual process has the right to do so and the used operation system supports
    * this operation.
    * @param FileURL URL of the file
    * @param bHidden true; "hidden" flag will be set, false; "hidden" flag will be reset
    */
  def setHidden(FileURL: java.lang.String, bHidden: scala.Boolean): scala.Unit
}

