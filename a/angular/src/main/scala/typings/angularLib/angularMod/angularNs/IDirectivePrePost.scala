package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDirectivePrePost[TScope /* <: IScope */] extends js.Object {
  var post: js.UndefOr[IDirectiveLinkFn[TScope]] = js.undefined
  var pre: js.UndefOr[IDirectiveLinkFn[TScope]] = js.undefined
}

