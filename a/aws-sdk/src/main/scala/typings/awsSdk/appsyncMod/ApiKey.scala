package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKey extends StObject {
  
  /**
    * The time after which the API key is deleted. The date is represented as seconds since the epoch, rounded down to the nearest hour.
    */
  var deletes: js.UndefOr[Long] = js.undefined
  
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the nearest hour.
    */
  var expires: js.UndefOr[Long] = js.undefined
  
  /**
    * The API key ID.
    */
  var id: js.UndefOr[String] = js.undefined
}
object ApiKey {
  
  @scala.inline
  def apply(): ApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKey]
  }
  
  @scala.inline
  implicit class ApiKeyMutableBuilder[Self <: ApiKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletes(value: Long): Self = StObject.set(x, "deletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletesUndefined: Self = StObject.set(x, "deletes", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpires(value: Long): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
