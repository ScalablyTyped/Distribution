package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCode extends StObject {
  
  /**
    *  The repository name for the source code. 
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    *  The branch of the source code. 
    */
  var sourceVersion: js.UndefOr[SourceVersion] = js.undefined
  
  /**
    *  The type of repository to use for the source code. 
    */
  var versionControl: js.UndefOr[VersionControl] = js.undefined
}
object SourceCode {
  
  inline def apply(): SourceCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceCode] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSourceVersion(value: SourceVersion): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
    
    inline def setVersionControl(value: VersionControl): Self = StObject.set(x, "versionControl", value.asInstanceOf[js.Any])
    
    inline def setVersionControlUndefined: Self = StObject.set(x, "versionControl", js.undefined)
  }
}
