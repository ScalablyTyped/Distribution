package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BytesRead extends js.Object {
  var bytesRead: Double
  var bytesWritten: Double
  var count: Double
  var filesCombined: Double
  var message: String
  var time: String
}

object Anon_BytesRead {
  @scala.inline
  def apply(
    bytesRead: Double,
    bytesWritten: Double,
    count: Double,
    filesCombined: Double,
    message: String,
    time: String
  ): Anon_BytesRead = {
    val __obj = js.Dynamic.literal(bytesRead = bytesRead, bytesWritten = bytesWritten, count = count, filesCombined = filesCombined, message = message, time = time)
  
    __obj.asInstanceOf[Anon_BytesRead]
  }
}

