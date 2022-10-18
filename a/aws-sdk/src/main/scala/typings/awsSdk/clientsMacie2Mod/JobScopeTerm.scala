package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobScopeTerm extends StObject {
  
  /**
    * A property-based condition that defines a property, operator, and one or more values for including or excluding objects from the job.
    */
  var simpleScopeTerm: js.UndefOr[SimpleScopeTerm] = js.undefined
  
  /**
    * A tag-based condition that defines the operator and tag keys or tag key and value pairs for including or excluding objects from the job.
    */
  var tagScopeTerm: js.UndefOr[TagScopeTerm] = js.undefined
}
object JobScopeTerm {
  
  inline def apply(): JobScopeTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobScopeTerm]
  }
  
  extension [Self <: JobScopeTerm](x: Self) {
    
    inline def setSimpleScopeTerm(value: SimpleScopeTerm): Self = StObject.set(x, "simpleScopeTerm", value.asInstanceOf[js.Any])
    
    inline def setSimpleScopeTermUndefined: Self = StObject.set(x, "simpleScopeTerm", js.undefined)
    
    inline def setTagScopeTerm(value: TagScopeTerm): Self = StObject.set(x, "tagScopeTerm", value.asInstanceOf[js.Any])
    
    inline def setTagScopeTermUndefined: Self = StObject.set(x, "tagScopeTerm", js.undefined)
  }
}
