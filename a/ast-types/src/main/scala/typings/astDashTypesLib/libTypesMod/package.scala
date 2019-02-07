package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type Deep = scala.Boolean | (js.Function2[/* type */ Type[js.Any], /* value */ js.Any, scala.Unit])
  type FieldType[T] = Field[T]
  type Type[T] = ArrayType[T] | IdentityType[T] | ObjectType[T] | OrType[T] | PredicateType[T]
}
