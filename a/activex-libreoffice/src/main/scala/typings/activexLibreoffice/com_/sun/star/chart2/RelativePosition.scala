package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.drawing.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Determines a position of an object relative to a size defined by other means. Values from 0 to 1 cover the entire reference rectangle. Values may also
  * be outside this range, especially negative.
  */
@js.native
trait RelativePosition extends js.Object {
  
  /**
    * This indicates how the object is placed at the relative position.
    *
    * The Anchor indicates which point of the placed object will be placed at the coordinates given within Primary and Secondary.
    *
    * For example if Anchor is TOP_LEFT the top left corner of an object will be placed at the given coordinates. If Anchor is RIGHT the right middle corner
    * of the object will be placed at the given coordinates.
    */
  var Anchor: Alignment = js.native
  
  /**
    * The position in the primary direction. The direction is defined by the object using this point.
    *
    * For example for western languages the primary direction may be the horizontal distance measured from left to right.
    *
    * The values are relative to a reference size (for example the page size). Values between 0 and 1 span the complete bounding rectangle.
    */
  var Primary: Double = js.native
  
  /**
    * The position in the secondary direction. The direction is defined by the object using this point.
    *
    * For example for western languages the secondary direction may be the vertical distance measured from top to bottom.
    *
    * The values are relative to a reference size (for example the page size). Values between 0 and 1 span the complete bounding rectangle.
    */
  var Secondary: Double = js.native
}
object RelativePosition {
  
  @scala.inline
  def apply(Anchor: Alignment, Primary: Double, Secondary: Double): RelativePosition = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], Primary = Primary.asInstanceOf[js.Any], Secondary = Secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativePosition]
  }
  
  @scala.inline
  implicit class RelativePositionOps[Self <: RelativePosition] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: Alignment): Self = this.set("Anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: Double): Self = this.set("Primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondary(value: Double): Self = this.set("Secondary", value.asInstanceOf[js.Any])
  }
}
