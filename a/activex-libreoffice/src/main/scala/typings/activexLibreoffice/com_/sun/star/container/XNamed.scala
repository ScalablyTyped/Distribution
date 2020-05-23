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
trait XNamed extends XInterface {
  /** @returns the programmatic name of the object. */
  var Name: String
  /** @returns the programmatic name of the object. */
  def getName(): String
  /** sets the programmatic name of the object. */
  def setName(aName: String): Unit
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
}

