package typings.atAngularCore.atAngularCoreMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Array-based representation of a key/value array.
  *
  * The format of the array is "property", "value", "property2",
  * "value2", etc...
  *
  * The first value in the array is reserved to store the instance
  * of the key/value array that was used to populate the property/
  * value entries that take place in the remainder of the array.
  */
@js.native
trait StylingMapArray
  extends Array[js.Object | String | Double | Null]

