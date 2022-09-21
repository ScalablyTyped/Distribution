package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statMod {
  
  @JSImport("@antv/g2/lib/util/stat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMean(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMean")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMedian(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMedian")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
}
