package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set the size of the underlying data of a stream to zero. */
@js.native
trait XTruncate extends XInterface {
  /** sets the size of the underlying data of the stream to zero. */
  def truncate(): Unit = js.native
}

object XTruncate {
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, truncate: () => Unit): XTruncate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), truncate = js.Any.fromFunction0(truncate))
    __obj.asInstanceOf[XTruncate]
  }
  @scala.inline
  implicit class XTruncateOps[Self <: XTruncate] (val x: Self) extends AnyVal {
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
    def setTruncate(value: () => Unit): Self = this.set("truncate", js.Any.fromFunction0(value))
  }
  
}

