package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to a collection of forms. */
@js.native
trait XFormsSupplier extends XInterface {
  
  /**
    * accesses the forms.
    *
    * {{program example here, see documentation}}
    * @returns the container of all the top-level forms belonging to the component.
    */
  val Forms: XNameContainer = js.native
  
  /**
    * accesses the forms.
    *
    * {{program example here, see documentation}}
    * @returns the container of all the top-level forms belonging to the component.
    */
  def getForms(): XNameContainer = js.native
}
object XFormsSupplier {
  
  @scala.inline
  def apply(
    Forms: XNameContainer,
    acquire: () => Unit,
    getForms: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormsSupplier = {
    val __obj = js.Dynamic.literal(Forms = Forms.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getForms = js.Any.fromFunction0(getForms), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFormsSupplier]
  }
  
  @scala.inline
  implicit class XFormsSupplierMutableBuilder[Self <: XFormsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForms(value: XNameContainer): Self = StObject.set(x, "Forms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetForms(value: () => XNameContainer): Self = StObject.set(x, "getForms", js.Any.fromFunction0(value))
  }
}
