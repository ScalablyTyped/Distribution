package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FDone extends StObject {
  
  val fDone: js.Any = js.native
  
  val nPage: js.Any = js.native
  
  val pDisp: js.Any = js.native
}
object FDone {
  
  @scala.inline
  def apply(fDone: js.Any, nPage: js.Any, pDisp: js.Any): FDone = {
    val __obj = js.Dynamic.literal(fDone = fDone.asInstanceOf[js.Any], nPage = nPage.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FDone]
  }
  
  @scala.inline
  implicit class FDoneMutableBuilder[Self <: FDone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFDone(value: js.Any): Self = StObject.set(x, "fDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNPage(value: js.Any): Self = StObject.set(x, "nPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDisp(value: js.Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
  }
}
