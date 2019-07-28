package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountFileSize extends js.Object {
  var count: Double
  var fileSize: Double
}

object Anon_CountFileSize {
  @scala.inline
  def apply(count: Double, fileSize: Double): Anon_CountFileSize = {
    val __obj = js.Dynamic.literal(count = count, fileSize = fileSize)
  
    __obj.asInstanceOf[Anon_CountFileSize]
  }
}

