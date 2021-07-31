package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.compileMetadataMod.CompilePipeMetadata
import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typings.angularCompiler.compileMetadataMod.CompileTypeSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata
  
  var summary: CompileTypeSummary
}
object Metadata {
  
  @scala.inline
  def apply(
    metadata: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata,
    summary: CompileTypeSummary
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(
      value: CompileNgModuleMetadata | CompileDirectiveMetadata | CompilePipeMetadata | CompileTypeMetadata
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: CompileTypeSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
