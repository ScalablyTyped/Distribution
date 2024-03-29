package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntityRecognizerResponse extends StObject {
  
  /**
    * Describes information associated with an entity recognizer.
    */
  var EntityRecognizerProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.EntityRecognizerProperties] = js.undefined
}
object DescribeEntityRecognizerResponse {
  
  inline def apply(): DescribeEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntityRecognizerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEntityRecognizerResponse] (val x: Self) extends AnyVal {
    
    inline def setEntityRecognizerProperties(value: EntityRecognizerProperties): Self = StObject.set(x, "EntityRecognizerProperties", value.asInstanceOf[js.Any])
    
    inline def setEntityRecognizerPropertiesUndefined: Self = StObject.set(x, "EntityRecognizerProperties", js.undefined)
  }
}
