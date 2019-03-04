package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountDeletion extends js.Object {
  var count: scala.Double
  var deletion: scala.Double
  var size: scala.Double
}

object Anon_CountDeletion {
  @scala.inline
  def apply(count: scala.Double, deletion: scala.Double, size: scala.Double): Anon_CountDeletion = {
    val __obj = js.Dynamic.literal(count = count, deletion = deletion, size = size)
  
    __obj.asInstanceOf[Anon_CountDeletion]
  }
}

