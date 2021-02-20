package typings.antvGBase

import typings.antvGBase.canvasMod.default
import typings.antvGBase.typesMod.CanvasCfg
import typings.antvGBase.typesMod.PathCommand
import typings.antvGBase.typesMod.ShapeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/g-base", "AbstractCanvas")
  @js.native
  abstract class AbstractCanvas protected () extends default {
    def this(cfg: CanvasCfg) = this()
  }
  
  @JSImport("@antv/g-base", "AbstractGroup")
  @js.native
  abstract class AbstractGroup ()
    extends typings.antvGBase.groupMod.default
  
  @JSImport("@antv/g-base", "AbstractShape")
  @js.native
  abstract class AbstractShape protected ()
    extends typings.antvGBase.shapeMod.default {
    def this(cfg: ShapeCfg) = this()
  }
  
  @JSImport("@antv/g-base", "Base")
  @js.native
  abstract class Base protected ()
    extends typings.antvGBase.baseMod.default {
    def this(cfg: js.Any) = this()
  }
  
  @JSImport("@antv/g-base", "Event")
  @js.native
  class Event protected ()
    extends typings.antvGBase.graphEventMod.default {
    def this(`type`: js.Any, event: js.Any) = this()
  }
  
  object PathUtil {
    
    @JSImport("@antv/g-base", "PathUtil.catmullRomToBezier")
    @js.native
    def catmullRomToBezier(crp: js.Any, z: js.Any): js.Array[_] = js.native
    
    @JSImport("@antv/g-base", "PathUtil.fillPath")
    @js.native
    def fillPath(source: js.Any, target: js.Any): js.Any = js.native
    
    @JSImport("@antv/g-base", "PathUtil.fillPathByDiff")
    @js.native
    def fillPathByDiff(source: js.Any, target: js.Any): js.Any = js.native
    
    @JSImport("@antv/g-base", "PathUtil.formatPath")
    @js.native
    def formatPath(fromPath: js.Any, toPath: js.Any): js.Any = js.native
    
    @JSImport("@antv/g-base", "PathUtil.intersection")
    @js.native
    def intersection(path1: js.Any, path2: js.Any): Double | js.Array[_] = js.native
    
    @JSImport("@antv/g-base", "PathUtil.parsePathArray")
    @js.native
    def parsePathArray(path: js.Any): js.Any = js.native
    
    @JSImport("@antv/g-base", "PathUtil.parsePathString")
    @js.native
    def parsePathString(pathString: String): js.Array[PathCommand] = js.native
    
    @JSImport("@antv/g-base", "PathUtil.pathToAbsolute")
    @js.native
    def pathToAbsolute(pathArray: js.Any): js.Array[_] = js.native
    
    @JSImport("@antv/g-base", "PathUtil.pathToCurve")
    @js.native
    def pathToCurve(path: js.Any): js.Array[_] = js.native
    @JSImport("@antv/g-base", "PathUtil.pathToCurve")
    @js.native
    def pathToCurve(path: js.Any, path2: js.Any): js.Array[_] = js.native
    
    @JSImport("@antv/g-base", "PathUtil.rectPath")
    @js.native
    def rectPath(x: js.Any, y: js.Any, w: js.Any, h: js.Any): js.Array[js.Array[_]] = js.native
    @JSImport("@antv/g-base", "PathUtil.rectPath")
    @js.native
    def rectPath(x: js.Any, y: js.Any, w: js.Any, h: js.Any, r: js.Any): js.Array[js.Array[_]] = js.native
  }
  
  @JSImport("@antv/g-base", "version")
  @js.native
  val version: js.Any = js.native
}
