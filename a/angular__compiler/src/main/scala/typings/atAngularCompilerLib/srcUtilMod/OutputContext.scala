package typings
package atAngularCompilerLib.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputContext extends js.Object {
  var constantPool: atAngularCompilerLib.srcConstantUnderscorePoolMod.ConstantPool = js.native
  var genFilePath: java.lang.String = js.native
  var statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement] = js.native
  def importExpr(reference: js.Any): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def importExpr(reference: js.Any, typeParams: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type]): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def importExpr(
    reference: js.Any,
    typeParams: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type],
    useSummaries: scala.Boolean
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def importExpr(reference: js.Any, typeParams: scala.Null, useSummaries: scala.Boolean): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
}

