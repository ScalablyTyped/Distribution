package typings.apolloDashUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/util/assign", JSImport.Namespace)
@js.native
object libUtilAssignMod extends js.Object {
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def assign[A, B](a: A, b: B): A with B = js.native
  def assign[A, B, C](a: A, b: B, c: C): A with B with C = js.native
  def assign[A, B, C, D](a: A, b: B, c: C, d: D): A with B with C with D = js.native
  def assign[A, B, C, D, E](a: A, b: B, c: C, d: D, e: E): A with B with C with D with E = js.native
}

