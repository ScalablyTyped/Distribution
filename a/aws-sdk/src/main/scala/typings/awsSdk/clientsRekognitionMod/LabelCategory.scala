package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelCategory extends StObject {
  
  /**
    * The name of a category that applies to a given label.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object LabelCategory {
  
  inline def apply(): LabelCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelCategory] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
