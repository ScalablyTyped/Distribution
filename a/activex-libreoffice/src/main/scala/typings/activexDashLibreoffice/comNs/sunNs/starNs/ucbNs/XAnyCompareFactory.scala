package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** creates an {@link XAnyCompare} instance. */
trait XAnyCompareFactory extends XInterface {
  /**
    * creates an {@link XAnyCompare} instance.
    * @param PropertyName is the name of a property
    * @returns a compare interface
    */
  def createAnyCompareByName(PropertyName: String): XAnyCompare
}

object XAnyCompareFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createAnyCompareByName: String => XAnyCompare,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAnyCompareFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createAnyCompareByName = js.Any.fromFunction1(createAnyCompareByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAnyCompareFactory]
  }
}

