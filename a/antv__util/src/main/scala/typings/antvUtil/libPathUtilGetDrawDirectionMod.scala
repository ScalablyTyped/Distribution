package typings.antvUtil

import typings.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathUtilGetDrawDirectionMod {
  
  @JSImport("@antv/util/lib/path/util/get-draw-direction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDrawDirection(pathArray: PathArray): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getDrawDirection")(pathArray.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
