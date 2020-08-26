package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the elements of a collection through an index.
  *
  * This interface should only be used if the data structure, itself, is indexed.
  */
@js.native
trait XIndexAccess extends XElementAccess {
  /** @returns the number of elements in this container. */
  val Count: Double = js.native
  /**
    * @param Index specifies the position in the array. The first index is 0.
    * @returns the element at the specified index.
    * @throws com::sun::star::lang::IndexOutOfBoundException if the index is not valid.
    * @throws com::sun::star::lang::WrappedTargetException If the implementation has internal reasons for exceptions, then wrap these in a {@link com.sun.star.
    */
  def getByIndex(Index: Double): js.Any = js.native
  /** @returns the number of elements in this container. */
  def getCount(): Double = js.native
}

object XIndexAccess {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIndexAccess = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIndexAccess]
  }
  @scala.inline
  implicit class XIndexAccessOps[Self <: XIndexAccess] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetByIndex(value: Double => js.Any): Self = this.set("getByIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
  }
  
}

