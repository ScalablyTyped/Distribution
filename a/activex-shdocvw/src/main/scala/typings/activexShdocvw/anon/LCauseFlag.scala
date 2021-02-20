package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LCauseFlag extends StObject {
  
  var Cancel: Boolean = js.native
  
  val lCauseFlag: Double = js.native
  
  val pWB2: js.Any = js.native
}
object LCauseFlag {
  
  @scala.inline
  def apply(Cancel: Boolean, lCauseFlag: Double, pWB2: js.Any): LCauseFlag = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], lCauseFlag = lCauseFlag.asInstanceOf[js.Any], pWB2 = pWB2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCauseFlag]
  }
  
  @scala.inline
  implicit class LCauseFlagMutableBuilder[Self <: LCauseFlag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLCauseFlag(value: Double): Self = StObject.set(x, "lCauseFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPWB2(value: js.Any): Self = StObject.set(x, "pWB2", value.asInstanceOf[js.Any])
  }
}
