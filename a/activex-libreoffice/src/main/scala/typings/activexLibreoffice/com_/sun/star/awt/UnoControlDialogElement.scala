package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a set of properties to describe the model of an {@link UnoControl} which is embedded in a {@link UnoControlDialogModel} . */
@js.native
trait UnoControlDialogElement extends StObject {
  
  /** specifies the height of the control. */
  var Height: Double = js.native
  
  /** specifies the name of the control. */
  var Name: String = js.native
  
  /** specifies the horizontal position of the control. */
  var PositionX: String = js.native
  
  /** specifies the vertical position of the control. */
  var PositionY: String = js.native
  
  /** specifies the step of the control. */
  var Step: Double = js.native
  
  /** specifies the tabindex of the control. */
  var TabIndex: Double = js.native
  
  /** specifies the tag of the control. */
  var Tag: String = js.native
  
  /** specifies the width of the control. */
  var Width: Double = js.native
}
object UnoControlDialogElement {
  
  @scala.inline
  def apply(
    Height: Double,
    Name: String,
    PositionX: String,
    PositionY: String,
    Step: Double,
    TabIndex: Double,
    Tag: String,
    Width: Double
  ): UnoControlDialogElement = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnoControlDialogElement]
  }
  
  @scala.inline
  implicit class UnoControlDialogElementMutableBuilder[Self <: UnoControlDialogElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionX(value: String): Self = StObject.set(x, "PositionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionY(value: String): Self = StObject.set(x, "PositionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "Step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "TabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
