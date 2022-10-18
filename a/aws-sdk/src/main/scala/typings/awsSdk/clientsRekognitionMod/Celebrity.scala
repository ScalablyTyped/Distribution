package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Celebrity extends StObject {
  
  /**
    * Provides information about the celebrity's face, such as its location on the image.
    */
  var Face: js.UndefOr[ComparedFace] = js.undefined
  
  /**
    * A unique identifier for the celebrity. 
    */
  var Id: js.UndefOr[RekognitionUniqueId] = js.undefined
  
  var KnownGender: js.UndefOr[typings.awsSdk.clientsRekognitionMod.KnownGender] = js.undefined
  
  /**
    * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity.
    */
  var MatchConfidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * An array of URLs pointing to additional information about the celebrity. If there is no additional information about the celebrity, this list is empty.
    */
  var Urls: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Urls] = js.undefined
}
object Celebrity {
  
  inline def apply(): Celebrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Celebrity]
  }
  
  extension [Self <: Celebrity](x: Self) {
    
    inline def setFace(value: ComparedFace): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    inline def setId(value: RekognitionUniqueId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setKnownGender(value: KnownGender): Self = StObject.set(x, "KnownGender", value.asInstanceOf[js.Any])
    
    inline def setKnownGenderUndefined: Self = StObject.set(x, "KnownGender", js.undefined)
    
    inline def setMatchConfidence(value: Percent): Self = StObject.set(x, "MatchConfidence", value.asInstanceOf[js.Any])
    
    inline def setMatchConfidenceUndefined: Self = StObject.set(x, "MatchConfidence", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUrls(value: Urls): Self = StObject.set(x, "Urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "Urls", js.undefined)
    
    inline def setUrlsVarargs(value: Url*): Self = StObject.set(x, "Urls", js.Array(value*))
  }
}
