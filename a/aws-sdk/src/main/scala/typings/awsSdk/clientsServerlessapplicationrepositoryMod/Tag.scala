package typings.awsSdk.clientsServerlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation Tag
    Data Type.
    */
  var Key: string
  
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation 
    Tag
    
    Data Type.
    */
  var Value: string
}
object Tag {
  
  inline def apply(Key: string, Value: string): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setKey(value: string): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: string): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
