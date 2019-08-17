package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object containerNs {
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception

  /**
    * is thrown by container methods, if an element is added which is already a child of the container.
    *
    * Probably not the same element is already a member, when this exception is thrown, but a member with the same id or name.
    * @see XNameContainer
    * @see XNameContainer.insertByName
    */
  type ElementExistException = Exception
  /**
    * is thrown by child access methods of collections, if the addressed child does not exist.
    * @see XEnumeration
    * @see XEnumeration.nextElement
    */
  type NoSuchElementException = Exception
}
