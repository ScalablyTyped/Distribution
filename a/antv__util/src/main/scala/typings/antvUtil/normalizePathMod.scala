package typings.antvUtil

import typings.antvUtil.pathTypesMod.NormalArray
import typings.antvUtil.pathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizePathMod {
  
  @JSImport("@antv/util/lib/path/process/normalize-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizePath(pathInput: String): NormalArray = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(pathInput.asInstanceOf[js.Any]).asInstanceOf[NormalArray]
  inline def normalizePath(pathInput: PathArray): NormalArray = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(pathInput.asInstanceOf[js.Any]).asInstanceOf[NormalArray]
}
