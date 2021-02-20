package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** defines a single text column. */
@js.native
trait TextColumn extends StObject {
  
  /**
    * contains the left margin of the column.
    *
    * This is a metric value.
    */
  var LeftMargin: Double = js.native
  
  /**
    * contains the right margin of the column.
    *
    * This is a metric value.
    */
  var RightMargin: Double = js.native
  
  /**
    * contains the relative width of the column, including both margins.
    *
    * Width isn't a metric value, it's a relative value to the sum of the width of all columns.
    */
  var Width: Double = js.native
}
object TextColumn {
  
  @scala.inline
  def apply(LeftMargin: Double, RightMargin: Double, Width: Double): TextColumn = {
    val __obj = js.Dynamic.literal(LeftMargin = LeftMargin.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColumn]
  }
  
  @scala.inline
  implicit class TextColumnMutableBuilder[Self <: TextColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "RightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
