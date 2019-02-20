package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to insert, remove and access named objects. */
trait XNamingService extends XInterface {
  /** provides a previous registered object. */
  def getRegisteredObject(Name: java.lang.String): XInterface
  /**
    * registers one object under the specified name.
    *
    * If any object is registered before, then this object is revoked automatically.
    */
  def registerObject(Name: java.lang.String, Object: XInterface): scala.Unit
  /**
    * revokes the registration of an object.
    *
    * If the object was not previously registered, then this call does nothing.
    */
  def revokeObject(Name: java.lang.String): scala.Unit
}

