package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * maps strings to anys.
  * @since OOo 2.3
  */
trait XStringKeyMap extends js.Object {
  /** the number of elements in the map. */
  var Count: scala.Double
  /**
    * obtains the key of an element by index.
    * @param nIndex is the index of the element.
    * @returns the key string matching the given index.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified index is greater than the number of elements
    */
  def getKeyByIndex(nIndex: scala.Double): java.lang.String
  /**
    * reads data from the map.
    * @param aKey The key string which should be searched for.
    * @returns the value matching aKey.
    * @throws com::sun::star::container::NoSuchElementException if an element under aKey does not exist.
    */
  def getValue(aKey: java.lang.String): js.Any
  /**
    * obtains the value of an element by index.
    * @param nIndex is the index of the key.
    * @returns the value matching the given index.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the specified index is greater than the number of elements
    */
  def getValueByIndex(nIndex: scala.Double): js.Any
  /**
    * checks for element existence.
    * @param aKey The key string which should be searched for.
    * @returns true if an element with key aKey exists.
    */
  def hasValue(aKey: java.lang.String): scala.Boolean
  /**
    * writes data to the map.
    * @param aKey The key string which should be used to store the value.
    * @param aValue The value that should be stored.
    * @throws com::sun::star::lang::IllegalArgumentException if the element could not be inserted.
    * @throws com::sun::star::container::ElementExistException if there is already a value stored under the key aKey.
    */
  def insertValue(aKey: java.lang.String, aValue: js.Any): scala.Unit
}

