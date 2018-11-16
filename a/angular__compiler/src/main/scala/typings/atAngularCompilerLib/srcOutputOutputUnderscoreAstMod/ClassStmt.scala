package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ClassStmt")
@js.native
class ClassStmt protected () extends Statement {
  def this(name: java.lang.String, parent: Expression, fields: js.Array[ClassField], getters: js.Array[ClassGetter], constructorMethod: ClassMethod, methods: js.Array[ClassMethod]) = this()
  def this(name: java.lang.String, parent: scala.Null, fields: js.Array[ClassField], getters: js.Array[ClassGetter], constructorMethod: ClassMethod, methods: js.Array[ClassMethod]) = this()
  def this(name: java.lang.String, parent: Expression, fields: js.Array[ClassField], getters: js.Array[ClassGetter], constructorMethod: ClassMethod, methods: js.Array[ClassMethod], modifiers: js.Array[StmtModifier]) = this()
  def this(name: java.lang.String, parent: scala.Null, fields: js.Array[ClassField], getters: js.Array[ClassGetter], constructorMethod: ClassMethod, methods: js.Array[ClassMethod], modifiers: js.Array[StmtModifier]) = this()
  def this(name: java.lang.String, parent: Expression, fields: js.Array[ClassField], getters: js.Array[ClassGetter], constructorMethod: ClassMethod, methods: js.Array[ClassMethod], modifiers: js.Array[StmtModifier], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, parent: Expression, fields: js.Array[ClassField], getters: js.Array[ClassGetter], constructorMethod: ClassMethod, methods: js.Array[ClassMethod], modifiers: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, parent: scala.Null, fields: js.Array[ClassField], getters: js.Array[ClassGetter], constructorMethod: ClassMethod, methods: js.Array[ClassMethod], modifiers: js.Array[StmtModifier], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, parent: scala.Null, fields: js.Array[ClassField], getters: js.Array[ClassGetter], constructorMethod: ClassMethod, methods: js.Array[ClassMethod], modifiers: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var constructorMethod: ClassMethod = js.native
  var fields: js.Array[ClassField] = js.native
  var getters: js.Array[ClassGetter] = js.native
  var methods: js.Array[ClassMethod] = js.native
  var name: java.lang.String = js.native
  var parent: Expression | scala.Null = js.native
}

