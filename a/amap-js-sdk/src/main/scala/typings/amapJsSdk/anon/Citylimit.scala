package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Citylimit extends StObject {
  
  var city: js.UndefOr[String] = js.undefined
  
  var citylimit: js.UndefOr[Boolean] = js.undefined
  
  var datatype: js.UndefOr[String] = js.undefined
  
  var input: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Citylimit {
  
  @scala.inline
  def apply(): Citylimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Citylimit]
  }
  
  @scala.inline
  implicit class CitylimitMutableBuilder[Self <: Citylimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCitylimit(value: Boolean): Self = StObject.set(x, "citylimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitylimitUndefined: Self = StObject.set(x, "citylimit", js.undefined)
    
    @scala.inline
    def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
