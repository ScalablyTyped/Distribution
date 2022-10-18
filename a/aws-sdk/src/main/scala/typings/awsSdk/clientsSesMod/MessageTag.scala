package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTag extends StObject {
  
  /**
    * The name of the tag. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
    */
  var Name: MessageTagName
  
  /**
    * The value of the tag. The value must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
    */
  var Value: MessageTagValue
}
object MessageTag {
  
  inline def apply(Name: MessageTagName, Value: MessageTagValue): MessageTag = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTag]
  }
  
  extension [Self <: MessageTag](x: Self) {
    
    inline def setName(value: MessageTagName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: MessageTagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
