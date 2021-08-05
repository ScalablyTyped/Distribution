package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  val Progress: Double
  
  val ProgressMax: Double
}
object Progress {
  
  inline def apply(Progress: Double, ProgressMax: Double): Progress = {
    val __obj = js.Dynamic.literal(Progress = Progress.asInstanceOf[js.Any], ProgressMax = ProgressMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setProgress(value: Double): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    inline def setProgressMax(value: Double): Self = StObject.set(x, "ProgressMax", value.asInstanceOf[js.Any])
  }
}
