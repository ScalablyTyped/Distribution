package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BolderBoldest[BaseToken] extends StObject {
  
  var bold: `19`[BaseToken]
  
  var bolder: `19`[BaseToken]
  
  var boldest: `19`[BaseToken]
}
object BolderBoldest {
  
  inline def apply[BaseToken](bold: `19`[BaseToken], bolder: `19`[BaseToken], boldest: `19`[BaseToken]): BolderBoldest[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], bolder = bolder.asInstanceOf[js.Any], boldest = boldest.asInstanceOf[js.Any])
    __obj.asInstanceOf[BolderBoldest[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BolderBoldest[?], BaseToken] (val x: Self & BolderBoldest[BaseToken]) extends AnyVal {
    
    inline def setBold(value: `19`[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBolder(value: `19`[BaseToken]): Self = StObject.set(x, "bolder", value.asInstanceOf[js.Any])
    
    inline def setBoldest(value: `19`[BaseToken]): Self = StObject.set(x, "boldest", value.asInstanceOf[js.Any])
  }
}
