package typings

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAtlaskitTree {
  type FlattenedTree = js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FlattenedItem */ js.Any
  ]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
