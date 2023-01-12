package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetBuildsOutput extends StObject {
  
  /**
    * Information about the requested builds.
    */
  var builds: js.UndefOr[Builds] = js.undefined
  
  /**
    * The IDs of builds for which information could not be found.
    */
  var buildsNotFound: js.UndefOr[BuildIds] = js.undefined
}
object BatchGetBuildsOutput {
  
  inline def apply(): BatchGetBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetBuildsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetBuildsOutput] (val x: Self) extends AnyVal {
    
    inline def setBuilds(value: Builds): Self = StObject.set(x, "builds", value.asInstanceOf[js.Any])
    
    inline def setBuildsNotFound(value: BuildIds): Self = StObject.set(x, "buildsNotFound", value.asInstanceOf[js.Any])
    
    inline def setBuildsNotFoundUndefined: Self = StObject.set(x, "buildsNotFound", js.undefined)
    
    inline def setBuildsNotFoundVarargs(value: NonEmptyString*): Self = StObject.set(x, "buildsNotFound", js.Array(value*))
    
    inline def setBuildsUndefined: Self = StObject.set(x, "builds", js.undefined)
    
    inline def setBuildsVarargs(value: Build*): Self = StObject.set(x, "builds", js.Array(value*))
  }
}
