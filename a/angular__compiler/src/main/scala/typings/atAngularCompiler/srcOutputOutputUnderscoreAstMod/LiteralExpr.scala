package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "LiteralExpr")
@js.native
class LiteralExpr () extends Expression {
  def this(value: String) = this()
  def this(value: Boolean) = this()
  def this(value: Double) = this()
  def this(value: js.UndefOr[scala.Nothing], `type`: Type) = this()
  def this(value: String, `type`: Type) = this()
  def this(value: Boolean, `type`: Type) = this()
  def this(value: Double, `type`: Type) = this()
  def this(value: Null, `type`: Type) = this()
  def this(value: js.UndefOr[scala.Nothing], `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: js.UndefOr[scala.Nothing], `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(value: String, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: String, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(value: Boolean, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: Boolean, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(value: Double, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: Double, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(value: Null, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(value: Null, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  var value: js.UndefOr[Double | String | Boolean | Null] = js.native
}

