package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the appearance of a line representing a single property in an {@link ObjectInspector} .
  *
  * Such a line consists of a label with a human-readable name for the propertya control which is used for user interaction - i.e. it displays the current
  * property value, and allows the user entering a new one.(optional) one or two buttons which, when clicked, can start a more complex, interactive
  * property value input. For instance, if you have a property whose value is a path in the file system, such a button could be used to let the user
  * browse for a path with a usual file picker.
  * @see XPropertyHandler.describePropertyLine
  * @see PropertyLineElement
  * @since OOo 2.0.3
  */
@js.native
trait LineDescriptor extends StObject {
  
  /**
    * describes the category into which the property should be sorted by the {@link ObjectInspector} .
    *
    * An {@link ObjectInspector} can visually group properties which semantically belong together (for instance using tab pages). The decision which
    * properties actually belong together is made using this {@link Category} attribute.
    *
    * For your implementation of {@link XPropertyHandler} , it's recommended that you document the programmatic names used for property categories. This
    * way, your handler might be re-used in different contexts, where only the {@link XObjectInspectorModel} needs to provide consistent UI names for the
    * categories.
    * @see XObjectInspectorModel.describeCategories
    */
  var Category: String = js.native
  
  /**
    * denotes the control which should be used to represent the property at the UI.
    * @see XPropertyControlFactory
    */
  var Control: XPropertyControl = js.native
  
  /** denotes the human-readable display name used to present a property to the user */
  var DisplayName: String = js.native
  
  /**
    * determines whether a button exists which can be used for a more complex, interactive property value input.
    *
    * If no image for the primary button is specified, but a primary button is present, the three dots will be displayed on the button.
    * @see XPropertyHandler.onInteractivePropertySelection
    * @see HasSecondaryButton
    * @see PrimaryButtonImageURL
    * @see PrimaryButtonImage
    */
  var HasPrimaryButton: Boolean = js.native
  
  /**
    * determines whether a secondary button exists which can be used for a more complex, interactive property value input.
    *
    * A secondary button subordinated to the primary button. If no primary button exists ( {@link HasPrimaryButton} ), this member is ignored.
    * @see XPropertyHandler.onInteractivePropertySelection
    * @see HasSecondaryButton
    */
  var HasSecondaryButton: Boolean = js.native
  
  /** specifies the URL to the help topic to be associated with the property */
  var HelpURL: String = js.native
  
  /**
    * describes the indent level for the property
    *
    * If a given property semantically depends on another one, the indent level can be used to visually represent this fact. For this, the dependent
    * property's indent level would be one larger than the indent level of the other property.
    *
    * Normally, XPropertyHandlers will set this to `0` when describing the UI for a normal property.
    */
  var IndentLevel: Double = js.native
  
  /**
    * describes a unique id to associate with the primary button
    *
    * In OpenOffice.org, UI elements sometimes require a so-called UniqueID, which can be used to uniquely (within the whole application) identify this UI
    * element. For instance, automating the OpenOffice.org UI via a dedicated separate application ("TestTool") requires such IDs.
    *
    * If a primary button exists for a property's UI representation ( {@link HasPrimaryButton} ), it gets the ID specified herein.
    */
  var PrimaryButtonId: String = js.native
  
  /**
    * describes a graphics to display at the primary button, if any.
    *
    * The property will be ignored if {@link HasPrimaryButton} is `FALSE` , or if {@link PrimaryButtonImageURL} is a non-empty string.
    * @see HasPrimaryButton
    * @see PrimaryButtonImageURL
    */
  var PrimaryButtonImage: XGraphic = js.native
  
  /**
    * describes the URL of an image to display on the primary button, if any.
    *
    * This URL will be used to obtain an actual {@link com.sun.star.graphic.XGraphic} object from an {@link com.sun.star.graphic.GraphicProvider} .
    *
    * The property will be ignored if {@link HasPrimaryButton} is `FALSE` .
    *
    * If you need to specify a graphic which does not have an URL, but is available as {@link com.sun.star.graphic.XGraphic} only, then you must leave
    * `PrimaryButtonImageURL` empty, and use the {@link PrimaryButtonImage} property.
    * @see PrimaryButtonImage
    */
  var PrimaryButtonImageURL: String = js.native
  
