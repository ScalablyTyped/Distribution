package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJsonClassifierRequest extends StObject {
  
  /**
    * A JsonPath string defining the JSON data for the classifier to classify. Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
    */
  var JsonPath: js.UndefOr[typings.awsSdk.clientsGlueMod.JsonPath] = js.undefined
  
  /**
    * The name of the classifier.
    */
  var Name: NameString
}
object UpdateJsonClassifierRequest {
  
  inline def apply(Name: NameString): UpdateJsonClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJsonClassifierRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateJsonClassifierRequest] (val x: Self) extends AnyVal {
    
    inline def setJsonPath(value: JsonPath): Self = StObject.set(x, "JsonPath", value.asInstanceOf[js.Any])
    
    inline def setJsonPathUndefined: Self = StObject.set(x, "JsonPath", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
