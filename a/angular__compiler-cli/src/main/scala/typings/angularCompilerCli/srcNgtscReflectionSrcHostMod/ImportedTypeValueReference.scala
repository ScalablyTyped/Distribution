package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.angularCompilerCli.angularCompilerCliInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportedTypeValueReference
  extends StObject
     with TypeValueReference {
  
  /**
    * The name of the top-level symbol that is imported from `moduleName`. If `nestedPath` is also
    * present, a nested object is being referenced from the top-level symbol.
    */
  var importedName: String
  
  var kind: `1`
  
  /**
    * The module specifier from which the `importedName` symbol should be imported.
    */
  var moduleName: String
  
  /**
    * If present, represents the symbol names that are referenced from the top-level import.
    * When `null` or empty, the `importedName` itself is the symbol being referenced.
    */
  var nestedPath: js.Array[String] | Null
  
  var valueDeclaration: DeclarationNode
}
object ImportedTypeValueReference {
  
  inline def apply(importedName: String, moduleName: String, valueDeclaration: DeclarationNode): ImportedTypeValueReference = {
    val __obj = js.Dynamic.literal(importedName = importedName.asInstanceOf[js.Any], kind = 1, moduleName = moduleName.asInstanceOf[js.Any], valueDeclaration = valueDeclaration.asInstanceOf[js.Any], nestedPath = null)
    __obj.asInstanceOf[ImportedTypeValueReference]
  }
  
  extension [Self <: ImportedTypeValueReference](x: Self) {
    
    inline def setImportedName(value: String): Self = StObject.set(x, "importedName", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `1`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setNestedPath(value: js.Array[String]): Self = StObject.set(x, "nestedPath", value.asInstanceOf[js.Any])
    
    inline def setNestedPathNull: Self = StObject.set(x, "nestedPath", null)
    
    inline def setNestedPathVarargs(value: String*): Self = StObject.set(x, "nestedPath", js.Array(value*))
    
    inline def setValueDeclaration(value: DeclarationNode): Self = StObject.set(x, "valueDeclaration", value.asInstanceOf[js.Any])
  }
}
