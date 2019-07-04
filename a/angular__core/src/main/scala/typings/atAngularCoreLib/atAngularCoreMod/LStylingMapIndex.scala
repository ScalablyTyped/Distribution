package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An index of position and offset points for any data stored within a `LStylingMap` instance.
  */
/* Rewritten from type alias, can be one of: 
  - atAngularCoreLib.atAngularCoreLibNumbers.`0`
  - atAngularCoreLib.atAngularCoreLibNumbers.`1`
  - atAngularCoreLib.atAngularCoreLibNumbers.`2`
*/
trait LStylingMapIndex extends js.Object

object LStylingMapIndex {
  /** The offset for the property entry in the tuple */
  @scala.inline
  def PropOffset: atAngularCoreLib.atAngularCoreLibNumbers.`0` = this.cast(0)
  /** The location of the raw key/value map instance used last to populate the array entries */
  @scala.inline
  def RawValuePosition: atAngularCoreLib.atAngularCoreLibNumbers.`0` = this.cast(0)
  /** The size of each property/value entry */
  @scala.inline
  def TupleSize: atAngularCoreLib.atAngularCoreLibNumbers.`2` = this.cast(2)
  /** The offset for the value entry in the tuple */
  @scala.inline
  def ValueOffset: atAngularCoreLib.atAngularCoreLibNumbers.`1` = this.cast(1)
  /** Where the values start in the array */
  @scala.inline
  def ValuesStartPosition: atAngularCoreLib.atAngularCoreLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

