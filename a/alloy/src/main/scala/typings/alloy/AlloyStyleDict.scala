package typings.alloy

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties and TSS classes to apply to a Titanium UI element.
  */
@js.native
trait AlloyStyleDict
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * Array of TSS classes to apply to the Titanium UI object.
    */
  var classes: js.UndefOr[js.Array[String] | String] = js.native
  
  /**
    * TSS ID style to apply to the Titanium UI object.
    */
  var id: js.UndefOr[String] = js.native
}
object AlloyStyleDict {
  
  @scala.inline
  def apply(): AlloyStyleDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlloyStyleDict]
  }
  
  @scala.inline
  implicit class AlloyStyleDictMutableBuilder[Self <: AlloyStyleDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: js.Array[String] | String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
