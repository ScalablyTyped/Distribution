package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains the information regarding named tokens */
trait NameToken extends StObject {
  
  var Index: Double
  
  var Sheet: Double
}
object NameToken {
  
  inline def apply(Index: Double, Sheet: Double): NameToken = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameToken] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: Double): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
  }
}
