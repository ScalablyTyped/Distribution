package typings.apolloDashTracing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: Double
  var fieldName: String
  var parentType: String
  var path: js.Array[String | Double]
  var returnType: String
  var startOffset: Double
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: Double,
    fieldName: String,
    parentType: String,
    path: js.Array[String | Double],
    returnType: String,
    startOffset: Double
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration, fieldName = fieldName, parentType = parentType, path = path, returnType = returnType, startOffset = startOffset)
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

