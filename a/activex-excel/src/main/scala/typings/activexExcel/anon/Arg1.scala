package typings.activexExcel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arg1 extends StObject {
  
  val Arg1: Double = js.native
  
  val Arg2: Double = js.native
  
  var Cancel: Boolean = js.native
  
  val ElementID: Double = js.native
}
object Arg1 {
  
  @scala.inline
  def apply(Arg1: Double, Arg2: Double, Cancel: Boolean, ElementID: Double): Arg1 = {
    val __obj = js.Dynamic.literal(Arg1 = Arg1.asInstanceOf[js.Any], Arg2 = Arg2.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], ElementID = ElementID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arg1]
  }
  
  @scala.inline
  implicit class Arg1MutableBuilder[Self <: Arg1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArg1(value: Double): Self = StObject.set(x, "Arg1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArg2(value: Double): Self = StObject.set(x, "Arg2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementID(value: Double): Self = StObject.set(x, "ElementID", value.asInstanceOf[js.Any])
  }
}
