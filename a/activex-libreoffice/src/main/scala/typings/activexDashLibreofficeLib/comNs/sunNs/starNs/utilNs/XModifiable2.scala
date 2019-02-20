package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to control modifiable state change.
  *
  * This interface allows to prevent changing of the modified state of the object. It is introduced for performance optimizations, to allow to prevent
  * unnecessary updates, for example while importing a document. Please use this interface very carefully.
  */
trait XModifiable2 extends XModifiable {
  /**
    * disable possibility to change modified state of the document
    * @returns the value that says whether the modified state change was enabled before the call `TRUE` the changing of the modified state was already disabled
    */
  def disableSetModified(): scala.Boolean
  /**
    * enable possibility to change modified state of the document
    * @returns the value that says whether the modified state change was enabled before the call `TRUE` the changing of the modified state was disabled `FALSE`
    */
  def enableSetModified(): scala.Boolean
  /** allows to detect whether the modified state change is enabled */
  def isSetModifiedEnabled(): scala.Boolean
}

