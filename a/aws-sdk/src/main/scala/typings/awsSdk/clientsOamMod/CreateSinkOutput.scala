package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSinkOutput extends StObject {
  
  /**
    * The ARN of the sink that is newly created.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The random ID string that Amazon Web Services generated as part of the sink ARN.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the sink.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The tags assigned to the sink.
    */
  var Tags: js.UndefOr[TagMapOutput] = js.undefined
}
object CreateSinkOutput {
  
  inline def apply(): CreateSinkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSinkOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSinkOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: TagMapOutput): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
