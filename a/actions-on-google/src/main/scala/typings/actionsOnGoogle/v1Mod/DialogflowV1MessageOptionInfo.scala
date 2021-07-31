package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageOptionInfo extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
}
object DialogflowV1MessageOptionInfo {
  
  @scala.inline
  def apply(): DialogflowV1MessageOptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageOptionInfo]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageOptionInfoMutableBuilder[Self <: DialogflowV1MessageOptionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
  }
}
