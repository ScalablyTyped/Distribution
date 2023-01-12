package typings.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the vertical orientation of an object.
  *
  * If `VerticalOrientation == VERT_NONE` , then the value "YPos" describes the distance from the top of the context. Otherwise "YPos" is ignored.
  */
trait VertOrientationFormat extends StObject {
  
  /** determines the vertical alignment of an object. The values refer to com::sun::star::VertOrientation. */
  var VerticalOrientation: Double
  
  /**
    * determines the reference position of the vertical alignment.
    * @see com.sun.star.text.RelOrientation
    */
  var VerticalRelation: Double
  
  /** contains the distance from top. Only valid if the property VerticalOrientation contains the value VERT_NONE. */
  var YPos: Double
}
object VertOrientationFormat {
  
  inline def apply(VerticalOrientation: Double, VerticalRelation: Double, YPos: Double): VertOrientationFormat = {
    val __obj = js.Dynamic.literal(VerticalOrientation = VerticalOrientation.asInstanceOf[js.Any], VerticalRelation = VerticalRelation.asInstanceOf[js.Any], YPos = YPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertOrientationFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VertOrientationFormat] (val x: Self) extends AnyVal {
    
    inline def setVerticalOrientation(value: Double): Self = StObject.set(x, "VerticalOrientation", value.asInstanceOf[js.Any])
    
    inline def setVerticalRelation(value: Double): Self = StObject.set(x, "VerticalRelation", value.asInstanceOf[js.Any])
    
    inline def setYPos(value: Double): Self = StObject.set(x, "YPos", value.asInstanceOf[js.Any])
  }
}
