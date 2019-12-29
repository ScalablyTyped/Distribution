package typings.atAntvG2.atAntvG2Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animate extends js.Object {
  def registerAnimation(animationType: String, animationName: String, animationFun: js.Any): Unit
}

@JSImport("@antv/g2", "Animate")
@js.native
object Animate extends TopLevel[Animate]

