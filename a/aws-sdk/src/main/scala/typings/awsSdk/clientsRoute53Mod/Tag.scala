package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * The value of Key depends on the operation that you want to perform:    Add a tag to a health check or hosted zone: Key is the name that you want to give the new tag.    Edit a tag: Key is the name of the tag that you want to change the Value for.     Delete a key: Key is the name of the tag you want to remove.    Give a name to a health check: Edit the default Name tag. In the Amazon Route 53 console, the list of your health checks includes a Name column that lets you see the name that you've given to each health check.  
    */
  var Key: js.UndefOr[TagKey] = js.undefined
  
  /**
    * The value of Value depends on the operation that you want to perform:    Add a tag to a health check or hosted zone: Value is the value that you want to give the new tag.    Edit a tag: Value is the new value that you want to assign the tag.  
    */
  var Value: js.UndefOr[TagValue] = js.undefined
}
object Tag {
  
  inline def apply(): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
