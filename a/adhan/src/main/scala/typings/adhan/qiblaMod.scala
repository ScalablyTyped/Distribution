package typings.adhan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qiblaMod {
  
  @JSImport("adhan/lib/types/Qibla", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(coordinates: typings.adhan.coordinatesMod.default): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(coordinates.asInstanceOf[js.Any]).asInstanceOf[Double]
}
