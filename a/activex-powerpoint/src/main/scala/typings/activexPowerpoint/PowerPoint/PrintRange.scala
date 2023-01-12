package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintRange extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  def Delete(): Unit
  
  val End: Double
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.PrintRange_typekey")
  var PowerPointDotPrintRange_typekey: PrintRange
  
  val Start: Double
}
object PrintRange {
  
  inline def apply(
    Application: Application,
    Delete: () => Unit,
    End: Double,
    Parent: Any,
    PowerPointDotPrintRange_typekey: PrintRange,
    Start: Double
  ): PrintRange = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), End = End.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PrintRange_typekey")(PowerPointDotPrintRange_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintRange] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setEnd(value: Double): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPrintRange_typekey(value: PrintRange): Self = StObject.set(x, "PowerPoint.PrintRange_typekey", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
