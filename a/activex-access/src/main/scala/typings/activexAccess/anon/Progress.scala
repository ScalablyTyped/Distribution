package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress extends StObject {
  
  val Progress: Double = js.native
  
  val ProgressMax: Double = js.native
}
object Progress {
  
  @scala.inline
  def apply(Progress: Double, ProgressMax: Double): Progress = {
    val __obj = js.Dynamic.literal(Progress = Progress.asInstanceOf[js.Any], ProgressMax = ProgressMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressMax(value: Double): Self = StObject.set(x, "ProgressMax", value.asInstanceOf[js.Any])
  }
}
