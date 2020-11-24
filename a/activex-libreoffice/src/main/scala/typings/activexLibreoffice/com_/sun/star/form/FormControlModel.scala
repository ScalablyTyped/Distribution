package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyState
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a control model within a form.
  *
  * Note that the model-view-paradigm is used for form controls, too.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because var conflicts: Name. Inlined Height, PositionX, PositionY, Step, TabIndex, Tag, Width
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because var conflicts: Name. Inlined DefaultControl */ @js.native
trait FormControlModel
  extends FormComponent
     with XFastPropertySet
     with XPropertyState
     with XMultiPropertySet
     with XCloneable {
  
  /**
    * specifies the ID for classification of the component.
    * @see FormComponentType
    */
  var ClassId: Double = js.native
  
  /** specifies the service name of the default control for this model. */
  var DefaultControl: String = js.native
  
  /** specifies the height of the control. */
  var Height: Double = js.native
  
  /** specifies the horizontal position of the control. */
  var PositionX: String = js.native
  
  /** specifies the vertical position of the control. */
  var PositionY: String = js.native
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: XPropertySetInfo = js.native
  
  /** specifies the step of the control. */
  var Step: Double = js.native
  
  /**
    * determines the relative taborder of the control associated with the model.
    *
    * The default -1 is used to indicate that the tab-order of this control should be determined automatically.
    *
    * Each component which supports a tabstop must provide a {@link FormControlModel.TabIndex} property.
    *
    * Normally, a {@link FormController} instance is evaluating this property.
    */
  var TabIndex: Double = js.native
  
  /**
    * used for additional information.
    *
    * No semantics is given for this property, it will usually be used by the creator of a document containing form controls.
    */
  var Tag: String = js.native
  
  /** specifies the width of the control. */
  var Width: Double = js.native
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}
