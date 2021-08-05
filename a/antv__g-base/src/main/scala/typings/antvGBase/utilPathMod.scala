package typings.antvGBase

import typings.antvGBase.typesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilPathMod {
  
  @JSImport("@antv/g-base/lib/util/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def catmullRomToBezier(crp: js.Any, z: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("catmullRomToBezier")(crp.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def fillPath(source: js.Any, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPath")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def fillPathByDiff(source: js.Any, target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fillPathByDiff")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def formatPath(fromPath: js.Any, toPath: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPath")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def intersection(path1: js.Any, path2: js.Any): Double | js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[js.Any]]
  
  inline def parsePathArray(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathArray")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def parsePathString(pathString: String): js.Array[PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathCommand]]
  
  inline def pathToAbsolute(pathArray: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToAbsolute")(pathArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def pathToCurve(path: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToCurve")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def pathToCurve(path: js.Any, path2: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToCurve")(path.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def rectPath(x: js.Any, y: js.Any, w: js.Any, h: js.Any): js.Array[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Any]]]
  inline def rectPath(x: js.Any, y: js.Any, w: js.Any, h: js.Any, r: js.Any): js.Array[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPath")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Any]]]
}
