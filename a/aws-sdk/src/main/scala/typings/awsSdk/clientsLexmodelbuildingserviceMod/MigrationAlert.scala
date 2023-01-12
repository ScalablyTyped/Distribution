package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationAlert extends StObject {
  
  /**
    * Additional details about the alert.
    */
  var details: js.UndefOr[MigrationAlertDetails] = js.undefined
  
  /**
    * A message that describes why the alert was issued.
    */
  var message: js.UndefOr[MigrationAlertMessage] = js.undefined
  
  /**
    * A link to the Amazon Lex documentation that describes how to resolve the alert.
    */
  var referenceURLs: js.UndefOr[MigrationAlertReferenceURLs] = js.undefined
  
  /**
    * The type of alert. There are two kinds of alerts:    ERROR - There was an issue with the migration that can't be resolved. The migration stops.    WARN - There was an issue with the migration that requires manual changes to the new Amazon Lex V2 bot. The migration continues.  
    */
  var `type`: js.UndefOr[MigrationAlertType] = js.undefined
}
object MigrationAlert {
  
  inline def apply(): MigrationAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationAlert]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MigrationAlert] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: MigrationAlertDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: MigrationAlertDetail*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setMessage(value: MigrationAlertMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReferenceURLs(value: MigrationAlertReferenceURLs): Self = StObject.set(x, "referenceURLs", value.asInstanceOf[js.Any])
    
    inline def setReferenceURLsUndefined: Self = StObject.set(x, "referenceURLs", js.undefined)
    
    inline def setReferenceURLsVarargs(value: MigrationAlertReferenceURL*): Self = StObject.set(x, "referenceURLs", js.Array(value*))
    
    inline def setType(value: MigrationAlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
