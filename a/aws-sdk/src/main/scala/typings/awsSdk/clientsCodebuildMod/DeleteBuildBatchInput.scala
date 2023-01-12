package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBuildBatchInput extends StObject {
  
  /**
    * The identifier of the batch build to delete.
    */
  var id: NonEmptyString
}
object DeleteBuildBatchInput {
  
  inline def apply(id: NonEmptyString): DeleteBuildBatchInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBuildBatchInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBuildBatchInput] (val x: Self) extends AnyVal {
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
