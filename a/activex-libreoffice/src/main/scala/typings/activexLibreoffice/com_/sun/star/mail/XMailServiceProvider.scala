package typings.activexLibreoffice.com_.sun.star.mail

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating different mail services.
  * @since OOo 2.0
  */
@js.native
trait XMailServiceProvider extends XInterface {
  /**
    * A factory method.
    * @param aType [in] the type of the requested mail service.
    * @returns A {@link XMailService} interface.
    * @see com.sun.star.mail.XMailServiceProvider
    * @see com.sun.star.mail.MailServiceType
    */
  def create(aType: MailServiceType): XMailService = js.native
}

object XMailServiceProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    create: MailServiceType => XMailService,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMailServiceProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction1(create), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMailServiceProvider]
  }
  @scala.inline
  implicit class XMailServiceProviderOps[Self <: XMailServiceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: MailServiceType => XMailService): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

