package typings
package atAngularCompilerLib.srcRender3R3UnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "Element")
@js.native
class Element protected () extends Node {
  def this(name: java.lang.String, attributes: js.Array[TextAttribute], inputs: js.Array[BoundAttribute], outputs: js.Array[BoundEvent], children: js.Array[Node], references: js.Array[Reference], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, attributes: js.Array[TextAttribute], inputs: js.Array[BoundAttribute], outputs: js.Array[BoundEvent], children: js.Array[Node], references: js.Array[Reference], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, attributes: js.Array[TextAttribute], inputs: js.Array[BoundAttribute], outputs: js.Array[BoundEvent], children: js.Array[Node], references: js.Array[Reference], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, endSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, attributes: js.Array[TextAttribute], inputs: js.Array[BoundAttribute], outputs: js.Array[BoundEvent], children: js.Array[Node], references: js.Array[Reference], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, startSourceSpan: scala.Null, endSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var attributes: js.Array[TextAttribute] = js.native
  var children: js.Array[Node] = js.native
  var endSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan | scala.Null = js.native
  var inputs: js.Array[BoundAttribute] = js.native
  var name: java.lang.String = js.native
  var outputs: js.Array[BoundEvent] = js.native
  var references: js.Array[Reference] = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var startSourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan | scala.Null = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

