package typings.appModulePath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("app-module-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPath(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addPath(path: String, parent: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPath")(path.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableForDir(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableForDir")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removePath(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removePath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
