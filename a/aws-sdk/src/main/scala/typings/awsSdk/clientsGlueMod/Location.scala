package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /**
    * An Amazon DynamoDB table location.
    */
  var DynamoDB: js.UndefOr[CodeGenNodeArgs] = js.undefined
  
  /**
    * A JDBC location.
    */
  var Jdbc: js.UndefOr[CodeGenNodeArgs] = js.undefined
  
  /**
    * An Amazon Simple Storage Service (Amazon S3) location.
    */
  var S3: js.UndefOr[CodeGenNodeArgs] = js.undefined
}
object Location {
  
  inline def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    inline def setDynamoDB(value: CodeGenNodeArgs): Self = StObject.set(x, "DynamoDB", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBUndefined: Self = StObject.set(x, "DynamoDB", js.undefined)
    
    inline def setDynamoDBVarargs(value: CodeGenNodeArg*): Self = StObject.set(x, "DynamoDB", js.Array(value*))
    
    inline def setJdbc(value: CodeGenNodeArgs): Self = StObject.set(x, "Jdbc", value.asInstanceOf[js.Any])
    
    inline def setJdbcUndefined: Self = StObject.set(x, "Jdbc", js.undefined)
    
    inline def setJdbcVarargs(value: CodeGenNodeArg*): Self = StObject.set(x, "Jdbc", js.Array(value*))
    
    inline def setS3(value: CodeGenNodeArgs): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    inline def setS3Varargs(value: CodeGenNodeArg*): Self = StObject.set(x, "S3", js.Array(value*))
  }
}
