package typings.antvGBase

import typings.antvGBase.libAbstractCanvasMod.default
import typings.antvGBase.libAnimateRegisterMod.EaseFn
import typings.antvGBase.libInterfacesMod.IBase
import typings.antvGBase.libTypesMod.CanvasCfg
import typings.antvGBase.libTypesMod.PathCommand
import typings.antvGBase.libTypesMod.ShapeAttrs
import typings.antvGBase.libTypesMod.ShapeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/g-base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@antv/g-base", "AbstractCanvas")
  @js.native
  open class AbstractCanvas protected () extends default {
    def this(cfg: CanvasCfg) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g-base", "AbstractGroup")
  @js.native
  open class AbstractGroup ()
    extends typings.antvGBase.libAbstractGroupMod.default
  
  /* note: abstract class */ @JSImport("@antv/g-base", "AbstractShape")
  @js.native
  open class AbstractShape protected ()
    extends typings.antvGBase.libAbstractShapeMod.default {
    def this(cfg: ShapeCfg) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g-base", "Base")
  @js.native
  open class Base protected ()
    extends typings.antvGBase.libAbstractBaseMod.default {
    def this(cfg: Any) = this()
  }
  
  @JSImport("@antv/g-base", "Event")
  @js.native
  open class Event protected ()
    extends typings.antvGBase.libEventGraphEventMod.default {
    def this(`type`: Any, event: Any) = this()
  }
  
  object PathUtil {
    
    @JSImport("@antv/g-base", "PathUtil")
    @js.native
    val ^ : js.Any = js.native
    
    inline def catmullRomToBezier(crp: Any, z: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("catmullRomToBezier")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def fillPath(source: Any, target: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPath")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def fillPathByDiff(source: Any, target: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPathByDiff")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def formatPath(fromPath: Any, toPath: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPath")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def intersection(path1: Any, path2: Any): Double | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Any]]
    
    inline def parsePathArray(path: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathArray")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def parsePathString(pathString: String): js.Array[PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathCommand]]
    
    inline def pathToAbsolute(pathArray: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToAbsolute")(pathArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def pathToCurve(path: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToCurve")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def pathToCurve(path: Any, path2: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToCurve")(path.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def rectPath(x: Any, y: Any, w: Any, h: Any): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
    inline def rectPath(x: Any, y: Any, w: Any, h: Any, r: Any): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  }
  
  inline def assembleFont(attrs: ShapeAttrs): String = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleFont")(attrs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getOffScreenContext(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOffScreenContext")().asInstanceOf[Any]
  
  inline def getTextHeight(text: String, fontSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextHeight")(text.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getTextHeight(text: String, fontSize: Double, lineHeight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextHeight")(text.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def invert(a: js.Array[Double]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def isAllowCapture(element: IBase): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAllowCapture")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def multiplyVec2(m: js.Array[Double], v: js.Array[Double]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyVec2")(m.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def registerEasing(`type`: String, easeFn: EaseFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEasing")(`type`.asInstanceOf[js.Any], easeFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@antv/g-base", "version")
  @js.native
  val version: /* "0.5.11" */ String = js.native
}
