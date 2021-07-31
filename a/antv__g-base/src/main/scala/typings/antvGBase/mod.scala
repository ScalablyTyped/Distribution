package typings.antvGBase

import typings.antvGBase.canvasMod.default
import typings.antvGBase.typesMod.CanvasCfg
import typings.antvGBase.typesMod.PathCommand
import typings.antvGBase.typesMod.ShapeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@antv/g-base", "PathUtil")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def catmullRomToBezier(crp: js.Any, z: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("catmullRomToBezier")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def fillPath(source: js.Any, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPath")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def fillPathByDiff(source: js.Any, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPathByDiff")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def formatPath(fromPath: js.Any, toPath: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPath")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def intersection(path1: js.Any, path2: js.Any): Double | js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[js.Any]]
    
    @scala.inline
    def parsePathArray(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathArray")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def parsePathString(pathString: String): js.Array[PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathCommand]]
    
    @scala.inline
    def pathToAbsolute(pathArray: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToAbsolute")(pathArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def pathToCurve(path: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToCurve")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    @scala.inline
    def pathToCurve(path: js.Any, path2: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToCurve")(path.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    
    @scala.inline
    def rectPath(x: js.Any, y: js.Any, w: js.Any, h: js.Any): js.Array[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Any]]]
    @scala.inline
    def rectPath(x: js.Any, y: js.Any, w: js.Any, h: js.Any, r: js.Any): js.Array[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Any]]]
  }
  
  @JSImport("@antv/g-base", "version")
  @js.native
  val version: js.Any = js.native
}