  /**
    * describes a unique id to associate with the primary button
    *
    * If a secondary button exists for a property's UI representation ( {@link HasSecondaryButton} ), it gets the ID specified herein.
    * @see PrimaryButtonId
    */
  var SecondaryButtonId: String = js.native
  
  /**
    * describes a graphics to display at the secondary button, if any.
    *
    * The property will be ignored if {@link HasSecondaryButton} is `FALSE` , or if {@link SecondaryButtonImageURL} is a non-empty string.
    * @see HasSecondaryButton
    * @see SecondaryButtonImageURL
    */
  var SecondaryButtonImage: XGraphic = js.native
  
  /**
    * describes the URL of an image to display on the secondary button, if any.
    *
    * This URL will be used to obtain an actual {@link com.sun.star.graphic.XGraphic} object from an {@link com.sun.star.graphic.GraphicProvider} .
    *
    * The property will be ignored if {@link HasSecondaryButton} is `FALSE` .
    *
    * If you need to specify a graphic which does not have an URL, but is available as {@link com.sun.star.graphic.XGraphic} only, then you must leave
    * `SecondaryButtonImageURL` empty, and use the {@link SecondaryButtonImage} property.
    * @see SecondaryButtonImage
    */
  var SecondaryButtonImageURL: String = js.native
}
object LineDescriptor {
  
  @scala.inline
  def apply(
    Category: String,
    Control: XPropertyControl,
    DisplayName: String,
    HasPrimaryButton: Boolean,
    HasSecondaryButton: Boolean,
    HelpURL: String,
    IndentLevel: Double,
    PrimaryButtonId: String,
    PrimaryButtonImage: XGraphic,
    PrimaryButtonImageURL: String,
    SecondaryButtonId: String,
    SecondaryButtonImage: XGraphic,
    SecondaryButtonImageURL: String
  ): LineDescriptor = {
    val __obj = js.Dynamic.literal(Category = Category.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], HasPrimaryButton = HasPrimaryButton.asInstanceOf[js.Any], HasSecondaryButton = HasSecondaryButton.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], IndentLevel = IndentLevel.asInstanceOf[js.Any], PrimaryButtonId = PrimaryButtonId.asInstanceOf[js.Any], PrimaryButtonImage = PrimaryButtonImage.asInstanceOf[js.Any], PrimaryButtonImageURL = PrimaryButtonImageURL.asInstanceOf[js.Any], SecondaryButtonId = SecondaryButtonId.asInstanceOf[js.Any], SecondaryButtonImage = SecondaryButtonImage.asInstanceOf[js.Any], SecondaryButtonImageURL = SecondaryButtonImageURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDescriptor]
  }
  
  @scala.inline
  implicit class LineDescriptorMutableBuilder[Self <: LineDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: XPropertyControl): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPrimaryButton(value: Boolean): Self = StObject.set(x, "HasPrimaryButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSecondaryButton(value: Boolean): Self = StObject.set(x, "HasSecondaryButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentLevel(value: Double): Self = StObject.set(x, "IndentLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryButtonId(value: String): Self = StObject.set(x, "PrimaryButtonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryButtonImage(value: XGraphic): Self = StObject.set(x, "PrimaryButtonImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryButtonImageURL(value: String): Self = StObject.set(x, "PrimaryButtonImageURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryButtonId(value: String): Self = StObject.set(x, "SecondaryButtonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryButtonImage(value: XGraphic): Self = StObject.set(x, "SecondaryButtonImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryButtonImageURL(value: String): Self = StObject.set(x, "SecondaryButtonImageURL", value.asInstanceOf[js.Any])
  }
}
