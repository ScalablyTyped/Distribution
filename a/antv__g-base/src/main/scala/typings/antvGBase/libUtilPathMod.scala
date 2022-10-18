package typings.antvGBase

import typings.antvGBase.libTypesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilPathMod {
  
  @JSImport("@antv/g-base/lib/util/path", JSImport.Namespace)
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
