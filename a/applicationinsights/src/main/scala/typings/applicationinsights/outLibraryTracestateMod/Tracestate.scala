package typings.applicationinsights.outLibraryTracestateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracestate extends js.Object {
  var fieldmap: js.Array[String]
  /* private */ def parseHeader(id: js.Any): js.Any
}

object Tracestate {
  @scala.inline
  def apply(fieldmap: js.Array[String], parseHeader: js.Any => js.Any, toString: () => String): Tracestate = {
    val __obj = js.Dynamic.literal(fieldmap = fieldmap, parseHeader = js.Any.fromFunction1(parseHeader), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Tracestate]
  }
}

