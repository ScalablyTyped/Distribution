package typings.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mail {
  /**
    * An {@link MailException} is the base of all mail related exceptions.
    * @since OOo 2.0
    */
  type MailException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  /**
    * A {@link NoMailServiceProviderException} will be thrown if an appropriate provider for requested mail service could not be found or could not be
    * created.
    * @see com.sun.star.mail.MailService
    * @since OOo 2.0
    */
  type NoMailServiceProviderException = typings.activexLibreoffice.com_.sun.star.mail.MailException
  /**
    * A {@link NoMailTransportProviderException} will be thrown if an appropriate provider for sending mail messages could not be found or could not be
    * created.
    * @see com.sun.star.mail.MailServer
    * @since OOo 2.0
    */
  type NoMailTransportProviderException = typings.activexLibreoffice.com_.sun.star.mail.MailException
}
