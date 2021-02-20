package typings.astTypes.anon

import typings.astTypes.astTypesMod.Plugin
import typings.astTypes.namedTypesMod.NamedTypes_
import typings.astTypes.nodePathMod.NodePathConstructor
import typings.astTypes.pathMod.PathConstructor
import typings.astTypes.pathVisitorMod.PathVisitorConstructor
import typings.astTypes.typesMod.ASTNode
import typings.astTypes.visitorMod.Visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AstNodesAreEquivalent extends StObject {
  
  var NodePath: NodePathConstructor = js.native
  
  var Path: PathConstructor = js.native
  
  var PathVisitor: PathVisitorConstructor = js.native
  
  var Type: Def = js.native
  
  def astNodesAreEquivalent(a: js.Any, b: js.Any): Boolean = js.native
  def astNodesAreEquivalent(a: js.Any, b: js.Any, problemPath: js.Any): Boolean = js.native
  @JSName("astNodesAreEquivalent")
  var astNodesAreEquivalent_Original: Call = js.native
  
  var builders: typings.astTypes.buildersMod.builders = js.native
  
  var builtInTypes: Array = js.native
  
  def defineMethod(name: js.Any): js.Function = js.native
  def defineMethod(name: js.Any, func: js.Function): js.Function = js.native
  
  def eachField(`object`: js.Any, callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _]): Unit = js.native
  def eachField(
    `object`: js.Any,
    callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _],
    context: js.Any
  ): Unit = js.native
  
  def getBuilderName(typeName: js.Any): js.Any = js.native
  
  def getFieldNames(`object`: js.Any): js.Array[String] = js.native
  
  def getFieldValue(`object`: js.Any, fieldName: js.Any): js.Any = js.native
  
  def getSupertypeNames(typeName: String): js.Array[String] = js.native
  
  var namedTypes: NamedTypes_ = js.native
  
  def someField(`object`: js.Any, callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _]): Boolean = js.native
  def someField(
    `object`: js.Any,
    callback: js.Function2[/* name */ js.Any, /* value */ js.Any, _],
    context: js.Any
  ): Boolean = js.native
  
  def use[T_1](plugin: Plugin[T_1]): T_1 = js.native
  
  def visit[M](node: ASTNode): js.Any = js.native
  def visit[M](node: ASTNode, methods: Visitor[M]): js.Any = js.native
}
