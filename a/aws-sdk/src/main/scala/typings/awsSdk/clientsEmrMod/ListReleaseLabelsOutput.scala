package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReleaseLabelsOutput extends StObject {
  
  /**
    * Used to paginate the next page of results if specified in the next ListReleaseLabels request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The returned release labels.
    */
  var ReleaseLabels: js.UndefOr[StringList] = js.undefined
}
object ListReleaseLabelsOutput {
  
  inline def apply(): ListReleaseLabelsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReleaseLabelsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReleaseLabelsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReleaseLabels(value: StringList): Self = StObject.set(x, "ReleaseLabels", value.asInstanceOf[js.Any])
    
    inline def setReleaseLabelsUndefined: Self = StObject.set(x, "ReleaseLabels", js.undefined)
    
    inline def setReleaseLabelsVarargs(value: String*): Self = StObject.set(x, "ReleaseLabels", js.Array(value*))
  }
}
