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

