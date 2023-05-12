package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataReader extends StObject {
  
  def getDirectiveMetadata(node: Reference[ClassDeclarationDeclarati]): DirectiveMeta | Null
  
  def getNgModuleMetadata(node: Reference[ClassDeclarationDeclarati]): NgModuleMeta | Null
  
  def getPipeMetadata(node: Reference[ClassDeclarationDeclarati]): PipeMeta | Null
}
object MetadataReader {
  
  inline def apply(
    getDirectiveMetadata: Reference[ClassDeclarationDeclarati] => DirectiveMeta | Null,
    getNgModuleMetadata: Reference[ClassDeclarationDeclarati] => NgModuleMeta | Null,
    getPipeMetadata: Reference[ClassDeclarationDeclarati] => PipeMeta | Null
  ): MetadataReader = {
    val __obj = js.Dynamic.literal(getDirectiveMetadata = js.Any.fromFunction1(getDirectiveMetadata), getNgModuleMetadata = js.Any.fromFunction1(getNgModuleMetadata), getPipeMetadata = js.Any.fromFunction1(getPipeMetadata))
    __obj.asInstanceOf[MetadataReader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataReader] (val x: Self) extends AnyVal {
    
    inline def setGetDirectiveMetadata(value: Reference[ClassDeclarationDeclarati] => DirectiveMeta | Null): Self = StObject.set(x, "getDirectiveMetadata", js.Any.fromFunction1(value))
    
    inline def setGetNgModuleMetadata(value: Reference[ClassDeclarationDeclarati] => NgModuleMeta | Null): Self = StObject.set(x, "getNgModuleMetadata", js.Any.fromFunction1(value))
    
    inline def setGetPipeMetadata(value: Reference[ClassDeclarationDeclarati] => PipeMeta | Null): Self = StObject.set(x, "getPipeMetadata", js.Any.fromFunction1(value))
  }
}
