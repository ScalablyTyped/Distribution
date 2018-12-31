package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOptions extends js.Object {
  /**
    * Clone recursively
    *
    * `true` by default
    */
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Clone non-plain object, they will be plain objects
    *
    * `false` by default
    */
  var nonPlainObjects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Clone only enumerable properties
    *
    * `true` by default
    */
  var onlyEnumerable: js.UndefOr[scala.Boolean] = js.undefined
}

