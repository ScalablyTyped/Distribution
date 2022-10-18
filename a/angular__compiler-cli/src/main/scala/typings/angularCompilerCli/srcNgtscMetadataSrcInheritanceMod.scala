package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscMetadataSrcInheritanceMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/inheritance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenInheritedDirectiveMetadata(reader: MetadataReader, dir: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenInheritedDirectiveMetadata")(reader.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[DirectiveMeta]
}
