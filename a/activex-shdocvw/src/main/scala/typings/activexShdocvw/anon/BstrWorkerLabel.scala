package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BstrWorkerLabel extends StObject {
  
  val bstrWorkerLabel: String = js.native
  
  val dwUniqueID: Double = js.native
}
object BstrWorkerLabel {
  
  @scala.inline
  def apply(bstrWorkerLabel: String, dwUniqueID: Double): BstrWorkerLabel = {
    val __obj = js.Dynamic.literal(bstrWorkerLabel = bstrWorkerLabel.asInstanceOf[js.Any], dwUniqueID = dwUniqueID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrWorkerLabel]
  }
  
  @scala.inline
  implicit class BstrWorkerLabelMutableBuilder[Self <: BstrWorkerLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrWorkerLabel(value: String): Self = StObject.set(x, "bstrWorkerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDwUniqueID(value: Double): Self = StObject.set(x, "dwUniqueID", value.asInstanceOf[js.Any])
  }
}
