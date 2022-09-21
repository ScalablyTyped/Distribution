package typings.antvUtil

import typings.antvUtil.pathParserMod.PathParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scanSegmentMod {
  
  @JSImport("@antv/util/lib/path/parser/scan-segment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scanSegment(path: PathParser): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scanSegment")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
