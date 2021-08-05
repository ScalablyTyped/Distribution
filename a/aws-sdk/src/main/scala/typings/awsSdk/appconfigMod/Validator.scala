package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validator extends StObject {
  
  /**
    * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
    */
  var Content: StringWithLengthBetween0And32768
  
  /**
    * AppConfig supports validators of type JSON_SCHEMA and LAMBDA 
    */
  var Type: ValidatorType
}
object Validator {
  
  inline def apply(Content: StringWithLengthBetween0And32768, Type: ValidatorType): Validator = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validator]
  }
  
  extension [Self <: Validator](x: Self) {
    
    inline def setContent(value: StringWithLengthBetween0And32768): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setType(value: ValidatorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
