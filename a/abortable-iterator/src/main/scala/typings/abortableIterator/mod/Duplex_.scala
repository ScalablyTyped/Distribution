package typings.abortableIterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duplex_[TSource, TSinkSource, TSinkReturn] extends js.Object {
  
  def sink(source: Source_[TSinkSource]): TSinkReturn = js.native
  @JSName("sink")
  var sink_Original: Sink_[TSinkSource, TSinkReturn] = js.native
  
  var source: Source_[TSource] = js.native
}
