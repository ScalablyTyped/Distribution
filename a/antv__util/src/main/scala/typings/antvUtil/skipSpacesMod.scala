package typings.antvUtil

import typings.antvUtil.pathParserMod.PathParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipSpacesMod {
  
  @JSImport("@antv/util/lib/path/parser/skip-spaces", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skipSpaces(path: PathParser): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipSpaces")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
