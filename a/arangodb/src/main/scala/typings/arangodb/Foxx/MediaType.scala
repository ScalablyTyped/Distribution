package typings.arangodb.Foxx

import typings.arangodb.anon.Charset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaType extends StObject {
  
  var parameters: Charset
  
  var subtype: String
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object MediaType {
  
  @scala.inline
  def apply(parameters: Charset, subtype: String, `type`: String): MediaType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaType]
  }
  
  @scala.inline
  implicit class MediaTypeMutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: Charset): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
