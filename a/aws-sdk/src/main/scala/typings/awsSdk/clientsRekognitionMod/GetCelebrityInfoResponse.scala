package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCelebrityInfoResponse extends StObject {
  
  /**
    * Retrieves the known gender for the celebrity.
    */
  var KnownGender: js.UndefOr[typings.awsSdk.clientsRekognitionMod.KnownGender] = js.undefined
  
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * An array of URLs pointing to additional celebrity information. 
    */
  var Urls: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Urls] = js.undefined
}
object GetCelebrityInfoResponse {
  
  inline def apply(): GetCelebrityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCelebrityInfoResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCelebrityInfoResponse] (val x: Self) extends AnyVal {
    
    inline def setKnownGender(value: KnownGender): Self = StObject.set(x, "KnownGender", value.asInstanceOf[js.Any])
    
    inline def setKnownGenderUndefined: Self = StObject.set(x, "KnownGender", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUrls(value: Urls): Self = StObject.set(x, "Urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "Urls", js.undefined)
    
    inline def setUrlsVarargs(value: Url*): Self = StObject.set(x, "Urls", js.Array(value*))
  }
}
