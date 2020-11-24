package typings.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/asar/asar", JSImport.Namespace)
@js.native
object asarMod extends js.Object {
  
  def readAsar(archive: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsarFilesystem */ _
  ] = js.native
  
  def readAsarJson(archive: String, file: String): js.Promise[_] = js.native
}
