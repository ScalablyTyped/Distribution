package typings.awsSdk.clientsRedshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlParameter extends StObject {
  
  /**
    * The name of the parameter.
    */
  var name: ParameterName
  
  /**
    * The value of the parameter. Amazon Redshift implicitly converts to the proper data type. For more inforation, see Data types in the Amazon Redshift Database Developer Guide. 
    */
  var value: ParameterValue
}
object SqlParameter {
  
  inline def apply(name: ParameterName, value: ParameterValue): SqlParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlParameter] (val x: Self) extends AnyVal {
    
    inline def setName(value: ParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ParameterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
