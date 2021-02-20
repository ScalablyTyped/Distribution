package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.beans.Pair
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides convenient access to the list of items in a list box */
@js.native
trait XItemList extends StObject {
  
  /** retrieves the texts and images of all items in the list */
  val AllItems: SafeArray[Pair[String, String]] = js.native
  
  /** is the number of items in the list */
  var ItemCount: Double = js.native
  
  /** registers a listener which is notified about changes in the item list. */
  def addItemListListener(Listener: XItemListListener): Unit = js.native
  
  /** retrieves the texts and images of all items in the list */
  def getAllItems(): SafeArray[Pair[String, String]] = js.native
  
  /**
    * retrieves the implementation dependent value associated with the given list item.
    * @param Position the position of the item whose data value should be retrieved. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @see setItemData
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def getItemData(Position: Double): js.Any = js.native
  
  /**
    * retrieves the URL of the image of an existing item
    * @param Position the position of the item whose image should be retrieved. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def getItemImage(Position: Double): String = js.native
  
  /**
    * retrieves the text of an existing item
    * @param Position the position of the item whose text should be retrieved. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def getItemText(Position: Double): String = js.native
  
  /**
    * retrieves both the text and the image URL of an existing item
    * @param Position the position of the item whose text and image should be retrieved. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def getItemTextAndImage(Position: Double): Pair[String, String] = js.native
  
  /**
    * inserts a new item into the list
    * @param Position the position at which the item should be inserted. Must be greater or equal to 0, and lesser than or equal to {@link ItemCount} .
    * @param ItemText the text of the item to be inserted.
    * @param ItemImageURL the URL of the image to display for the item
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def insertItem(Position: Double, ItemText: String, ItemImageURL: String): Unit = js.native
  
  /**
    * inserts an item which has only an image, but no text
    * @param Position the position at which the item should be inserted. Must be greater or equal to 0, and lesser than or equal to {@link ItemCount} .
    * @param ItemImageURL the URL of the image to display for the item
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def insertItemImage(Position: Double, ItemImageURL: String): Unit = js.native
  
  /**
    * inserts an item which has only a text, but no image
    * @param Position the position at which the item should be inserted. Must be greater or equal to 0, and lesser than or equal to {@link ItemCount} .
    * @param ItemText the text of the item to be inserted.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def insertItemText(Position: Double, ItemText: String): Unit = js.native
  
  /** removes all items from the list */
  def removeAllItems(): Unit = js.native
  
  /**
    * removes an item from the list
    * @param Position the position of the item which should be removed. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def removeItem(Position: Double): Unit = js.native
  
  /** revokes a listener which is notified about changes in the item list. */
  def removeItemListListener(Listener: XItemListListener): Unit = js.native
  
  /**
    * associates an implementation dependent value with the given list item.
    *
    * You can use this to store data for an item which does not interfere with the displayed text and image, but can be used by the client of the list box
    * for an arbitrary purpose.
    * @param Position the position of the item whose data value should be set. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @param ItemData the data to associate with the list item
    * @see getItemData
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def setItemData(Position: Double, ItemData: js.Any): Unit = js.native
  
  /**
    * sets a new image for an existing item
    * @param Position the position of the item whose image is to be changed. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @param ItemImageURL the new URL of the image to display for the item
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def setItemImage(Position: Double, ItemImageURL: String): Unit = js.native
  
  /**
    * sets a new text for an existing item
    * @param Position the position of the item whose text is to be changed. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @param ItemText the new text of the item
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def setItemText(Position: Double, ItemText: String): Unit = js.native
  
  /**
    * sets both a new position and text for an existing item
    * @param Position the position of the item whose text and image is to be changed. Must be greater or equal to 0, and lesser than {@link ItemCount} .
    * @param ItemText the new text of the item
    * @param ItemImageURL the new URL of the image to display for the item
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Position` is invalid.
    */
  def setItemTextAndImage(Position: Double, ItemText: String, ItemImageURL: String): Unit = js.native
}
object XItemList {
  
  @scala.inline
  def apply(
    AllItems: SafeArray[Pair[String, String]],
    ItemCount: Double,
    addItemListListener: XItemListListener => Unit,
    getAllItems: () => SafeArray[Pair[String, String]],
    getItemData: Double => js.Any,
    getItemImage: Double => String,
    getItemText: Double => String,
    getItemTextAndImage: Double => Pair[String, String],
    insertItem: (Double, String, String) => Unit,
    insertItemImage: (Double, String) => Unit,
    insertItemText: (Double, String) => Unit,
    removeAllItems: () => Unit,
    removeItem: Double => Unit,
    removeItemListListener: XItemListListener => Unit,
    setItemData: (Double, js.Any) => Unit,
    setItemImage: (Double, String) => Unit,
    setItemText: (Double, String) => Unit,
    setItemTextAndImage: (Double, String, String) => Unit
  ): XItemList = {
    val __obj = js.Dynamic.literal(AllItems = AllItems.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], addItemListListener = js.Any.fromFunction1(addItemListListener), getAllItems = js.Any.fromFunction0(getAllItems), getItemData = js.Any.fromFunction1(getItemData), getItemImage = js.Any.fromFunction1(getItemImage), getItemText = js.Any.fromFunction1(getItemText), getItemTextAndImage = js.Any.fromFunction1(getItemTextAndImage), insertItem = js.Any.fromFunction3(insertItem), insertItemImage = js.Any.fromFunction2(insertItemImage), insertItemText = js.Any.fromFunction2(insertItemText), removeAllItems = js.Any.fromFunction0(removeAllItems), removeItem = js.Any.fromFunction1(removeItem), removeItemListListener = js.Any.fromFunction1(removeItemListListener), setItemData = js.Any.fromFunction2(setItemData), setItemImage = js.Any.fromFunction2(setItemImage), setItemText = js.Any.fromFunction2(setItemText), setItemTextAndImage = js.Any.fromFunction3(setItemTextAndImage))
    __obj.asInstanceOf[XItemList]
  }
  
  @scala.inline
  implicit class XItemListMutableBuilder[Self <: XItemList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddItemListListener(value: XItemListListener => Unit): Self = StObject.set(x, "addItemListListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllItems(value: SafeArray[Pair[String, String]]): Self = StObject.set(x, "AllItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllItems(value: () => SafeArray[Pair[String, String]]): Self = StObject.set(x, "getAllItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemData(value: Double => js.Any): Self = StObject.set(x, "getItemData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemImage(value: Double => String): Self = StObject.set(x, "getItemImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemText(value: Double => String): Self = StObject.set(x, "getItemText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemTextAndImage(value: Double => Pair[String, String]): Self = StObject.set(x, "getItemTextAndImage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItem(value: (Double, String, String) => Unit): Self = StObject.set(x, "insertItem", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInsertItemImage(value: (Double, String) => Unit): Self = StObject.set(x, "insertItemImage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertItemText(value: (Double, String) => Unit): Self = StObject.set(x, "insertItemText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemCount(value: Double): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAllItems(value: () => Unit): Self = StObject.set(x, "removeAllItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveItem(value: Double => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveItemListListener(value: XItemListListener => Unit): Self = StObject.set(x, "removeItemListListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItemData(value: (Double, js.Any) => Unit): Self = StObject.set(x, "setItemData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetItemImage(value: (Double, String) => Unit): Self = StObject.set(x, "setItemImage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetItemText(value: (Double, String) => Unit): Self = StObject.set(x, "setItemText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetItemTextAndImage(value: (Double, String, String) => Unit): Self = StObject.set(x, "setItemTextAndImage", js.Any.fromFunction3(value))
  }
}
