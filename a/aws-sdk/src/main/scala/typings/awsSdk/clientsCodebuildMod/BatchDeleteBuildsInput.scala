package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteBuildsInput extends StObject {
  
  /**
    * The IDs of the builds to delete.
    */
  var ids: BuildIds
}
object BatchDeleteBuildsInput {
  
  inline def apply(ids: BuildIds): BatchDeleteBuildsInput = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteBuildsInput]
  }
  
  extension [Self <: BatchDeleteBuildsInput](x: Self) {
    
    inline def setIds(value: BuildIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
