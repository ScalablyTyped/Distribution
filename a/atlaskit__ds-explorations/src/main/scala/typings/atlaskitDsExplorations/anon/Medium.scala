package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medium extends StObject {
  
  var bold: SerializedStyles
  
  var medium: SerializedStyles
  
  var regular: SerializedStyles
  
  var semibold: SerializedStyles
}
object Medium {
  
  inline def apply(
    bold: SerializedStyles,
    medium: SerializedStyles,
    regular: SerializedStyles,
    semibold: SerializedStyles
  ): Medium = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], semibold = semibold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Medium]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Medium] (val x: Self) extends AnyVal {
    
    inline def setBold(value: SerializedStyles): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: SerializedStyles): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setRegular(value: SerializedStyles): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    inline def setSemibold(value: SerializedStyles): Self = StObject.set(x, "semibold", value.asInstanceOf[js.Any])
  }
}
