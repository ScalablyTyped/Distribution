package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait tagXHRCOOKIE extends StObject {
  
  val dwFlags: Double
  
  val ftExpires: _FILETIME
  
  val pwszName: String
  
  val pwszP3PPolicy: String
  
  val pwszUrl: String
  
  val pwszValue: String
}
object tagXHRCOOKIE {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: tagXHRCOOKIE] (val x: Self) extends AnyVal {
    
    inline def setDwFlags(value: Double): Self = StObject.set(x, "dwFlags", value.asInstanceOf[js.Any])
    
    inline def setFtExpires(value: _FILETIME): Self = StObject.set(x, "ftExpires", value.asInstanceOf[js.Any])
    
    inline def setPwszName(value: String): Self = StObject.set(x, "pwszName", value.asInstanceOf[js.Any])
    
    inline def setPwszP3PPolicy(value: String): Self = StObject.set(x, "pwszP3PPolicy", value.asInstanceOf[js.Any])
    
    inline def setPwszUrl(value: String): Self = StObject.set(x, "pwszUrl", value.asInstanceOf[js.Any])
    
    inline def setPwszValue(value: String): Self = StObject.set(x, "pwszValue", value.asInstanceOf[js.Any])
  }
}
