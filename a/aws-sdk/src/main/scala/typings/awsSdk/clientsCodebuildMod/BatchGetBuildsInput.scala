package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetBuildsInput extends StObject {
  
  /**
    * The IDs of the builds.
    */
  var ids: BuildIds
}
object BatchGetBuildsInput {
  
  inline def apply(ids: BuildIds): BatchGetBuildsInput = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetBuildsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetBuildsInput] (val x: Self) extends AnyVal {
    
    inline def setIds(value: BuildIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
