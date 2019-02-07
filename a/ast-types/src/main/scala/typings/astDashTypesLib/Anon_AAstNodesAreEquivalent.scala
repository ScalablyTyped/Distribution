package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AAstNodesAreEquivalent extends js.Object {
  var NodePath: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ast-types/lib/node-path.NodePathConstructor */ js.Any = js.native
  var Path: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ast-types/lib/path.PathConstructor */ js.Any = js.native
  var PathVisitor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ast-types/lib/path-visitor.PathVisitorConstructor */ js.Any = js.native
  var Type: Anon_Def = js.native
  @JSName("astNodesAreEquivalent")
  var astNodesAreEquivalent_Original: Anon_A = js.native
  var builders: org.scalablytyped.runtime.StringDictionary[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ast-types/lib/types.Builder */ js.Any
  ] = js.native
  var builtInTypes: Anon_Array = js.native
  var namedTypes: org.scalablytyped.runtime.StringDictionary[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ast-types/lib/types.AnyType */ js.Any
  ] = js.native
  def astNodesAreEquivalent(a: js.Any, b: js.Any): scala.Boolean = js.native
  def astNodesAreEquivalent(a: js.Any, b: js.Any, problemPath: js.Any): scala.Boolean = js.native
  def defineMethod(name: js.Any): js.Function = js.native
  def defineMethod(name: js.Any, func: js.Function): js.Function = js.native
  def eachField(`object`: js.Any, callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _]): scala.Unit = js.native
  def eachField(
    `object`: js.Any,
    callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _],
    context: js.Any
  ): scala.Unit = js.native
  def getBuilderName(typeName: js.Any): js.Any = js.native
  def getFieldNames(`object`: js.Any): js.Array[java.lang.String] = js.native
  def getFieldValue(`object`: js.Any, fieldName: js.Any): js.Any = js.native
  def getSupertypeNames(typeName: java.lang.String): js.Array[java.lang.String] = js.native
  def someField(`object`: js.Any, callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _]): scala.Boolean = js.native
  def someField(
    `object`: js.Any,
    callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _],
    context: js.Any
  ): scala.Boolean = js.native
  def use[T](plugin: astDashTypesLib.typesMod.Plugin[T]): T = js.native
  def visit(
    node: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ast-types/lib/types.ASTNode */ js.Any
  ): js.Any = js.native
  def visit(
    node: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_ast-types/lib/types.ASTNode */ js.Any,
    methods: js.Any
  ): js.Any = js.native
}

