package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BstrUrl extends StObject {
  
  var Cancel: Boolean
  
  val bstrUrl: String
  
  val bstrUrlContext: String
  
  val dwFlags: Double
  
  var ppDisp: js.Any
}
object BstrUrl {
  
  @scala.inline
  def apply(Cancel: Boolean, bstrUrl: String, bstrUrlContext: String, dwFlags: Double, ppDisp: js.Any): BstrUrl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], bstrUrl = bstrUrl.asInstanceOf[js.Any], bstrUrlContext = bstrUrlContext.asInstanceOf[js.Any], dwFlags = dwFlags.asInstanceOf[js.Any], ppDisp = ppDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrUrl]
  }
  
  @scala.inline
  implicit class BstrUrlMutableBuilder[Self <: BstrUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrUrl(value: String): Self = StObject.set(x, "bstrUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBstrUrlContext(value: String): Self = StObject.set(x, "bstrUrlContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDwFlags(value: Double): Self = StObject.set(x, "dwFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPpDisp(value: js.Any): Self = StObject.set(x, "ppDisp", value.asInstanceOf[js.Any])
  }
}
