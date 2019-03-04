package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates an {@link XAnyCompare} instance. */
trait XAnyCompareFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates an {@link XAnyCompare} instance.
    * @param PropertyName is the name of a property
    * @returns a compare interface
    */
  def createAnyCompareByName(PropertyName: java.lang.String): XAnyCompare
}

object XAnyCompareFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createAnyCompareByName: js.Function1[java.lang.String, XAnyCompare],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAnyCompareFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire, createAnyCompareByName = createAnyCompareByName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAnyCompareFactory]
  }
}

