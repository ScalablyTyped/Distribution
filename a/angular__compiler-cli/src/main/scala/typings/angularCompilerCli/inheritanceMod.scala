package typings.angularCompilerCli

import typings.angularCompilerCli.metadataSrcApiMod.DirectiveMeta
import typings.angularCompilerCli.metadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inheritanceMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/inheritance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenInheritedDirectiveMetadata(reader: MetadataReader, dir: Reference[ClassDeclaration[DeclarationNode]]): DirectiveMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenInheritedDirectiveMetadata")(reader.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[DirectiveMeta]
}
