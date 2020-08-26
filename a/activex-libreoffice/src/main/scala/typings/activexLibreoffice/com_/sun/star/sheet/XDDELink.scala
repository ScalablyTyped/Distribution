package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to change the settings of a DDE link.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.DDELink
  */
@js.native
trait XDDELink extends XInterface {
  /** returns the application from which data are requested (the DDE server application). */
  val Application: String = js.native
  /** returns the DDE item from which data are requested. */
  val Item: String = js.native
  /** returns the DDE topic from which data are requested. */
  val Topic: String = js.native
  /** returns the application from which data are requested (the DDE server application). */
  def getApplication(): String = js.native
  /** returns the DDE item from which data are requested. */
  def getItem(): String = js.native
  /** returns the DDE topic from which data are requested. */
  def getTopic(): String = js.native
}

object XDDELink {
  @scala.inline
  def apply(
    Application: String,
    Item: String,
    Topic: String,
    acquire: () => Unit,
    getApplication: () => String,
    getItem: () => String,
    getTopic: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDDELink = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Topic = Topic.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getApplication = js.Any.fromFunction0(getApplication), getItem = js.Any.fromFunction0(getItem), getTopic = js.Any.fromFunction0(getTopic), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDDELink]
  }
  @scala.inline
  implicit class XDDELinkOps[Self <: XDDELink] (val x: Self) extends AnyVal {
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
    def setApplication(value: String): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: String): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("Topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetApplication(value: () => String): Self = this.set("getApplication", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: () => String): Self = this.set("getItem", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTopic(value: () => String): Self = this.set("getTopic", js.Any.fromFunction0(value))
  }
  
}

