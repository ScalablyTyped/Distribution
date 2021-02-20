package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait tagXHRCOOKIE extends StObject {
  
  val dwFlags: Double = js.native
  
  val ftExpires: _FILETIME = js.native
  
  val pwszName: String = js.native
  
  val pwszP3PPolicy: String = js.native
  
  val pwszUrl: String = js.native
  
  val pwszValue: String = js.native
}
object tagXHRCOOKIE {
  
  @scala.inline
  def apply(
    dwFlags: Double,
    ftExpires: _FILETIME,
    pwszName: String,
    pwszP3PPolicy: String,
    pwszUrl: String,
    pwszValue: String
  ): tagXHRCOOKIE = {
    val __obj = js.Dynamic.literal(dwFlags = dwFlags.asInstanceOf[js.Any], ftExpires = ftExpires.asInstanceOf[js.Any], pwszName = pwszName.asInstanceOf[js.Any], pwszP3PPolicy = pwszP3PPolicy.asInstanceOf[js.Any], pwszUrl = pwszUrl.asInstanceOf[js.Any], pwszValue = pwszValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[tagXHRCOOKIE]
  }
  
  @scala.inline
  implicit class tagXHRCOOKIEMutableBuilder[Self <: tagXHRCOOKIE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDwFlags(value: Double): Self = StObject.set(x, "dwFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFtExpires(value: _FILETIME): Self = StObject.set(x, "ftExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPwszName(value: String): Self = StObject.set(x, "pwszName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPwszP3PPolicy(value: String): Self = StObject.set(x, "pwszP3PPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPwszUrl(value: String): Self = StObject.set(x, "pwszUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPwszValue(value: String): Self = StObject.set(x, "pwszValue", value.asInstanceOf[js.Any])
  }
}
