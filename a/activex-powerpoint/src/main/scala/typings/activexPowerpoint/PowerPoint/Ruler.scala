package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ruler extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Levels: RulerLevels
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.Ruler_typekey")
  var PowerPointDotRuler_typekey: Ruler
  
  val TabStops: typings.activexPowerpoint.PowerPoint.TabStops
}
object Ruler {
  
  inline def apply(
    Application: Application,
    Levels: RulerLevels,
    Parent: Any,
    PowerPointDotRuler_typekey: Ruler,
    TabStops: TabStops
  ): Ruler = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TabStops = TabStops.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Ruler_typekey")(PowerPointDotRuler_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ruler] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setLevels(value: RulerLevels): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotRuler_typekey(value: Ruler): Self = StObject.set(x, "PowerPoint.Ruler_typekey", value.asInstanceOf[js.Any])
    
    inline def setTabStops(value: TabStops): Self = StObject.set(x, "TabStops", value.asInstanceOf[js.Any])
  }
}
