package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asarMod {
  
  @JSImport("app-builder-lib/out/asar/asar", "readAsar")
  @js.native
  def readAsar(archive: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsarFilesystem */ _
  ] = js.native
  
  @JSImport("app-builder-lib/out/asar/asar", "readAsarJson")
  @js.native
  def readAsarJson(archive: String, file: String): js.Promise[_] = js.native
}
