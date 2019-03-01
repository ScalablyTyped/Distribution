package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dot extends js.Object {
  val dotNs: Anon_CCompile
  val nunjucksNs: Anon_Compile
}

object Anon_Dot {
  @scala.inline
  def apply(dotNs: Anon_CCompile, nunjucksNs: Anon_Compile): Anon_Dot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dotNs")(dotNs)
    __obj.updateDynamic("nunjucksNs")(nunjucksNs)
    __obj.asInstanceOf[Anon_Dot]
  }
}

