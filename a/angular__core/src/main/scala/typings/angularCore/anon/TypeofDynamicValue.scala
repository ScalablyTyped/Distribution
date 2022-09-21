package typings.angularCore.anon

import org.scalablytyped.runtime.Instantiable0
import typings.angularCompilerCli.migrationsMod.DynamicValue
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.srcHostMod.FunctionDefinition
import typings.angularCompilerCli.syntheticMod.SyntheticValue
import typings.typescript.mod.Declaration
import typings.typescript.mod.Node
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDynamicValue
  extends StObject
     with Instantiable0[DynamicValue[js.Object]] {
  
  def fromComplexFunctionCall(node: Node, fn: FunctionDefinition): typings.angularCompilerCli.dynamicMod.DynamicValue[FunctionDefinition] = js.native
  
  def fromDynamicInput(node: Node, input: typings.angularCompilerCli.dynamicMod.DynamicValue[Any]): typings.angularCompilerCli.dynamicMod.DynamicValue[typings.angularCompilerCli.dynamicMod.DynamicValue[Any]] = js.native
  
  def fromDynamicString(node: Node): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = js.native
  
  def fromDynamicType(node: TypeNode): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = js.native
  
  def fromExternalReference(node: Node, ref: Reference[Declaration]): typings.angularCompilerCli.dynamicMod.DynamicValue[Reference[Declaration]] = js.native
  
  def fromInvalidExpressionType(node: Node, value: Any): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = js.native
  
  def fromSyntheticInput(node: Node, value: SyntheticValue[Any]): typings.angularCompilerCli.dynamicMod.DynamicValue[SyntheticValue[Any]] = js.native
  
  def fromUnknown(node: Node): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = js.native
  
  def fromUnknownIdentifier(node: typings.typescript.mod.Identifier): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = js.native
  
  def fromUnsupportedSyntax(node: Node): typings.angularCompilerCli.dynamicMod.DynamicValue[Any] = js.native
}
