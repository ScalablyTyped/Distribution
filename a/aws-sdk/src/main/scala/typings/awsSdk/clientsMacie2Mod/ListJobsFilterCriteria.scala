package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsFilterCriteria extends StObject {
  
  /**
    * An array of objects, one for each condition that determines which jobs to exclude from the results.
    */
  var excludes: js.UndefOr[listOfListJobsFilterTerm] = js.undefined
  
  /**
    * An array of objects, one for each condition that determines which jobs to include in the results.
    */
  var includes: js.UndefOr[listOfListJobsFilterTerm] = js.undefined
}
object ListJobsFilterCriteria {
  
  inline def apply(): ListJobsFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsFilterCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobsFilterCriteria] (val x: Self) extends AnyVal {
    
    inline def setExcludes(value: listOfListJobsFilterTerm): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: ListJobsFilterTerm*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setIncludes(value: listOfListJobsFilterTerm): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    inline def setIncludesVarargs(value: ListJobsFilterTerm*): Self = StObject.set(x, "includes", js.Array(value*))
  }
}
