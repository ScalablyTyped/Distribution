package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to modify the behavior of resolving external preferences.
  *
  * Usually, the parser has a default behavior of resolving external references (See documentation of the parser implementation). Use this interface to
  * modify or reimplement this behavior.
  */
trait XEntityResolver
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns {@link InputSource} for the external entity.  If **aInputStream** is a valid reference to an input stream, the parser uses this {@link InputSourc */
  def resolveEntity(sPublicId: java.lang.String, sSystemId: java.lang.String): InputSource
}

object XEntityResolver {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    resolveEntity: (java.lang.String, java.lang.String) => InputSource
  ): XEntityResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolveEntity = js.Any.fromFunction2(resolveEntity))
  
    __obj.asInstanceOf[XEntityResolver]
  }
}

