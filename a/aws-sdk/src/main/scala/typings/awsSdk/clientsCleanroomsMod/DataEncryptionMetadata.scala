package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataEncryptionMetadata extends StObject {
  
  /**
    * Indicates whether encrypted tables can contain cleartext data (true) or are to cryptographically process every column (false).
    */
  var allowCleartext: Boolean
  
  /**
    * Indicates whether Fingerprint columns can contain duplicate entries (true) or are to contain only non-repeated values (false).
    */
  var allowDuplicates: Boolean
  
  /**
    * Indicates whether Fingerprint columns can be joined on any other Fingerprint column with a different name (true) or can only be joined on Fingerprint columns of the same name (false).
    */
  var allowJoinsOnColumnsWithDifferentNames: Boolean
  
  /**
    * Indicates whether NULL values are to be copied as NULL to encrypted tables (true) or cryptographically processed (false).
    */
  var preserveNulls: Boolean
}
object DataEncryptionMetadata {
  
  inline def apply(
    allowCleartext: Boolean,
    allowDuplicates: Boolean,
    allowJoinsOnColumnsWithDifferentNames: Boolean,
    preserveNulls: Boolean
  ): DataEncryptionMetadata = {
    val __obj = js.Dynamic.literal(allowCleartext = allowCleartext.asInstanceOf[js.Any], allowDuplicates = allowDuplicates.asInstanceOf[js.Any], allowJoinsOnColumnsWithDifferentNames = allowJoinsOnColumnsWithDifferentNames.asInstanceOf[js.Any], preserveNulls = preserveNulls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEncryptionMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataEncryptionMetadata] (val x: Self) extends AnyVal {
    
    inline def setAllowCleartext(value: Boolean): Self = StObject.set(x, "allowCleartext", value.asInstanceOf[js.Any])
    
    inline def setAllowDuplicates(value: Boolean): Self = StObject.set(x, "allowDuplicates", value.asInstanceOf[js.Any])
    
    inline def setAllowJoinsOnColumnsWithDifferentNames(value: Boolean): Self = StObject.set(x, "allowJoinsOnColumnsWithDifferentNames", value.asInstanceOf[js.Any])
    
    inline def setPreserveNulls(value: Boolean): Self = StObject.set(x, "preserveNulls", value.asInstanceOf[js.Any])
  }
}
