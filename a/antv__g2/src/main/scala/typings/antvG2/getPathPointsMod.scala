package typings.antvG2

import typings.antvG2.libInterfaceMod.ShapeVertices
import typings.antvGBase.typesMod.PathCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPathPointsMod {
  
  @JSImport("@antv/g2/lib/geometry/shape/util/get-path-points", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPathPoints(points: ShapeVertices): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def getPathPoints(points: ShapeVertices, connectNulls: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getPathPoints(points: ShapeVertices, connectNulls: Boolean, showSinglePoint: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any], showSinglePoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getPathPoints(points: ShapeVertices, connectNulls: Unit, showSinglePoint: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any], showSinglePoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getSmoothViolinPath(points: ShapeVertices): js.Array[PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSmoothViolinPath")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathCommand]]
  
  inline def getViolinPath(points: ShapeVertices): js.Array[PathCommand] = ^.asInstanceOf[js.Dynamic].applyDynamic("getViolinPath")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathCommand]]
}
