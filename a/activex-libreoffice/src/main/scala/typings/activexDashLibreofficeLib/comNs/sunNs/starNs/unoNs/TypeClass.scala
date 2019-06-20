package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This enum describes all type classes of UNO. Every specific type has a type class specifying the general context of the reflected type.
  *
  * Example: A type reflecting the interface {@link XInterface} is of type class INTERFACE and its name is "com.sun.star.uno.XInterface".
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`14`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`21`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`29`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`30`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`15`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`19`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`22`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`26`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`25`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`24`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`28`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`20`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`23`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`31`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`17`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`13`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`16`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`18`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`27`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait TypeClass extends js.Object

object TypeClass {
  /** reflecting the any type; anys can carry any UNO value except of any values */
  @scala.inline
  def ANY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`14` = this.cast(14)
  /**
    * Deprecated, UNOIDL does not have an array concept.
    * @deprecated Deprecated
    */
  @scala.inline
  def ARRAY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`21` = this.cast(21)
  /** reflecting the boolean type; true and false */
  @scala.inline
  def BOOLEAN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** reflecting the 8-bit ordinal type */
  @scala.inline
  def BYTE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** reflecting the 16-bit unicode character type */
  @scala.inline
  def CHAR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** reflecting constants */
  @scala.inline
  def CONSTANT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`29` = this.cast(29)
  /** reflecting constants groups */
  @scala.inline
  def CONSTANTS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`30` = this.cast(30)
  /** reflecting the 64-bit floating point type */
  @scala.inline
  def DOUBLE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11` = this.cast(11)
  /** reflecting enum types */
  @scala.inline
  def ENUM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`15` = this.cast(15)
  /** reflecting exception types */
  @scala.inline
  def EXCEPTION: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`19` = this.cast(19)
  /** reflecting the 32-bit floating point type */
  @scala.inline
  def FLOAT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10` = this.cast(10)
  /** reflecting the signed 64-bit ordinal type */
  @scala.inline
  def HYPER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  /** reflecting interface types */
  @scala.inline
  def INTERFACE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`22` = this.cast(22)
  /** reflecting interface attributes */
  @scala.inline
  def INTERFACE_ATTRIBUTE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`26` = this.cast(26)
  /** reflecting interface methods */
  @scala.inline
  def INTERFACE_METHOD: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`25` = this.cast(25)
  /** reflecting the signed 32-bit ordinal type */
  @scala.inline
  def LONG: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /** reflecting modules */
  @scala.inline
  def MODULE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`24` = this.cast(24)
  /** reflecting properties */
  @scala.inline
  def PROPERTY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`28` = this.cast(28)
  /** reflecting sequence types */
  @scala.inline
  def SEQUENCE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`20` = this.cast(20)
  /** reflecting services */
  @scala.inline
  def SERVICE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`23` = this.cast(23)
  /** reflecting the signed 16-bit ordinal type */
  @scala.inline
  def SHORT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** reflecting singletons */
  @scala.inline
  def SINGLETON: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`31` = this.cast(31)
  /** reflecting the string type; strings of unicode characters */
  @scala.inline
  def STRING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12` = this.cast(12)
  /** reflecting compound types */
  @scala.inline
  def STRUCT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`17` = this.cast(17)
  /** reflecting the meta type */
  @scala.inline
  def TYPE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`13` = this.cast(13)
  /** reflecting typedefed types referencing other types */
  @scala.inline
  def TYPEDEF: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`16` = this.cast(16)
  /**
    * Deprecated, UNOIDL does not have a union concept.
    * @deprecated Deprecated
    */
  @scala.inline
  def UNION: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`18` = this.cast(18)
  /** reflecting the unreflectable type */
  @scala.inline
  def UNKNOWN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`27` = this.cast(27)
  /** reflecting the unsigned 64-bit ordinal type */
  @scala.inline
  def UNSIGNED_HYPER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9` = this.cast(9)
  /** reflecting the unsigned 32-bit type */
  @scala.inline
  def UNSIGNED_LONG: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /** reflecting the unsigned 16-bit ordinal type */
  @scala.inline
  def UNSIGNED_SHORT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** reflecting the void type; denotes no type */
  @scala.inline
  def VOID: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

