package typings.abstractLeveldown.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractIterator[K, V] extends AbstractOptions {
  
  var db: AbstractLevelDOWN[K, V] = js.native
  
  def end(cb: ErrorCallback): Unit = js.native
  
  def next(cb: ErrorKeyValueCallback[K, V]): this.type = js.native
}
@JSImport("abstract-leveldown", "AbstractIterator")
@js.native
object AbstractIterator extends TopLevel[AbstractIteratorConstructor]
