package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scoping extends StObject {
  
  /**
    * The property- and tag-based conditions that determine which objects to exclude from the analysis.
    */
  var excludes: js.UndefOr[JobScopingBlock] = js.undefined
  
  /**
    * The property- and tag-based conditions that determine which objects to include in the analysis.
    */
  var includes: js.UndefOr[JobScopingBlock] = js.undefined
}
object Scoping {
  
  inline def apply(): Scoping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scoping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scoping] (val x: Self) extends AnyVal {
    
    inline def setExcludes(value: JobScopingBlock): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setIncludes(value: JobScopingBlock): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
  }
}
