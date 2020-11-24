package typings.antvGBase

import typings.antvGBase.canvasMod.default
import typings.antvGBase.typesMod.CanvasCfg
import typings.antvGBase.typesMod.PathCommand
import typings.antvGBase.typesMod.ShapeCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val version: js.Any = js.native
  
  @js.native
  abstract class AbstractCanvas protected () extends default {
    def this(cfg: CanvasCfg) = this()
  }
  
  @js.native
  abstract class AbstractGroup ()
    extends typings.antvGBase.groupMod.AbstractGroup
  
  @js.native
  abstract class AbstractShape protected ()
    extends typings.antvGBase.shapeMod.default {
    def this(cfg: ShapeCfg) = this()
  }
  
  @js.native
  abstract class Base protected ()
    extends typings.antvGBase.baseMod.default {
    def this(cfg: js.Any) = this()
  }
  
  @js.native
  class Event protected ()
    extends typings.antvGBase.graphEventMod.default {
    def this(`type`: js.Any, event: js.Any) = this()
  }
  
  @js.native
  object PathUtil extends js.Object {
    
    def catmullRomToBezier(crp: js.Any, z: js.Any): js.Array[_] = js.native
    
    def fillPath(source: js.Any, target: js.Any): js.Any = js.native
    
    def fillPathByDiff(source: js.Any, target: js.Any): js.Any = js.native
    
    def formatPath(fromPath: js.Any, toPath: js.Any): js.Any = js.native
    
    def intersection(path1: js.Any, path2: js.Any): Double | js.Array[_] = js.native
    
    def parsePathArray(path: js.Any): js.Any = js.native
    
    def parsePathString(pathString: String): js.Array[PathCommand] = js.native
    
    def pathToAbsolute(pathArray: js.Any): js.Array[_] = js.native
    
    def pathToCurve(path: js.Any): js.Array[_] = js.native
    def pathToCurve(path: js.Any, path2: js.Any): js.Array[_] = js.native
    
    def rectPath(x: js.Any, y: js.Any, w: js.Any, h: js.Any): js.Array[js.Array[_]] = js.native
    def rectPath(x: js.Any, y: js.Any, w: js.Any, h: js.Any, r: js.Any): js.Array[js.Array[_]] = js.native
  }
}
