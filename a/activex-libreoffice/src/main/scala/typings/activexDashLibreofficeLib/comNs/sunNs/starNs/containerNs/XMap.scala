package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a map between keys and values.
  *
  * Keys in the map are unique, and each key maps to exactly one value.
  *
  * Locating elements in the map, both values and keys, requires a notion of equality of two objects. In conformance with the [UNO type system]{@link
  * url="http://udk.openoffice.org/common/man/typesystem.html"} , two values are said to be equal if and only if they have the same type, and both denote
  * the same element of this type's value set.
  * @see Map for a default implementation of this interface
  */
trait XMap extends XElementAccess {
  /**
    * denotes the type of the keys in the map.
    *
    * Implementations are free to accept any supertype of `KeyType` as keys.
    */
  var KeyType: activexDashLibreofficeLib.`type`
  /**
    * denotes the type of the values in the map.
    *
    * Implementations are free to accept any supertype of the `ValueType` as values.
    */
  var ValueType: activexDashLibreofficeLib.`type`
  /**
    * clears the map, removing all key-value pairs from it.
    * @throws com::sun::star::lang::NoSupportException if the map is not mutable.
    */
  def clear(): scala.Unit
  /**
    * determines whether a mapping for he given key exists in the map
    * @param Key is the key whose presence in the map is to be tested.
    * @returns `TRUE` if and only if the map contains a mapping for the given key.
    * @throws com::sun::star::beans::IllegalTypeException if the given key is not of a type which is accepted by the map
    * @throws com::sun::star::lang::IllegalArgumentException if the given key is not supported to be put into the map. It's up to the service implementing the
    */
  def containsKey(Key: js.Any): scala.Boolean
  /**
    * determines whether the map contains a mapping to a given value.
    * @param Value is the value whose presence in the map is to be tested.
    * @returns `TRUE` if and only one or more keys map to the given value.
    * @throws com::sun::star::beans::IllegalTypeException if the given value is not of a type which is accepted by the map. It's up to the service implementing
    * @throws com::sun::star::lang::IllegalArgumentException if the given value is not supported to be put into the map.
    */
  def containsValue(Value: js.Any): scala.Boolean
  /**
    * gets the value to which a given key maps.
    * @param Key they key whose associated value is to be returned.
    * @returns the value which is associated with the given key.
    * @throws com::sun::star::beans::IllegalTypeException if the given key is not of a type which is accepted by the map
    * @throws com::sun::star::lang::IllegalArgumentException if the given key is not supported to be put into the map. It's up to the service implementing the
    * @throws com::sun::star::container::NoSuchElementException if there is no value associated with the given key
    */
  def get(Key: js.Any): js.Any
  /**
    * associates a given key with a given value
    *
    * If the map already contains a mapping for the given key, then the old value is replaced by the given new value.
    * @param Key is the key which the given value should be associated with
    * @param Value is the value which should be associated with the given key
    * @returns the value which was previously associated with the given key, or `VOID` if there was no such previous association.
    * @throws com::sun::star::beans::IllegalTypeException if the given key is not of a type which is accepted by the map
    * @throws com::sun::star::lang::IllegalArgumentException if the given key, or the given value, is not supported to be put into the map. It's up to the serv
    * @throws com::sun::star::lang::NoSupportException if the map does not support putting new mappings into it
    */
  def put(Key: js.Any, Value: js.Any): js.Any
  /**
    * removes a key-value mapping, given by key, from the map.
    * @param Key is the key whose mapping should be removed from the map
    * @returns the value which was associated with the given key before the removal
    * @throws com::sun::star::beans::IllegalTypeException if the given key is not of a type which is accepted by the map
    * @throws com::sun::star::lang::IllegalArgumentException if the given key is not supported to be put into the map. It's up to the service implementing the
    * @throws com::sun::star::lang::NoSupportException if the map does not support removing mappings
    * @throws com::sun::star::container::NoSuchElementException if there is no value associated with the given key
    */
  def remove(Key: js.Any): js.Any
}

object XMap {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    KeyType: activexDashLibreofficeLib.`type`,
    ValueType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    clear: () => scala.Unit,
    containsKey: js.Any => scala.Boolean,
    containsValue: js.Any => scala.Boolean,
    get: js.Any => js.Any,
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasElements: () => scala.Boolean,
    put: (js.Any, js.Any) => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: js.Any => js.Any
  ): XMap = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, KeyType = KeyType, ValueType = ValueType, acquire = js.Any.fromFunction0(acquire), clear = js.Any.fromFunction0(clear), containsKey = js.Any.fromFunction1(containsKey), containsValue = js.Any.fromFunction1(containsValue), get = js.Any.fromFunction1(get), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), put = js.Any.fromFunction2(put), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[XMap]
  }
}

