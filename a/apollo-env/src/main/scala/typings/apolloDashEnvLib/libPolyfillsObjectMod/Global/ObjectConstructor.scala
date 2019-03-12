package typings
package apolloDashEnvLib.libPolyfillsObjectMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectConstructor extends js.Object {
  def fromEntries[K /* <: java.lang.String */, V](map: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[js.Tuple2[K, V]]): stdLib.Record[K, V]
}

object ObjectConstructor {
  @scala.inline
  def apply(
    fromEntries: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[js.Tuple2[js.Any, js.Any]] => stdLib.Record[js.Any, js.Any]
  ): ObjectConstructor = {
    val __obj = js.Dynamic.literal(fromEntries = js.Any.fromFunction1(fromEntries))
  
    __obj.asInstanceOf[ObjectConstructor]
  }
}

