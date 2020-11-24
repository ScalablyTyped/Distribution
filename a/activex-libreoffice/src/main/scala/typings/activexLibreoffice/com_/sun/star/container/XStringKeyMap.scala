package typings.activexLibreoffice.com_.sun.star.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * maps strings to anys.
  * @since OOo 2.3
  */
@js.native
trait XStringKeyMap extends js.Object {
  
  /** the number of elements in the map. */
  var Count: Double = js.native
  
  /**
    * obtains the key of an element by index.
    * @param nIndex is the index of the element.
    * @returns the key string matching the given index.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified index is greater than the number of elements
    */
  def getKeyByIndex(nIndex: Double): String = js.native
  
  /**
    * reads data from the map.
    * @param aKey The key string which should be searched for.
    * @returns the value matching aKey.
    * @throws com::sun::star::container::NoSuchElementException if an element under aKey does not exist.
    */
  def getValue(aKey: String): js.Any = js.native
  
  /**
    * obtains the value of an element by index.
    * @param nIndex is the index of the key.
    * @returns the value matching the given index.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified index is greater than the number of elements
    */
  def getValueByIndex(nIndex: Double): js.Any = js.native
  
  /**
    * checks for element existence.
    * @param aKey The key string which should be searched for.
    * @returns true if an element with key aKey exists.
    */
  def hasValue(aKey: String): Boolean = js.native
  
  /**
    * writes data to the map.
    * @param aKey The key string which should be used to store the value.
    * @param aValue The value that should be stored.
    * @throws com::sun::star::lang::IllegalArgumentException if the element could not be inserted.
    * @throws com::sun::star::container::ElementExistException if there is already a value stored under the key aKey.
    */
  def insertValue(aKey: String, aValue: js.Any): Unit = js.native
}
object XStringKeyMap {
  
  @scala.inline
  def apply(
    Count: Double,
    getKeyByIndex: Double => String,
    getValue: String => js.Any,
    getValueByIndex: Double => js.Any,
    hasValue: String => Boolean,
    insertValue: (String, js.Any) => Unit
  ): XStringKeyMap = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], getKeyByIndex = js.Any.fromFunction1(getKeyByIndex), getValue = js.Any.fromFunction1(getValue), getValueByIndex = js.Any.fromFunction1(getValueByIndex), hasValue = js.Any.fromFunction1(hasValue), insertValue = js.Any.fromFunction2(insertValue))
    __obj.asInstanceOf[XStringKeyMap]
  }
  
  @scala.inline
  implicit class XStringKeyMapOps[Self <: XStringKeyMap] (val x: Self) extends AnyVal {
    
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
    def setGetKeyByIndex(value: Double => String): Self = this.set("getKeyByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: String => js.Any): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValueByIndex(value: Double => js.Any): Self = this.set("getValueByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasValue(value: String => Boolean): Self = this.set("hasValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertValue(value: (String, js.Any) => Unit): Self = this.set("insertValue", js.Any.fromFunction2(value))
  }
}
