package typings.apolloTracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var fieldName: String
  var parentType: String
  var path: js.Array[String | Double]
  var returnType: String
  var startOffset: Double
}

object AnonDuration {
  @scala.inline
  def apply(
    duration: Double,
    fieldName: String,
    parentType: String,
    path: js.Array[String | Double],
    returnType: String,
    startOffset: Double
  ): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
}

