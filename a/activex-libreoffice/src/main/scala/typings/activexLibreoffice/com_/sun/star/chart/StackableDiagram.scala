package typings.activexLibreoffice.com_.sun.star.chart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** a helper service for stackable chart types (e.g., charts in which the data rows may be displayed stacked on each other or in percent relation). */
trait StackableDiagram extends StObject {
  
  /** If `TRUE` , the series of the diagram are stacked and each category sums up to 100%. */
  var Percent: Boolean
  
  /**
    * If `TRUE` , the series of the diagram are stacked.
    *
    * If you have a stacked bar chart, you can easily determine the sum of data in each category, by taking the top of the topmost bar.
    */
  var Stacked: Boolean
}
object StackableDiagram {
  
  inline def apply(Percent: Boolean, Stacked: Boolean): StackableDiagram = {
    val __obj = js.Dynamic.literal(Percent = Percent.asInstanceOf[js.Any], Stacked = Stacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackableDiagram]
  }
  
  extension [Self <: StackableDiagram](x: Self) {
    
    inline def setPercent(value: Boolean): Self = StObject.set(x, "Percent", value.asInstanceOf[js.Any])
    
    inline def setStacked(value: Boolean): Self = StObject.set(x, "Stacked", value.asInstanceOf[js.Any])
  }
}
