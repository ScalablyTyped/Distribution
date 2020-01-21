package typings.applicationinsights.tracestateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracestate extends js.Object {
  var fieldmap: js.Array[String]
  /* private */ def parseHeader(id: js.Any): js.Any
}

object Tracestate {
  @scala.inline
  def apply(fieldmap: js.Array[String], parseHeader: js.Any => js.Any): Tracestate = {
    val __obj = js.Dynamic.literal(fieldmap = fieldmap.asInstanceOf[js.Any], parseHeader = js.Any.fromFunction1(parseHeader))
  
    __obj.asInstanceOf[Tracestate]
  }
}

