package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaqSummary extends StObject {
  
  /**
    * The UNIX datetime that the FAQ was added to the index.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The file type used to create the FAQ. 
    */
  var FileFormat: js.UndefOr[FaqFileFormat] = js.undefined
  
  /**
    * The unique identifier of the FAQ.
    */
  var Id: js.UndefOr[FaqId] = js.undefined
  
  /**
    * The code for a language. This shows a supported language for the FAQ document as part of the summary information for FAQs. English is supported by default. For more information on supported languages, including their codes, see Adding documents in languages other than English.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsKendraMod.LanguageCode] = js.undefined
  
  /**
    * The name that you assigned the FAQ when you created or updated the FAQ.
    */
  var Name: js.UndefOr[FaqName] = js.undefined
  
  /**
    * The current status of the FAQ. When the status is ACTIVE the FAQ is ready for use.
    */
  var Status: js.UndefOr[FaqStatus] = js.undefined
  
  /**
    * The UNIX datetime that the FAQ was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object FaqSummary {
  
  inline def apply(): FaqSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaqSummary]
  }
  
  extension [Self <: FaqSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setFileFormat(value: FaqFileFormat): Self = StObject.set(x, "FileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "FileFormat", js.undefined)
    
    inline def setId(value: FaqId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setName(value: FaqName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FaqStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
