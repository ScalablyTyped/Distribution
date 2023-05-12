package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConnectionParameters extends StObject {
  
  /**
    * Provides ConnectionType details.
    */
  var CodeStar: js.UndefOr[CodeStarParameters] = js.undefined
}
object SourceConnectionParameters {
  
  inline def apply(): SourceConnectionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConnectionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceConnectionParameters] (val x: Self) extends AnyVal {
    
    inline def setCodeStar(value: CodeStarParameters): Self = StObject.set(x, "CodeStar", value.asInstanceOf[js.Any])
    
    inline def setCodeStarUndefined: Self = StObject.set(x, "CodeStar", js.undefined)
  }
}
