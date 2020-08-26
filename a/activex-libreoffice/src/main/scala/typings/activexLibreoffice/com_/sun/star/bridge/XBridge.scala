package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** main interface for an interprocess bridge. */
@js.native
trait XBridge extends XInterface {
  /** a unique descriptive string: protocol + ":" + XConnection.getDescription() */
  val Description: String = js.native
  /** name that the bridge got when it was created. */
  val Name: String = js.native
  /** a unique descriptive string: protocol + ":" + XConnection.getDescription() */
  def getDescription(): String = js.native
  /**
    * tries to get an interface from the remote that is known by this name.
    *
    * In general, this method is called once to get the initial object from the remote, but it is allowed to call the method multiple times.
    * @param sInstanceName The name of the object, that shall be retrieved from the remote process. The call is delegated to {@link com.sun.star.bridge.XInsta
    * @see com.sun.star.bridge.XInstanceProvider
    */
  def getInstance(sInstanceName: String): XInterface = js.native
  /** name that the bridge got when it was created. */
  def getName(): String = js.native
}

object XBridge {
  @scala.inline
  def apply(
    Description: String,
    Name: String,
    acquire: () => Unit,
    getDescription: () => String,
    getInstance: String => XInterface,
    getName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBridge = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDescription = js.Any.fromFunction0(getDescription), getInstance = js.Any.fromFunction1(getInstance), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBridge]
  }
  @scala.inline
  implicit class XBridgeOps[Self <: XBridge] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDescription(value: () => String): Self = this.set("getDescription", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInstance(value: String => XInterface): Self = this.set("getInstance", js.Any.fromFunction1(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
  }
  
}

