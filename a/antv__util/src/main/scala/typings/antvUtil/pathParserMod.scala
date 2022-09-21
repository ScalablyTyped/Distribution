package typings.antvUtil

import typings.antvUtil.pathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathParserMod {
  
  @JSImport("@antv/util/lib/path/parser/path-parser", "PathParser")
  @js.native
  open class PathParser protected () extends StObject {
    def this(pathString: String) = this()
    
    var data: Any = js.native
    
    var err: String = js.native
    
    var index: Double = js.native
    
    var max: Double = js.native
    
    var param: Double = js.native
    
    var pathValue: String = js.native
    
    var segmentStart: Double = js.native
    
    var segments: PathArray = js.native
  }
}
