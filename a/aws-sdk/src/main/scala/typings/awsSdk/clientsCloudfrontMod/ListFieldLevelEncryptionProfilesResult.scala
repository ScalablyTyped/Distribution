package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFieldLevelEncryptionProfilesResult extends StObject {
  
  /**
    * Returns a list of the field-level encryption profiles that have been created in CloudFront for this account.
    */
  var FieldLevelEncryptionProfileList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.FieldLevelEncryptionProfileList] = js.undefined
}
object ListFieldLevelEncryptionProfilesResult {
  
  inline def apply(): ListFieldLevelEncryptionProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFieldLevelEncryptionProfilesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFieldLevelEncryptionProfilesResult] (val x: Self) extends AnyVal {
    
    inline def setFieldLevelEncryptionProfileList(value: FieldLevelEncryptionProfileList): Self = StObject.set(x, "FieldLevelEncryptionProfileList", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelEncryptionProfileListUndefined: Self = StObject.set(x, "FieldLevelEncryptionProfileList", js.undefined)
  }
}
