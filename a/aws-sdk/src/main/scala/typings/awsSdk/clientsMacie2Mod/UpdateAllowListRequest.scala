package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAllowListRequest extends StObject {
  
  /**
    * The criteria that specify the text or text pattern to ignore. The criteria can be the location and name of an S3 object that lists specific text to ignore (s3WordsList), or a regular expression that defines a text pattern to ignore (regex). You can change a list's underlying criteria, such as the name of the S3 object or the regular expression to use. However, you can't change the type from s3WordsList to regex or the other way around.
    */
  var criteria: AllowListCriteria
  
  /**
    * A custom description of the allow list. The description can contain as many as 512 characters.
    */
  var description: js.UndefOr[stringMin1Max512PatternSS] = js.undefined
  
  /**
    * The unique identifier for the Amazon Macie resource that the request applies to.
    */
  var id: string
  
  /**
    * A custom name for the allow list. The name can contain as many as 128 characters.
    */
  var name: stringMin1Max128Pattern
}
object UpdateAllowListRequest {
  
  inline def apply(criteria: AllowListCriteria, id: string, name: stringMin1Max128Pattern): UpdateAllowListRequest = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAllowListRequest]
  }
  
  extension [Self <: UpdateAllowListRequest](x: Self) {
    
    inline def setCriteria(value: AllowListCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: stringMin1Max512PatternSS): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: stringMin1Max128Pattern): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
