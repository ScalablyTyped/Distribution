package typings.angularCompilerCli

import typings.std.Map
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTransformSrcAliasMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/transform/src/alias", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aliasTransformFactory(exportStatements: Map[String, Map[String, js.Tuple2[String, String]]]): TransformerFactory[SourceFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("aliasTransformFactory")(exportStatements.asInstanceOf[js.Any]).asInstanceOf[TransformerFactory[SourceFile]]
}
