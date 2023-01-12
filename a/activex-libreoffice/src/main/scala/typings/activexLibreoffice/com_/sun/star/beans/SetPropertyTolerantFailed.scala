package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies information about a single property failed to be set.
  * @see com.sun.star.beans.XTolerantMultiPropertySet
  */
trait SetPropertyTolerantFailed extends StObject {
  
  /** specifies the name of the property. */
  var Name: String
  
  /**
    * specifies the success or error code for setting the properties value.
    *
    * Since the property was not successful set the result will never be {@link com.sun.star.beans.TolerantPropertySetResultType.SUCCESS} .
    * @see com.sun.star.beans.TolerantPropertySetResultType
    */
  var Result: Double
}
object SetPropertyTolerantFailed {
  
  inline def apply(Name: String, Result: Double): SetPropertyTolerantFailed = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPropertyTolerantFailed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetPropertyTolerantFailed] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Double): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
