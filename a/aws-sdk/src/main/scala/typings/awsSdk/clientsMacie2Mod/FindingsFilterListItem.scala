package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingsFilterListItem extends StObject {
  
  /**
    * The action that's performed on findings that match the filter criteria. Possible values are: ARCHIVE, suppress (automatically archive) the findings; and, NOOP, don't perform any action on the findings.
    */
  var action: js.UndefOr[FindingsFilterAction] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the filter.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the filter.
    */
  var id: js.UndefOr[string] = js.undefined
  
  /**
    * The custom name of the filter.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * A map of key-value pairs that specifies which tags (keys and values) are associated with the filter.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object FindingsFilterListItem {
  
  inline def apply(): FindingsFilterListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingsFilterListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingsFilterListItem] (val x: Self) extends AnyVal {
    
    inline def setAction(value: FindingsFilterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
