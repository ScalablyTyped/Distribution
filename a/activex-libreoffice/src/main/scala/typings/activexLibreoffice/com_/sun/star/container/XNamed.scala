package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the name of the object.
  *
  * The name is generally unique in the container of the object.
  */
@js.native
trait XNamed extends XInterface {
  /** @returns the programmatic name of the object. */
  var Name: String = js.native
  /** @returns the programmatic name of the object. */
  def getName(): String = js.native
  /** sets the programmatic name of the object. */
  def setName(aName: String): Unit = js.native
}

object XNamed {
  @scala.inline
  def apply(
    Name: String,
    acquire: () => Unit,
    getName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit
  ): XNamed = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[XNamed]
  }
  @scala.inline
  implicit class XNamedOps[Self <: XNamed] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setSetName(value: String => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
  }
  
}

