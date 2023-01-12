package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBuildBatchInput extends StObject {
  
  /**
    * The identifier of the batch build to stop.
    */
  var id: NonEmptyString
}
object StopBuildBatchInput {
  
  inline def apply(id: NonEmptyString): StopBuildBatchInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBuildBatchInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopBuildBatchInput] (val x: Self) extends AnyVal {
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
