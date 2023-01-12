package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelAlias extends StObject {
  
  /**
    * The name of an alias for a given label.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object LabelAlias {
  
  inline def apply(): LabelAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelAlias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelAlias] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
