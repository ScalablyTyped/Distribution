package typings.antvGLite.utilsGradientMod

import typings.antvGLite.anon.R
import typings.antvGLite.anon.X1
import typings.antvGLite.utilsGradientMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def colorStopToString(colorStop: ColorStop): String = ^.asInstanceOf[js.Dynamic].applyDynamic("colorStopToString")(colorStop.asInstanceOf[js.Any]).asInstanceOf[String]

inline def computeLinearGradient(width: Double, height: Double, angle: Double): X1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeLinearGradient")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[X1]

inline def computeRadialGradient(width: Double, height: Double, cx: Double, cy: Double): R = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRadialGradient")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any])).asInstanceOf[R]

inline def parseGradient(code: String): js.Array[GradientNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGradient")(code.asInstanceOf[js.Any]).asInstanceOf[js.Array[GradientNode]]
