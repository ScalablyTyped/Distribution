package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TransformIteratorOptions[S] extends BufferedIteratorOptions {
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[AsyncIterator[S]] = js.undefined
}

