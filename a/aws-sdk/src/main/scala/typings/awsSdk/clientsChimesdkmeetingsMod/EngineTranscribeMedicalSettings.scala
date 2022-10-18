package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineTranscribeMedicalSettings extends StObject {
  
  /**
    * Set this field to PHI to identify personal health information in the transcription output.
    */
  var ContentIdentificationType: js.UndefOr[TranscribeMedicalContentIdentificationType] = js.undefined
  
  /**
    * The language code specified for the Amazon Transcribe Medical engine.
    */
  var LanguageCode: TranscribeMedicalLanguageCode
  
  /**
    * The AWS Region passed to Amazon Transcribe Medical. If you don't specify a Region, Amazon Chime uses the meeting's Region. 
    */
  var Region: js.UndefOr[TranscribeMedicalRegion] = js.undefined
  
  /**
    * The specialty specified for the Amazon Transcribe Medical engine.
    */
  var Specialty: TranscribeMedicalSpecialty
  
  /**
    * The type of transcription.
    */
  var Type: TranscribeMedicalType
  
  /**
    * The name of the vocabulary passed to Amazon Transcribe Medical.
    */
  var VocabularyName: js.UndefOr[String] = js.undefined
}
object EngineTranscribeMedicalSettings {
  
  inline def apply(
    LanguageCode: TranscribeMedicalLanguageCode,
    Specialty: TranscribeMedicalSpecialty,
    Type: TranscribeMedicalType
  ): EngineTranscribeMedicalSettings = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Specialty = Specialty.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineTranscribeMedicalSettings]
  }
  
  extension [Self <: EngineTranscribeMedicalSettings](x: Self) {
    
    inline def setContentIdentificationType(value: TranscribeMedicalContentIdentificationType): Self = StObject.set(x, "ContentIdentificationType", value.asInstanceOf[js.Any])
    
    inline def setContentIdentificationTypeUndefined: Self = StObject.set(x, "ContentIdentificationType", js.undefined)
    
    inline def setLanguageCode(value: TranscribeMedicalLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: TranscribeMedicalRegion): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setSpecialty(value: TranscribeMedicalSpecialty): Self = StObject.set(x, "Specialty", value.asInstanceOf[js.Any])
    
    inline def setType(value: TranscribeMedicalType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVocabularyName(value: String): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyNameUndefined: Self = StObject.set(x, "VocabularyName", js.undefined)
  }
}
