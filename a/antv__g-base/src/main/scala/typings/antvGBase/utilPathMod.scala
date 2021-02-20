package typings.antvGBase

import typings.antvGBase.typesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilPathMod {
  
  @JSImport("@antv/g-base/lib/util/path", "catmullRomToBezier")
  @js.native
  def catmullRomToBezier(crp: js.Any, z: js.Any): js.Array[_] = js.native
  
  @JSImport("@antv/g-base/lib/util/path", "fillPath")
  @js.native
  def fillPath(source: js.Any, target: js.Any): js.Any = js.native
  
  @JSImport("@antv/g-base/lib/util/path", "fillPathByDiff")
  @js.native
  def fillPathByDiff(source: js.Any, target: js.Any): js.Any = js.native
  
  @JSImport("@antv/g-base/lib/util/path", "formatPath")
  @js.native
  def formatPath(fromPath: js.Any, toPath: js.Any): js.Any = js.native
  
  @JSImport("@antv/g-base/lib/util/path", "intersection")
  @js.native
  def intersection(path1: js.Any, path2: js.Any): Double | js.Array[_] = js.native
  
  @JSImport("@antv/g-base/lib/util/path", "parsePathArray")
  @js.native
  def parsePathArray(path: js.Any): js.Any = js.native
  
  @JSImport("@antv/g-base/lib/util/path", "parsePathString")
  @js.native
  def parsePathString(pathString: String): js.Array[PathCommand] = js.native
  
  @JSImport("@antv/g-base/lib/util/path", "pathToAbsolute")
  @js.native
  def pathToAbsolute(pathArray: js.Any): js.Array[_] = js.native
  
  @JSImport("@antv/g-base/lib/util/path", "pathToCurve")
  @js.native
  def pathToCurve(path: js.Any): js.Array[_] = js.native
  @JSImport("@antv/g-base/lib/util/path", "pathToCurve")
  @js.native
  def pathToCurve(path: js.Any, path2: js.Any): js.Array[_] = js.native
  
  @JSImport("@antv/g-base/lib/util/path", "rectPath")
  @js.native
  def rectPath(x: js.Any, y: js.Any, w: js.Any, h: js.Any): js.Array[js.Array[_]] = js.native
  @JSImport("@antv/g-base/lib/util/path", "rectPath")
  @js.native
  def rectPath(x: js.Any, y: js.Any, w: js.Any, h: js.Any, r: js.Any): js.Array[js.Array[_]] = js.native
}
