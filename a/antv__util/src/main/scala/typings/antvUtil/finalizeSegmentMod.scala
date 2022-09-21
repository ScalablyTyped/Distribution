package typings.antvUtil

import typings.antvUtil.pathParserMod.PathParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object finalizeSegmentMod {
  
  @JSImport("@antv/util/lib/path/parser/finalize-segment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def finalizeSegment(path: PathParser): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("finalizeSegment")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
