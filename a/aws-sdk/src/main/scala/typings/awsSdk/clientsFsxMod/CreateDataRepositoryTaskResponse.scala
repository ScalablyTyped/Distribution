package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataRepositoryTaskResponse extends StObject {
  
  /**
    * The description of the data repository task that you just created.
    */
  var DataRepositoryTask: js.UndefOr[typings.awsSdk.clientsFsxMod.DataRepositoryTask] = js.undefined
}
object CreateDataRepositoryTaskResponse {
  
  inline def apply(): CreateDataRepositoryTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataRepositoryTaskResponse]
  }
  
  extension [Self <: CreateDataRepositoryTaskResponse](x: Self) {
    
    inline def setDataRepositoryTask(value: DataRepositoryTask): Self = StObject.set(x, "DataRepositoryTask", value.asInstanceOf[js.Any])
    
    inline def setDataRepositoryTaskUndefined: Self = StObject.set(x, "DataRepositoryTask", js.undefined)
  }
}
