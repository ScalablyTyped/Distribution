package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel
import typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyBag
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyState
import typings.activexLibreoffice.com_.sun.star.container.XChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a control model within a form.
  *
  * Note that the model-view-paradigm is used for form controls, too.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
- typings.activexLibreoffice.com_.sun.star.container.XNamed because var conflicts: Name. Inlined getName, setName
- typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.FormComponent because var conflicts: Name. Inlined  */ @js.native
trait FormControlModel
  extends StObject
     with UnoControlModel
     with XFastPropertySet
     with XPropertyState
     with XChild
     with XPropertyBag {
  
  /**
    * specifies the ID for classification of the component.
    * @see FormComponentType
    */
  var ClassId: Double = js.native
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: XPropertySetInfo = js.native
  
  /** @returns the programmatic name of the object. */
  def getName(): String = js.native
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
  
  /** sets the programmatic name of the object. */
  def setName(aName: String): Unit = js.native
}
