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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    resolveEntity: js.Function2[java.lang.String, java.lang.String, InputSource]
  ): XEntityResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("resolveEntity")(resolveEntity)
    __obj.asInstanceOf[XEntityResolver]
  }
}

