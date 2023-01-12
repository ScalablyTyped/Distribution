package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteBuildsOutput extends StObject {
  
  /**
    * The IDs of the builds that were successfully deleted.
    */
  var buildsDeleted: js.UndefOr[BuildIds] = js.undefined
  
  /**
    * Information about any builds that could not be successfully deleted.
    */
  var buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.undefined
}
object BatchDeleteBuildsOutput {
  
  inline def apply(): BatchDeleteBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteBuildsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteBuildsOutput] (val x: Self) extends AnyVal {
    
    inline def setBuildsDeleted(value: BuildIds): Self = StObject.set(x, "buildsDeleted", value.asInstanceOf[js.Any])
    
    inline def setBuildsDeletedUndefined: Self = StObject.set(x, "buildsDeleted", js.undefined)
    
    inline def setBuildsDeletedVarargs(value: NonEmptyString*): Self = StObject.set(x, "buildsDeleted", js.Array(value*))
    
    inline def setBuildsNotDeleted(value: BuildsNotDeleted): Self = StObject.set(x, "buildsNotDeleted", value.asInstanceOf[js.Any])
    
    inline def setBuildsNotDeletedUndefined: Self = StObject.set(x, "buildsNotDeleted", js.undefined)
    
    inline def setBuildsNotDeletedVarargs(value: BuildNotDeleted*): Self = StObject.set(x, "buildsNotDeleted", js.Array(value*))
  }
}
