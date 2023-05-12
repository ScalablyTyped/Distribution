package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataReaderWithIndex
  extends StObject
     with MetadataReader {
  
  def getKnown(kind: MetaKind): js.Array[ClassDeclarationDeclarati]
}
object MetadataReaderWithIndex {
  
  inline def apply(
    getDirectiveMetadata: Reference[ClassDeclarationDeclarati] => DirectiveMeta | Null,
    getKnown: MetaKind => js.Array[ClassDeclarationDeclarati],
    getNgModuleMetadata: Reference[ClassDeclarationDeclarati] => NgModuleMeta | Null,
    getPipeMetadata: Reference[ClassDeclarationDeclarati] => PipeMeta | Null
  ): MetadataReaderWithIndex = {
    val __obj = js.Dynamic.literal(getDirectiveMetadata = js.Any.fromFunction1(getDirectiveMetadata), getKnown = js.Any.fromFunction1(getKnown), getNgModuleMetadata = js.Any.fromFunction1(getNgModuleMetadata), getPipeMetadata = js.Any.fromFunction1(getPipeMetadata))
    __obj.asInstanceOf[MetadataReaderWithIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataReaderWithIndex] (val x: Self) extends AnyVal {
    
    inline def setGetKnown(value: MetaKind => js.Array[ClassDeclarationDeclarati]): Self = StObject.set(x, "getKnown", js.Any.fromFunction1(value))
  }
}
