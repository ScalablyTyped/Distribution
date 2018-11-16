package typings
package algebraDotJsLib.algebraDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algebra.js", JSImport.Namespace)
@js.native
object algebraDotJsModMembers extends js.Object {
  def parse(input: java.lang.String): algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Equation | algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def toTex(input: algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Equation): java.lang.String = js.native
  def toTex(input: algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Expression): java.lang.String = js.native
  def toTex(input: algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction): java.lang.String = js.native
  def toTex(input: js.Array[algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs.Fraction | js.Object]): java.lang.String = js.native
  def toTex(input: js.Object): java.lang.String = js.native
}

