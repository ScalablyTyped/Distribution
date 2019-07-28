package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ClassStmt")
@js.native
class ClassStmt protected () extends Statement {
  def this(
    name: String,
    parent: Null,
    fields: js.Array[ClassField],
    getters: js.Array[ClassGetter],
    constructorMethod: ClassMethod,
    methods: js.Array[ClassMethod]
  ) = this()
  def this(
    name: String,
    parent: Expression,
    fields: js.Array[ClassField],
    getters: js.Array[ClassGetter],
    constructorMethod: ClassMethod,
    methods: js.Array[ClassMethod]
  ) = this()
  def this(
    name: String,
    parent: Null,
    fields: js.Array[ClassField],
    getters: js.Array[ClassGetter],
    constructorMethod: ClassMethod,
    methods: js.Array[ClassMethod],
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(
    name: String,
    parent: Expression,
    fields: js.Array[ClassField],
    getters: js.Array[ClassGetter],
    constructorMethod: ClassMethod,
    methods: js.Array[ClassMethod],
    modifiers: js.Array[StmtModifier]
  ) = this()
  def this(
    name: String,
    parent: Null,
    fields: js.Array[ClassField],
    getters: js.Array[ClassGetter],
    constructorMethod: ClassMethod,
    methods: js.Array[ClassMethod],
    modifiers: js.Array[StmtModifier],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    parent: Null,
    fields: js.Array[ClassField],
    getters: js.Array[ClassGetter],
    constructorMethod: ClassMethod,
    methods: js.Array[ClassMethod],
    modifiers: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    parent: Expression,
    fields: js.Array[ClassField],
    getters: js.Array[ClassGetter],
    constructorMethod: ClassMethod,
    methods: js.Array[ClassMethod],
    modifiers: js.Array[StmtModifier],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    parent: Expression,
    fields: js.Array[ClassField],
    getters: js.Array[ClassGetter],
    constructorMethod: ClassMethod,
    methods: js.Array[ClassMethod],
    modifiers: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  var constructorMethod: ClassMethod = js.native
  var fields: js.Array[ClassField] = js.native
  var getters: js.Array[ClassGetter] = js.native
  var methods: js.Array[ClassMethod] = js.native
  var name: String = js.native
  var parent: Expression | Null = js.native
}

