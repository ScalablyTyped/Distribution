package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasListEntry extends StObject {
  
  /**
    * String that contains the key ARN.
    */
  var AliasArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * String that contains the alias. This value begins with alias/.
    */
  var AliasName: js.UndefOr[AliasNameType] = js.undefined
  
  /**
    * Date and time that the alias was most recently created in the account and Region. Formatted as Unix time.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Date and time that the alias was most recently associated with a KMS key in the account and Region. Formatted as Unix time.
    */
  var LastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * String that contains the key identifier of the KMS key associated with the alias.
    */
  var TargetKeyId: js.UndefOr[KeyIdType] = js.undefined
}
object AliasListEntry {
  
  inline def apply(): AliasListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasListEntry]
  }
  
  extension [Self <: AliasListEntry](x: Self) {
    
    inline def setAliasArn(value: ArnType): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
    
    inline def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
    
    inline def setAliasName(value: AliasNameType): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    inline def setTargetKeyId(value: KeyIdType): Self = StObject.set(x, "TargetKeyId", value.asInstanceOf[js.Any])
    
    inline def setTargetKeyIdUndefined: Self = StObject.set(x, "TargetKeyId", js.undefined)
  }
}
