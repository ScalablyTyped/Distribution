package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coauthoring extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val CoauthorCount: Double
  
  def EndReview(): Unit
  
  var FavorServerEditsDuringMerge: Boolean
  
  val MergeMode: Boolean
  
  val Parent: js.Any
  
  val PendingUpdates: Boolean
  
  @JSName("PowerPoint.Coauthoring_typekey")
  var PowerPointDotCoauthoring_typekey: Coauthoring
}
object Coauthoring {
  
  @scala.inline
  def apply(
    Application: Application,
    CoauthorCount: Double,
    EndReview: () => Unit,
    FavorServerEditsDuringMerge: Boolean,
    MergeMode: Boolean,
    Parent: js.Any,
    PendingUpdates: Boolean,
    PowerPointDotCoauthoring_typekey: Coauthoring
  ): Coauthoring = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CoauthorCount = CoauthorCount.asInstanceOf[js.Any], EndReview = js.Any.fromFunction0(EndReview), FavorServerEditsDuringMerge = FavorServerEditsDuringMerge.asInstanceOf[js.Any], MergeMode = MergeMode.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PendingUpdates = PendingUpdates.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Coauthoring_typekey")(PowerPointDotCoauthoring_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coauthoring]
  }
  
  @scala.inline
  implicit class CoauthoringMutableBuilder[Self <: Coauthoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoauthorCount(value: Double): Self = StObject.set(x, "CoauthorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndReview(value: () => Unit): Self = StObject.set(x, "EndReview", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFavorServerEditsDuringMerge(value: Boolean): Self = StObject.set(x, "FavorServerEditsDuringMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeMode(value: Boolean): Self = StObject.set(x, "MergeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUpdates(value: Boolean): Self = StObject.set(x, "PendingUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotCoauthoring_typekey(value: Coauthoring): Self = StObject.set(x, "PowerPoint.Coauthoring_typekey", value.asInstanceOf[js.Any])
  }
}
