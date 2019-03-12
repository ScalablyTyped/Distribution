package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs

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
trait XGalleryTheme
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * retrieves the name of the Gallery theme
    * @returns The name of the Gallery theme
    */
  val Name: java.lang.String
  /**
    * retrieves the name of the Gallery theme
    * @returns The name of the Gallery theme
    */
  def getName(): java.lang.String
  /**
    * inserts an item
    * @param Drawing A drawing model that should be added to the collection
    * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
    * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
    * @see XGalleryItem
    * @see com.sun.star.lang.WrappedTargetException
    */
  def insertDrawingByIndex(Drawing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, Index: scala.Double): scala.Double
  /**
    * inserts an item
    * @param Graphic The {@link com.sun.star.graphic.XGraphic} object that should be added to the collection
    * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
    * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
    * @see com.sun.star.graphic.XGraphic
    * @see XGalleryItem
    * @see com.sun.star.lang.WrappedTargetException
    */
  def insertGraphicByIndex(Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic, Index: scala.Double): scala.Double
  /**
    * inserts an item
    * @param URL The URL of a graphic or media object, that should be added to the collection
    * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
    * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
    * @see XGalleryItem
    * @see com.sun.star.lang.WrappedTargetException
    */
  def insertURLByIndex(URL: java.lang.String, Index: scala.Double): scala.Double
  /**
    * deletes an item from the collection
    * @param Index The position of the item to be removed. The position is zero based.
    * @see com.sun.star.container.NoSuchElementException
    */
  def removeByIndex(Index: scala.Double): scala.Unit
  /**
    * updates the theme
    *
    * This method iterates over each item of the Gallery theme and updates it accordingly. Main purpose is to automatically regenerate the thumbnails and to
    * remove invalid items, that is items who have got an URL that has become invalid. This method also optimizes underlying data structures.
    */
  def update(): scala.Unit
}

object XGalleryTheme {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    Name: java.lang.String,
    acquire: () => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getName: () => java.lang.String,
    hasElements: () => scala.Boolean,
    insertDrawingByIndex: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, scala.Double) => scala.Double,
    insertGraphicByIndex: (activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic, scala.Double) => scala.Double,
    insertURLByIndex: (java.lang.String, scala.Double) => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByIndex: scala.Double => scala.Unit,
    update: () => scala.Unit
  ): XGalleryTheme = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, Name = Name, acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), hasElements = js.Any.fromFunction0(hasElements), insertDrawingByIndex = js.Any.fromFunction2(insertDrawingByIndex), insertGraphicByIndex = js.Any.fromFunction2(insertGraphicByIndex), insertURLByIndex = js.Any.fromFunction2(insertURLByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[XGalleryTheme]
  }
}

