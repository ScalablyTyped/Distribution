package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a range of cells that can be merged. */
@js.native
trait XMergeable extends XInterface {
  /** @returns `TRUE` if the area specified by this object is merged, or `FALSE` otherwise. */
  val IsMerged: Boolean = js.native
  /** @returns `TRUE` if the area specified by this object is merged, or `FALSE` otherwise. */
  def getIsMerged(): Boolean = js.native
  /** merges/unmerges the area specified by this object. */
  def merge(bMerge: Boolean): Unit = js.native
}

object XMergeable {
  @scala.inline
  def apply(
    IsMerged: Boolean,
    acquire: () => Unit,
    getIsMerged: () => Boolean,
    merge: Boolean => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMergeable = {
    val __obj = js.Dynamic.literal(IsMerged = IsMerged.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIsMerged = js.Any.fromFunction0(getIsMerged), merge = js.Any.fromFunction1(merge), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMergeable]
  }
  @scala.inline
  implicit class XMergeableOps[Self <: XMergeable] (val x: Self) extends AnyVal {
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
    def setIsMerged(value: Boolean): Self = this.set("IsMerged", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetIsMerged(value: () => Boolean): Self = this.set("getIsMerged", js.Any.fromFunction0(value))
    @scala.inline
    def setMerge(value: Boolean => Unit): Self = this.set("merge", js.Any.fromFunction1(value))
  }
  
}

