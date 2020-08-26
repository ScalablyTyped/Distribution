package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to replace strings in a text described by a {@link SearchDescriptor} .
  *
  * Example: replace all bold words "search for" by "look for"
  *
  * {{program example here, see documentation}}
  */
@js.native
trait XReplaceable extends XSearchable {
  /**
    * creates a descriptor which contains properties that specify a search in this container.
    * @see SearchDescriptor
    */
  def createReplaceDescriptor(): XReplaceDescriptor = js.native
  /**
    * searches for all occurrences of whatever is specified.
    * @see SearchDescriptor
    */
  def replaceAll(xDesc: XSearchDescriptor): Double = js.native
}

object XReplaceable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createReplaceDescriptor: () => XReplaceDescriptor,
    createSearchDescriptor: () => XSearchDescriptor,
    findAll: XSearchDescriptor => XIndexAccess,
    findFirst: XSearchDescriptor => XInterface,
    findNext: (XInterface, XSearchDescriptor) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    replaceAll: XSearchDescriptor => Double
  ): XReplaceable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createReplaceDescriptor = js.Any.fromFunction0(createReplaceDescriptor), createSearchDescriptor = js.Any.fromFunction0(createSearchDescriptor), findAll = js.Any.fromFunction1(findAll), findFirst = js.Any.fromFunction1(findFirst), findNext = js.Any.fromFunction2(findNext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceAll = js.Any.fromFunction1(replaceAll))
    __obj.asInstanceOf[XReplaceable]
  }
  @scala.inline
  implicit class XReplaceableOps[Self <: XReplaceable] (val x: Self) extends AnyVal {
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
    def setCreateReplaceDescriptor(value: () => XReplaceDescriptor): Self = this.set("createReplaceDescriptor", js.Any.fromFunction0(value))
    @scala.inline
    def setReplaceAll(value: XSearchDescriptor => Double): Self = this.set("replaceAll", js.Any.fromFunction1(value))
  }
  
}

