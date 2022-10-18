package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayoutResponse extends StObject {
  
  /**
    * Information about which fields will be present in the layout, the order of the fields, and read-only attribute of the field. 
    */
  var content: LayoutContent
  
  /**
    * The Amazon Resource Name (ARN) of the newly created layout.
    */
  var layoutArn: LayoutArn
  
  /**
    * The unique identifier of the layout.
    */
  var layoutId: LayoutId
  
  /**
    * The name of the layout. It must be unique.
    */
  var name: LayoutName
  
  /**
    * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control access for this resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object GetLayoutResponse {
  
  inline def apply(content: LayoutContent, layoutArn: LayoutArn, layoutId: LayoutId, name: LayoutName): GetLayoutResponse = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], layoutArn = layoutArn.asInstanceOf[js.Any], layoutId = layoutId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayoutResponse]
  }
  
  extension [Self <: GetLayoutResponse](x: Self) {
    
    inline def setContent(value: LayoutContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setLayoutArn(value: LayoutArn): Self = StObject.set(x, "layoutArn", value.asInstanceOf[js.Any])
    
    inline def setLayoutId(value: LayoutId): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setName(value: LayoutName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
