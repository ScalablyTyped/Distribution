package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.angularCompilerCli.angularCompilerCliInts.`0`
import typings.typescript.mod.Expression
import typings.typescript.mod.ImportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalTypeValueReference
  extends StObject
     with TypeValueReference {
  
  /**
    * If the type originates from a default import, the import statement is captured here to be able
    * to track its usages, preventing the import from being elided if it was originally only used in
    * a type-position. See `DefaultImportTracker` for details.
    */
  var defaultImportStatement: ImportDeclaration | Null
  
  /**
    * The synthesized expression to reference the type in a value position.
    */
  var expression: Expression
  
  var kind: `0`
}
object LocalTypeValueReference {
  
  inline def apply(expression: Expression): LocalTypeValueReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], kind = 0, defaultImportStatement = null)
    __obj.asInstanceOf[LocalTypeValueReference]
  }
  
  extension [Self <: LocalTypeValueReference](x: Self) {
    
    inline def setDefaultImportStatement(value: ImportDeclaration): Self = StObject.set(x, "defaultImportStatement", value.asInstanceOf[js.Any])
    
    inline def setDefaultImportStatementNull: Self = StObject.set(x, "defaultImportStatement", null)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `0`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
