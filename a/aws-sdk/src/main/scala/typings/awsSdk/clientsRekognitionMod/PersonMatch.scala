package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonMatch extends StObject {
  
  /**
    * Information about the faces in the input collection that match the face of a person in the video.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.undefined
  
  /**
    * Information about the matched person.
    */
  var Person: js.UndefOr[PersonDetail] = js.undefined
  
  /**
    * The time, in milliseconds from the beginning of the video, that the person was matched in the video.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Timestamp] = js.undefined
}
object PersonMatch {
  
  inline def apply(): PersonMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersonMatch] (val x: Self) extends AnyVal {
    
    inline def setFaceMatches(value: FaceMatchList): Self = StObject.set(x, "FaceMatches", value.asInstanceOf[js.Any])
    
    inline def setFaceMatchesUndefined: Self = StObject.set(x, "FaceMatches", js.undefined)
    
    inline def setFaceMatchesVarargs(value: FaceMatch*): Self = StObject.set(x, "FaceMatches", js.Array(value*))
    
    inline def setPerson(value: PersonDetail): Self = StObject.set(x, "Person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "Person", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
