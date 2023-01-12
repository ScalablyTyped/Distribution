package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOptionGroupMessage extends StObject {
  
  /**
    * The identifier for the source option group. Constraints:   Must specify a valid option group.  
    */
  var SourceOptionGroupIdentifier: String
  
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The description for the copied option group.
    */
  var TargetOptionGroupDescription: String
  
  /**
    * The identifier for the copied option group. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-option-group 
    */
  var TargetOptionGroupIdentifier: String
}
object CopyOptionGroupMessage {
  
  inline def apply(
    SourceOptionGroupIdentifier: String,
    TargetOptionGroupDescription: String,
    TargetOptionGroupIdentifier: String
  ): CopyOptionGroupMessage = {
    val __obj = js.Dynamic.literal(SourceOptionGroupIdentifier = SourceOptionGroupIdentifier.asInstanceOf[js.Any], TargetOptionGroupDescription = TargetOptionGroupDescription.asInstanceOf[js.Any], TargetOptionGroupIdentifier = TargetOptionGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyOptionGroupMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyOptionGroupMessage] (val x: Self) extends AnyVal {
    
    inline def setSourceOptionGroupIdentifier(value: String): Self = StObject.set(x, "SourceOptionGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetOptionGroupDescription(value: String): Self = StObject.set(x, "TargetOptionGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setTargetOptionGroupIdentifier(value: String): Self = StObject.set(x, "TargetOptionGroupIdentifier", value.asInstanceOf[js.Any])
  }
}
