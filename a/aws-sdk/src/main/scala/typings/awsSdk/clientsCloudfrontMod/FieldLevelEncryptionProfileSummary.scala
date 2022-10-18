package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldLevelEncryptionProfileSummary extends StObject {
  
  /**
    * An optional comment for the field-level encryption profile summary. The comment cannot be longer than 128 characters.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: typings.awsSdk.clientsCloudfrontMod.EncryptionEntities
  
  /**
    * ID for the field-level encryption profile summary.
    */
  var Id: String
  
  /**
    * The time when the the field-level encryption profile summary was last updated.
    */
  var LastModifiedTime: js.Date
  
  /**
    * Name for the field-level encryption profile summary.
    */
  var Name: String
}
object FieldLevelEncryptionProfileSummary {
  
  inline def apply(EncryptionEntities: EncryptionEntities, Id: String, LastModifiedTime: js.Date, Name: String): FieldLevelEncryptionProfileSummary = {
    val __obj = js.Dynamic.literal(EncryptionEntities = EncryptionEntities.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileSummary]
  }
  
  extension [Self <: FieldLevelEncryptionProfileSummary](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setEncryptionEntities(value: EncryptionEntities): Self = StObject.set(x, "EncryptionEntities", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
