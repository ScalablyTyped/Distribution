package typings.activexLibreoffice.com_.sun.star.chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** a helper service for stackable chart types (e.g., charts in which the data rows may be displayed stacked on each other or in percent relation). */
@js.native
trait StackableDiagram extends js.Object {
  
  /** If `TRUE` , the series of the diagram are stacked and each category sums up to 100%. */
  var Percent: Boolean = js.native
  
  /**
    * If `TRUE` , the series of the diagram are stacked.
    *
    * If you have a stacked bar chart, you can easily determine the sum of data in each category, by taking the top of the topmost bar.
    */
  var Stacked: Boolean = js.native
}
object StackableDiagram {
  
  @scala.inline
  def apply(Percent: Boolean, Stacked: Boolean): StackableDiagram = {
    val __obj = js.Dynamic.literal(Percent = Percent.asInstanceOf[js.Any], Stacked = Stacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackableDiagram]
  }
  
  @scala.inline
  implicit class StackableDiagramOps[Self <: StackableDiagram] (val x: Self) extends AnyVal {
    
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
    def setPercent(value: Boolean): Self = this.set("Percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("Stacked", value.asInstanceOf[js.Any])
  }
}
