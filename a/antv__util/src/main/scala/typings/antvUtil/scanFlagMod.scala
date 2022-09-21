package typings.antvUtil

import typings.antvUtil.pathParserMod.PathParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scanFlagMod {
  
  @JSImport("@antv/util/lib/path/parser/scan-flag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scanFlag(path: PathParser): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scanFlag")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
