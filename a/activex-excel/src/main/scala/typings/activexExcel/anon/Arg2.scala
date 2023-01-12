package typings.activexExcel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arg2 extends StObject {
  
  val Arg1: Double
  
  val Arg2: Double
  
  val ElementID: Double
}
object Arg2 {
  
  inline def apply(Arg1: Double, Arg2: Double, ElementID: Double): Arg2 = {
    val __obj = js.Dynamic.literal(Arg1 = Arg1.asInstanceOf[js.Any], Arg2 = Arg2.asInstanceOf[js.Any], ElementID = ElementID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arg2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arg2] (val x: Self) extends AnyVal {
    
    inline def setArg1(value: Double): Self = StObject.set(x, "Arg1", value.asInstanceOf[js.Any])
    
    inline def setArg2(value: Double): Self = StObject.set(x, "Arg2", value.asInstanceOf[js.Any])
    
    inline def setElementID(value: Double): Self = StObject.set(x, "ElementID", value.asInstanceOf[js.Any])
  }
}
