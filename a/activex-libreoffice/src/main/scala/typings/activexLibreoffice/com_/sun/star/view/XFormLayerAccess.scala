package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.form.XForm
import typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the form layer elements in a view
  * @since OOo 2.3
  */
trait XFormLayerAccess
  extends StObject
     with XControlAccess {
  
  /**
    * returns the {@link com.sun.star.form.FormController} instance which operates on a given form.
    *
    * A form controller is a component which controls the user interaction with the form layer, as long as the form is not in design mode.
    * @returns the requested form controller, or `NULL` if the view's form layer is currently in design mode. Note that the returned instance becomes non-functi
    * @see isDesignMode
    * @see setDesignMode
    * @see com.sun.star.form.runtime.FormController
    * @see com.sun.star.form.runtime.FormOperations
    */
  def getFormController(Form: XForm): XFormController
  
  /**
    * determines whether the view's form layer is currently in design or alive mode
    *
    * **Note** : This is a convenience method. In the user interface, the design mode is coupled with the `.uno:SwitchControlDesignMode` feature (see {@link
    * com.sun.star.frame.XDispatchProvider} ), and asking for the current mode is the same as asking for the state of this feature.
    */
  def isFormDesignMode(): Boolean
  
  /**
    * determines whether the view's form layer is currently in design or alive mode
    *
    * **Note** : This is a convenience method. In the user interface, the design mode is coupled with the `.uno:SwitchControlDesignMode` feature (see {@link
    * com.sun.star.frame.XDispatchProvider} ), and changing the current mode is the same as dispatching this feature URL.
    */
  def setFormDesignMode(DesignMode: Boolean): Unit
}
object XFormLayerAccess {
  
  inline def apply(
    acquire: () => Unit,
    getControl: XControlModel => XControl,
    getFormController: XForm => XFormController,
    isFormDesignMode: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    setFormDesignMode: Boolean => Unit
  ): XFormLayerAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getControl = js.Any.fromFunction1(getControl), getFormController = js.Any.fromFunction1(getFormController), isFormDesignMode = js.Any.fromFunction0(isFormDesignMode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormDesignMode = js.Any.fromFunction1(setFormDesignMode))
    __obj.asInstanceOf[XFormLayerAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XFormLayerAccess] (val x: Self) extends AnyVal {
    
    inline def setGetFormController(value: XForm => XFormController): Self = StObject.set(x, "getFormController", js.Any.fromFunction1(value))
    
    inline def setIsFormDesignMode(value: () => Boolean): Self = StObject.set(x, "isFormDesignMode", js.Any.fromFunction0(value))
    
    inline def setSetFormDesignMode(value: Boolean => Unit): Self = StObject.set(x, "setFormDesignMode", js.Any.fromFunction1(value))
  }
}
