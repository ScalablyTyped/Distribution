package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountFileSize extends js.Object {
  var count: scala.Double
  var fileSize: scala.Double
}

object Anon_CountFileSize {
  @scala.inline
  def apply(count: scala.Double, fileSize: scala.Double): Anon_CountFileSize = {
    val __obj = js.Dynamic.literal(count = count, fileSize = fileSize)
  
    __obj.asInstanceOf[Anon_CountFileSize]
  }
}

