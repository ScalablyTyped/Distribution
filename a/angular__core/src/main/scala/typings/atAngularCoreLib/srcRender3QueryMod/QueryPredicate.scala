package typings
package atAngularCoreLib.srcRender3QueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryPredicate[T] extends js.Object {
  /**
    * Indicates which token should be read from DI for this query.
    */
  var read: atAngularCoreLib.srcTypeMod.Type[T] | scala.Null
  /**
    * If selector then contains local names to query for.
    */
  var selector: js.Array[java.lang.String] | scala.Null
  /**
    * If looking for directives then it contains the directive type.
    */
  var `type`: atAngularCoreLib.srcTypeMod.Type[T] | scala.Null
}

