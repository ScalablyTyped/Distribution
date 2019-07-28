package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountDeletion extends js.Object {
  var count: Double
  var deletion: Double
  var size: Double
}

object Anon_CountDeletion {
  @scala.inline
  def apply(count: Double, deletion: Double, size: Double): Anon_CountDeletion = {
    val __obj = js.Dynamic.literal(count = count, deletion = deletion, size = size)
  
    __obj.asInstanceOf[Anon_CountDeletion]
  }
}

