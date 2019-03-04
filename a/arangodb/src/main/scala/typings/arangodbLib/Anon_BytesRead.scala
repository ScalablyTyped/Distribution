package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BytesRead extends js.Object {
  var bytesRead: scala.Double
  var bytesWritten: scala.Double
  var count: scala.Double
  var filesCombined: scala.Double
  var message: java.lang.String
  var time: java.lang.String
}

object Anon_BytesRead {
  @scala.inline
  def apply(
    bytesRead: scala.Double,
    bytesWritten: scala.Double,
    count: scala.Double,
    filesCombined: scala.Double,
    message: java.lang.String,
    time: java.lang.String
  ): Anon_BytesRead = {
    val __obj = js.Dynamic.literal(bytesRead = bytesRead, bytesWritten = bytesWritten, count = count, filesCombined = filesCombined, message = message, time = time)
  
    __obj.asInstanceOf[Anon_BytesRead]
  }
}

