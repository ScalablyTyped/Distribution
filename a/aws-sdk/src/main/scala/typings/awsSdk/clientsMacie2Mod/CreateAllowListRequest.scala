package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAllowListRequest extends StObject {
  
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: string
  
  /**
    * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3 object that lists specific text to ignore (s3WordsList), or a regular expression (regex) that defines a text pattern to ignore.
    */
  var criteria: AllowListCriteria
  
  /**
    * A custom description of the allow list. The description can contain as many as 512 characters.
    */
  var description: js.UndefOr[stringMin1Max512PatternSS] = js.undefined
  
  /**
    * A custom name for the allow list. The name can contain as many as 128 characters.
    */
  var name: stringMin1Max128Pattern
  
  /**
    * A map of key-value pairs that specifies the tags to associate with the allow list. An allow list can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAllowListRequest {
  
  inline def apply(clientToken: string, criteria: AllowListCriteria, name: stringMin1Max128Pattern): CreateAllowListRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAllowListRequest]
  }
  
  extension [Self <: CreateAllowListRequest](x: Self) {
    
    inline def setClientToken(value: string): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setCriteria(value: AllowListCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: stringMin1Max512PatternSS): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: stringMin1Max128Pattern): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
