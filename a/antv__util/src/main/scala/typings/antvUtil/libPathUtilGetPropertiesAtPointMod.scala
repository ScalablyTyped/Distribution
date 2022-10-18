package typings.antvUtil

import typings.antvUtil.libPathTypesMod.PathArray
import typings.antvUtil.libPathTypesMod.Point
import typings.antvUtil.libPathTypesMod.PointProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilGetPropertiesAtPointMod {
  
  @JSImport("@antv/util/lib/path/util/get-properties-at-point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPropertiesAtPoint(pathInput: String, point: Point): PointProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesAtPoint")(pathInput.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[PointProperties]
  inline def getPropertiesAtPoint(pathInput: PathArray, point: Point): PointProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertiesAtPoint")(pathInput.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[PointProperties]
}
