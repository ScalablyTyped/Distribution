package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulerLevel extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var FirstMargin: Double = js.native
  
  var LeftMargin: Double = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.RulerLevel_typekey")
  var PowerPointDotRulerLevel_typekey: RulerLevel = js.native
}
object RulerLevel {
  
  @scala.inline
  def apply(
    Application: Application,
    FirstMargin: Double,
    LeftMargin: Double,
    Parent: js.Any,
    PowerPointDotRulerLevel_typekey: RulerLevel
  ): RulerLevel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], FirstMargin = FirstMargin.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RulerLevel_typekey")(PowerPointDotRulerLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerLevel]
  }
  
  @scala.inline
  implicit class RulerLevelMutableBuilder[Self <: RulerLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMargin(value: Double): Self = StObject.set(x, "FirstMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotRulerLevel_typekey(value: RulerLevel): Self = StObject.set(x, "PowerPoint.RulerLevel_typekey", value.asInstanceOf[js.Any])
  }
}
