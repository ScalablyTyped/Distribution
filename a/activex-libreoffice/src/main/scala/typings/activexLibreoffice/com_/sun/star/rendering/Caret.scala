package typings.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains the caret information.
  *
  * This structure is used from the {@link XTextLayout} interface to transport information regarding a text caret.
  * @since OOo 2.0
  */
trait Caret extends StObject {
  
  /**
    * The angle of the caret.
    *
    * This member contains the rotation angle of the caret in degrees, with 0 denoting an unrotated caret (the unrotated caret orientation depends on the
    * writing mode, horizontally or vertically). The rotation angle is positive for counter-clockwise rotations.
    */
  var CaretAngle: Double
  
  /**
    * This contains the main caret index.
    *
    * The main caret index corresponds to the insert position when inserting text in the layout's main text direction.
    */
  var MainCaretIndex: Double
  
  /**
    * This contains the secondary caret index.
    *
    * The secondary caret index, when different from the main caret index, corresponds to the insert position when inserting text at a direction change
    * opposite to the layout's main text direction.
    */
  var SecondaryCaretIndex: Double
}
object Caret {
  
  @scala.inline
  def apply(CaretAngle: Double, MainCaretIndex: Double, SecondaryCaretIndex: Double): Caret = {
    val __obj = js.Dynamic.literal(CaretAngle = CaretAngle.asInstanceOf[js.Any], MainCaretIndex = MainCaretIndex.asInstanceOf[js.Any], SecondaryCaretIndex = SecondaryCaretIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caret]
  }
  
  @scala.inline
  implicit class CaretMutableBuilder[Self <: Caret] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaretAngle(value: Double): Self = StObject.set(x, "CaretAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainCaretIndex(value: Double): Self = StObject.set(x, "MainCaretIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryCaretIndex(value: Double): Self = StObject.set(x, "SecondaryCaretIndex", value.asInstanceOf[js.Any])
  }
}
