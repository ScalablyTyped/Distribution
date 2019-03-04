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
    acquire: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getName: js.Function0[java.lang.String],
    hasElements: js.Function0[scala.Boolean],
    insertDrawingByIndex: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, 
      scala.Double, 
      scala.Double
    ],
    insertGraphicByIndex: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic, 
      scala.Double, 
      scala.Double
    ],
    insertURLByIndex: js.Function2[java.lang.String, scala.Double, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit],
    update: js.Function0[scala.Unit]
  ): XGalleryTheme = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, Name = Name, acquire = acquire, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, getName = getName, hasElements = hasElements, insertDrawingByIndex = insertDrawingByIndex, insertGraphicByIndex = insertGraphicByIndex, insertURLByIndex = insertURLByIndex, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex, update = update)
  
    __obj.asInstanceOf[XGalleryTheme]
  }
}

