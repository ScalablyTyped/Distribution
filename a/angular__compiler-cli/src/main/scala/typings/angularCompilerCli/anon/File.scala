package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.ParseSourceFile
import typings.angularCompilerCli.indexerSrcApiMod.TopLevelIdentifier
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var file: ParseSourceFile
  
  var identifiers: Set[TopLevelIdentifier]
  
  var isInline: Boolean
  
  var usedComponents: Set[DeclarationNode]
}
object File {
  
  inline def apply(
    file: ParseSourceFile,
    identifiers: Set[TopLevelIdentifier],
    isInline: Boolean,
    usedComponents: Set[DeclarationNode]
  ): File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], usedComponents = usedComponents.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setFile(value: ParseSourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setIdentifiers(value: Set[TopLevelIdentifier]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    inline def setUsedComponents(value: Set[DeclarationNode]): Self = StObject.set(x, "usedComponents", value.asInstanceOf[js.Any])
  }
}
