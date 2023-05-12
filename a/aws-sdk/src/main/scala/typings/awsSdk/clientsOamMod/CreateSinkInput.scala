package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSinkInput extends StObject {
  
  /**
    * A name for the sink.
    */
  var Name: SinkName
  
  /**
    * Assigns one or more tags (key-value pairs) to the link.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. For more information about using tags to control access, see Controlling access to Amazon Web Services resources using tags.
    */
  var Tags: js.UndefOr[TagMapInput] = js.undefined
}
object CreateSinkInput {
  
  inline def apply(Name: SinkName): CreateSinkInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSinkInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSinkInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: SinkName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMapInput): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
