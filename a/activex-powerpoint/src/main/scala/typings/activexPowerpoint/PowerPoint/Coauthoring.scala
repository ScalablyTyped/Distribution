package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coauthoring extends js.Object {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val CoauthorCount: Double = js.native
  
  def EndReview(): Unit = js.native
  
  var FavorServerEditsDuringMerge: Boolean = js.native
  
  val MergeMode: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  val PendingUpdates: Boolean = js.native
  
  @JSName("PowerPoint.Coauthoring_typekey")
  var PowerPointDotCoauthoring_typekey: Coauthoring = js.native
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
  implicit class CoauthoringOps[Self <: Coauthoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoauthorCount(value: Double): Self = this.set("CoauthorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndReview(value: () => Unit): Self = this.set("EndReview", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFavorServerEditsDuringMerge(value: Boolean): Self = this.set("FavorServerEditsDuringMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeMode(value: Boolean): Self = this.set("MergeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUpdates(value: Boolean): Self = this.set("PendingUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotCoauthoring_typekey(value: Coauthoring): Self = this.set("PowerPoint.Coauthoring_typekey", value.asInstanceOf[js.Any])
  }
}
