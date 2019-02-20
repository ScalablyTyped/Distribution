package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to insert and remove elements in/from a container using an implicit (unique) ID. */
trait XImplicitIDContainer extends XImplicitIDReplace {
  /**
    * adds a new object to the container and generates an implicit (unique) ID for this object.
    * @returns the implicit ID for the new object.
    */
  def addWithImplicitID(aElement: js.Any): java.lang.String
  /** removes an object from the container which is specified by an implicit (unique) identifier. */
  def removeByImplicitID(ID: java.lang.String): scala.Unit
}

