package typings
package awsDashSdkLib.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Term extends js.Object {
  /**
    * The source text of the term being translated by the custom terminology.
    */
  var SourceText: js.UndefOr[String] = js.undefined
  /**
    * The target text of the term being translated by the custom terminology.
    */
  var TargetText: js.UndefOr[String] = js.undefined
}

object Term {
  @scala.inline
  def apply(SourceText: String = null, TargetText: String = null): Term = {
    val __obj = js.Dynamic.literal()
    if (SourceText != null) __obj.updateDynamic("SourceText")(SourceText)
    if (TargetText != null) __obj.updateDynamic("TargetText")(TargetText)
    __obj.asInstanceOf[Term]
  }
}

