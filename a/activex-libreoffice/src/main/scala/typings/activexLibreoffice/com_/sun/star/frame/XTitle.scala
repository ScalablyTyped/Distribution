package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** an interface representing an entity with a modifyable title. */
@js.native
trait XTitle extends XInterface {
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  var Title: String = js.native
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  def getTitle(): String = js.native
  /**
    * Sets the title of the object.
    * @param sTitle The title.
    */
  def setTitle(sTitle: String): Unit = js.native
}

object XTitle {
  @scala.inline
  def apply(
    Title: String,
    acquire: () => Unit,
    getTitle: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): XTitle = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTitle = js.Any.fromFunction0(getTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XTitle]
  }
  @scala.inline
  implicit class XTitleOps[Self <: XTitle] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setSetTitle(value: String => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
  
}

