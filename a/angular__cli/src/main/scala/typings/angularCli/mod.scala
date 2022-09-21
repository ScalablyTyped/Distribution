package typings.angularCli

import typings.angularCli.packageMetadataMod.PackageManifest
import typings.angularCli.packageMetadataMod.PackageMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(metadata: PackageMetadata, selector: String): PackageManifest = (^.asInstanceOf[js.Dynamic].apply(metadata.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[PackageManifest]
  
  @JSImport("npm-pick-manifest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
