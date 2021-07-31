package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asarMod {
  
  @JSImport("app-builder-lib/out/asar/asar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def readAsar(archive: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsarFilesystem */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsar")(archive.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsarFilesystem */ js.Any
  ]]
  
  @scala.inline
  def readAsarJson(archive: String, file: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readAsarJson")(archive.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
