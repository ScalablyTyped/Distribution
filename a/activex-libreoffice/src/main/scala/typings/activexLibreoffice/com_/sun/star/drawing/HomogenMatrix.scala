package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a homogeneous matrix by three homogeneous lines */
@js.native
trait HomogenMatrix extends StObject {
  
  var Line1: HomogenMatrixLine = js.native
  
  var Line2: HomogenMatrixLine = js.native
  
  var Line3: HomogenMatrixLine = js.native
  
  var Line4: HomogenMatrixLine = js.native
}
object HomogenMatrix {
  
  @scala.inline
  def apply(
    Line1: HomogenMatrixLine,
    Line2: HomogenMatrixLine,
    Line3: HomogenMatrixLine,
    Line4: HomogenMatrixLine
  ): HomogenMatrix = {
    val __obj = js.Dynamic.literal(Line1 = Line1.asInstanceOf[js.Any], Line2 = Line2.asInstanceOf[js.Any], Line3 = Line3.asInstanceOf[js.Any], Line4 = Line4.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomogenMatrix]
  }
  
  @scala.inline
  implicit class HomogenMatrixMutableBuilder[Self <: HomogenMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine1(value: HomogenMatrixLine): Self = StObject.set(x, "Line1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine2(value: HomogenMatrixLine): Self = StObject.set(x, "Line2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine3(value: HomogenMatrixLine): Self = StObject.set(x, "Line3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine4(value: HomogenMatrixLine): Self = StObject.set(x, "Line4", value.asInstanceOf[js.Any])
  }
}
