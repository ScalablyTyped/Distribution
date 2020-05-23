package typings.activexLibreoffice.com_.sun.star.gallery

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the items of a Gallery themes. It also allows inserting and removing of single items.
  *
  * This interface extends the interface {@link com.sun.star.container.XIndexAccess} which provides access to existing Gallery items collection.
  * @see com.sun.star.container.XIndexAccess
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XGalleryTheme extends XIndexAccess {
  /**
    * retrieves the name of the Gallery theme
    * @returns The name of the Gallery theme
    */
  val Name: String
  /**
    * retrieves the name of the Gallery theme
    * @returns The name of the Gallery theme
    */
  def getName(): String
  /**
    * inserts an item
    * @param Drawing A drawing model that should be added to the collection
    * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
    * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
    * @see XGalleryItem
    * @see com.sun.star.lang.WrappedTargetException
    */
  def insertDrawingByIndex(Drawing: XComponent, Index: Double): Double
  /**
    * inserts an item
    * @param Graphic The {@link com.sun.star.graphic.XGraphic} object that should be added to the collection
    * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
    * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
    * @see com.sun.star.graphic.XGraphic
    * @see XGalleryItem
    * @see com.sun.star.lang.WrappedTargetException
    */
  def insertGraphicByIndex(Graphic: XGraphic, Index: Double): Double
  /**
    * inserts an item
    * @param URL The URL of a graphic or media object, that should be added to the collection
    * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
    * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
    * @see XGalleryItem
    * @see com.sun.star.lang.WrappedTargetException
    */
  def insertURLByIndex(URL: String, Index: Double): Double
  /**
    * deletes an item from the collection
    * @param Index The position of the item to be removed. The position is zero based.
    * @see com.sun.star.container.NoSuchElementException
    */
  def removeByIndex(Index: Double): Unit
  /**
    * updates the theme
    *
    * This method iterates over each item of the Gallery theme and updates it accordingly. Main purpose is to automatically regenerate the thumbnails and to
    * remove invalid items, that is items who have got an URL that has become invalid. This method also optimizes underlying data structures.
    */
  def update(): Unit
}

object XGalleryTheme {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    Name: String,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getName: () => String,
    hasElements: () => Boolean,
    insertDrawingByIndex: (XComponent, Double) => Double,
    insertGraphicByIndex: (XGraphic, Double) => Double,
    insertURLByIndex: (String, Double) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit,
    update: () => Unit
  ): XGalleryTheme = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), hasElements = js.Any.fromFunction0(hasElements), insertDrawingByIndex = js.Any.fromFunction2(insertDrawingByIndex), insertGraphicByIndex = js.Any.fromFunction2(insertGraphicByIndex), insertURLByIndex = js.Any.fromFunction2(insertURLByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[XGalleryTheme]
  }
}

