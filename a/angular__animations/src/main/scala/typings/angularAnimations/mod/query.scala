package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations", "query")
@js.native
object query extends js.Object {
  def apply(selector: String, animation: js.Array[AnimationMetadata]): AnimationQueryMetadata = js.native
  def apply(selector: String, animation: js.Array[AnimationMetadata], options: AnimationQueryOptions): AnimationQueryMetadata = js.native
  def apply(selector: String, animation: AnimationMetadata): AnimationQueryMetadata = js.native
  def apply(selector: String, animation: AnimationMetadata, options: AnimationQueryOptions): AnimationQueryMetadata = js.native
}

