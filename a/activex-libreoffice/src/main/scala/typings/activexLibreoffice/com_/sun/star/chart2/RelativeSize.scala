package typings.activexLibreoffice.com_.sun.star.chart2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gives a position relative to some size defined by other means. Values from 0 to 1 cover the entire reference rectangle. Values may also be greater
  * than one, meaning a bigger size than the reference size. Negative values are not allowed.
  */
@js.native
trait RelativeSize extends js.Object {
  
  /**
    * The extension in the primary direction. The direction is defined by the object using this point.
    *
    * Typically, the direction is determined by an Orientation. Another typical use would be the direction of a given orientation-angle.
    *
    * The values are relative to the page or an object. Values between 0 and 1 span the complete bounding rectangle of the page/object.
    *
    * For a western Orientation this is the width.
    */
  var Primary: Double = js.native
  
  /**
    * The extension in the secondary direction. The direction is defined by the object using this point.
    *
    * Typically, the direction is determined by an Orientation. Another typical use would be the direction perpendicular to a given orientation-angle.
    *
    * The values are relative to the page or an object. Values between 0 and 1 span the complete bounding rectangle of the page/object.
    *
    * For a western Orientation this is the height.
    */
  var Secondary: Double = js.native
}
object RelativeSize {
  
  @scala.inline
  def apply(Primary: Double, Secondary: Double): RelativeSize = {
    val __obj = js.Dynamic.literal(Primary = Primary.asInstanceOf[js.Any], Secondary = Secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeSize]
  }
  
  @scala.inline
  implicit class RelativeSizeOps[Self <: RelativeSize] (val x: Self) extends AnyVal {
    
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
    def setPrimary(value: Double): Self = this.set("Primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondary(value: Double): Self = this.set("Secondary", value.asInstanceOf[js.Any])
  }
}
