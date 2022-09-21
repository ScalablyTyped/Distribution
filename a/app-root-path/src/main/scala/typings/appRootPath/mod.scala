package typings.appRootPath

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("app-root-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-root-path", "path")
  @js.native
  val path: String = js.native
  
  inline def require(pathToModule: String): ReturnType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequire */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(pathToModule.asInstanceOf[js.Any]).asInstanceOf[ReturnType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequire */ Any
  ]]
  
  inline def resolve(pathToModule: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pathToModule.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setPath(explicitlySetPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(explicitlySetPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
}
