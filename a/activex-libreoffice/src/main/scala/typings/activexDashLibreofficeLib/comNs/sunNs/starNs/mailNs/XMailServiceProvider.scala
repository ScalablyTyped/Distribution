package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating different mail services.
  * @since OOo 2.0
  */
trait XMailServiceProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * A factory method.
    * @param aType [in] the type of the requested mail service.
    * @returns A {@link XMailService} interface.
    * @see com.sun.star.mail.XMailServiceProvider
    * @see com.sun.star.mail.MailServiceType
    */
  def create(aType: MailServiceType): XMailService
}

object XMailServiceProvider {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    create: MailServiceType => XMailService,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMailServiceProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction1(create), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMailServiceProvider]
  }
}

