package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a default {@link XEnumerableMap} implementation
  *
  * For the keys put into the map using {@link XMap.put()} or {@link createImmutable()} , the following rules apply: A `VOID` key is not allowed.If the
  * key type is `BOOLEAN` , `CHAR` , `FLOAT` , `DOUBLE` , `STRING` , `TYPE` , or `UNSIGNED HYPER` , then only keys of exactly this type are accepted.If
  * the key type is `DOUBLE` or `FLOAT` , then `Double.NaN` respectively `Float.NaN` is not accepted as key.If the key type's class is
  * com::sun::star::uno::TypeClass::ENUM, then only keys of exactly this type are accepted.If the key type is any of `BYTE` , `SHORT` , `UNSIGNED SHORT` ,
  * `LONG` , `UNSIGNED LONG` , or `HYPER` , then all keys which can losslessly be converted to this type (possibly using widening conversions) are
  * accepted.If the key type is an interface type, then all key values denoting objects which can be queried for the given interface are accepted.All
  * other key types are rejected.
  *
  * For the values put into the map using {@link XMap.put()} or {@link createImmutable()} , the following rules apply: The `VOID` value will be accepted
  * to be put into the map.
  *
  * If the value type's class is com::sun::star::uno::TypeClass::ANY, any value will be accepted.If the value type is an interface type, then all values
  * denoting objects which can be queried for the given interface are accepted.If the value type's class is com::sun::star::uno::TypeClass::EXCEPTION or
  * com::sun::star::uno::TypeClass::STRUCT, then values whose type equals the value type, or is a sub class of the value type, are accepted.For all other
  * value types, only values whose type matches exactly are accepted.If the value type is `DOUBLE` or `FLOAT` , then `Double.NaN` respectively `Float.NaN`
  * is not accepted.
  *
  * The factory methods of the `XEnumerableMap` interface support both **isolated** and **non-isolated** enumerators. The latter one will be automatically
  * disposed when the map changes after enumerator creation, so every attempt to use them will result in a {@link com.sun.star.lang.DisposedException}
  * being thrown.
  * @see http://udk.openoffice.org/common/man/typesystem.html
  */
trait EnumerableMap extends XEnumerableMap {
  /**
    * creates an instance mapping from the given key type to the given value type
    * @param KeyType denotes the type of the keys in the to-be-created map
    * @param ValueType denotes the type of the values in the to-be-created map
    * @throws com::sun::star::beans::IllegalTypeException if KeyType or ValueType are unsupported types. For values, all type classes except com::sun::star::un
    */
  def create(KeyType: activexDashLibreofficeLib.`type`, ValueType: activexDashLibreofficeLib.`type`): scala.Unit
  /**
    * creates an instance mapping from the given key type to the given value type
    *
    * The resulting map is immutable, so later alter operations on it will fail with a {@link com.sun.star.lang.NoSupportException} .
    * @param KeyType denotes the type of the keys in the to-be-created map
    * @param ValueType denotes the type of the values in the to-be-created map
    * @param Values denote the values contained in the to-be-created map
    * @throws com::sun::star::beans::IllegalTypeException if KeyType or ValueType are unsupported types. For values, all type classes except com::sun::star::un
    * @throws com::sun::star::lang::IllegalArgumentException if any of the given values or keys violates the [key rules]{@link url="#keyrules"} or [value rules
    */
  def createImmutable(
    KeyType: activexDashLibreofficeLib.`type`,
    ValueType: activexDashLibreofficeLib.`type`,
    Values: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[_, _]]
  ): scala.Unit
}

