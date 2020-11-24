package typings.antvG2.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animate extends js.Object {
  
  def registerAnimation(animationType: String, animationName: String, animationFun: js.Any): Unit = js.native
}
@JSImport("@antv/g2", "Animate")
@js.native
object Animate extends TopLevel[Animate]
