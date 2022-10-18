package typings.antvUtil

import typings.antvUtil.libPathTypesMod.CurveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathProcessReverseCurveMod {
  
  @JSImport("@antv/util/lib/path/process/reverse-curve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reverseCurve(pathArray: CurveArray): CurveArray = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCurve")(pathArray.asInstanceOf[js.Any]).asInstanceOf[CurveArray]
}
